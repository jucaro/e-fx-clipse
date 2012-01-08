package at.bestsolution.efxclipse.tooling.svgpath.ui.contentassist.antlr.internal; 

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
import at.bestsolution.efxclipse.tooling.svgpath.services.SvgPathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSvgPathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WSP", "','", "'M'", "'m'", "'Z'", "'z'", "'L'", "'l'", "'H'", "'h'", "'V'", "'v'", "'C'", "'c'", "'S'", "'s'", "'Q'", "'q'", "'T'", "'t'", "'A'", "'a'", "'e'", "'E'", "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", "'+'", "'-'", "'.'"
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
    public String getGrammarFileName() { return "../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g"; }


     
     	private SvgPathGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SvgPathGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRulesvg_path"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:60:1: entryRulesvg_path : rulesvg_path EOF ;
    public final void entryRulesvg_path() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:61:1: ( rulesvg_path EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:62:1: rulesvg_path EOF
            {
             before(grammarAccess.getSvg_pathRule()); 
            pushFollow(FOLLOW_rulesvg_path_in_entryRulesvg_path61);
            rulesvg_path();

            state._fsp--;

             after(grammarAccess.getSvg_pathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesvg_path68); 

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
    // $ANTLR end "entryRulesvg_path"


    // $ANTLR start "rulesvg_path"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:69:1: rulesvg_path : ( ( rule__Svg_path__Moveto_drawto_command_groupsAssignment )? ) ;
    public final void rulesvg_path() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:73:2: ( ( ( rule__Svg_path__Moveto_drawto_command_groupsAssignment )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:74:1: ( ( rule__Svg_path__Moveto_drawto_command_groupsAssignment )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:74:1: ( ( rule__Svg_path__Moveto_drawto_command_groupsAssignment )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:75:1: ( rule__Svg_path__Moveto_drawto_command_groupsAssignment )?
            {
             before(grammarAccess.getSvg_pathAccess().getMoveto_drawto_command_groupsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:76:1: ( rule__Svg_path__Moveto_drawto_command_groupsAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=6 && LA1_0<=7)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:76:2: rule__Svg_path__Moveto_drawto_command_groupsAssignment
                    {
                    pushFollow(FOLLOW_rule__Svg_path__Moveto_drawto_command_groupsAssignment_in_rulesvg_path94);
                    rule__Svg_path__Moveto_drawto_command_groupsAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSvg_pathAccess().getMoveto_drawto_command_groupsAssignment()); 

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
    // $ANTLR end "rulesvg_path"


    // $ANTLR start "entryRulemoveto_drawto_command_groups"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:88:1: entryRulemoveto_drawto_command_groups : rulemoveto_drawto_command_groups EOF ;
    public final void entryRulemoveto_drawto_command_groups() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:89:1: ( rulemoveto_drawto_command_groups EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:90:1: rulemoveto_drawto_command_groups EOF
            {
             before(grammarAccess.getMoveto_drawto_command_groupsRule()); 
            pushFollow(FOLLOW_rulemoveto_drawto_command_groups_in_entryRulemoveto_drawto_command_groups122);
            rulemoveto_drawto_command_groups();

            state._fsp--;

             after(grammarAccess.getMoveto_drawto_command_groupsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemoveto_drawto_command_groups129); 

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
    // $ANTLR end "entryRulemoveto_drawto_command_groups"


    // $ANTLR start "rulemoveto_drawto_command_groups"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:97:1: rulemoveto_drawto_command_groups : ( ( rule__Moveto_drawto_command_groups__CommandsAssignment ) ) ;
    public final void rulemoveto_drawto_command_groups() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:101:2: ( ( ( rule__Moveto_drawto_command_groups__CommandsAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:102:1: ( ( rule__Moveto_drawto_command_groups__CommandsAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:102:1: ( ( rule__Moveto_drawto_command_groups__CommandsAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:103:1: ( rule__Moveto_drawto_command_groups__CommandsAssignment )
            {
             before(grammarAccess.getMoveto_drawto_command_groupsAccess().getCommandsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:104:1: ( rule__Moveto_drawto_command_groups__CommandsAssignment )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:104:2: rule__Moveto_drawto_command_groups__CommandsAssignment
            {
            pushFollow(FOLLOW_rule__Moveto_drawto_command_groups__CommandsAssignment_in_rulemoveto_drawto_command_groups155);
            rule__Moveto_drawto_command_groups__CommandsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMoveto_drawto_command_groupsAccess().getCommandsAssignment()); 

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
    // $ANTLR end "rulemoveto_drawto_command_groups"


    // $ANTLR start "entryRulemoveto_drawto_command_group"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:116:1: entryRulemoveto_drawto_command_group : rulemoveto_drawto_command_group EOF ;
    public final void entryRulemoveto_drawto_command_group() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:117:1: ( rulemoveto_drawto_command_group EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:118:1: rulemoveto_drawto_command_group EOF
            {
             before(grammarAccess.getMoveto_drawto_command_groupRule()); 
            pushFollow(FOLLOW_rulemoveto_drawto_command_group_in_entryRulemoveto_drawto_command_group182);
            rulemoveto_drawto_command_group();

            state._fsp--;

             after(grammarAccess.getMoveto_drawto_command_groupRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemoveto_drawto_command_group189); 

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
    // $ANTLR end "entryRulemoveto_drawto_command_group"


    // $ANTLR start "rulemoveto_drawto_command_group"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:125:1: rulemoveto_drawto_command_group : ( ( rule__Moveto_drawto_command_group__Group__0 ) ) ;
    public final void rulemoveto_drawto_command_group() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:129:2: ( ( ( rule__Moveto_drawto_command_group__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:130:1: ( ( rule__Moveto_drawto_command_group__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:130:1: ( ( rule__Moveto_drawto_command_group__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:131:1: ( rule__Moveto_drawto_command_group__Group__0 )
            {
             before(grammarAccess.getMoveto_drawto_command_groupAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:132:1: ( rule__Moveto_drawto_command_group__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:132:2: rule__Moveto_drawto_command_group__Group__0
            {
            pushFollow(FOLLOW_rule__Moveto_drawto_command_group__Group__0_in_rulemoveto_drawto_command_group215);
            rule__Moveto_drawto_command_group__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveto_drawto_command_groupAccess().getGroup()); 

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
    // $ANTLR end "rulemoveto_drawto_command_group"


    // $ANTLR start "entryRulemoveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:144:1: entryRulemoveto : rulemoveto EOF ;
    public final void entryRulemoveto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:145:1: ( rulemoveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:146:1: rulemoveto EOF
            {
             before(grammarAccess.getMovetoRule()); 
            pushFollow(FOLLOW_rulemoveto_in_entryRulemoveto242);
            rulemoveto();

            state._fsp--;

             after(grammarAccess.getMovetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulemoveto249); 

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
    // $ANTLR end "entryRulemoveto"


    // $ANTLR start "rulemoveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:153:1: rulemoveto : ( ( rule__Moveto__Group__0 ) ) ;
    public final void rulemoveto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:157:2: ( ( ( rule__Moveto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:158:1: ( ( rule__Moveto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:158:1: ( ( rule__Moveto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:159:1: ( rule__Moveto__Group__0 )
            {
             before(grammarAccess.getMovetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:160:1: ( rule__Moveto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:160:2: rule__Moveto__Group__0
            {
            pushFollow(FOLLOW_rule__Moveto__Group__0_in_rulemoveto275);
            rule__Moveto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovetoAccess().getGroup()); 

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
    // $ANTLR end "rulemoveto"


    // $ANTLR start "entryRulelineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:172:1: entryRulelineto_argument_sequence : rulelineto_argument_sequence EOF ;
    public final void entryRulelineto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:173:1: ( rulelineto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:174:1: rulelineto_argument_sequence EOF
            {
             before(grammarAccess.getLineto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulelineto_argument_sequence_in_entryRulelineto_argument_sequence302);
            rulelineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getLineto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelineto_argument_sequence309); 

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
    // $ANTLR end "entryRulelineto_argument_sequence"


    // $ANTLR start "rulelineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:181:1: rulelineto_argument_sequence : ( ( rule__Lineto_argument_sequence__Group__0 ) ) ;
    public final void rulelineto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:185:2: ( ( ( rule__Lineto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:186:1: ( ( rule__Lineto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:186:1: ( ( rule__Lineto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:187:1: ( rule__Lineto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:188:1: ( rule__Lineto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:188:2: rule__Lineto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group__0_in_rulelineto_argument_sequence335);
            rule__Lineto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLineto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulelineto_argument_sequence"


    // $ANTLR start "entryRuledrawto_commands"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:200:1: entryRuledrawto_commands : ruledrawto_commands EOF ;
    public final void entryRuledrawto_commands() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:201:1: ( ruledrawto_commands EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:202:1: ruledrawto_commands EOF
            {
             before(grammarAccess.getDrawto_commandsRule()); 
            pushFollow(FOLLOW_ruledrawto_commands_in_entryRuledrawto_commands362);
            ruledrawto_commands();

            state._fsp--;

             after(grammarAccess.getDrawto_commandsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledrawto_commands369); 

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
    // $ANTLR end "entryRuledrawto_commands"


    // $ANTLR start "ruledrawto_commands"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:209:1: ruledrawto_commands : ( ( ( rule__Drawto_commands__Drawto_commandsAssignment ) ) ( ( rule__Drawto_commands__Drawto_commandsAssignment )* ) ) ;
    public final void ruledrawto_commands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:213:2: ( ( ( ( rule__Drawto_commands__Drawto_commandsAssignment ) ) ( ( rule__Drawto_commands__Drawto_commandsAssignment )* ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:214:1: ( ( ( rule__Drawto_commands__Drawto_commandsAssignment ) ) ( ( rule__Drawto_commands__Drawto_commandsAssignment )* ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:214:1: ( ( ( rule__Drawto_commands__Drawto_commandsAssignment ) ) ( ( rule__Drawto_commands__Drawto_commandsAssignment )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:215:1: ( ( rule__Drawto_commands__Drawto_commandsAssignment ) ) ( ( rule__Drawto_commands__Drawto_commandsAssignment )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:215:1: ( ( rule__Drawto_commands__Drawto_commandsAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:216:1: ( rule__Drawto_commands__Drawto_commandsAssignment )
            {
             before(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:217:1: ( rule__Drawto_commands__Drawto_commandsAssignment )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:217:2: rule__Drawto_commands__Drawto_commandsAssignment
            {
            pushFollow(FOLLOW_rule__Drawto_commands__Drawto_commandsAssignment_in_ruledrawto_commands397);
            rule__Drawto_commands__Drawto_commandsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsAssignment()); 

            }

            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:220:1: ( ( rule__Drawto_commands__Drawto_commandsAssignment )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:221:1: ( rule__Drawto_commands__Drawto_commandsAssignment )*
            {
             before(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:222:1: ( rule__Drawto_commands__Drawto_commandsAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=8 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:222:2: rule__Drawto_commands__Drawto_commandsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Drawto_commands__Drawto_commandsAssignment_in_ruledrawto_commands409);
            	    rule__Drawto_commands__Drawto_commandsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsAssignment()); 

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
    // $ANTLR end "ruledrawto_commands"


    // $ANTLR start "entryRuledrawto_command"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:235:1: entryRuledrawto_command : ruledrawto_command EOF ;
    public final void entryRuledrawto_command() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:236:1: ( ruledrawto_command EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:237:1: ruledrawto_command EOF
            {
             before(grammarAccess.getDrawto_commandRule()); 
            pushFollow(FOLLOW_ruledrawto_command_in_entryRuledrawto_command439);
            ruledrawto_command();

            state._fsp--;

             after(grammarAccess.getDrawto_commandRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledrawto_command446); 

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
    // $ANTLR end "entryRuledrawto_command"


    // $ANTLR start "ruledrawto_command"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:244:1: ruledrawto_command : ( ( rule__Drawto_command__Alternatives ) ) ;
    public final void ruledrawto_command() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:248:2: ( ( ( rule__Drawto_command__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:249:1: ( ( rule__Drawto_command__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:249:1: ( ( rule__Drawto_command__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:250:1: ( rule__Drawto_command__Alternatives )
            {
             before(grammarAccess.getDrawto_commandAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:251:1: ( rule__Drawto_command__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:251:2: rule__Drawto_command__Alternatives
            {
            pushFollow(FOLLOW_rule__Drawto_command__Alternatives_in_ruledrawto_command472);
            rule__Drawto_command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDrawto_commandAccess().getAlternatives()); 

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
    // $ANTLR end "ruledrawto_command"


    // $ANTLR start "entryRuleclosepath"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:263:1: entryRuleclosepath : ruleclosepath EOF ;
    public final void entryRuleclosepath() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:264:1: ( ruleclosepath EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:265:1: ruleclosepath EOF
            {
             before(grammarAccess.getClosepathRule()); 
            pushFollow(FOLLOW_ruleclosepath_in_entryRuleclosepath499);
            ruleclosepath();

            state._fsp--;

             after(grammarAccess.getClosepathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleclosepath506); 

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
    // $ANTLR end "entryRuleclosepath"


    // $ANTLR start "ruleclosepath"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:272:1: ruleclosepath : ( ( rule__Closepath__Group__0 ) ) ;
    public final void ruleclosepath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:276:2: ( ( ( rule__Closepath__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:277:1: ( ( rule__Closepath__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:277:1: ( ( rule__Closepath__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:278:1: ( rule__Closepath__Group__0 )
            {
             before(grammarAccess.getClosepathAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:279:1: ( rule__Closepath__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:279:2: rule__Closepath__Group__0
            {
            pushFollow(FOLLOW_rule__Closepath__Group__0_in_ruleclosepath532);
            rule__Closepath__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClosepathAccess().getGroup()); 

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
    // $ANTLR end "ruleclosepath"


    // $ANTLR start "entryRulelineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:291:1: entryRulelineto : rulelineto EOF ;
    public final void entryRulelineto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:292:1: ( rulelineto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:293:1: rulelineto EOF
            {
             before(grammarAccess.getLinetoRule()); 
            pushFollow(FOLLOW_rulelineto_in_entryRulelineto559);
            rulelineto();

            state._fsp--;

             after(grammarAccess.getLinetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulelineto566); 

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
    // $ANTLR end "entryRulelineto"


    // $ANTLR start "rulelineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:300:1: rulelineto : ( ( rule__Lineto__Group__0 ) ) ;
    public final void rulelineto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:304:2: ( ( ( rule__Lineto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:305:1: ( ( rule__Lineto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:305:1: ( ( rule__Lineto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:306:1: ( rule__Lineto__Group__0 )
            {
             before(grammarAccess.getLinetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:307:1: ( rule__Lineto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:307:2: rule__Lineto__Group__0
            {
            pushFollow(FOLLOW_rule__Lineto__Group__0_in_rulelineto592);
            rule__Lineto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinetoAccess().getGroup()); 

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
    // $ANTLR end "rulelineto"


    // $ANTLR start "entryRulehorizontal_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:319:1: entryRulehorizontal_lineto : rulehorizontal_lineto EOF ;
    public final void entryRulehorizontal_lineto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:320:1: ( rulehorizontal_lineto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:321:1: rulehorizontal_lineto EOF
            {
             before(grammarAccess.getHorizontal_linetoRule()); 
            pushFollow(FOLLOW_rulehorizontal_lineto_in_entryRulehorizontal_lineto619);
            rulehorizontal_lineto();

            state._fsp--;

             after(grammarAccess.getHorizontal_linetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulehorizontal_lineto626); 

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
    // $ANTLR end "entryRulehorizontal_lineto"


    // $ANTLR start "rulehorizontal_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:328:1: rulehorizontal_lineto : ( ( rule__Horizontal_lineto__Group__0 ) ) ;
    public final void rulehorizontal_lineto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:332:2: ( ( ( rule__Horizontal_lineto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:333:1: ( ( rule__Horizontal_lineto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:333:1: ( ( rule__Horizontal_lineto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:334:1: ( rule__Horizontal_lineto__Group__0 )
            {
             before(grammarAccess.getHorizontal_linetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:335:1: ( rule__Horizontal_lineto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:335:2: rule__Horizontal_lineto__Group__0
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto__Group__0_in_rulehorizontal_lineto652);
            rule__Horizontal_lineto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontal_linetoAccess().getGroup()); 

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
    // $ANTLR end "rulehorizontal_lineto"


    // $ANTLR start "entryRulehorizontal_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:347:1: entryRulehorizontal_lineto_argument_sequence : rulehorizontal_lineto_argument_sequence EOF ;
    public final void entryRulehorizontal_lineto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:348:1: ( rulehorizontal_lineto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:349:1: rulehorizontal_lineto_argument_sequence EOF
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulehorizontal_lineto_argument_sequence_in_entryRulehorizontal_lineto_argument_sequence679);
            rulehorizontal_lineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getHorizontal_lineto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulehorizontal_lineto_argument_sequence686); 

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
    // $ANTLR end "entryRulehorizontal_lineto_argument_sequence"


    // $ANTLR start "rulehorizontal_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:356:1: rulehorizontal_lineto_argument_sequence : ( ( rule__Horizontal_lineto_argument_sequence__Group__0 ) ) ;
    public final void rulehorizontal_lineto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:360:2: ( ( ( rule__Horizontal_lineto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:361:1: ( ( rule__Horizontal_lineto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:361:1: ( ( rule__Horizontal_lineto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:362:1: ( rule__Horizontal_lineto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:363:1: ( rule__Horizontal_lineto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:363:2: rule__Horizontal_lineto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__0_in_rulehorizontal_lineto_argument_sequence712);
            rule__Horizontal_lineto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulehorizontal_lineto_argument_sequence"


    // $ANTLR start "entryRulevertical_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:375:1: entryRulevertical_lineto : rulevertical_lineto EOF ;
    public final void entryRulevertical_lineto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:376:1: ( rulevertical_lineto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:377:1: rulevertical_lineto EOF
            {
             before(grammarAccess.getVertical_linetoRule()); 
            pushFollow(FOLLOW_rulevertical_lineto_in_entryRulevertical_lineto739);
            rulevertical_lineto();

            state._fsp--;

             after(grammarAccess.getVertical_linetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevertical_lineto746); 

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
    // $ANTLR end "entryRulevertical_lineto"


    // $ANTLR start "rulevertical_lineto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:384:1: rulevertical_lineto : ( ( rule__Vertical_lineto__Group__0 ) ) ;
    public final void rulevertical_lineto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:388:2: ( ( ( rule__Vertical_lineto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:389:1: ( ( rule__Vertical_lineto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:389:1: ( ( rule__Vertical_lineto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:390:1: ( rule__Vertical_lineto__Group__0 )
            {
             before(grammarAccess.getVertical_linetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:391:1: ( rule__Vertical_lineto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:391:2: rule__Vertical_lineto__Group__0
            {
            pushFollow(FOLLOW_rule__Vertical_lineto__Group__0_in_rulevertical_lineto772);
            rule__Vertical_lineto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVertical_linetoAccess().getGroup()); 

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
    // $ANTLR end "rulevertical_lineto"


    // $ANTLR start "entryRulevertical_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:403:1: entryRulevertical_lineto_argument_sequence : rulevertical_lineto_argument_sequence EOF ;
    public final void entryRulevertical_lineto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:404:1: ( rulevertical_lineto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:405:1: rulevertical_lineto_argument_sequence EOF
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulevertical_lineto_argument_sequence_in_entryRulevertical_lineto_argument_sequence799);
            rulevertical_lineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getVertical_lineto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulevertical_lineto_argument_sequence806); 

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
    // $ANTLR end "entryRulevertical_lineto_argument_sequence"


    // $ANTLR start "rulevertical_lineto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:412:1: rulevertical_lineto_argument_sequence : ( ( rule__Vertical_lineto_argument_sequence__Group__0 ) ) ;
    public final void rulevertical_lineto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:416:2: ( ( ( rule__Vertical_lineto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:417:1: ( ( rule__Vertical_lineto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:417:1: ( ( rule__Vertical_lineto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:418:1: ( rule__Vertical_lineto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:419:1: ( rule__Vertical_lineto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:419:2: rule__Vertical_lineto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group__0_in_rulevertical_lineto_argument_sequence832);
            rule__Vertical_lineto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulevertical_lineto_argument_sequence"


    // $ANTLR start "entryRulecurveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:431:1: entryRulecurveto : rulecurveto EOF ;
    public final void entryRulecurveto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:432:1: ( rulecurveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:433:1: rulecurveto EOF
            {
             before(grammarAccess.getCurvetoRule()); 
            pushFollow(FOLLOW_rulecurveto_in_entryRulecurveto859);
            rulecurveto();

            state._fsp--;

             after(grammarAccess.getCurvetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecurveto866); 

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
    // $ANTLR end "entryRulecurveto"


    // $ANTLR start "rulecurveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:440:1: rulecurveto : ( ( rule__Curveto__Group__0 ) ) ;
    public final void rulecurveto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:444:2: ( ( ( rule__Curveto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:445:1: ( ( rule__Curveto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:445:1: ( ( rule__Curveto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:446:1: ( rule__Curveto__Group__0 )
            {
             before(grammarAccess.getCurvetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:447:1: ( rule__Curveto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:447:2: rule__Curveto__Group__0
            {
            pushFollow(FOLLOW_rule__Curveto__Group__0_in_rulecurveto892);
            rule__Curveto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCurvetoAccess().getGroup()); 

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
    // $ANTLR end "rulecurveto"


    // $ANTLR start "entryRulecurveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:459:1: entryRulecurveto_argument_sequence : rulecurveto_argument_sequence EOF ;
    public final void entryRulecurveto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:460:1: ( rulecurveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:461:1: rulecurveto_argument_sequence EOF
            {
             before(grammarAccess.getCurveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulecurveto_argument_sequence_in_entryRulecurveto_argument_sequence919);
            rulecurveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getCurveto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecurveto_argument_sequence926); 

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
    // $ANTLR end "entryRulecurveto_argument_sequence"


    // $ANTLR start "rulecurveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:468:1: rulecurveto_argument_sequence : ( ( rule__Curveto_argument_sequence__Group__0 ) ) ;
    public final void rulecurveto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:472:2: ( ( ( rule__Curveto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:473:1: ( ( rule__Curveto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:473:1: ( ( rule__Curveto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:474:1: ( rule__Curveto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:475:1: ( rule__Curveto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:475:2: rule__Curveto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group__0_in_rulecurveto_argument_sequence952);
            rule__Curveto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulecurveto_argument_sequence"


    // $ANTLR start "entryRulecurveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:487:1: entryRulecurveto_argument : rulecurveto_argument EOF ;
    public final void entryRulecurveto_argument() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:488:1: ( rulecurveto_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:489:1: rulecurveto_argument EOF
            {
             before(grammarAccess.getCurveto_argumentRule()); 
            pushFollow(FOLLOW_rulecurveto_argument_in_entryRulecurveto_argument979);
            rulecurveto_argument();

            state._fsp--;

             after(grammarAccess.getCurveto_argumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecurveto_argument986); 

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
    // $ANTLR end "entryRulecurveto_argument"


    // $ANTLR start "rulecurveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:496:1: rulecurveto_argument : ( ( rule__Curveto_argument__Group__0 ) ) ;
    public final void rulecurveto_argument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:500:2: ( ( ( rule__Curveto_argument__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:501:1: ( ( rule__Curveto_argument__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:501:1: ( ( rule__Curveto_argument__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:502:1: ( rule__Curveto_argument__Group__0 )
            {
             before(grammarAccess.getCurveto_argumentAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:503:1: ( rule__Curveto_argument__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:503:2: rule__Curveto_argument__Group__0
            {
            pushFollow(FOLLOW_rule__Curveto_argument__Group__0_in_rulecurveto_argument1012);
            rule__Curveto_argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argumentAccess().getGroup()); 

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
    // $ANTLR end "rulecurveto_argument"


    // $ANTLR start "entryRulesmooth_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:515:1: entryRulesmooth_curveto : rulesmooth_curveto EOF ;
    public final void entryRulesmooth_curveto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:516:1: ( rulesmooth_curveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:517:1: rulesmooth_curveto EOF
            {
             before(grammarAccess.getSmooth_curvetoRule()); 
            pushFollow(FOLLOW_rulesmooth_curveto_in_entryRulesmooth_curveto1039);
            rulesmooth_curveto();

            state._fsp--;

             after(grammarAccess.getSmooth_curvetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_curveto1046); 

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
    // $ANTLR end "entryRulesmooth_curveto"


    // $ANTLR start "rulesmooth_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:524:1: rulesmooth_curveto : ( ( rule__Smooth_curveto__Group__0 ) ) ;
    public final void rulesmooth_curveto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:528:2: ( ( ( rule__Smooth_curveto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:529:1: ( ( rule__Smooth_curveto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:529:1: ( ( rule__Smooth_curveto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:530:1: ( rule__Smooth_curveto__Group__0 )
            {
             before(grammarAccess.getSmooth_curvetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:531:1: ( rule__Smooth_curveto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:531:2: rule__Smooth_curveto__Group__0
            {
            pushFollow(FOLLOW_rule__Smooth_curveto__Group__0_in_rulesmooth_curveto1072);
            rule__Smooth_curveto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curvetoAccess().getGroup()); 

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
    // $ANTLR end "rulesmooth_curveto"


    // $ANTLR start "entryRulesmooth_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:543:1: entryRulesmooth_curveto_argument_sequence : rulesmooth_curveto_argument_sequence EOF ;
    public final void entryRulesmooth_curveto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:544:1: ( rulesmooth_curveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:545:1: rulesmooth_curveto_argument_sequence EOF
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_sequence_in_entryRulesmooth_curveto_argument_sequence1099);
            rulesmooth_curveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getSmooth_curveto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_curveto_argument_sequence1106); 

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
    // $ANTLR end "entryRulesmooth_curveto_argument_sequence"


    // $ANTLR start "rulesmooth_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:552:1: rulesmooth_curveto_argument_sequence : ( ( rule__Smooth_curveto_argument_sequence__Group__0 ) ) ;
    public final void rulesmooth_curveto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:556:2: ( ( ( rule__Smooth_curveto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:557:1: ( ( rule__Smooth_curveto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:557:1: ( ( rule__Smooth_curveto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:558:1: ( rule__Smooth_curveto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:559:1: ( rule__Smooth_curveto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:559:2: rule__Smooth_curveto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group__0_in_rulesmooth_curveto_argument_sequence1132);
            rule__Smooth_curveto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulesmooth_curveto_argument_sequence"


    // $ANTLR start "entryRulesmooth_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:571:1: entryRulesmooth_curveto_argument : rulesmooth_curveto_argument EOF ;
    public final void entryRulesmooth_curveto_argument() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:572:1: ( rulesmooth_curveto_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:573:1: rulesmooth_curveto_argument EOF
            {
             before(grammarAccess.getSmooth_curveto_argumentRule()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_in_entryRulesmooth_curveto_argument1159);
            rulesmooth_curveto_argument();

            state._fsp--;

             after(grammarAccess.getSmooth_curveto_argumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_curveto_argument1166); 

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
    // $ANTLR end "entryRulesmooth_curveto_argument"


    // $ANTLR start "rulesmooth_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:580:1: rulesmooth_curveto_argument : ( ( rule__Smooth_curveto_argument__Group__0 ) ) ;
    public final void rulesmooth_curveto_argument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:584:2: ( ( ( rule__Smooth_curveto_argument__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:585:1: ( ( rule__Smooth_curveto_argument__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:585:1: ( ( rule__Smooth_curveto_argument__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:586:1: ( rule__Smooth_curveto_argument__Group__0 )
            {
             before(grammarAccess.getSmooth_curveto_argumentAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:587:1: ( rule__Smooth_curveto_argument__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:587:2: rule__Smooth_curveto_argument__Group__0
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument__Group__0_in_rulesmooth_curveto_argument1192);
            rule__Smooth_curveto_argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curveto_argumentAccess().getGroup()); 

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
    // $ANTLR end "rulesmooth_curveto_argument"


    // $ANTLR start "entryRulequadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:599:1: entryRulequadratic_bezier_curveto : rulequadratic_bezier_curveto EOF ;
    public final void entryRulequadratic_bezier_curveto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:600:1: ( rulequadratic_bezier_curveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:601:1: rulequadratic_bezier_curveto EOF
            {
             before(grammarAccess.getQuadratic_bezier_curvetoRule()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_in_entryRulequadratic_bezier_curveto1219);
            rulequadratic_bezier_curveto();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curvetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulequadratic_bezier_curveto1226); 

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
    // $ANTLR end "entryRulequadratic_bezier_curveto"


    // $ANTLR start "rulequadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:608:1: rulequadratic_bezier_curveto : ( ( rule__Quadratic_bezier_curveto__Group__0 ) ) ;
    public final void rulequadratic_bezier_curveto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:612:2: ( ( ( rule__Quadratic_bezier_curveto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:613:1: ( ( rule__Quadratic_bezier_curveto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:613:1: ( ( rule__Quadratic_bezier_curveto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:614:1: ( rule__Quadratic_bezier_curveto__Group__0 )
            {
             before(grammarAccess.getQuadratic_bezier_curvetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:615:1: ( rule__Quadratic_bezier_curveto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:615:2: rule__Quadratic_bezier_curveto__Group__0
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto__Group__0_in_rulequadratic_bezier_curveto1252);
            rule__Quadratic_bezier_curveto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curvetoAccess().getGroup()); 

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
    // $ANTLR end "rulequadratic_bezier_curveto"


    // $ANTLR start "entryRulequadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:627:1: entryRulequadratic_bezier_curveto_argument_sequence : rulequadratic_bezier_curveto_argument_sequence EOF ;
    public final void entryRulequadratic_bezier_curveto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:628:1: ( rulequadratic_bezier_curveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:629:1: rulequadratic_bezier_curveto_argument_sequence EOF
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_entryRulequadratic_bezier_curveto_argument_sequence1279);
            rulequadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument_sequence1286); 

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
    // $ANTLR end "entryRulequadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "rulequadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:636:1: rulequadratic_bezier_curveto_argument_sequence : ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0 ) ) ;
    public final void rulequadratic_bezier_curveto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:640:2: ( ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:641:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:641:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:642:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:643:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:643:2: rule__Quadratic_bezier_curveto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__0_in_rulequadratic_bezier_curveto_argument_sequence1312);
            rule__Quadratic_bezier_curveto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulequadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "entryRulequadratic_bezier_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:655:1: entryRulequadratic_bezier_curveto_argument : rulequadratic_bezier_curveto_argument EOF ;
    public final void entryRulequadratic_bezier_curveto_argument() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:656:1: ( rulequadratic_bezier_curveto_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:657:1: rulequadratic_bezier_curveto_argument EOF
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentRule()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_in_entryRulequadratic_bezier_curveto_argument1339);
            rulequadratic_bezier_curveto_argument();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curveto_argumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument1346); 

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
    // $ANTLR end "entryRulequadratic_bezier_curveto_argument"


    // $ANTLR start "rulequadratic_bezier_curveto_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:664:1: rulequadratic_bezier_curveto_argument : ( ( rule__Quadratic_bezier_curveto_argument__Group__0 ) ) ;
    public final void rulequadratic_bezier_curveto_argument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:668:2: ( ( ( rule__Quadratic_bezier_curveto_argument__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:669:1: ( ( rule__Quadratic_bezier_curveto_argument__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:669:1: ( ( rule__Quadratic_bezier_curveto_argument__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:670:1: ( rule__Quadratic_bezier_curveto_argument__Group__0 )
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:671:1: ( rule__Quadratic_bezier_curveto_argument__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:671:2: rule__Quadratic_bezier_curveto_argument__Group__0
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__0_in_rulequadratic_bezier_curveto_argument1372);
            rule__Quadratic_bezier_curveto_argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getGroup()); 

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
    // $ANTLR end "rulequadratic_bezier_curveto_argument"


    // $ANTLR start "entryRulesmooth_quadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:683:1: entryRulesmooth_quadratic_bezier_curveto : rulesmooth_quadratic_bezier_curveto EOF ;
    public final void entryRulesmooth_quadratic_bezier_curveto() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:684:1: ( rulesmooth_quadratic_bezier_curveto EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:685:1: rulesmooth_quadratic_bezier_curveto EOF
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curvetoRule()); 
            pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_in_entryRulesmooth_quadratic_bezier_curveto1399);
            rulesmooth_quadratic_bezier_curveto();

            state._fsp--;

             after(grammarAccess.getSmooth_quadratic_bezier_curvetoRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto1406); 

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
    // $ANTLR end "entryRulesmooth_quadratic_bezier_curveto"


    // $ANTLR start "rulesmooth_quadratic_bezier_curveto"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:692:1: rulesmooth_quadratic_bezier_curveto : ( ( rule__Smooth_quadratic_bezier_curveto__Group__0 ) ) ;
    public final void rulesmooth_quadratic_bezier_curveto() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:696:2: ( ( ( rule__Smooth_quadratic_bezier_curveto__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:697:1: ( ( rule__Smooth_quadratic_bezier_curveto__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:697:1: ( ( rule__Smooth_quadratic_bezier_curveto__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:698:1: ( rule__Smooth_quadratic_bezier_curveto__Group__0 )
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:699:1: ( rule__Smooth_quadratic_bezier_curveto__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:699:2: rule__Smooth_quadratic_bezier_curveto__Group__0
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__0_in_rulesmooth_quadratic_bezier_curveto1432);
            rule__Smooth_quadratic_bezier_curveto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getGroup()); 

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
    // $ANTLR end "rulesmooth_quadratic_bezier_curveto"


    // $ANTLR start "entryRulesmooth_quadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:711:1: entryRulesmooth_quadratic_bezier_curveto_argument_sequence : rulesmooth_quadratic_bezier_curveto_argument_sequence EOF ;
    public final void entryRulesmooth_quadratic_bezier_curveto_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:712:1: ( rulesmooth_quadratic_bezier_curveto_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:713:1: rulesmooth_quadratic_bezier_curveto_argument_sequence EOF
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceRule()); 
            pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence1459);
            rulesmooth_quadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence1466); 

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
    // $ANTLR end "entryRulesmooth_quadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "rulesmooth_quadratic_bezier_curveto_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:720:1: rulesmooth_quadratic_bezier_curveto_argument_sequence : ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 ) ) ;
    public final void rulesmooth_quadratic_bezier_curveto_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:724:2: ( ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:725:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:725:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:726:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 )
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:727:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:727:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0_in_rulesmooth_quadratic_bezier_curveto_argument_sequence1492);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "rulesmooth_quadratic_bezier_curveto_argument_sequence"


    // $ANTLR start "entryRuleelliptical_arc"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:739:1: entryRuleelliptical_arc : ruleelliptical_arc EOF ;
    public final void entryRuleelliptical_arc() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:740:1: ( ruleelliptical_arc EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:741:1: ruleelliptical_arc EOF
            {
             before(grammarAccess.getElliptical_arcRule()); 
            pushFollow(FOLLOW_ruleelliptical_arc_in_entryRuleelliptical_arc1519);
            ruleelliptical_arc();

            state._fsp--;

             after(grammarAccess.getElliptical_arcRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelliptical_arc1526); 

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
    // $ANTLR end "entryRuleelliptical_arc"


    // $ANTLR start "ruleelliptical_arc"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:748:1: ruleelliptical_arc : ( ( rule__Elliptical_arc__Group__0 ) ) ;
    public final void ruleelliptical_arc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:752:2: ( ( ( rule__Elliptical_arc__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:753:1: ( ( rule__Elliptical_arc__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:753:1: ( ( rule__Elliptical_arc__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:754:1: ( rule__Elliptical_arc__Group__0 )
            {
             before(grammarAccess.getElliptical_arcAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:755:1: ( rule__Elliptical_arc__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:755:2: rule__Elliptical_arc__Group__0
            {
            pushFollow(FOLLOW_rule__Elliptical_arc__Group__0_in_ruleelliptical_arc1552);
            rule__Elliptical_arc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arcAccess().getGroup()); 

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
    // $ANTLR end "ruleelliptical_arc"


    // $ANTLR start "entryRuleelliptical_arc_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:767:1: entryRuleelliptical_arc_argument_sequence : ruleelliptical_arc_argument_sequence EOF ;
    public final void entryRuleelliptical_arc_argument_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:768:1: ( ruleelliptical_arc_argument_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:769:1: ruleelliptical_arc_argument_sequence EOF
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceRule()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_sequence_in_entryRuleelliptical_arc_argument_sequence1579);
            ruleelliptical_arc_argument_sequence();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argument_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelliptical_arc_argument_sequence1586); 

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
    // $ANTLR end "entryRuleelliptical_arc_argument_sequence"


    // $ANTLR start "ruleelliptical_arc_argument_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:776:1: ruleelliptical_arc_argument_sequence : ( ( rule__Elliptical_arc_argument_sequence__Group__0 ) ) ;
    public final void ruleelliptical_arc_argument_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:780:2: ( ( ( rule__Elliptical_arc_argument_sequence__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:781:1: ( ( rule__Elliptical_arc_argument_sequence__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:781:1: ( ( rule__Elliptical_arc_argument_sequence__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:782:1: ( rule__Elliptical_arc_argument_sequence__Group__0 )
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:783:1: ( rule__Elliptical_arc_argument_sequence__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:783:2: rule__Elliptical_arc_argument_sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group__0_in_ruleelliptical_arc_argument_sequence1612);
            rule__Elliptical_arc_argument_sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleelliptical_arc_argument_sequence"


    // $ANTLR start "entryRuleelliptical_arc_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:795:1: entryRuleelliptical_arc_argument : ruleelliptical_arc_argument EOF ;
    public final void entryRuleelliptical_arc_argument() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:796:1: ( ruleelliptical_arc_argument EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:797:1: ruleelliptical_arc_argument EOF
            {
             before(grammarAccess.getElliptical_arc_argumentRule()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_in_entryRuleelliptical_arc_argument1639);
            ruleelliptical_arc_argument();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleelliptical_arc_argument1646); 

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
    // $ANTLR end "entryRuleelliptical_arc_argument"


    // $ANTLR start "ruleelliptical_arc_argument"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:804:1: ruleelliptical_arc_argument : ( ( rule__Elliptical_arc_argument__Group__0 ) ) ;
    public final void ruleelliptical_arc_argument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:808:2: ( ( ( rule__Elliptical_arc_argument__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:809:1: ( ( rule__Elliptical_arc_argument__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:809:1: ( ( rule__Elliptical_arc_argument__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:810:1: ( rule__Elliptical_arc_argument__Group__0 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:811:1: ( rule__Elliptical_arc_argument__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:811:2: rule__Elliptical_arc_argument__Group__0
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__0_in_ruleelliptical_arc_argument1672);
            rule__Elliptical_arc_argument__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getGroup()); 

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
    // $ANTLR end "ruleelliptical_arc_argument"


    // $ANTLR start "entryRulecoordinate_pair"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:823:1: entryRulecoordinate_pair : rulecoordinate_pair EOF ;
    public final void entryRulecoordinate_pair() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:824:1: ( rulecoordinate_pair EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:825:1: rulecoordinate_pair EOF
            {
             before(grammarAccess.getCoordinate_pairRule()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_entryRulecoordinate_pair1699);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getCoordinate_pairRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecoordinate_pair1706); 

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
    // $ANTLR end "entryRulecoordinate_pair"


    // $ANTLR start "rulecoordinate_pair"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:832:1: rulecoordinate_pair : ( ( rule__Coordinate_pair__Group__0 ) ) ;
    public final void rulecoordinate_pair() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:836:2: ( ( ( rule__Coordinate_pair__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:837:1: ( ( rule__Coordinate_pair__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:837:1: ( ( rule__Coordinate_pair__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:838:1: ( rule__Coordinate_pair__Group__0 )
            {
             before(grammarAccess.getCoordinate_pairAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:839:1: ( rule__Coordinate_pair__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:839:2: rule__Coordinate_pair__Group__0
            {
            pushFollow(FOLLOW_rule__Coordinate_pair__Group__0_in_rulecoordinate_pair1732);
            rule__Coordinate_pair__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinate_pairAccess().getGroup()); 

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
    // $ANTLR end "rulecoordinate_pair"


    // $ANTLR start "entryRulecomma"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:851:1: entryRulecomma : rulecomma EOF ;
    public final void entryRulecomma() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:852:1: ( rulecomma EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:853:1: rulecomma EOF
            {
             before(grammarAccess.getCommaRule()); 
            pushFollow(FOLLOW_rulecomma_in_entryRulecomma1759);
            rulecomma();

            state._fsp--;

             after(grammarAccess.getCommaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecomma1766); 

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
    // $ANTLR end "entryRulecomma"


    // $ANTLR start "rulecomma"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:860:1: rulecomma : ( ',' ) ;
    public final void rulecomma() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:864:2: ( ( ',' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:865:1: ( ',' )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:865:1: ( ',' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:866:1: ','
            {
             before(grammarAccess.getCommaAccess().getCommaKeyword()); 
            match(input,5,FOLLOW_5_in_rulecomma1793); 
             after(grammarAccess.getCommaAccess().getCommaKeyword()); 

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
    // $ANTLR end "rulecomma"


    // $ANTLR start "entryRulecoordinate"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:881:1: entryRulecoordinate : rulecoordinate EOF ;
    public final void entryRulecoordinate() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:882:1: ( rulecoordinate EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:883:1: rulecoordinate EOF
            {
             before(grammarAccess.getCoordinateRule()); 
            pushFollow(FOLLOW_rulecoordinate_in_entryRulecoordinate1821);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulecoordinate1828); 

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
    // $ANTLR end "entryRulecoordinate"


    // $ANTLR start "rulecoordinate"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:890:1: rulecoordinate : ( rulenumber ) ;
    public final void rulecoordinate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:894:2: ( ( rulenumber ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:895:1: ( rulenumber )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:895:1: ( rulenumber )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:896:1: rulenumber
            {
             before(grammarAccess.getCoordinateAccess().getNumberParserRuleCall()); 
            pushFollow(FOLLOW_rulenumber_in_rulecoordinate1854);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getCoordinateAccess().getNumberParserRuleCall()); 

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
    // $ANTLR end "rulecoordinate"


    // $ANTLR start "entryRulenumber"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:909:1: entryRulenumber : rulenumber EOF ;
    public final void entryRulenumber() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:910:1: ( rulenumber EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:911:1: rulenumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_rulenumber_in_entryRulenumber1880);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenumber1887); 

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
    // $ANTLR end "entryRulenumber"


    // $ANTLR start "rulenumber"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:918:1: rulenumber : ( ( rule__Number__Group__0 ) ) ;
    public final void rulenumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:922:2: ( ( ( rule__Number__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:923:1: ( ( rule__Number__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:923:1: ( ( rule__Number__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:924:1: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:925:1: ( rule__Number__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:925:2: rule__Number__Group__0
            {
            pushFollow(FOLLOW_rule__Number__Group__0_in_rulenumber1913);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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
    // $ANTLR end "rulenumber"


    // $ANTLR start "entryRulenonnegative_number"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:937:1: entryRulenonnegative_number : rulenonnegative_number EOF ;
    public final void entryRulenonnegative_number() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:938:1: ( rulenonnegative_number EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:939:1: rulenonnegative_number EOF
            {
             before(grammarAccess.getNonnegative_numberRule()); 
            pushFollow(FOLLOW_rulenonnegative_number_in_entryRulenonnegative_number1940);
            rulenonnegative_number();

            state._fsp--;

             after(grammarAccess.getNonnegative_numberRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulenonnegative_number1947); 

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
    // $ANTLR end "entryRulenonnegative_number"


    // $ANTLR start "rulenonnegative_number"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:946:1: rulenonnegative_number : ( ( rule__Nonnegative_number__Group__0 ) ) ;
    public final void rulenonnegative_number() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:950:2: ( ( ( rule__Nonnegative_number__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:951:1: ( ( rule__Nonnegative_number__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:951:1: ( ( rule__Nonnegative_number__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:952:1: ( rule__Nonnegative_number__Group__0 )
            {
             before(grammarAccess.getNonnegative_numberAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:953:1: ( rule__Nonnegative_number__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:953:2: rule__Nonnegative_number__Group__0
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__Group__0_in_rulenonnegative_number1973);
            rule__Nonnegative_number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonnegative_numberAccess().getGroup()); 

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
    // $ANTLR end "rulenonnegative_number"


    // $ANTLR start "entryRuleexponent"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:965:1: entryRuleexponent : ruleexponent EOF ;
    public final void entryRuleexponent() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:966:1: ( ruleexponent EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:967:1: ruleexponent EOF
            {
             before(grammarAccess.getExponentRule()); 
            pushFollow(FOLLOW_ruleexponent_in_entryRuleexponent2000);
            ruleexponent();

            state._fsp--;

             after(grammarAccess.getExponentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleexponent2007); 

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
    // $ANTLR end "entryRuleexponent"


    // $ANTLR start "ruleexponent"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:974:1: ruleexponent : ( ( rule__Exponent__Group__0 ) ) ;
    public final void ruleexponent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:978:2: ( ( ( rule__Exponent__Group__0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:979:1: ( ( rule__Exponent__Group__0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:979:1: ( ( rule__Exponent__Group__0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:980:1: ( rule__Exponent__Group__0 )
            {
             before(grammarAccess.getExponentAccess().getGroup()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:981:1: ( rule__Exponent__Group__0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:981:2: rule__Exponent__Group__0
            {
            pushFollow(FOLLOW_rule__Exponent__Group__0_in_ruleexponent2033);
            rule__Exponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getGroup()); 

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
    // $ANTLR end "ruleexponent"


    // $ANTLR start "entryRuledigit_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:993:1: entryRuledigit_sequence : ruledigit_sequence EOF ;
    public final void entryRuledigit_sequence() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:994:1: ( ruledigit_sequence EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:995:1: ruledigit_sequence EOF
            {
             before(grammarAccess.getDigit_sequenceRule()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence2060);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getDigit_sequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit_sequence2067); 

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
    // $ANTLR end "entryRuledigit_sequence"


    // $ANTLR start "ruledigit_sequence"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1002:1: ruledigit_sequence : ( ( rule__Digit_sequence__DigitsAssignment ) ) ;
    public final void ruledigit_sequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1006:2: ( ( ( rule__Digit_sequence__DigitsAssignment ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1007:1: ( ( rule__Digit_sequence__DigitsAssignment ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1007:1: ( ( rule__Digit_sequence__DigitsAssignment ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1008:1: ( rule__Digit_sequence__DigitsAssignment )
            {
             before(grammarAccess.getDigit_sequenceAccess().getDigitsAssignment()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1009:1: ( rule__Digit_sequence__DigitsAssignment )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1009:2: rule__Digit_sequence__DigitsAssignment
            {
            pushFollow(FOLLOW_rule__Digit_sequence__DigitsAssignment_in_ruledigit_sequence2093);
            rule__Digit_sequence__DigitsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDigit_sequenceAccess().getDigitsAssignment()); 

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
    // $ANTLR end "ruledigit_sequence"


    // $ANTLR start "entryRuledigit"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1021:1: entryRuledigit : ruledigit EOF ;
    public final void entryRuledigit() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1022:1: ( ruledigit EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1023:1: ruledigit EOF
            {
             before(grammarAccess.getDigitRule()); 
            pushFollow(FOLLOW_ruledigit_in_entryRuledigit2120);
            ruledigit();

            state._fsp--;

             after(grammarAccess.getDigitRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuledigit2127); 

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
    // $ANTLR end "entryRuledigit"


    // $ANTLR start "ruledigit"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1030:1: ruledigit : ( ( rule__Digit__Alternatives ) ) ;
    public final void ruledigit() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1034:2: ( ( ( rule__Digit__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1035:1: ( ( rule__Digit__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1035:1: ( ( rule__Digit__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1036:1: ( rule__Digit__Alternatives )
            {
             before(grammarAccess.getDigitAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1037:1: ( rule__Digit__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1037:2: rule__Digit__Alternatives
            {
            pushFollow(FOLLOW_rule__Digit__Alternatives_in_ruledigit2153);
            rule__Digit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDigitAccess().getAlternatives()); 

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
    // $ANTLR end "ruledigit"


    // $ANTLR start "entryRulesign"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1049:1: entryRulesign : rulesign EOF ;
    public final void entryRulesign() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1050:1: ( rulesign EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1051:1: rulesign EOF
            {
             before(grammarAccess.getSignRule()); 
            pushFollow(FOLLOW_rulesign_in_entryRulesign2180);
            rulesign();

            state._fsp--;

             after(grammarAccess.getSignRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulesign2187); 

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
    // $ANTLR end "entryRulesign"


    // $ANTLR start "rulesign"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1058:1: rulesign : ( ( rule__Sign__Alternatives ) ) ;
    public final void rulesign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1062:2: ( ( ( rule__Sign__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1063:1: ( ( rule__Sign__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1063:1: ( ( rule__Sign__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1064:1: ( rule__Sign__Alternatives )
            {
             before(grammarAccess.getSignAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1065:1: ( rule__Sign__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1065:2: rule__Sign__Alternatives
            {
            pushFollow(FOLLOW_rule__Sign__Alternatives_in_rulesign2213);
            rule__Sign__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignAccess().getAlternatives()); 

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
    // $ANTLR end "rulesign"


    // $ANTLR start "entryRuleflag"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1077:1: entryRuleflag : ruleflag EOF ;
    public final void entryRuleflag() throws RecognitionException {
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1078:1: ( ruleflag EOF )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1079:1: ruleflag EOF
            {
             before(grammarAccess.getFlagRule()); 
            pushFollow(FOLLOW_ruleflag_in_entryRuleflag2240);
            ruleflag();

            state._fsp--;

             after(grammarAccess.getFlagRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleflag2247); 

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
    // $ANTLR end "entryRuleflag"


    // $ANTLR start "ruleflag"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1086:1: ruleflag : ( ( rule__Flag__Alternatives ) ) ;
    public final void ruleflag() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1090:2: ( ( ( rule__Flag__Alternatives ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1091:1: ( ( rule__Flag__Alternatives ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1091:1: ( ( rule__Flag__Alternatives ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1092:1: ( rule__Flag__Alternatives )
            {
             before(grammarAccess.getFlagAccess().getAlternatives()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1093:1: ( rule__Flag__Alternatives )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1093:2: rule__Flag__Alternatives
            {
            pushFollow(FOLLOW_rule__Flag__Alternatives_in_ruleflag2273);
            rule__Flag__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFlagAccess().getAlternatives()); 

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
    // $ANTLR end "ruleflag"


    // $ANTLR start "rule__Moveto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1105:1: rule__Moveto__Alternatives_0 : ( ( 'M' ) | ( 'm' ) );
    public final void rule__Moveto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1109:1: ( ( 'M' ) | ( 'm' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==6) ) {
                alt3=1;
            }
            else if ( (LA3_0==7) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1110:1: ( 'M' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1110:1: ( 'M' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1111:1: 'M'
                    {
                     before(grammarAccess.getMovetoAccess().getMKeyword_0_0()); 
                    match(input,6,FOLLOW_6_in_rule__Moveto__Alternatives_02310); 
                     after(grammarAccess.getMovetoAccess().getMKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1118:6: ( 'm' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1118:6: ( 'm' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1119:1: 'm'
                    {
                     before(grammarAccess.getMovetoAccess().getMKeyword_0_1()); 
                    match(input,7,FOLLOW_7_in_rule__Moveto__Alternatives_02330); 
                     after(grammarAccess.getMovetoAccess().getMKeyword_0_1()); 

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
    // $ANTLR end "rule__Moveto__Alternatives_0"


    // $ANTLR start "rule__Drawto_command__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1131:1: rule__Drawto_command__Alternatives : ( ( ruleclosepath ) | ( rulelineto ) | ( rulehorizontal_lineto ) | ( rulevertical_lineto ) | ( rulecurveto ) | ( rulesmooth_curveto ) | ( rulequadratic_bezier_curveto ) | ( rulesmooth_quadratic_bezier_curveto ) | ( ruleelliptical_arc ) );
    public final void rule__Drawto_command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1135:1: ( ( ruleclosepath ) | ( rulelineto ) | ( rulehorizontal_lineto ) | ( rulevertical_lineto ) | ( rulecurveto ) | ( rulesmooth_curveto ) | ( rulequadratic_bezier_curveto ) | ( rulesmooth_quadratic_bezier_curveto ) | ( ruleelliptical_arc ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case 8:
            case 9:
                {
                alt4=1;
                }
                break;
            case 10:
            case 11:
                {
                alt4=2;
                }
                break;
            case 12:
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
            case 17:
                {
                alt4=5;
                }
                break;
            case 18:
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
            case 21:
                {
                alt4=7;
                }
                break;
            case 22:
            case 23:
                {
                alt4=8;
                }
                break;
            case 24:
            case 25:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1136:1: ( ruleclosepath )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1136:1: ( ruleclosepath )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1137:1: ruleclosepath
                    {
                     before(grammarAccess.getDrawto_commandAccess().getClosepathParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleclosepath_in_rule__Drawto_command__Alternatives2364);
                    ruleclosepath();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getClosepathParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1142:6: ( rulelineto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1142:6: ( rulelineto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1143:1: rulelineto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getLinetoParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulelineto_in_rule__Drawto_command__Alternatives2381);
                    rulelineto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getLinetoParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1148:6: ( rulehorizontal_lineto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1148:6: ( rulehorizontal_lineto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1149:1: rulehorizontal_lineto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getHorizontal_linetoParserRuleCall_2()); 
                    pushFollow(FOLLOW_rulehorizontal_lineto_in_rule__Drawto_command__Alternatives2398);
                    rulehorizontal_lineto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getHorizontal_linetoParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1154:6: ( rulevertical_lineto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1154:6: ( rulevertical_lineto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1155:1: rulevertical_lineto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getVertical_linetoParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulevertical_lineto_in_rule__Drawto_command__Alternatives2415);
                    rulevertical_lineto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getVertical_linetoParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1160:6: ( rulecurveto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1160:6: ( rulecurveto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1161:1: rulecurveto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getCurvetoParserRuleCall_4()); 
                    pushFollow(FOLLOW_rulecurveto_in_rule__Drawto_command__Alternatives2432);
                    rulecurveto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getCurvetoParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1166:6: ( rulesmooth_curveto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1166:6: ( rulesmooth_curveto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1167:1: rulesmooth_curveto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getSmooth_curvetoParserRuleCall_5()); 
                    pushFollow(FOLLOW_rulesmooth_curveto_in_rule__Drawto_command__Alternatives2449);
                    rulesmooth_curveto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getSmooth_curvetoParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1172:6: ( rulequadratic_bezier_curveto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1172:6: ( rulequadratic_bezier_curveto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1173:1: rulequadratic_bezier_curveto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getQuadratic_bezier_curvetoParserRuleCall_6()); 
                    pushFollow(FOLLOW_rulequadratic_bezier_curveto_in_rule__Drawto_command__Alternatives2466);
                    rulequadratic_bezier_curveto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getQuadratic_bezier_curvetoParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1178:6: ( rulesmooth_quadratic_bezier_curveto )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1178:6: ( rulesmooth_quadratic_bezier_curveto )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1179:1: rulesmooth_quadratic_bezier_curveto
                    {
                     before(grammarAccess.getDrawto_commandAccess().getSmooth_quadratic_bezier_curvetoParserRuleCall_7()); 
                    pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_in_rule__Drawto_command__Alternatives2483);
                    rulesmooth_quadratic_bezier_curveto();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getSmooth_quadratic_bezier_curvetoParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1184:6: ( ruleelliptical_arc )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1184:6: ( ruleelliptical_arc )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1185:1: ruleelliptical_arc
                    {
                     before(grammarAccess.getDrawto_commandAccess().getElliptical_arcParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleelliptical_arc_in_rule__Drawto_command__Alternatives2500);
                    ruleelliptical_arc();

                    state._fsp--;

                     after(grammarAccess.getDrawto_commandAccess().getElliptical_arcParserRuleCall_8()); 

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
    // $ANTLR end "rule__Drawto_command__Alternatives"


    // $ANTLR start "rule__Closepath__Alternatives_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1195:1: rule__Closepath__Alternatives_1 : ( ( 'Z' ) | ( 'z' ) );
    public final void rule__Closepath__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1199:1: ( ( 'Z' ) | ( 'z' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==8) ) {
                alt5=1;
            }
            else if ( (LA5_0==9) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1200:1: ( 'Z' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1200:1: ( 'Z' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1201:1: 'Z'
                    {
                     before(grammarAccess.getClosepathAccess().getZKeyword_1_0()); 
                    match(input,8,FOLLOW_8_in_rule__Closepath__Alternatives_12533); 
                     after(grammarAccess.getClosepathAccess().getZKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1208:6: ( 'z' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1208:6: ( 'z' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1209:1: 'z'
                    {
                     before(grammarAccess.getClosepathAccess().getZKeyword_1_1()); 
                    match(input,9,FOLLOW_9_in_rule__Closepath__Alternatives_12553); 
                     after(grammarAccess.getClosepathAccess().getZKeyword_1_1()); 

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
    // $ANTLR end "rule__Closepath__Alternatives_1"


    // $ANTLR start "rule__Lineto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1221:1: rule__Lineto__Alternatives_0 : ( ( 'L' ) | ( 'l' ) );
    public final void rule__Lineto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1225:1: ( ( 'L' ) | ( 'l' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==10) ) {
                alt6=1;
            }
            else if ( (LA6_0==11) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1226:1: ( 'L' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1226:1: ( 'L' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1227:1: 'L'
                    {
                     before(grammarAccess.getLinetoAccess().getLKeyword_0_0()); 
                    match(input,10,FOLLOW_10_in_rule__Lineto__Alternatives_02588); 
                     after(grammarAccess.getLinetoAccess().getLKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1234:6: ( 'l' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1234:6: ( 'l' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1235:1: 'l'
                    {
                     before(grammarAccess.getLinetoAccess().getLKeyword_0_1()); 
                    match(input,11,FOLLOW_11_in_rule__Lineto__Alternatives_02608); 
                     after(grammarAccess.getLinetoAccess().getLKeyword_0_1()); 

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
    // $ANTLR end "rule__Lineto__Alternatives_0"


    // $ANTLR start "rule__Horizontal_lineto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1247:1: rule__Horizontal_lineto__Alternatives_0 : ( ( 'H' ) | ( 'h' ) );
    public final void rule__Horizontal_lineto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1251:1: ( ( 'H' ) | ( 'h' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            else if ( (LA7_0==13) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1252:1: ( 'H' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1252:1: ( 'H' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1253:1: 'H'
                    {
                     before(grammarAccess.getHorizontal_linetoAccess().getHKeyword_0_0()); 
                    match(input,12,FOLLOW_12_in_rule__Horizontal_lineto__Alternatives_02643); 
                     after(grammarAccess.getHorizontal_linetoAccess().getHKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1260:6: ( 'h' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1260:6: ( 'h' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1261:1: 'h'
                    {
                     before(grammarAccess.getHorizontal_linetoAccess().getHKeyword_0_1()); 
                    match(input,13,FOLLOW_13_in_rule__Horizontal_lineto__Alternatives_02663); 
                     after(grammarAccess.getHorizontal_linetoAccess().getHKeyword_0_1()); 

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
    // $ANTLR end "rule__Horizontal_lineto__Alternatives_0"


    // $ANTLR start "rule__Vertical_lineto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1273:1: rule__Vertical_lineto__Alternatives_0 : ( ( 'V' ) | ( 'v' ) );
    public final void rule__Vertical_lineto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1277:1: ( ( 'V' ) | ( 'v' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==15) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1278:1: ( 'V' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1278:1: ( 'V' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1279:1: 'V'
                    {
                     before(grammarAccess.getVertical_linetoAccess().getVKeyword_0_0()); 
                    match(input,14,FOLLOW_14_in_rule__Vertical_lineto__Alternatives_02698); 
                     after(grammarAccess.getVertical_linetoAccess().getVKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1286:6: ( 'v' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1286:6: ( 'v' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1287:1: 'v'
                    {
                     before(grammarAccess.getVertical_linetoAccess().getVKeyword_0_1()); 
                    match(input,15,FOLLOW_15_in_rule__Vertical_lineto__Alternatives_02718); 
                     after(grammarAccess.getVertical_linetoAccess().getVKeyword_0_1()); 

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
    // $ANTLR end "rule__Vertical_lineto__Alternatives_0"


    // $ANTLR start "rule__Curveto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1299:1: rule__Curveto__Alternatives_0 : ( ( 'C' ) | ( 'c' ) );
    public final void rule__Curveto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1303:1: ( ( 'C' ) | ( 'c' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==16) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1304:1: ( 'C' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1304:1: ( 'C' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1305:1: 'C'
                    {
                     before(grammarAccess.getCurvetoAccess().getCKeyword_0_0()); 
                    match(input,16,FOLLOW_16_in_rule__Curveto__Alternatives_02753); 
                     after(grammarAccess.getCurvetoAccess().getCKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1312:6: ( 'c' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1312:6: ( 'c' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1313:1: 'c'
                    {
                     before(grammarAccess.getCurvetoAccess().getCKeyword_0_1()); 
                    match(input,17,FOLLOW_17_in_rule__Curveto__Alternatives_02773); 
                     after(grammarAccess.getCurvetoAccess().getCKeyword_0_1()); 

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
    // $ANTLR end "rule__Curveto__Alternatives_0"


    // $ANTLR start "rule__Smooth_curveto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1325:1: rule__Smooth_curveto__Alternatives_0 : ( ( 'S' ) | ( 's' ) );
    public final void rule__Smooth_curveto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1329:1: ( ( 'S' ) | ( 's' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            else if ( (LA10_0==19) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1330:1: ( 'S' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1330:1: ( 'S' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1331:1: 'S'
                    {
                     before(grammarAccess.getSmooth_curvetoAccess().getSKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Smooth_curveto__Alternatives_02808); 
                     after(grammarAccess.getSmooth_curvetoAccess().getSKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1338:6: ( 's' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1338:6: ( 's' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1339:1: 's'
                    {
                     before(grammarAccess.getSmooth_curvetoAccess().getSKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Smooth_curveto__Alternatives_02828); 
                     after(grammarAccess.getSmooth_curvetoAccess().getSKeyword_0_1()); 

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
    // $ANTLR end "rule__Smooth_curveto__Alternatives_0"


    // $ANTLR start "rule__Quadratic_bezier_curveto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1351:1: rule__Quadratic_bezier_curveto__Alternatives_0 : ( ( 'Q' ) | ( 'q' ) );
    public final void rule__Quadratic_bezier_curveto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1355:1: ( ( 'Q' ) | ( 'q' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1356:1: ( 'Q' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1356:1: ( 'Q' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1357:1: 'Q'
                    {
                     before(grammarAccess.getQuadratic_bezier_curvetoAccess().getQKeyword_0_0()); 
                    match(input,20,FOLLOW_20_in_rule__Quadratic_bezier_curveto__Alternatives_02863); 
                     after(grammarAccess.getQuadratic_bezier_curvetoAccess().getQKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1364:6: ( 'q' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1364:6: ( 'q' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1365:1: 'q'
                    {
                     before(grammarAccess.getQuadratic_bezier_curvetoAccess().getQKeyword_0_1()); 
                    match(input,21,FOLLOW_21_in_rule__Quadratic_bezier_curveto__Alternatives_02883); 
                     after(grammarAccess.getQuadratic_bezier_curvetoAccess().getQKeyword_0_1()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto__Alternatives_0"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1377:1: rule__Smooth_quadratic_bezier_curveto__Alternatives_0 : ( ( 'T' ) | ( 't' ) );
    public final void rule__Smooth_quadratic_bezier_curveto__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1381:1: ( ( 'T' ) | ( 't' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            else if ( (LA12_0==23) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1382:1: ( 'T' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1382:1: ( 'T' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1383:1: 'T'
                    {
                     before(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getTKeyword_0_0()); 
                    match(input,22,FOLLOW_22_in_rule__Smooth_quadratic_bezier_curveto__Alternatives_02918); 
                     after(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getTKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1390:6: ( 't' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1390:6: ( 't' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1391:1: 't'
                    {
                     before(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getTKeyword_0_1()); 
                    match(input,23,FOLLOW_23_in_rule__Smooth_quadratic_bezier_curveto__Alternatives_02938); 
                     after(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getTKeyword_0_1()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto__Alternatives_0"


    // $ANTLR start "rule__Elliptical_arc__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1403:1: rule__Elliptical_arc__Alternatives_0 : ( ( 'A' ) | ( 'a' ) );
    public final void rule__Elliptical_arc__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1407:1: ( ( 'A' ) | ( 'a' ) )
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
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1408:1: ( 'A' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1408:1: ( 'A' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1409:1: 'A'
                    {
                     before(grammarAccess.getElliptical_arcAccess().getAKeyword_0_0()); 
                    match(input,24,FOLLOW_24_in_rule__Elliptical_arc__Alternatives_02973); 
                     after(grammarAccess.getElliptical_arcAccess().getAKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1416:6: ( 'a' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1416:6: ( 'a' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1417:1: 'a'
                    {
                     before(grammarAccess.getElliptical_arcAccess().getAKeyword_0_1()); 
                    match(input,25,FOLLOW_25_in_rule__Elliptical_arc__Alternatives_02993); 
                     after(grammarAccess.getElliptical_arcAccess().getAKeyword_0_1()); 

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
    // $ANTLR end "rule__Elliptical_arc__Alternatives_0"


    // $ANTLR start "rule__Exponent__Alternatives_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1429:1: rule__Exponent__Alternatives_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__Exponent__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1433:1: ( ( 'e' ) | ( 'E' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1434:1: ( 'e' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1434:1: ( 'e' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1435:1: 'e'
                    {
                     before(grammarAccess.getExponentAccess().getEKeyword_0_0()); 
                    match(input,26,FOLLOW_26_in_rule__Exponent__Alternatives_03028); 
                     after(grammarAccess.getExponentAccess().getEKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1442:6: ( 'E' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1442:6: ( 'E' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1443:1: 'E'
                    {
                     before(grammarAccess.getExponentAccess().getEKeyword_0_1()); 
                    match(input,27,FOLLOW_27_in_rule__Exponent__Alternatives_03048); 
                     after(grammarAccess.getExponentAccess().getEKeyword_0_1()); 

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
    // $ANTLR end "rule__Exponent__Alternatives_0"


    // $ANTLR start "rule__Digit__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1455:1: rule__Digit__Alternatives : ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) );
    public final void rule__Digit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1459:1: ( ( '0' ) | ( '1' ) | ( '2' ) | ( '3' ) | ( '4' ) | ( '5' ) | ( '6' ) | ( '7' ) | ( '8' ) | ( '9' ) )
            int alt15=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            case 32:
                {
                alt15=5;
                }
                break;
            case 33:
                {
                alt15=6;
                }
                break;
            case 34:
                {
                alt15=7;
                }
                break;
            case 35:
                {
                alt15=8;
                }
                break;
            case 36:
                {
                alt15=9;
                }
                break;
            case 37:
                {
                alt15=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1460:1: ( '0' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1460:1: ( '0' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1461:1: '0'
                    {
                     before(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__Digit__Alternatives3083); 
                     after(grammarAccess.getDigitAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1468:6: ( '1' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1468:6: ( '1' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1469:1: '1'
                    {
                     before(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__Digit__Alternatives3103); 
                     after(grammarAccess.getDigitAccess().getDigitOneKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1476:6: ( '2' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1476:6: ( '2' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1477:1: '2'
                    {
                     before(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__Digit__Alternatives3123); 
                     after(grammarAccess.getDigitAccess().getDigitTwoKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1484:6: ( '3' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1484:6: ( '3' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1485:1: '3'
                    {
                     before(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 
                    match(input,31,FOLLOW_31_in_rule__Digit__Alternatives3143); 
                     after(grammarAccess.getDigitAccess().getDigitThreeKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1492:6: ( '4' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1492:6: ( '4' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1493:1: '4'
                    {
                     before(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 
                    match(input,32,FOLLOW_32_in_rule__Digit__Alternatives3163); 
                     after(grammarAccess.getDigitAccess().getDigitFourKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1500:6: ( '5' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1500:6: ( '5' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1501:1: '5'
                    {
                     before(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 
                    match(input,33,FOLLOW_33_in_rule__Digit__Alternatives3183); 
                     after(grammarAccess.getDigitAccess().getDigitFiveKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1508:6: ( '6' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1508:6: ( '6' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1509:1: '6'
                    {
                     before(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 
                    match(input,34,FOLLOW_34_in_rule__Digit__Alternatives3203); 
                     after(grammarAccess.getDigitAccess().getDigitSixKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1516:6: ( '7' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1516:6: ( '7' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1517:1: '7'
                    {
                     before(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 
                    match(input,35,FOLLOW_35_in_rule__Digit__Alternatives3223); 
                     after(grammarAccess.getDigitAccess().getDigitSevenKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1524:6: ( '8' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1524:6: ( '8' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1525:1: '8'
                    {
                     before(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 
                    match(input,36,FOLLOW_36_in_rule__Digit__Alternatives3243); 
                     after(grammarAccess.getDigitAccess().getDigitEightKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1532:6: ( '9' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1532:6: ( '9' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1533:1: '9'
                    {
                     before(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 
                    match(input,37,FOLLOW_37_in_rule__Digit__Alternatives3263); 
                     after(grammarAccess.getDigitAccess().getDigitNineKeyword_9()); 

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
    // $ANTLR end "rule__Digit__Alternatives"


    // $ANTLR start "rule__Sign__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1545:1: rule__Sign__Alternatives : ( ( '+' ) | ( '-' ) );
    public final void rule__Sign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1549:1: ( ( '+' ) | ( '-' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            else if ( (LA16_0==39) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1550:1: ( '+' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1550:1: ( '+' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1551:1: '+'
                    {
                     before(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 
                    match(input,38,FOLLOW_38_in_rule__Sign__Alternatives3298); 
                     after(grammarAccess.getSignAccess().getPlusSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1558:6: ( '-' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1558:6: ( '-' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1559:1: '-'
                    {
                     before(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 
                    match(input,39,FOLLOW_39_in_rule__Sign__Alternatives3318); 
                     after(grammarAccess.getSignAccess().getHyphenMinusKeyword_1()); 

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
    // $ANTLR end "rule__Sign__Alternatives"


    // $ANTLR start "rule__Flag__Alternatives"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1571:1: rule__Flag__Alternatives : ( ( '0' ) | ( '1' ) );
    public final void rule__Flag__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1575:1: ( ( '0' ) | ( '1' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            else if ( (LA17_0==29) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1576:1: ( '0' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1576:1: ( '0' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1577:1: '0'
                    {
                     before(grammarAccess.getFlagAccess().getDigitZeroKeyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__Flag__Alternatives3353); 
                     after(grammarAccess.getFlagAccess().getDigitZeroKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1584:6: ( '1' )
                    {
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1584:6: ( '1' )
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1585:1: '1'
                    {
                     before(grammarAccess.getFlagAccess().getDigitOneKeyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__Flag__Alternatives3373); 
                     after(grammarAccess.getFlagAccess().getDigitOneKeyword_1()); 

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
    // $ANTLR end "rule__Flag__Alternatives"


    // $ANTLR start "rule__Moveto_drawto_command_group__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1599:1: rule__Moveto_drawto_command_group__Group__0 : rule__Moveto_drawto_command_group__Group__0__Impl rule__Moveto_drawto_command_group__Group__1 ;
    public final void rule__Moveto_drawto_command_group__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1603:1: ( rule__Moveto_drawto_command_group__Group__0__Impl rule__Moveto_drawto_command_group__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1604:2: rule__Moveto_drawto_command_group__Group__0__Impl rule__Moveto_drawto_command_group__Group__1
            {
            pushFollow(FOLLOW_rule__Moveto_drawto_command_group__Group__0__Impl_in_rule__Moveto_drawto_command_group__Group__03405);
            rule__Moveto_drawto_command_group__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Moveto_drawto_command_group__Group__1_in_rule__Moveto_drawto_command_group__Group__03408);
            rule__Moveto_drawto_command_group__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Moveto_drawto_command_group__Group__0"


    // $ANTLR start "rule__Moveto_drawto_command_group__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1611:1: rule__Moveto_drawto_command_group__Group__0__Impl : ( ( rule__Moveto_drawto_command_group__MovetoAssignment_0 ) ) ;
    public final void rule__Moveto_drawto_command_group__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1615:1: ( ( ( rule__Moveto_drawto_command_group__MovetoAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1616:1: ( ( rule__Moveto_drawto_command_group__MovetoAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1616:1: ( ( rule__Moveto_drawto_command_group__MovetoAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1617:1: ( rule__Moveto_drawto_command_group__MovetoAssignment_0 )
            {
             before(grammarAccess.getMoveto_drawto_command_groupAccess().getMovetoAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1618:1: ( rule__Moveto_drawto_command_group__MovetoAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1618:2: rule__Moveto_drawto_command_group__MovetoAssignment_0
            {
            pushFollow(FOLLOW_rule__Moveto_drawto_command_group__MovetoAssignment_0_in_rule__Moveto_drawto_command_group__Group__0__Impl3435);
            rule__Moveto_drawto_command_group__MovetoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveto_drawto_command_groupAccess().getMovetoAssignment_0()); 

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
    // $ANTLR end "rule__Moveto_drawto_command_group__Group__0__Impl"


    // $ANTLR start "rule__Moveto_drawto_command_group__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1628:1: rule__Moveto_drawto_command_group__Group__1 : rule__Moveto_drawto_command_group__Group__1__Impl ;
    public final void rule__Moveto_drawto_command_group__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1632:1: ( rule__Moveto_drawto_command_group__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1633:2: rule__Moveto_drawto_command_group__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Moveto_drawto_command_group__Group__1__Impl_in_rule__Moveto_drawto_command_group__Group__13465);
            rule__Moveto_drawto_command_group__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Moveto_drawto_command_group__Group__1"


    // $ANTLR start "rule__Moveto_drawto_command_group__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1639:1: rule__Moveto_drawto_command_group__Group__1__Impl : ( ( rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 )? ) ;
    public final void rule__Moveto_drawto_command_group__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1643:1: ( ( ( rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1644:1: ( ( rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1644:1: ( ( rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1645:1: ( rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 )?
            {
             before(grammarAccess.getMoveto_drawto_command_groupAccess().getDrawto_commandsAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1646:1: ( rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=8 && LA18_0<=25)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1646:2: rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1_in_rule__Moveto_drawto_command_group__Group__1__Impl3492);
                    rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoveto_drawto_command_groupAccess().getDrawto_commandsAssignment_1()); 

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
    // $ANTLR end "rule__Moveto_drawto_command_group__Group__1__Impl"


    // $ANTLR start "rule__Moveto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1660:1: rule__Moveto__Group__0 : rule__Moveto__Group__0__Impl rule__Moveto__Group__1 ;
    public final void rule__Moveto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1664:1: ( rule__Moveto__Group__0__Impl rule__Moveto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1665:2: rule__Moveto__Group__0__Impl rule__Moveto__Group__1
            {
            pushFollow(FOLLOW_rule__Moveto__Group__0__Impl_in_rule__Moveto__Group__03527);
            rule__Moveto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Moveto__Group__1_in_rule__Moveto__Group__03530);
            rule__Moveto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Moveto__Group__0"


    // $ANTLR start "rule__Moveto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1672:1: rule__Moveto__Group__0__Impl : ( ( rule__Moveto__Alternatives_0 ) ) ;
    public final void rule__Moveto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1676:1: ( ( ( rule__Moveto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1677:1: ( ( rule__Moveto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1677:1: ( ( rule__Moveto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1678:1: ( rule__Moveto__Alternatives_0 )
            {
             before(grammarAccess.getMovetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1679:1: ( rule__Moveto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1679:2: rule__Moveto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Moveto__Alternatives_0_in_rule__Moveto__Group__0__Impl3557);
            rule__Moveto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMovetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Moveto__Group__0__Impl"


    // $ANTLR start "rule__Moveto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1689:1: rule__Moveto__Group__1 : rule__Moveto__Group__1__Impl rule__Moveto__Group__2 ;
    public final void rule__Moveto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1693:1: ( rule__Moveto__Group__1__Impl rule__Moveto__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1694:2: rule__Moveto__Group__1__Impl rule__Moveto__Group__2
            {
            pushFollow(FOLLOW_rule__Moveto__Group__1__Impl_in_rule__Moveto__Group__13587);
            rule__Moveto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Moveto__Group__2_in_rule__Moveto__Group__13590);
            rule__Moveto__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Moveto__Group__1"


    // $ANTLR start "rule__Moveto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1701:1: rule__Moveto__Group__1__Impl : ( ( rule__Moveto__PointAssignment_1 ) ) ;
    public final void rule__Moveto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1705:1: ( ( ( rule__Moveto__PointAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1706:1: ( ( rule__Moveto__PointAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1706:1: ( ( rule__Moveto__PointAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1707:1: ( rule__Moveto__PointAssignment_1 )
            {
             before(grammarAccess.getMovetoAccess().getPointAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1708:1: ( rule__Moveto__PointAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1708:2: rule__Moveto__PointAssignment_1
            {
            pushFollow(FOLLOW_rule__Moveto__PointAssignment_1_in_rule__Moveto__Group__1__Impl3617);
            rule__Moveto__PointAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMovetoAccess().getPointAssignment_1()); 

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
    // $ANTLR end "rule__Moveto__Group__1__Impl"


    // $ANTLR start "rule__Moveto__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1718:1: rule__Moveto__Group__2 : rule__Moveto__Group__2__Impl rule__Moveto__Group__3 ;
    public final void rule__Moveto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1722:1: ( rule__Moveto__Group__2__Impl rule__Moveto__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1723:2: rule__Moveto__Group__2__Impl rule__Moveto__Group__3
            {
            pushFollow(FOLLOW_rule__Moveto__Group__2__Impl_in_rule__Moveto__Group__23647);
            rule__Moveto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Moveto__Group__3_in_rule__Moveto__Group__23650);
            rule__Moveto__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Moveto__Group__2"


    // $ANTLR start "rule__Moveto__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1730:1: rule__Moveto__Group__2__Impl : ( ( rulecomma )? ) ;
    public final void rule__Moveto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1734:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1735:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1735:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1736:1: ( rulecomma )?
            {
             before(grammarAccess.getMovetoAccess().getCommaParserRuleCall_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1737:1: ( rulecomma )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==5) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1737:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Moveto__Group__2__Impl3678);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMovetoAccess().getCommaParserRuleCall_2()); 

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
    // $ANTLR end "rule__Moveto__Group__2__Impl"


    // $ANTLR start "rule__Moveto__Group__3"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1747:1: rule__Moveto__Group__3 : rule__Moveto__Group__3__Impl ;
    public final void rule__Moveto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1751:1: ( rule__Moveto__Group__3__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1752:2: rule__Moveto__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Moveto__Group__3__Impl_in_rule__Moveto__Group__33709);
            rule__Moveto__Group__3__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Moveto__Group__3"


    // $ANTLR start "rule__Moveto__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1758:1: rule__Moveto__Group__3__Impl : ( ( rule__Moveto__Lineto_argument_sequenceAssignment_3 ) ) ;
    public final void rule__Moveto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1762:1: ( ( ( rule__Moveto__Lineto_argument_sequenceAssignment_3 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1763:1: ( ( rule__Moveto__Lineto_argument_sequenceAssignment_3 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1763:1: ( ( rule__Moveto__Lineto_argument_sequenceAssignment_3 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1764:1: ( rule__Moveto__Lineto_argument_sequenceAssignment_3 )
            {
             before(grammarAccess.getMovetoAccess().getLineto_argument_sequenceAssignment_3()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1765:1: ( rule__Moveto__Lineto_argument_sequenceAssignment_3 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1765:2: rule__Moveto__Lineto_argument_sequenceAssignment_3
            {
            pushFollow(FOLLOW_rule__Moveto__Lineto_argument_sequenceAssignment_3_in_rule__Moveto__Group__3__Impl3736);
            rule__Moveto__Lineto_argument_sequenceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMovetoAccess().getLineto_argument_sequenceAssignment_3()); 

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
    // $ANTLR end "rule__Moveto__Group__3__Impl"


    // $ANTLR start "rule__Lineto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1783:1: rule__Lineto_argument_sequence__Group__0 : rule__Lineto_argument_sequence__Group__0__Impl rule__Lineto_argument_sequence__Group__1 ;
    public final void rule__Lineto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1787:1: ( rule__Lineto_argument_sequence__Group__0__Impl rule__Lineto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1788:2: rule__Lineto_argument_sequence__Group__0__Impl rule__Lineto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group__0__Impl_in_rule__Lineto_argument_sequence__Group__03774);
            rule__Lineto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group__1_in_rule__Lineto_argument_sequence__Group__03777);
            rule__Lineto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Lineto_argument_sequence__Group__0"


    // $ANTLR start "rule__Lineto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1795:1: rule__Lineto_argument_sequence__Group__0__Impl : ( ( rule__Lineto_argument_sequence__PairsAssignment_0 ) ) ;
    public final void rule__Lineto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1799:1: ( ( ( rule__Lineto_argument_sequence__PairsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1800:1: ( ( rule__Lineto_argument_sequence__PairsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1800:1: ( ( rule__Lineto_argument_sequence__PairsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1801:1: ( rule__Lineto_argument_sequence__PairsAssignment_0 )
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getPairsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1802:1: ( rule__Lineto_argument_sequence__PairsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1802:2: rule__Lineto_argument_sequence__PairsAssignment_0
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__PairsAssignment_0_in_rule__Lineto_argument_sequence__Group__0__Impl3804);
            rule__Lineto_argument_sequence__PairsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLineto_argument_sequenceAccess().getPairsAssignment_0()); 

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
    // $ANTLR end "rule__Lineto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Lineto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1812:1: rule__Lineto_argument_sequence__Group__1 : rule__Lineto_argument_sequence__Group__1__Impl ;
    public final void rule__Lineto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1816:1: ( rule__Lineto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1817:2: rule__Lineto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group__1__Impl_in_rule__Lineto_argument_sequence__Group__13834);
            rule__Lineto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Lineto_argument_sequence__Group__1"


    // $ANTLR start "rule__Lineto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1823:1: rule__Lineto_argument_sequence__Group__1__Impl : ( ( rule__Lineto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Lineto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1827:1: ( ( ( rule__Lineto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1828:1: ( ( rule__Lineto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1828:1: ( ( rule__Lineto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1829:1: ( rule__Lineto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1830:1: ( rule__Lineto_argument_sequence__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==5||(LA20_0>=28 && LA20_0<=39)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1830:2: rule__Lineto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group_1__0_in_rule__Lineto_argument_sequence__Group__1__Impl3861);
            	    rule__Lineto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getLineto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Lineto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Lineto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1844:1: rule__Lineto_argument_sequence__Group_1__0 : rule__Lineto_argument_sequence__Group_1__0__Impl rule__Lineto_argument_sequence__Group_1__1 ;
    public final void rule__Lineto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1848:1: ( rule__Lineto_argument_sequence__Group_1__0__Impl rule__Lineto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1849:2: rule__Lineto_argument_sequence__Group_1__0__Impl rule__Lineto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group_1__0__Impl_in_rule__Lineto_argument_sequence__Group_1__03896);
            rule__Lineto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group_1__1_in_rule__Lineto_argument_sequence__Group_1__03899);
            rule__Lineto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Lineto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Lineto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1856:1: rule__Lineto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Lineto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1860:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1861:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1861:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1862:1: ( rulecomma )?
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1863:1: ( rulecomma )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==5) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1863:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Lineto_argument_sequence__Group_1__0__Impl3927);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Lineto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Lineto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1873:1: rule__Lineto_argument_sequence__Group_1__1 : rule__Lineto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Lineto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1877:1: ( rule__Lineto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1878:2: rule__Lineto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__Group_1__1__Impl_in_rule__Lineto_argument_sequence__Group_1__13958);
            rule__Lineto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Lineto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Lineto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1884:1: rule__Lineto_argument_sequence__Group_1__1__Impl : ( ( rule__Lineto_argument_sequence__PairsAssignment_1_1 ) ) ;
    public final void rule__Lineto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1888:1: ( ( ( rule__Lineto_argument_sequence__PairsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1889:1: ( ( rule__Lineto_argument_sequence__PairsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1889:1: ( ( rule__Lineto_argument_sequence__PairsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1890:1: ( rule__Lineto_argument_sequence__PairsAssignment_1_1 )
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getPairsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1891:1: ( rule__Lineto_argument_sequence__PairsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1891:2: rule__Lineto_argument_sequence__PairsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Lineto_argument_sequence__PairsAssignment_1_1_in_rule__Lineto_argument_sequence__Group_1__1__Impl3985);
            rule__Lineto_argument_sequence__PairsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLineto_argument_sequenceAccess().getPairsAssignment_1_1()); 

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
    // $ANTLR end "rule__Lineto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Closepath__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1905:1: rule__Closepath__Group__0 : rule__Closepath__Group__0__Impl rule__Closepath__Group__1 ;
    public final void rule__Closepath__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1909:1: ( rule__Closepath__Group__0__Impl rule__Closepath__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1910:2: rule__Closepath__Group__0__Impl rule__Closepath__Group__1
            {
            pushFollow(FOLLOW_rule__Closepath__Group__0__Impl_in_rule__Closepath__Group__04019);
            rule__Closepath__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Closepath__Group__1_in_rule__Closepath__Group__04022);
            rule__Closepath__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Closepath__Group__0"


    // $ANTLR start "rule__Closepath__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1917:1: rule__Closepath__Group__0__Impl : ( () ) ;
    public final void rule__Closepath__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1921:1: ( ( () ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1922:1: ( () )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1922:1: ( () )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1923:1: ()
            {
             before(grammarAccess.getClosepathAccess().getClosepathAction_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1924:1: ()
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1926:1: 
            {
            }

             after(grammarAccess.getClosepathAccess().getClosepathAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Closepath__Group__0__Impl"


    // $ANTLR start "rule__Closepath__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1936:1: rule__Closepath__Group__1 : rule__Closepath__Group__1__Impl ;
    public final void rule__Closepath__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1940:1: ( rule__Closepath__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1941:2: rule__Closepath__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Closepath__Group__1__Impl_in_rule__Closepath__Group__14080);
            rule__Closepath__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Closepath__Group__1"


    // $ANTLR start "rule__Closepath__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1947:1: rule__Closepath__Group__1__Impl : ( ( rule__Closepath__Alternatives_1 ) ) ;
    public final void rule__Closepath__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1951:1: ( ( ( rule__Closepath__Alternatives_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1952:1: ( ( rule__Closepath__Alternatives_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1952:1: ( ( rule__Closepath__Alternatives_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1953:1: ( rule__Closepath__Alternatives_1 )
            {
             before(grammarAccess.getClosepathAccess().getAlternatives_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1954:1: ( rule__Closepath__Alternatives_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1954:2: rule__Closepath__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Closepath__Alternatives_1_in_rule__Closepath__Group__1__Impl4107);
            rule__Closepath__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getClosepathAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Closepath__Group__1__Impl"


    // $ANTLR start "rule__Lineto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1968:1: rule__Lineto__Group__0 : rule__Lineto__Group__0__Impl rule__Lineto__Group__1 ;
    public final void rule__Lineto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1972:1: ( rule__Lineto__Group__0__Impl rule__Lineto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1973:2: rule__Lineto__Group__0__Impl rule__Lineto__Group__1
            {
            pushFollow(FOLLOW_rule__Lineto__Group__0__Impl_in_rule__Lineto__Group__04141);
            rule__Lineto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Lineto__Group__1_in_rule__Lineto__Group__04144);
            rule__Lineto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Lineto__Group__0"


    // $ANTLR start "rule__Lineto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1980:1: rule__Lineto__Group__0__Impl : ( ( rule__Lineto__Alternatives_0 ) ) ;
    public final void rule__Lineto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1984:1: ( ( ( rule__Lineto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1985:1: ( ( rule__Lineto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1985:1: ( ( rule__Lineto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1986:1: ( rule__Lineto__Alternatives_0 )
            {
             before(grammarAccess.getLinetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1987:1: ( rule__Lineto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1987:2: rule__Lineto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Lineto__Alternatives_0_in_rule__Lineto__Group__0__Impl4171);
            rule__Lineto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLinetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Lineto__Group__0__Impl"


    // $ANTLR start "rule__Lineto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:1997:1: rule__Lineto__Group__1 : rule__Lineto__Group__1__Impl ;
    public final void rule__Lineto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2001:1: ( rule__Lineto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2002:2: rule__Lineto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lineto__Group__1__Impl_in_rule__Lineto__Group__14201);
            rule__Lineto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Lineto__Group__1"


    // $ANTLR start "rule__Lineto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2008:1: rule__Lineto__Group__1__Impl : ( ( rule__Lineto__Lineto_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Lineto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2012:1: ( ( ( rule__Lineto__Lineto_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2013:1: ( ( rule__Lineto__Lineto_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2013:1: ( ( rule__Lineto__Lineto_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2014:1: ( rule__Lineto__Lineto_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getLinetoAccess().getLineto_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2015:1: ( rule__Lineto__Lineto_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2015:2: rule__Lineto__Lineto_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Lineto__Lineto_argument_sequenceAssignment_1_in_rule__Lineto__Group__1__Impl4228);
            rule__Lineto__Lineto_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLinetoAccess().getLineto_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Lineto__Group__1__Impl"


    // $ANTLR start "rule__Horizontal_lineto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2029:1: rule__Horizontal_lineto__Group__0 : rule__Horizontal_lineto__Group__0__Impl rule__Horizontal_lineto__Group__1 ;
    public final void rule__Horizontal_lineto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2033:1: ( rule__Horizontal_lineto__Group__0__Impl rule__Horizontal_lineto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2034:2: rule__Horizontal_lineto__Group__0__Impl rule__Horizontal_lineto__Group__1
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto__Group__0__Impl_in_rule__Horizontal_lineto__Group__04262);
            rule__Horizontal_lineto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horizontal_lineto__Group__1_in_rule__Horizontal_lineto__Group__04265);
            rule__Horizontal_lineto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Horizontal_lineto__Group__0"


    // $ANTLR start "rule__Horizontal_lineto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2041:1: rule__Horizontal_lineto__Group__0__Impl : ( ( rule__Horizontal_lineto__Alternatives_0 ) ) ;
    public final void rule__Horizontal_lineto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2045:1: ( ( ( rule__Horizontal_lineto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2046:1: ( ( rule__Horizontal_lineto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2046:1: ( ( rule__Horizontal_lineto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2047:1: ( rule__Horizontal_lineto__Alternatives_0 )
            {
             before(grammarAccess.getHorizontal_linetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2048:1: ( rule__Horizontal_lineto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2048:2: rule__Horizontal_lineto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto__Alternatives_0_in_rule__Horizontal_lineto__Group__0__Impl4292);
            rule__Horizontal_lineto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontal_linetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Horizontal_lineto__Group__0__Impl"


    // $ANTLR start "rule__Horizontal_lineto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2058:1: rule__Horizontal_lineto__Group__1 : rule__Horizontal_lineto__Group__1__Impl ;
    public final void rule__Horizontal_lineto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2062:1: ( rule__Horizontal_lineto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2063:2: rule__Horizontal_lineto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto__Group__1__Impl_in_rule__Horizontal_lineto__Group__14322);
            rule__Horizontal_lineto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Horizontal_lineto__Group__1"


    // $ANTLR start "rule__Horizontal_lineto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2069:1: rule__Horizontal_lineto__Group__1__Impl : ( ( rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Horizontal_lineto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2073:1: ( ( ( rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2074:1: ( ( rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2074:1: ( ( rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2075:1: ( rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getHorizontal_linetoAccess().getHorizontal_lineto_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2076:1: ( rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2076:2: rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1_in_rule__Horizontal_lineto__Group__1__Impl4349);
            rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontal_linetoAccess().getHorizontal_lineto_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Horizontal_lineto__Group__1__Impl"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2090:1: rule__Horizontal_lineto_argument_sequence__Group__0 : rule__Horizontal_lineto_argument_sequence__Group__0__Impl rule__Horizontal_lineto_argument_sequence__Group__1 ;
    public final void rule__Horizontal_lineto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2094:1: ( rule__Horizontal_lineto_argument_sequence__Group__0__Impl rule__Horizontal_lineto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2095:2: rule__Horizontal_lineto_argument_sequence__Group__0__Impl rule__Horizontal_lineto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__0__Impl_in_rule__Horizontal_lineto_argument_sequence__Group__04383);
            rule__Horizontal_lineto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__1_in_rule__Horizontal_lineto_argument_sequence__Group__04386);
            rule__Horizontal_lineto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group__0"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2102:1: rule__Horizontal_lineto_argument_sequence__Group__0__Impl : ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 ) ) ;
    public final void rule__Horizontal_lineto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2106:1: ( ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2107:1: ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2107:1: ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2108:1: ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 )
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2109:1: ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2109:2: rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0_in_rule__Horizontal_lineto_argument_sequence__Group__0__Impl4413);
            rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesAssignment_0()); 

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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2119:1: rule__Horizontal_lineto_argument_sequence__Group__1 : rule__Horizontal_lineto_argument_sequence__Group__1__Impl ;
    public final void rule__Horizontal_lineto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2123:1: ( rule__Horizontal_lineto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2124:2: rule__Horizontal_lineto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__1__Impl_in_rule__Horizontal_lineto_argument_sequence__Group__14443);
            rule__Horizontal_lineto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group__1"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2130:1: rule__Horizontal_lineto_argument_sequence__Group__1__Impl : ( ( rule__Horizontal_lineto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Horizontal_lineto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2134:1: ( ( ( rule__Horizontal_lineto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2135:1: ( ( rule__Horizontal_lineto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2135:1: ( ( rule__Horizontal_lineto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2136:1: ( rule__Horizontal_lineto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2137:1: ( rule__Horizontal_lineto_argument_sequence__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==5||(LA22_0>=28 && LA22_0<=39)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2137:2: rule__Horizontal_lineto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__0_in_rule__Horizontal_lineto_argument_sequence__Group__1__Impl4470);
            	    rule__Horizontal_lineto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2151:1: rule__Horizontal_lineto_argument_sequence__Group_1__0 : rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl rule__Horizontal_lineto_argument_sequence__Group_1__1 ;
    public final void rule__Horizontal_lineto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2155:1: ( rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl rule__Horizontal_lineto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2156:2: rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl rule__Horizontal_lineto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl_in_rule__Horizontal_lineto_argument_sequence__Group_1__04505);
            rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__1_in_rule__Horizontal_lineto_argument_sequence__Group_1__04508);
            rule__Horizontal_lineto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2163:1: rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2167:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2168:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2168:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2169:1: ( rulecomma )?
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2170:1: ( rulecomma )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==5) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2170:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl4536);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2180:1: rule__Horizontal_lineto_argument_sequence__Group_1__1 : rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Horizontal_lineto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2184:1: ( rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2185:2: rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl_in_rule__Horizontal_lineto_argument_sequence__Group_1__14567);
            rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2191:1: rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl : ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 ) ) ;
    public final void rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2195:1: ( ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2196:1: ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2196:1: ( ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2197:1: ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 )
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2198:1: ( rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2198:2: rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1_in_rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl4594);
            rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesAssignment_1_1()); 

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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Vertical_lineto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2212:1: rule__Vertical_lineto__Group__0 : rule__Vertical_lineto__Group__0__Impl rule__Vertical_lineto__Group__1 ;
    public final void rule__Vertical_lineto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2216:1: ( rule__Vertical_lineto__Group__0__Impl rule__Vertical_lineto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2217:2: rule__Vertical_lineto__Group__0__Impl rule__Vertical_lineto__Group__1
            {
            pushFollow(FOLLOW_rule__Vertical_lineto__Group__0__Impl_in_rule__Vertical_lineto__Group__04628);
            rule__Vertical_lineto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vertical_lineto__Group__1_in_rule__Vertical_lineto__Group__04631);
            rule__Vertical_lineto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Vertical_lineto__Group__0"


    // $ANTLR start "rule__Vertical_lineto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2224:1: rule__Vertical_lineto__Group__0__Impl : ( ( rule__Vertical_lineto__Alternatives_0 ) ) ;
    public final void rule__Vertical_lineto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2228:1: ( ( ( rule__Vertical_lineto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2229:1: ( ( rule__Vertical_lineto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2229:1: ( ( rule__Vertical_lineto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2230:1: ( rule__Vertical_lineto__Alternatives_0 )
            {
             before(grammarAccess.getVertical_linetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2231:1: ( rule__Vertical_lineto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2231:2: rule__Vertical_lineto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Vertical_lineto__Alternatives_0_in_rule__Vertical_lineto__Group__0__Impl4658);
            rule__Vertical_lineto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getVertical_linetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Vertical_lineto__Group__0__Impl"


    // $ANTLR start "rule__Vertical_lineto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2241:1: rule__Vertical_lineto__Group__1 : rule__Vertical_lineto__Group__1__Impl ;
    public final void rule__Vertical_lineto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2245:1: ( rule__Vertical_lineto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2246:2: rule__Vertical_lineto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vertical_lineto__Group__1__Impl_in_rule__Vertical_lineto__Group__14688);
            rule__Vertical_lineto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Vertical_lineto__Group__1"


    // $ANTLR start "rule__Vertical_lineto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2252:1: rule__Vertical_lineto__Group__1__Impl : ( ( rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Vertical_lineto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2256:1: ( ( ( rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2257:1: ( ( rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2257:1: ( ( rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2258:1: ( rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getVertical_linetoAccess().getVertical_lineto_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2259:1: ( rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2259:2: rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1_in_rule__Vertical_lineto__Group__1__Impl4715);
            rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVertical_linetoAccess().getVertical_lineto_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Vertical_lineto__Group__1__Impl"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2273:1: rule__Vertical_lineto_argument_sequence__Group__0 : rule__Vertical_lineto_argument_sequence__Group__0__Impl rule__Vertical_lineto_argument_sequence__Group__1 ;
    public final void rule__Vertical_lineto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2277:1: ( rule__Vertical_lineto_argument_sequence__Group__0__Impl rule__Vertical_lineto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2278:2: rule__Vertical_lineto_argument_sequence__Group__0__Impl rule__Vertical_lineto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group__0__Impl_in_rule__Vertical_lineto_argument_sequence__Group__04749);
            rule__Vertical_lineto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group__1_in_rule__Vertical_lineto_argument_sequence__Group__04752);
            rule__Vertical_lineto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group__0"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2285:1: rule__Vertical_lineto_argument_sequence__Group__0__Impl : ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 ) ) ;
    public final void rule__Vertical_lineto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2289:1: ( ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2290:1: ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2290:1: ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2291:1: ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 )
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2292:1: ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2292:2: rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0_in_rule__Vertical_lineto_argument_sequence__Group__0__Impl4779);
            rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesAssignment_0()); 

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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2302:1: rule__Vertical_lineto_argument_sequence__Group__1 : rule__Vertical_lineto_argument_sequence__Group__1__Impl ;
    public final void rule__Vertical_lineto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2306:1: ( rule__Vertical_lineto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2307:2: rule__Vertical_lineto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group__1__Impl_in_rule__Vertical_lineto_argument_sequence__Group__14809);
            rule__Vertical_lineto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group__1"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2313:1: rule__Vertical_lineto_argument_sequence__Group__1__Impl : ( ( rule__Vertical_lineto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Vertical_lineto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2317:1: ( ( ( rule__Vertical_lineto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2318:1: ( ( rule__Vertical_lineto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2318:1: ( ( rule__Vertical_lineto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2319:1: ( rule__Vertical_lineto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2320:1: ( rule__Vertical_lineto_argument_sequence__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==5||(LA24_0>=28 && LA24_0<=39)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2320:2: rule__Vertical_lineto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__0_in_rule__Vertical_lineto_argument_sequence__Group__1__Impl4836);
            	    rule__Vertical_lineto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2334:1: rule__Vertical_lineto_argument_sequence__Group_1__0 : rule__Vertical_lineto_argument_sequence__Group_1__0__Impl rule__Vertical_lineto_argument_sequence__Group_1__1 ;
    public final void rule__Vertical_lineto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2338:1: ( rule__Vertical_lineto_argument_sequence__Group_1__0__Impl rule__Vertical_lineto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2339:2: rule__Vertical_lineto_argument_sequence__Group_1__0__Impl rule__Vertical_lineto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__0__Impl_in_rule__Vertical_lineto_argument_sequence__Group_1__04871);
            rule__Vertical_lineto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__1_in_rule__Vertical_lineto_argument_sequence__Group_1__04874);
            rule__Vertical_lineto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2346:1: rule__Vertical_lineto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Vertical_lineto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2350:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2351:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2351:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2352:1: ( rulecomma )?
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2353:1: ( rulecomma )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==5) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2353:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Vertical_lineto_argument_sequence__Group_1__0__Impl4902);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2363:1: rule__Vertical_lineto_argument_sequence__Group_1__1 : rule__Vertical_lineto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Vertical_lineto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2367:1: ( rule__Vertical_lineto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2368:2: rule__Vertical_lineto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__1__Impl_in_rule__Vertical_lineto_argument_sequence__Group_1__14933);
            rule__Vertical_lineto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2374:1: rule__Vertical_lineto_argument_sequence__Group_1__1__Impl : ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 ) ) ;
    public final void rule__Vertical_lineto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2378:1: ( ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2379:1: ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2379:1: ( ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2380:1: ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 )
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2381:1: ( rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2381:2: rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1_in_rule__Vertical_lineto_argument_sequence__Group_1__1__Impl4960);
            rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesAssignment_1_1()); 

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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Curveto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2395:1: rule__Curveto__Group__0 : rule__Curveto__Group__0__Impl rule__Curveto__Group__1 ;
    public final void rule__Curveto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2399:1: ( rule__Curveto__Group__0__Impl rule__Curveto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2400:2: rule__Curveto__Group__0__Impl rule__Curveto__Group__1
            {
            pushFollow(FOLLOW_rule__Curveto__Group__0__Impl_in_rule__Curveto__Group__04994);
            rule__Curveto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto__Group__1_in_rule__Curveto__Group__04997);
            rule__Curveto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto__Group__0"


    // $ANTLR start "rule__Curveto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2407:1: rule__Curveto__Group__0__Impl : ( ( rule__Curveto__Alternatives_0 ) ) ;
    public final void rule__Curveto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2411:1: ( ( ( rule__Curveto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2412:1: ( ( rule__Curveto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2412:1: ( ( rule__Curveto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2413:1: ( rule__Curveto__Alternatives_0 )
            {
             before(grammarAccess.getCurvetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2414:1: ( rule__Curveto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2414:2: rule__Curveto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Curveto__Alternatives_0_in_rule__Curveto__Group__0__Impl5024);
            rule__Curveto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getCurvetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Curveto__Group__0__Impl"


    // $ANTLR start "rule__Curveto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2424:1: rule__Curveto__Group__1 : rule__Curveto__Group__1__Impl ;
    public final void rule__Curveto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2428:1: ( rule__Curveto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2429:2: rule__Curveto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Curveto__Group__1__Impl_in_rule__Curveto__Group__15054);
            rule__Curveto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto__Group__1"


    // $ANTLR start "rule__Curveto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2435:1: rule__Curveto__Group__1__Impl : ( ( rule__Curveto__Curveto_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Curveto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2439:1: ( ( ( rule__Curveto__Curveto_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2440:1: ( ( rule__Curveto__Curveto_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2440:1: ( ( rule__Curveto__Curveto_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2441:1: ( rule__Curveto__Curveto_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getCurvetoAccess().getCurveto_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2442:1: ( rule__Curveto__Curveto_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2442:2: rule__Curveto__Curveto_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Curveto__Curveto_argument_sequenceAssignment_1_in_rule__Curveto__Group__1__Impl5081);
            rule__Curveto__Curveto_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCurvetoAccess().getCurveto_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Curveto__Group__1__Impl"


    // $ANTLR start "rule__Curveto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2456:1: rule__Curveto_argument_sequence__Group__0 : rule__Curveto_argument_sequence__Group__0__Impl rule__Curveto_argument_sequence__Group__1 ;
    public final void rule__Curveto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2460:1: ( rule__Curveto_argument_sequence__Group__0__Impl rule__Curveto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2461:2: rule__Curveto_argument_sequence__Group__0__Impl rule__Curveto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group__0__Impl_in_rule__Curveto_argument_sequence__Group__05115);
            rule__Curveto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group__1_in_rule__Curveto_argument_sequence__Group__05118);
            rule__Curveto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument_sequence__Group__0"


    // $ANTLR start "rule__Curveto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2468:1: rule__Curveto_argument_sequence__Group__0__Impl : ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 ) ) ;
    public final void rule__Curveto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2472:1: ( ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2473:1: ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2473:1: ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2474:1: ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 )
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2475:1: ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2475:2: rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0_in_rule__Curveto_argument_sequence__Group__0__Impl5145);
            rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsAssignment_0()); 

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
    // $ANTLR end "rule__Curveto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Curveto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2485:1: rule__Curveto_argument_sequence__Group__1 : rule__Curveto_argument_sequence__Group__1__Impl ;
    public final void rule__Curveto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2489:1: ( rule__Curveto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2490:2: rule__Curveto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group__1__Impl_in_rule__Curveto_argument_sequence__Group__15175);
            rule__Curveto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument_sequence__Group__1"


    // $ANTLR start "rule__Curveto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2496:1: rule__Curveto_argument_sequence__Group__1__Impl : ( ( rule__Curveto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Curveto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2500:1: ( ( ( rule__Curveto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2501:1: ( ( rule__Curveto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2501:1: ( ( rule__Curveto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2502:1: ( rule__Curveto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2503:1: ( rule__Curveto_argument_sequence__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==5||(LA26_0>=28 && LA26_0<=39)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2503:2: rule__Curveto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group_1__0_in_rule__Curveto_argument_sequence__Group__1__Impl5202);
            	    rule__Curveto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCurveto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Curveto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Curveto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2517:1: rule__Curveto_argument_sequence__Group_1__0 : rule__Curveto_argument_sequence__Group_1__0__Impl rule__Curveto_argument_sequence__Group_1__1 ;
    public final void rule__Curveto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2521:1: ( rule__Curveto_argument_sequence__Group_1__0__Impl rule__Curveto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2522:2: rule__Curveto_argument_sequence__Group_1__0__Impl rule__Curveto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group_1__0__Impl_in_rule__Curveto_argument_sequence__Group_1__05237);
            rule__Curveto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group_1__1_in_rule__Curveto_argument_sequence__Group_1__05240);
            rule__Curveto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Curveto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2529:1: rule__Curveto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Curveto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2533:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2534:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2534:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2535:1: ( rulecomma )?
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2536:1: ( rulecomma )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==5) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2536:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Curveto_argument_sequence__Group_1__0__Impl5268);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Curveto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Curveto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2546:1: rule__Curveto_argument_sequence__Group_1__1 : rule__Curveto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Curveto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2550:1: ( rule__Curveto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2551:2: rule__Curveto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Group_1__1__Impl_in_rule__Curveto_argument_sequence__Group_1__15299);
            rule__Curveto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Curveto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2557:1: rule__Curveto_argument_sequence__Group_1__1__Impl : ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 ) ) ;
    public final void rule__Curveto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2561:1: ( ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2562:1: ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2562:1: ( ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2563:1: ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 )
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2564:1: ( rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2564:2: rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1_in_rule__Curveto_argument_sequence__Group_1__1__Impl5326);
            rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Curveto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Curveto_argument__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2578:1: rule__Curveto_argument__Group__0 : rule__Curveto_argument__Group__0__Impl rule__Curveto_argument__Group__1 ;
    public final void rule__Curveto_argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2582:1: ( rule__Curveto_argument__Group__0__Impl rule__Curveto_argument__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2583:2: rule__Curveto_argument__Group__0__Impl rule__Curveto_argument__Group__1
            {
            pushFollow(FOLLOW_rule__Curveto_argument__Group__0__Impl_in_rule__Curveto_argument__Group__05360);
            rule__Curveto_argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto_argument__Group__1_in_rule__Curveto_argument__Group__05363);
            rule__Curveto_argument__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument__Group__0"


    // $ANTLR start "rule__Curveto_argument__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2590:1: rule__Curveto_argument__Group__0__Impl : ( ( rule__Curveto_argument__C1Assignment_0 ) ) ;
    public final void rule__Curveto_argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2594:1: ( ( ( rule__Curveto_argument__C1Assignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2595:1: ( ( rule__Curveto_argument__C1Assignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2595:1: ( ( rule__Curveto_argument__C1Assignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2596:1: ( rule__Curveto_argument__C1Assignment_0 )
            {
             before(grammarAccess.getCurveto_argumentAccess().getC1Assignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2597:1: ( rule__Curveto_argument__C1Assignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2597:2: rule__Curveto_argument__C1Assignment_0
            {
            pushFollow(FOLLOW_rule__Curveto_argument__C1Assignment_0_in_rule__Curveto_argument__Group__0__Impl5390);
            rule__Curveto_argument__C1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argumentAccess().getC1Assignment_0()); 

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
    // $ANTLR end "rule__Curveto_argument__Group__0__Impl"


    // $ANTLR start "rule__Curveto_argument__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2607:1: rule__Curveto_argument__Group__1 : rule__Curveto_argument__Group__1__Impl rule__Curveto_argument__Group__2 ;
    public final void rule__Curveto_argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2611:1: ( rule__Curveto_argument__Group__1__Impl rule__Curveto_argument__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2612:2: rule__Curveto_argument__Group__1__Impl rule__Curveto_argument__Group__2
            {
            pushFollow(FOLLOW_rule__Curveto_argument__Group__1__Impl_in_rule__Curveto_argument__Group__15420);
            rule__Curveto_argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto_argument__Group__2_in_rule__Curveto_argument__Group__15423);
            rule__Curveto_argument__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument__Group__1"


    // $ANTLR start "rule__Curveto_argument__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2619:1: rule__Curveto_argument__Group__1__Impl : ( ( rulecomma )? ) ;
    public final void rule__Curveto_argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2623:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2624:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2624:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2625:1: ( rulecomma )?
            {
             before(grammarAccess.getCurveto_argumentAccess().getCommaParserRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2626:1: ( rulecomma )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==5) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2626:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Curveto_argument__Group__1__Impl5451);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurveto_argumentAccess().getCommaParserRuleCall_1()); 

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
    // $ANTLR end "rule__Curveto_argument__Group__1__Impl"


    // $ANTLR start "rule__Curveto_argument__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2636:1: rule__Curveto_argument__Group__2 : rule__Curveto_argument__Group__2__Impl rule__Curveto_argument__Group__3 ;
    public final void rule__Curveto_argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2640:1: ( rule__Curveto_argument__Group__2__Impl rule__Curveto_argument__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2641:2: rule__Curveto_argument__Group__2__Impl rule__Curveto_argument__Group__3
            {
            pushFollow(FOLLOW_rule__Curveto_argument__Group__2__Impl_in_rule__Curveto_argument__Group__25482);
            rule__Curveto_argument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto_argument__Group__3_in_rule__Curveto_argument__Group__25485);
            rule__Curveto_argument__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument__Group__2"


    // $ANTLR start "rule__Curveto_argument__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2648:1: rule__Curveto_argument__Group__2__Impl : ( ( rule__Curveto_argument__C2Assignment_2 ) ) ;
    public final void rule__Curveto_argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2652:1: ( ( ( rule__Curveto_argument__C2Assignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2653:1: ( ( rule__Curveto_argument__C2Assignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2653:1: ( ( rule__Curveto_argument__C2Assignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2654:1: ( rule__Curveto_argument__C2Assignment_2 )
            {
             before(grammarAccess.getCurveto_argumentAccess().getC2Assignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2655:1: ( rule__Curveto_argument__C2Assignment_2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2655:2: rule__Curveto_argument__C2Assignment_2
            {
            pushFollow(FOLLOW_rule__Curveto_argument__C2Assignment_2_in_rule__Curveto_argument__Group__2__Impl5512);
            rule__Curveto_argument__C2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argumentAccess().getC2Assignment_2()); 

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
    // $ANTLR end "rule__Curveto_argument__Group__2__Impl"


    // $ANTLR start "rule__Curveto_argument__Group__3"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2665:1: rule__Curveto_argument__Group__3 : rule__Curveto_argument__Group__3__Impl rule__Curveto_argument__Group__4 ;
    public final void rule__Curveto_argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2669:1: ( rule__Curveto_argument__Group__3__Impl rule__Curveto_argument__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2670:2: rule__Curveto_argument__Group__3__Impl rule__Curveto_argument__Group__4
            {
            pushFollow(FOLLOW_rule__Curveto_argument__Group__3__Impl_in_rule__Curveto_argument__Group__35542);
            rule__Curveto_argument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Curveto_argument__Group__4_in_rule__Curveto_argument__Group__35545);
            rule__Curveto_argument__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument__Group__3"


    // $ANTLR start "rule__Curveto_argument__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2677:1: rule__Curveto_argument__Group__3__Impl : ( ( rulecomma )? ) ;
    public final void rule__Curveto_argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2681:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2682:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2682:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2683:1: ( rulecomma )?
            {
             before(grammarAccess.getCurveto_argumentAccess().getCommaParserRuleCall_3()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2684:1: ( rulecomma )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==5) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2684:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Curveto_argument__Group__3__Impl5573);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCurveto_argumentAccess().getCommaParserRuleCall_3()); 

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
    // $ANTLR end "rule__Curveto_argument__Group__3__Impl"


    // $ANTLR start "rule__Curveto_argument__Group__4"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2694:1: rule__Curveto_argument__Group__4 : rule__Curveto_argument__Group__4__Impl ;
    public final void rule__Curveto_argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2698:1: ( rule__Curveto_argument__Group__4__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2699:2: rule__Curveto_argument__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Curveto_argument__Group__4__Impl_in_rule__Curveto_argument__Group__45604);
            rule__Curveto_argument__Group__4__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Curveto_argument__Group__4"


    // $ANTLR start "rule__Curveto_argument__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2705:1: rule__Curveto_argument__Group__4__Impl : ( ( rule__Curveto_argument__C3Assignment_4 ) ) ;
    public final void rule__Curveto_argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2709:1: ( ( ( rule__Curveto_argument__C3Assignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2710:1: ( ( rule__Curveto_argument__C3Assignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2710:1: ( ( rule__Curveto_argument__C3Assignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2711:1: ( rule__Curveto_argument__C3Assignment_4 )
            {
             before(grammarAccess.getCurveto_argumentAccess().getC3Assignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2712:1: ( rule__Curveto_argument__C3Assignment_4 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2712:2: rule__Curveto_argument__C3Assignment_4
            {
            pushFollow(FOLLOW_rule__Curveto_argument__C3Assignment_4_in_rule__Curveto_argument__Group__4__Impl5631);
            rule__Curveto_argument__C3Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCurveto_argumentAccess().getC3Assignment_4()); 

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
    // $ANTLR end "rule__Curveto_argument__Group__4__Impl"


    // $ANTLR start "rule__Smooth_curveto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2732:1: rule__Smooth_curveto__Group__0 : rule__Smooth_curveto__Group__0__Impl rule__Smooth_curveto__Group__1 ;
    public final void rule__Smooth_curveto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2736:1: ( rule__Smooth_curveto__Group__0__Impl rule__Smooth_curveto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2737:2: rule__Smooth_curveto__Group__0__Impl rule__Smooth_curveto__Group__1
            {
            pushFollow(FOLLOW_rule__Smooth_curveto__Group__0__Impl_in_rule__Smooth_curveto__Group__05671);
            rule__Smooth_curveto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_curveto__Group__1_in_rule__Smooth_curveto__Group__05674);
            rule__Smooth_curveto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto__Group__0"


    // $ANTLR start "rule__Smooth_curveto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2744:1: rule__Smooth_curveto__Group__0__Impl : ( ( rule__Smooth_curveto__Alternatives_0 ) ) ;
    public final void rule__Smooth_curveto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2748:1: ( ( ( rule__Smooth_curveto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2749:1: ( ( rule__Smooth_curveto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2749:1: ( ( rule__Smooth_curveto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2750:1: ( rule__Smooth_curveto__Alternatives_0 )
            {
             before(grammarAccess.getSmooth_curvetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2751:1: ( rule__Smooth_curveto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2751:2: rule__Smooth_curveto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Smooth_curveto__Alternatives_0_in_rule__Smooth_curveto__Group__0__Impl5701);
            rule__Smooth_curveto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curvetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Smooth_curveto__Group__0__Impl"


    // $ANTLR start "rule__Smooth_curveto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2761:1: rule__Smooth_curveto__Group__1 : rule__Smooth_curveto__Group__1__Impl ;
    public final void rule__Smooth_curveto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2765:1: ( rule__Smooth_curveto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2766:2: rule__Smooth_curveto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_curveto__Group__1__Impl_in_rule__Smooth_curveto__Group__15731);
            rule__Smooth_curveto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto__Group__1"


    // $ANTLR start "rule__Smooth_curveto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2772:1: rule__Smooth_curveto__Group__1__Impl : ( ( rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Smooth_curveto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2776:1: ( ( ( rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2777:1: ( ( rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2777:1: ( ( rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2778:1: ( rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getSmooth_curvetoAccess().getSmooth_curveto_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2779:1: ( rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2779:2: rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1_in_rule__Smooth_curveto__Group__1__Impl5758);
            rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curvetoAccess().getSmooth_curveto_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Smooth_curveto__Group__1__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2793:1: rule__Smooth_curveto_argument_sequence__Group__0 : rule__Smooth_curveto_argument_sequence__Group__0__Impl rule__Smooth_curveto_argument_sequence__Group__1 ;
    public final void rule__Smooth_curveto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2797:1: ( rule__Smooth_curveto_argument_sequence__Group__0__Impl rule__Smooth_curveto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2798:2: rule__Smooth_curveto_argument_sequence__Group__0__Impl rule__Smooth_curveto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group__0__Impl_in_rule__Smooth_curveto_argument_sequence__Group__05792);
            rule__Smooth_curveto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group__1_in_rule__Smooth_curveto_argument_sequence__Group__05795);
            rule__Smooth_curveto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group__0"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2805:1: rule__Smooth_curveto_argument_sequence__Group__0__Impl : ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 ) ) ;
    public final void rule__Smooth_curveto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2809:1: ( ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2810:1: ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2810:1: ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2811:1: ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 )
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2812:1: ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2812:2: rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0_in_rule__Smooth_curveto_argument_sequence__Group__0__Impl5822);
            rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsAssignment_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2822:1: rule__Smooth_curveto_argument_sequence__Group__1 : rule__Smooth_curveto_argument_sequence__Group__1__Impl ;
    public final void rule__Smooth_curveto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2826:1: ( rule__Smooth_curveto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2827:2: rule__Smooth_curveto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group__1__Impl_in_rule__Smooth_curveto_argument_sequence__Group__15852);
            rule__Smooth_curveto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group__1"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2833:1: rule__Smooth_curveto_argument_sequence__Group__1__Impl : ( ( rule__Smooth_curveto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Smooth_curveto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2837:1: ( ( ( rule__Smooth_curveto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2838:1: ( ( rule__Smooth_curveto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2838:1: ( ( rule__Smooth_curveto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2839:1: ( rule__Smooth_curveto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2840:1: ( rule__Smooth_curveto_argument_sequence__Group_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==5||(LA30_0>=28 && LA30_0<=39)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2840:2: rule__Smooth_curveto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__0_in_rule__Smooth_curveto_argument_sequence__Group__1__Impl5879);
            	    rule__Smooth_curveto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2854:1: rule__Smooth_curveto_argument_sequence__Group_1__0 : rule__Smooth_curveto_argument_sequence__Group_1__0__Impl rule__Smooth_curveto_argument_sequence__Group_1__1 ;
    public final void rule__Smooth_curveto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2858:1: ( rule__Smooth_curveto_argument_sequence__Group_1__0__Impl rule__Smooth_curveto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2859:2: rule__Smooth_curveto_argument_sequence__Group_1__0__Impl rule__Smooth_curveto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__0__Impl_in_rule__Smooth_curveto_argument_sequence__Group_1__05914);
            rule__Smooth_curveto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__1_in_rule__Smooth_curveto_argument_sequence__Group_1__05917);
            rule__Smooth_curveto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2866:1: rule__Smooth_curveto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Smooth_curveto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2870:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2871:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2871:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2872:1: ( rulecomma )?
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2873:1: ( rulecomma )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==5) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2873:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Smooth_curveto_argument_sequence__Group_1__0__Impl5945);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2883:1: rule__Smooth_curveto_argument_sequence__Group_1__1 : rule__Smooth_curveto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Smooth_curveto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2887:1: ( rule__Smooth_curveto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2888:2: rule__Smooth_curveto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__1__Impl_in_rule__Smooth_curveto_argument_sequence__Group_1__15976);
            rule__Smooth_curveto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2894:1: rule__Smooth_curveto_argument_sequence__Group_1__1__Impl : ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 ) ) ;
    public final void rule__Smooth_curveto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2898:1: ( ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2899:1: ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2899:1: ( ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2900:1: ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 )
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2901:1: ( rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2901:2: rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1_in_rule__Smooth_curveto_argument_sequence__Group_1__1__Impl6003);
            rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2915:1: rule__Smooth_curveto_argument__Group__0 : rule__Smooth_curveto_argument__Group__0__Impl rule__Smooth_curveto_argument__Group__1 ;
    public final void rule__Smooth_curveto_argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2919:1: ( rule__Smooth_curveto_argument__Group__0__Impl rule__Smooth_curveto_argument__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2920:2: rule__Smooth_curveto_argument__Group__0__Impl rule__Smooth_curveto_argument__Group__1
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument__Group__0__Impl_in_rule__Smooth_curveto_argument__Group__06037);
            rule__Smooth_curveto_argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_curveto_argument__Group__1_in_rule__Smooth_curveto_argument__Group__06040);
            rule__Smooth_curveto_argument__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument__Group__0"


    // $ANTLR start "rule__Smooth_curveto_argument__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2927:1: rule__Smooth_curveto_argument__Group__0__Impl : ( ( rule__Smooth_curveto_argument__C1Assignment_0 ) ) ;
    public final void rule__Smooth_curveto_argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2931:1: ( ( ( rule__Smooth_curveto_argument__C1Assignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2932:1: ( ( rule__Smooth_curveto_argument__C1Assignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2932:1: ( ( rule__Smooth_curveto_argument__C1Assignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2933:1: ( rule__Smooth_curveto_argument__C1Assignment_0 )
            {
             before(grammarAccess.getSmooth_curveto_argumentAccess().getC1Assignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2934:1: ( rule__Smooth_curveto_argument__C1Assignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2934:2: rule__Smooth_curveto_argument__C1Assignment_0
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument__C1Assignment_0_in_rule__Smooth_curveto_argument__Group__0__Impl6067);
            rule__Smooth_curveto_argument__C1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curveto_argumentAccess().getC1Assignment_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument__Group__0__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2944:1: rule__Smooth_curveto_argument__Group__1 : rule__Smooth_curveto_argument__Group__1__Impl rule__Smooth_curveto_argument__Group__2 ;
    public final void rule__Smooth_curveto_argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2948:1: ( rule__Smooth_curveto_argument__Group__1__Impl rule__Smooth_curveto_argument__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2949:2: rule__Smooth_curveto_argument__Group__1__Impl rule__Smooth_curveto_argument__Group__2
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument__Group__1__Impl_in_rule__Smooth_curveto_argument__Group__16097);
            rule__Smooth_curveto_argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_curveto_argument__Group__2_in_rule__Smooth_curveto_argument__Group__16100);
            rule__Smooth_curveto_argument__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument__Group__1"


    // $ANTLR start "rule__Smooth_curveto_argument__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2956:1: rule__Smooth_curveto_argument__Group__1__Impl : ( ( rulecomma )? ) ;
    public final void rule__Smooth_curveto_argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2960:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2961:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2961:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2962:1: ( rulecomma )?
            {
             before(grammarAccess.getSmooth_curveto_argumentAccess().getCommaParserRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2963:1: ( rulecomma )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==5) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2963:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Smooth_curveto_argument__Group__1__Impl6128);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmooth_curveto_argumentAccess().getCommaParserRuleCall_1()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument__Group__1__Impl"


    // $ANTLR start "rule__Smooth_curveto_argument__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2973:1: rule__Smooth_curveto_argument__Group__2 : rule__Smooth_curveto_argument__Group__2__Impl ;
    public final void rule__Smooth_curveto_argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2977:1: ( rule__Smooth_curveto_argument__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2978:2: rule__Smooth_curveto_argument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument__Group__2__Impl_in_rule__Smooth_curveto_argument__Group__26159);
            rule__Smooth_curveto_argument__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_curveto_argument__Group__2"


    // $ANTLR start "rule__Smooth_curveto_argument__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2984:1: rule__Smooth_curveto_argument__Group__2__Impl : ( ( rule__Smooth_curveto_argument__C2Assignment_2 ) ) ;
    public final void rule__Smooth_curveto_argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2988:1: ( ( ( rule__Smooth_curveto_argument__C2Assignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2989:1: ( ( rule__Smooth_curveto_argument__C2Assignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2989:1: ( ( rule__Smooth_curveto_argument__C2Assignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2990:1: ( rule__Smooth_curveto_argument__C2Assignment_2 )
            {
             before(grammarAccess.getSmooth_curveto_argumentAccess().getC2Assignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2991:1: ( rule__Smooth_curveto_argument__C2Assignment_2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:2991:2: rule__Smooth_curveto_argument__C2Assignment_2
            {
            pushFollow(FOLLOW_rule__Smooth_curveto_argument__C2Assignment_2_in_rule__Smooth_curveto_argument__Group__2__Impl6186);
            rule__Smooth_curveto_argument__C2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_curveto_argumentAccess().getC2Assignment_2()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument__Group__2__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3007:1: rule__Quadratic_bezier_curveto__Group__0 : rule__Quadratic_bezier_curveto__Group__0__Impl rule__Quadratic_bezier_curveto__Group__1 ;
    public final void rule__Quadratic_bezier_curveto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3011:1: ( rule__Quadratic_bezier_curveto__Group__0__Impl rule__Quadratic_bezier_curveto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3012:2: rule__Quadratic_bezier_curveto__Group__0__Impl rule__Quadratic_bezier_curveto__Group__1
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto__Group__0__Impl_in_rule__Quadratic_bezier_curveto__Group__06222);
            rule__Quadratic_bezier_curveto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto__Group__1_in_rule__Quadratic_bezier_curveto__Group__06225);
            rule__Quadratic_bezier_curveto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto__Group__0"


    // $ANTLR start "rule__Quadratic_bezier_curveto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3019:1: rule__Quadratic_bezier_curveto__Group__0__Impl : ( ( rule__Quadratic_bezier_curveto__Alternatives_0 ) ) ;
    public final void rule__Quadratic_bezier_curveto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3023:1: ( ( ( rule__Quadratic_bezier_curveto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3024:1: ( ( rule__Quadratic_bezier_curveto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3024:1: ( ( rule__Quadratic_bezier_curveto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3025:1: ( rule__Quadratic_bezier_curveto__Alternatives_0 )
            {
             before(grammarAccess.getQuadratic_bezier_curvetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3026:1: ( rule__Quadratic_bezier_curveto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3026:2: rule__Quadratic_bezier_curveto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto__Alternatives_0_in_rule__Quadratic_bezier_curveto__Group__0__Impl6252);
            rule__Quadratic_bezier_curveto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curvetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto__Group__0__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3036:1: rule__Quadratic_bezier_curveto__Group__1 : rule__Quadratic_bezier_curveto__Group__1__Impl ;
    public final void rule__Quadratic_bezier_curveto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3040:1: ( rule__Quadratic_bezier_curveto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3041:2: rule__Quadratic_bezier_curveto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto__Group__1__Impl_in_rule__Quadratic_bezier_curveto__Group__16282);
            rule__Quadratic_bezier_curveto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto__Group__1"


    // $ANTLR start "rule__Quadratic_bezier_curveto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3047:1: rule__Quadratic_bezier_curveto__Group__1__Impl : ( rulequadratic_bezier_curveto_argument_sequence ) ;
    public final void rule__Quadratic_bezier_curveto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3051:1: ( ( rulequadratic_bezier_curveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3052:1: ( rulequadratic_bezier_curveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3052:1: ( rulequadratic_bezier_curveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3053:1: rulequadratic_bezier_curveto_argument_sequence
            {
             before(grammarAccess.getQuadratic_bezier_curvetoAccess().getQuadratic_bezier_curveto_argument_sequenceParserRuleCall_1()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_rule__Quadratic_bezier_curveto__Group__1__Impl6309);
            rulequadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curvetoAccess().getQuadratic_bezier_curveto_argument_sequenceParserRuleCall_1()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto__Group__1__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3068:1: rule__Quadratic_bezier_curveto_argument_sequence__Group__0 : rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl rule__Quadratic_bezier_curveto_argument_sequence__Group__1 ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3072:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl rule__Quadratic_bezier_curveto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3073:2: rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl rule__Quadratic_bezier_curveto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__06342);
            rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__1_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__06345);
            rule__Quadratic_bezier_curveto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group__0"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3080:1: rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl : ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 ) ) ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3084:1: ( ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3085:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3085:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3086:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 )
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3087:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3087:2: rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl6372);
            rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsAssignment_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3097:1: rule__Quadratic_bezier_curveto_argument_sequence__Group__1 : rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3101:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3102:2: rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__16402);
            rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group__1"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3108:1: rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl : ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3112:1: ( ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3113:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3113:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3114:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3115:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==5||(LA33_0>=28 && LA33_0<=39)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3115:2: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl6429);
            	    rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3129:1: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0 : rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1 ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3133:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3134:2: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__06464);
            rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__06467);
            rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3141:1: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3145:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3146:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3146:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3147:1: ( rulecomma )?
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3148:1: ( rulecomma )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==5) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3148:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl6495);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3158:1: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1 : rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3162:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3163:2: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__16526);
            rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3169:1: rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl : ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 ) ) ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3173:1: ( ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3174:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3174:1: ( ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3175:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 )
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3176:1: ( rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3176:2: rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl6553);
            rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3190:1: rule__Quadratic_bezier_curveto_argument__Group__0 : rule__Quadratic_bezier_curveto_argument__Group__0__Impl rule__Quadratic_bezier_curveto_argument__Group__1 ;
    public final void rule__Quadratic_bezier_curveto_argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3194:1: ( rule__Quadratic_bezier_curveto_argument__Group__0__Impl rule__Quadratic_bezier_curveto_argument__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3195:2: rule__Quadratic_bezier_curveto_argument__Group__0__Impl rule__Quadratic_bezier_curveto_argument__Group__1
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__0__Impl_in_rule__Quadratic_bezier_curveto_argument__Group__06587);
            rule__Quadratic_bezier_curveto_argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__1_in_rule__Quadratic_bezier_curveto_argument__Group__06590);
            rule__Quadratic_bezier_curveto_argument__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__Group__0"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3202:1: rule__Quadratic_bezier_curveto_argument__Group__0__Impl : ( ( rule__Quadratic_bezier_curveto_argument__C1Assignment_0 ) ) ;
    public final void rule__Quadratic_bezier_curveto_argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3206:1: ( ( ( rule__Quadratic_bezier_curveto_argument__C1Assignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3207:1: ( ( rule__Quadratic_bezier_curveto_argument__C1Assignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3207:1: ( ( rule__Quadratic_bezier_curveto_argument__C1Assignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3208:1: ( rule__Quadratic_bezier_curveto_argument__C1Assignment_0 )
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC1Assignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3209:1: ( rule__Quadratic_bezier_curveto_argument__C1Assignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3209:2: rule__Quadratic_bezier_curveto_argument__C1Assignment_0
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__C1Assignment_0_in_rule__Quadratic_bezier_curveto_argument__Group__0__Impl6617);
            rule__Quadratic_bezier_curveto_argument__C1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC1Assignment_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__Group__0__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3219:1: rule__Quadratic_bezier_curveto_argument__Group__1 : rule__Quadratic_bezier_curveto_argument__Group__1__Impl rule__Quadratic_bezier_curveto_argument__Group__2 ;
    public final void rule__Quadratic_bezier_curveto_argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3223:1: ( rule__Quadratic_bezier_curveto_argument__Group__1__Impl rule__Quadratic_bezier_curveto_argument__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3224:2: rule__Quadratic_bezier_curveto_argument__Group__1__Impl rule__Quadratic_bezier_curveto_argument__Group__2
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__1__Impl_in_rule__Quadratic_bezier_curveto_argument__Group__16647);
            rule__Quadratic_bezier_curveto_argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__2_in_rule__Quadratic_bezier_curveto_argument__Group__16650);
            rule__Quadratic_bezier_curveto_argument__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__Group__1"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3231:1: rule__Quadratic_bezier_curveto_argument__Group__1__Impl : ( ( rulecomma )? ) ;
    public final void rule__Quadratic_bezier_curveto_argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3235:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3236:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3236:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3237:1: ( rulecomma )?
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getCommaParserRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3238:1: ( rulecomma )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==5) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3238:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Quadratic_bezier_curveto_argument__Group__1__Impl6678);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getCommaParserRuleCall_1()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__Group__1__Impl"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3248:1: rule__Quadratic_bezier_curveto_argument__Group__2 : rule__Quadratic_bezier_curveto_argument__Group__2__Impl ;
    public final void rule__Quadratic_bezier_curveto_argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3252:1: ( rule__Quadratic_bezier_curveto_argument__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3253:2: rule__Quadratic_bezier_curveto_argument__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__2__Impl_in_rule__Quadratic_bezier_curveto_argument__Group__26709);
            rule__Quadratic_bezier_curveto_argument__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__Group__2"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3259:1: rule__Quadratic_bezier_curveto_argument__Group__2__Impl : ( ( rule__Quadratic_bezier_curveto_argument__C2Assignment_2 ) ) ;
    public final void rule__Quadratic_bezier_curveto_argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3263:1: ( ( ( rule__Quadratic_bezier_curveto_argument__C2Assignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3264:1: ( ( rule__Quadratic_bezier_curveto_argument__C2Assignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3264:1: ( ( rule__Quadratic_bezier_curveto_argument__C2Assignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3265:1: ( rule__Quadratic_bezier_curveto_argument__C2Assignment_2 )
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC2Assignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3266:1: ( rule__Quadratic_bezier_curveto_argument__C2Assignment_2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3266:2: rule__Quadratic_bezier_curveto_argument__C2Assignment_2
            {
            pushFollow(FOLLOW_rule__Quadratic_bezier_curveto_argument__C2Assignment_2_in_rule__Quadratic_bezier_curveto_argument__Group__2__Impl6736);
            rule__Quadratic_bezier_curveto_argument__C2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC2Assignment_2()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__Group__2__Impl"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3282:1: rule__Smooth_quadratic_bezier_curveto__Group__0 : rule__Smooth_quadratic_bezier_curveto__Group__0__Impl rule__Smooth_quadratic_bezier_curveto__Group__1 ;
    public final void rule__Smooth_quadratic_bezier_curveto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3286:1: ( rule__Smooth_quadratic_bezier_curveto__Group__0__Impl rule__Smooth_quadratic_bezier_curveto__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3287:2: rule__Smooth_quadratic_bezier_curveto__Group__0__Impl rule__Smooth_quadratic_bezier_curveto__Group__1
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__0__Impl_in_rule__Smooth_quadratic_bezier_curveto__Group__06772);
            rule__Smooth_quadratic_bezier_curveto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__1_in_rule__Smooth_quadratic_bezier_curveto__Group__06775);
            rule__Smooth_quadratic_bezier_curveto__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto__Group__0"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3294:1: rule__Smooth_quadratic_bezier_curveto__Group__0__Impl : ( ( rule__Smooth_quadratic_bezier_curveto__Alternatives_0 ) ) ;
    public final void rule__Smooth_quadratic_bezier_curveto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3298:1: ( ( ( rule__Smooth_quadratic_bezier_curveto__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3299:1: ( ( rule__Smooth_quadratic_bezier_curveto__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3299:1: ( ( rule__Smooth_quadratic_bezier_curveto__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3300:1: ( rule__Smooth_quadratic_bezier_curveto__Alternatives_0 )
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3301:1: ( rule__Smooth_quadratic_bezier_curveto__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3301:2: rule__Smooth_quadratic_bezier_curveto__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto__Alternatives_0_in_rule__Smooth_quadratic_bezier_curveto__Group__0__Impl6802);
            rule__Smooth_quadratic_bezier_curveto__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto__Group__0__Impl"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3311:1: rule__Smooth_quadratic_bezier_curveto__Group__1 : rule__Smooth_quadratic_bezier_curveto__Group__1__Impl ;
    public final void rule__Smooth_quadratic_bezier_curveto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3315:1: ( rule__Smooth_quadratic_bezier_curveto__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3316:2: rule__Smooth_quadratic_bezier_curveto__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__1__Impl_in_rule__Smooth_quadratic_bezier_curveto__Group__16832);
            rule__Smooth_quadratic_bezier_curveto__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto__Group__1"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3322:1: rule__Smooth_quadratic_bezier_curveto__Group__1__Impl : ( ( rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Smooth_quadratic_bezier_curveto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3326:1: ( ( ( rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3327:1: ( ( rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3327:1: ( ( rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3328:1: ( rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getSmooth_quadratic_bezier_curveto_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3329:1: ( rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3329:2: rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1_in_rule__Smooth_quadratic_bezier_curveto__Group__1__Impl6859);
            rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getSmooth_quadratic_bezier_curveto_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto__Group__1__Impl"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3343:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0 : rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1 ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3347:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3348:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__06893);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__06896);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3355:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl : ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 ) ) ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3359:1: ( ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3360:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3360:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3361:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 )
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3362:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3362:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl6923);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsAssignment_0()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3372:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1 : rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3376:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3377:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__16953);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3383:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl : ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3387:1: ( ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3388:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3388:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3389:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3390:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==5||(LA36_0>=28 && LA36_0<=39)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3390:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl6980);
            	    rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3404:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0 : rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1 ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3408:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3409:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__07015);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__07018);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3416:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3420:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3421:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3421:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3422:1: ( rulecomma )?
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3423:1: ( rulecomma )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==5) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3423:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl7046);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3433:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1 : rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3437:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3438:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__17077);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3444:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl : ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 ) ) ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3448:1: ( ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3449:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3449:1: ( ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3450:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 )
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3451:1: ( rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3451:2: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl7104);
            rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsAssignment_1_1()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Elliptical_arc__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3465:1: rule__Elliptical_arc__Group__0 : rule__Elliptical_arc__Group__0__Impl rule__Elliptical_arc__Group__1 ;
    public final void rule__Elliptical_arc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3469:1: ( rule__Elliptical_arc__Group__0__Impl rule__Elliptical_arc__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3470:2: rule__Elliptical_arc__Group__0__Impl rule__Elliptical_arc__Group__1
            {
            pushFollow(FOLLOW_rule__Elliptical_arc__Group__0__Impl_in_rule__Elliptical_arc__Group__07138);
            rule__Elliptical_arc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc__Group__1_in_rule__Elliptical_arc__Group__07141);
            rule__Elliptical_arc__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc__Group__0"


    // $ANTLR start "rule__Elliptical_arc__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3477:1: rule__Elliptical_arc__Group__0__Impl : ( ( rule__Elliptical_arc__Alternatives_0 ) ) ;
    public final void rule__Elliptical_arc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3481:1: ( ( ( rule__Elliptical_arc__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3482:1: ( ( rule__Elliptical_arc__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3482:1: ( ( rule__Elliptical_arc__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3483:1: ( rule__Elliptical_arc__Alternatives_0 )
            {
             before(grammarAccess.getElliptical_arcAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3484:1: ( rule__Elliptical_arc__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3484:2: rule__Elliptical_arc__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Elliptical_arc__Alternatives_0_in_rule__Elliptical_arc__Group__0__Impl7168);
            rule__Elliptical_arc__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arcAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Elliptical_arc__Group__0__Impl"


    // $ANTLR start "rule__Elliptical_arc__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3494:1: rule__Elliptical_arc__Group__1 : rule__Elliptical_arc__Group__1__Impl ;
    public final void rule__Elliptical_arc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3498:1: ( rule__Elliptical_arc__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3499:2: rule__Elliptical_arc__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Elliptical_arc__Group__1__Impl_in_rule__Elliptical_arc__Group__17198);
            rule__Elliptical_arc__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc__Group__1"


    // $ANTLR start "rule__Elliptical_arc__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3505:1: rule__Elliptical_arc__Group__1__Impl : ( ( rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 ) ) ;
    public final void rule__Elliptical_arc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3509:1: ( ( ( rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3510:1: ( ( rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3510:1: ( ( rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3511:1: ( rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 )
            {
             before(grammarAccess.getElliptical_arcAccess().getElliptical_arc_argument_sequenceAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3512:1: ( rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3512:2: rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1_in_rule__Elliptical_arc__Group__1__Impl7225);
            rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arcAccess().getElliptical_arc_argument_sequenceAssignment_1()); 

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
    // $ANTLR end "rule__Elliptical_arc__Group__1__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3526:1: rule__Elliptical_arc_argument_sequence__Group__0 : rule__Elliptical_arc_argument_sequence__Group__0__Impl rule__Elliptical_arc_argument_sequence__Group__1 ;
    public final void rule__Elliptical_arc_argument_sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3530:1: ( rule__Elliptical_arc_argument_sequence__Group__0__Impl rule__Elliptical_arc_argument_sequence__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3531:2: rule__Elliptical_arc_argument_sequence__Group__0__Impl rule__Elliptical_arc_argument_sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group__0__Impl_in_rule__Elliptical_arc_argument_sequence__Group__07259);
            rule__Elliptical_arc_argument_sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group__1_in_rule__Elliptical_arc_argument_sequence__Group__07262);
            rule__Elliptical_arc_argument_sequence__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group__0"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3538:1: rule__Elliptical_arc_argument_sequence__Group__0__Impl : ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 ) ) ;
    public final void rule__Elliptical_arc_argument_sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3542:1: ( ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3543:1: ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3543:1: ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3544:1: ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 )
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3545:1: ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3545:2: rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0_in_rule__Elliptical_arc_argument_sequence__Group__0__Impl7289);
            rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsAssignment_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group__0__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3555:1: rule__Elliptical_arc_argument_sequence__Group__1 : rule__Elliptical_arc_argument_sequence__Group__1__Impl ;
    public final void rule__Elliptical_arc_argument_sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3559:1: ( rule__Elliptical_arc_argument_sequence__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3560:2: rule__Elliptical_arc_argument_sequence__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group__1__Impl_in_rule__Elliptical_arc_argument_sequence__Group__17319);
            rule__Elliptical_arc_argument_sequence__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group__1"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3566:1: rule__Elliptical_arc_argument_sequence__Group__1__Impl : ( ( rule__Elliptical_arc_argument_sequence__Group_1__0 )* ) ;
    public final void rule__Elliptical_arc_argument_sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3570:1: ( ( ( rule__Elliptical_arc_argument_sequence__Group_1__0 )* ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3571:1: ( ( rule__Elliptical_arc_argument_sequence__Group_1__0 )* )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3571:1: ( ( rule__Elliptical_arc_argument_sequence__Group_1__0 )* )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3572:1: ( rule__Elliptical_arc_argument_sequence__Group_1__0 )*
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3573:1: ( rule__Elliptical_arc_argument_sequence__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==5||(LA38_0>=28 && LA38_0<=37)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3573:2: rule__Elliptical_arc_argument_sequence__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__0_in_rule__Elliptical_arc_argument_sequence__Group__1__Impl7346);
            	    rule__Elliptical_arc_argument_sequence__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group__1__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3587:1: rule__Elliptical_arc_argument_sequence__Group_1__0 : rule__Elliptical_arc_argument_sequence__Group_1__0__Impl rule__Elliptical_arc_argument_sequence__Group_1__1 ;
    public final void rule__Elliptical_arc_argument_sequence__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3591:1: ( rule__Elliptical_arc_argument_sequence__Group_1__0__Impl rule__Elliptical_arc_argument_sequence__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3592:2: rule__Elliptical_arc_argument_sequence__Group_1__0__Impl rule__Elliptical_arc_argument_sequence__Group_1__1
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__0__Impl_in_rule__Elliptical_arc_argument_sequence__Group_1__07381);
            rule__Elliptical_arc_argument_sequence__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__1_in_rule__Elliptical_arc_argument_sequence__Group_1__07384);
            rule__Elliptical_arc_argument_sequence__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group_1__0"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3599:1: rule__Elliptical_arc_argument_sequence__Group_1__0__Impl : ( ( rulecomma )? ) ;
    public final void rule__Elliptical_arc_argument_sequence__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3603:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3604:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3604:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3605:1: ( rulecomma )?
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3606:1: ( rulecomma )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==5) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3606:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Elliptical_arc_argument_sequence__Group_1__0__Impl7412);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getCommaParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group_1__0__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3616:1: rule__Elliptical_arc_argument_sequence__Group_1__1 : rule__Elliptical_arc_argument_sequence__Group_1__1__Impl ;
    public final void rule__Elliptical_arc_argument_sequence__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3620:1: ( rule__Elliptical_arc_argument_sequence__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3621:2: rule__Elliptical_arc_argument_sequence__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__1__Impl_in_rule__Elliptical_arc_argument_sequence__Group_1__17443);
            rule__Elliptical_arc_argument_sequence__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group_1__1"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3627:1: rule__Elliptical_arc_argument_sequence__Group_1__1__Impl : ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 ) ) ;
    public final void rule__Elliptical_arc_argument_sequence__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3631:1: ( ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3632:1: ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3632:1: ( ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3633:1: ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 )
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3634:1: ( rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3634:2: rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1_in_rule__Elliptical_arc_argument_sequence__Group_1__1__Impl7470);
            rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsAssignment_1_1()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Group_1__1__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3648:1: rule__Elliptical_arc_argument__Group__0 : rule__Elliptical_arc_argument__Group__0__Impl rule__Elliptical_arc_argument__Group__1 ;
    public final void rule__Elliptical_arc_argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3652:1: ( rule__Elliptical_arc_argument__Group__0__Impl rule__Elliptical_arc_argument__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3653:2: rule__Elliptical_arc_argument__Group__0__Impl rule__Elliptical_arc_argument__Group__1
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__0__Impl_in_rule__Elliptical_arc_argument__Group__07504);
            rule__Elliptical_arc_argument__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__1_in_rule__Elliptical_arc_argument__Group__07507);
            rule__Elliptical_arc_argument__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__0"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3660:1: rule__Elliptical_arc_argument__Group__0__Impl : ( ( rule__Elliptical_arc_argument__RxAssignment_0 ) ) ;
    public final void rule__Elliptical_arc_argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3664:1: ( ( ( rule__Elliptical_arc_argument__RxAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3665:1: ( ( rule__Elliptical_arc_argument__RxAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3665:1: ( ( rule__Elliptical_arc_argument__RxAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3666:1: ( rule__Elliptical_arc_argument__RxAssignment_0 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getRxAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3667:1: ( rule__Elliptical_arc_argument__RxAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3667:2: rule__Elliptical_arc_argument__RxAssignment_0
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__RxAssignment_0_in_rule__Elliptical_arc_argument__Group__0__Impl7534);
            rule__Elliptical_arc_argument__RxAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getRxAssignment_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__0__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3677:1: rule__Elliptical_arc_argument__Group__1 : rule__Elliptical_arc_argument__Group__1__Impl rule__Elliptical_arc_argument__Group__2 ;
    public final void rule__Elliptical_arc_argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3681:1: ( rule__Elliptical_arc_argument__Group__1__Impl rule__Elliptical_arc_argument__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3682:2: rule__Elliptical_arc_argument__Group__1__Impl rule__Elliptical_arc_argument__Group__2
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__1__Impl_in_rule__Elliptical_arc_argument__Group__17564);
            rule__Elliptical_arc_argument__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__2_in_rule__Elliptical_arc_argument__Group__17567);
            rule__Elliptical_arc_argument__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__1"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3689:1: rule__Elliptical_arc_argument__Group__1__Impl : ( ( rulecomma )? ) ;
    public final void rule__Elliptical_arc_argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3693:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3694:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3694:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3695:1: ( rulecomma )?
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3696:1: ( rulecomma )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==5) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3696:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__1__Impl7595);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_1()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__1__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3706:1: rule__Elliptical_arc_argument__Group__2 : rule__Elliptical_arc_argument__Group__2__Impl rule__Elliptical_arc_argument__Group__3 ;
    public final void rule__Elliptical_arc_argument__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3710:1: ( rule__Elliptical_arc_argument__Group__2__Impl rule__Elliptical_arc_argument__Group__3 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3711:2: rule__Elliptical_arc_argument__Group__2__Impl rule__Elliptical_arc_argument__Group__3
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__2__Impl_in_rule__Elliptical_arc_argument__Group__27626);
            rule__Elliptical_arc_argument__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__3_in_rule__Elliptical_arc_argument__Group__27629);
            rule__Elliptical_arc_argument__Group__3();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__2"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3718:1: rule__Elliptical_arc_argument__Group__2__Impl : ( ( rule__Elliptical_arc_argument__RyAssignment_2 ) ) ;
    public final void rule__Elliptical_arc_argument__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3722:1: ( ( ( rule__Elliptical_arc_argument__RyAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3723:1: ( ( rule__Elliptical_arc_argument__RyAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3723:1: ( ( rule__Elliptical_arc_argument__RyAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3724:1: ( rule__Elliptical_arc_argument__RyAssignment_2 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getRyAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3725:1: ( rule__Elliptical_arc_argument__RyAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3725:2: rule__Elliptical_arc_argument__RyAssignment_2
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__RyAssignment_2_in_rule__Elliptical_arc_argument__Group__2__Impl7656);
            rule__Elliptical_arc_argument__RyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getRyAssignment_2()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__2__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__3"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3735:1: rule__Elliptical_arc_argument__Group__3 : rule__Elliptical_arc_argument__Group__3__Impl rule__Elliptical_arc_argument__Group__4 ;
    public final void rule__Elliptical_arc_argument__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3739:1: ( rule__Elliptical_arc_argument__Group__3__Impl rule__Elliptical_arc_argument__Group__4 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3740:2: rule__Elliptical_arc_argument__Group__3__Impl rule__Elliptical_arc_argument__Group__4
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__3__Impl_in_rule__Elliptical_arc_argument__Group__37686);
            rule__Elliptical_arc_argument__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__4_in_rule__Elliptical_arc_argument__Group__37689);
            rule__Elliptical_arc_argument__Group__4();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__3"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__3__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3747:1: rule__Elliptical_arc_argument__Group__3__Impl : ( ( rulecomma )? ) ;
    public final void rule__Elliptical_arc_argument__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3751:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3752:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3752:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3753:1: ( rulecomma )?
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_3()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3754:1: ( rulecomma )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==5) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3754:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__3__Impl7717);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_3()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__3__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__4"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3764:1: rule__Elliptical_arc_argument__Group__4 : rule__Elliptical_arc_argument__Group__4__Impl rule__Elliptical_arc_argument__Group__5 ;
    public final void rule__Elliptical_arc_argument__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3768:1: ( rule__Elliptical_arc_argument__Group__4__Impl rule__Elliptical_arc_argument__Group__5 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3769:2: rule__Elliptical_arc_argument__Group__4__Impl rule__Elliptical_arc_argument__Group__5
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__4__Impl_in_rule__Elliptical_arc_argument__Group__47748);
            rule__Elliptical_arc_argument__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__5_in_rule__Elliptical_arc_argument__Group__47751);
            rule__Elliptical_arc_argument__Group__5();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__4"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__4__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3776:1: rule__Elliptical_arc_argument__Group__4__Impl : ( ( rule__Elliptical_arc_argument__RotationAssignment_4 ) ) ;
    public final void rule__Elliptical_arc_argument__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3780:1: ( ( ( rule__Elliptical_arc_argument__RotationAssignment_4 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3781:1: ( ( rule__Elliptical_arc_argument__RotationAssignment_4 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3781:1: ( ( rule__Elliptical_arc_argument__RotationAssignment_4 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3782:1: ( rule__Elliptical_arc_argument__RotationAssignment_4 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getRotationAssignment_4()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3783:1: ( rule__Elliptical_arc_argument__RotationAssignment_4 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3783:2: rule__Elliptical_arc_argument__RotationAssignment_4
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__RotationAssignment_4_in_rule__Elliptical_arc_argument__Group__4__Impl7778);
            rule__Elliptical_arc_argument__RotationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getRotationAssignment_4()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__4__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__5"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3793:1: rule__Elliptical_arc_argument__Group__5 : rule__Elliptical_arc_argument__Group__5__Impl rule__Elliptical_arc_argument__Group__6 ;
    public final void rule__Elliptical_arc_argument__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3797:1: ( rule__Elliptical_arc_argument__Group__5__Impl rule__Elliptical_arc_argument__Group__6 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3798:2: rule__Elliptical_arc_argument__Group__5__Impl rule__Elliptical_arc_argument__Group__6
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__5__Impl_in_rule__Elliptical_arc_argument__Group__57808);
            rule__Elliptical_arc_argument__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__6_in_rule__Elliptical_arc_argument__Group__57811);
            rule__Elliptical_arc_argument__Group__6();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__5"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__5__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3805:1: rule__Elliptical_arc_argument__Group__5__Impl : ( rulecomma ) ;
    public final void rule__Elliptical_arc_argument__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3809:1: ( ( rulecomma ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3810:1: ( rulecomma )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3810:1: ( rulecomma )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3811:1: rulecomma
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_5()); 
            pushFollow(FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__5__Impl7838);
            rulecomma();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_5()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__5__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__6"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3822:1: rule__Elliptical_arc_argument__Group__6 : rule__Elliptical_arc_argument__Group__6__Impl rule__Elliptical_arc_argument__Group__7 ;
    public final void rule__Elliptical_arc_argument__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3826:1: ( rule__Elliptical_arc_argument__Group__6__Impl rule__Elliptical_arc_argument__Group__7 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3827:2: rule__Elliptical_arc_argument__Group__6__Impl rule__Elliptical_arc_argument__Group__7
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__6__Impl_in_rule__Elliptical_arc_argument__Group__67867);
            rule__Elliptical_arc_argument__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__7_in_rule__Elliptical_arc_argument__Group__67870);
            rule__Elliptical_arc_argument__Group__7();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__6"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__6__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3834:1: rule__Elliptical_arc_argument__Group__6__Impl : ( ( rule__Elliptical_arc_argument__LargearcflagAssignment_6 ) ) ;
    public final void rule__Elliptical_arc_argument__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3838:1: ( ( ( rule__Elliptical_arc_argument__LargearcflagAssignment_6 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3839:1: ( ( rule__Elliptical_arc_argument__LargearcflagAssignment_6 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3839:1: ( ( rule__Elliptical_arc_argument__LargearcflagAssignment_6 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3840:1: ( rule__Elliptical_arc_argument__LargearcflagAssignment_6 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getLargearcflagAssignment_6()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3841:1: ( rule__Elliptical_arc_argument__LargearcflagAssignment_6 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3841:2: rule__Elliptical_arc_argument__LargearcflagAssignment_6
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__LargearcflagAssignment_6_in_rule__Elliptical_arc_argument__Group__6__Impl7897);
            rule__Elliptical_arc_argument__LargearcflagAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getLargearcflagAssignment_6()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__6__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__7"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3851:1: rule__Elliptical_arc_argument__Group__7 : rule__Elliptical_arc_argument__Group__7__Impl rule__Elliptical_arc_argument__Group__8 ;
    public final void rule__Elliptical_arc_argument__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3855:1: ( rule__Elliptical_arc_argument__Group__7__Impl rule__Elliptical_arc_argument__Group__8 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3856:2: rule__Elliptical_arc_argument__Group__7__Impl rule__Elliptical_arc_argument__Group__8
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__7__Impl_in_rule__Elliptical_arc_argument__Group__77927);
            rule__Elliptical_arc_argument__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__8_in_rule__Elliptical_arc_argument__Group__77930);
            rule__Elliptical_arc_argument__Group__8();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__7"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__7__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3863:1: rule__Elliptical_arc_argument__Group__7__Impl : ( ( rulecomma )? ) ;
    public final void rule__Elliptical_arc_argument__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3867:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3868:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3868:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3869:1: ( rulecomma )?
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_7()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3870:1: ( rulecomma )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==5) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3870:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__7__Impl7958);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_7()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__7__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__8"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3880:1: rule__Elliptical_arc_argument__Group__8 : rule__Elliptical_arc_argument__Group__8__Impl rule__Elliptical_arc_argument__Group__9 ;
    public final void rule__Elliptical_arc_argument__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3884:1: ( rule__Elliptical_arc_argument__Group__8__Impl rule__Elliptical_arc_argument__Group__9 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3885:2: rule__Elliptical_arc_argument__Group__8__Impl rule__Elliptical_arc_argument__Group__9
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__8__Impl_in_rule__Elliptical_arc_argument__Group__87989);
            rule__Elliptical_arc_argument__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__9_in_rule__Elliptical_arc_argument__Group__87992);
            rule__Elliptical_arc_argument__Group__9();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__8"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__8__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3892:1: rule__Elliptical_arc_argument__Group__8__Impl : ( ( rule__Elliptical_arc_argument__SweepflagAssignment_8 ) ) ;
    public final void rule__Elliptical_arc_argument__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3896:1: ( ( ( rule__Elliptical_arc_argument__SweepflagAssignment_8 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3897:1: ( ( rule__Elliptical_arc_argument__SweepflagAssignment_8 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3897:1: ( ( rule__Elliptical_arc_argument__SweepflagAssignment_8 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3898:1: ( rule__Elliptical_arc_argument__SweepflagAssignment_8 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getSweepflagAssignment_8()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3899:1: ( rule__Elliptical_arc_argument__SweepflagAssignment_8 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3899:2: rule__Elliptical_arc_argument__SweepflagAssignment_8
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__SweepflagAssignment_8_in_rule__Elliptical_arc_argument__Group__8__Impl8019);
            rule__Elliptical_arc_argument__SweepflagAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getSweepflagAssignment_8()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__8__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__9"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3909:1: rule__Elliptical_arc_argument__Group__9 : rule__Elliptical_arc_argument__Group__9__Impl rule__Elliptical_arc_argument__Group__10 ;
    public final void rule__Elliptical_arc_argument__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3913:1: ( rule__Elliptical_arc_argument__Group__9__Impl rule__Elliptical_arc_argument__Group__10 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3914:2: rule__Elliptical_arc_argument__Group__9__Impl rule__Elliptical_arc_argument__Group__10
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__9__Impl_in_rule__Elliptical_arc_argument__Group__98049);
            rule__Elliptical_arc_argument__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__10_in_rule__Elliptical_arc_argument__Group__98052);
            rule__Elliptical_arc_argument__Group__10();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__9"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__9__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3921:1: rule__Elliptical_arc_argument__Group__9__Impl : ( ( rulecomma )? ) ;
    public final void rule__Elliptical_arc_argument__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3925:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3926:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3926:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3927:1: ( rulecomma )?
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_9()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3928:1: ( rulecomma )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==5) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3928:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__9__Impl8080);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getCommaParserRuleCall_9()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__9__Impl"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__10"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3938:1: rule__Elliptical_arc_argument__Group__10 : rule__Elliptical_arc_argument__Group__10__Impl ;
    public final void rule__Elliptical_arc_argument__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3942:1: ( rule__Elliptical_arc_argument__Group__10__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3943:2: rule__Elliptical_arc_argument__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Group__10__Impl_in_rule__Elliptical_arc_argument__Group__108111);
            rule__Elliptical_arc_argument__Group__10__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__10"


    // $ANTLR start "rule__Elliptical_arc_argument__Group__10__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3949:1: rule__Elliptical_arc_argument__Group__10__Impl : ( ( rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 ) ) ;
    public final void rule__Elliptical_arc_argument__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3953:1: ( ( ( rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3954:1: ( ( rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3954:1: ( ( rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3955:1: ( rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 )
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCoordinate_pairAssignment_10()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3956:1: ( rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3956:2: rule__Elliptical_arc_argument__Coordinate_pairAssignment_10
            {
            pushFollow(FOLLOW_rule__Elliptical_arc_argument__Coordinate_pairAssignment_10_in_rule__Elliptical_arc_argument__Group__10__Impl8138);
            rule__Elliptical_arc_argument__Coordinate_pairAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getElliptical_arc_argumentAccess().getCoordinate_pairAssignment_10()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Group__10__Impl"


    // $ANTLR start "rule__Coordinate_pair__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3988:1: rule__Coordinate_pair__Group__0 : rule__Coordinate_pair__Group__0__Impl rule__Coordinate_pair__Group__1 ;
    public final void rule__Coordinate_pair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3992:1: ( rule__Coordinate_pair__Group__0__Impl rule__Coordinate_pair__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:3993:2: rule__Coordinate_pair__Group__0__Impl rule__Coordinate_pair__Group__1
            {
            pushFollow(FOLLOW_rule__Coordinate_pair__Group__0__Impl_in_rule__Coordinate_pair__Group__08190);
            rule__Coordinate_pair__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Coordinate_pair__Group__1_in_rule__Coordinate_pair__Group__08193);
            rule__Coordinate_pair__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Coordinate_pair__Group__0"


    // $ANTLR start "rule__Coordinate_pair__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4000:1: rule__Coordinate_pair__Group__0__Impl : ( ( rule__Coordinate_pair__C1Assignment_0 ) ) ;
    public final void rule__Coordinate_pair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4004:1: ( ( ( rule__Coordinate_pair__C1Assignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4005:1: ( ( rule__Coordinate_pair__C1Assignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4005:1: ( ( rule__Coordinate_pair__C1Assignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4006:1: ( rule__Coordinate_pair__C1Assignment_0 )
            {
             before(grammarAccess.getCoordinate_pairAccess().getC1Assignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4007:1: ( rule__Coordinate_pair__C1Assignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4007:2: rule__Coordinate_pair__C1Assignment_0
            {
            pushFollow(FOLLOW_rule__Coordinate_pair__C1Assignment_0_in_rule__Coordinate_pair__Group__0__Impl8220);
            rule__Coordinate_pair__C1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinate_pairAccess().getC1Assignment_0()); 

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
    // $ANTLR end "rule__Coordinate_pair__Group__0__Impl"


    // $ANTLR start "rule__Coordinate_pair__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4017:1: rule__Coordinate_pair__Group__1 : rule__Coordinate_pair__Group__1__Impl rule__Coordinate_pair__Group__2 ;
    public final void rule__Coordinate_pair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4021:1: ( rule__Coordinate_pair__Group__1__Impl rule__Coordinate_pair__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4022:2: rule__Coordinate_pair__Group__1__Impl rule__Coordinate_pair__Group__2
            {
            pushFollow(FOLLOW_rule__Coordinate_pair__Group__1__Impl_in_rule__Coordinate_pair__Group__18250);
            rule__Coordinate_pair__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Coordinate_pair__Group__2_in_rule__Coordinate_pair__Group__18253);
            rule__Coordinate_pair__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Coordinate_pair__Group__1"


    // $ANTLR start "rule__Coordinate_pair__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4029:1: rule__Coordinate_pair__Group__1__Impl : ( ( rulecomma )? ) ;
    public final void rule__Coordinate_pair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4033:1: ( ( ( rulecomma )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4034:1: ( ( rulecomma )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4034:1: ( ( rulecomma )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4035:1: ( rulecomma )?
            {
             before(grammarAccess.getCoordinate_pairAccess().getCommaParserRuleCall_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4036:1: ( rulecomma )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==5) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4036:3: rulecomma
                    {
                    pushFollow(FOLLOW_rulecomma_in_rule__Coordinate_pair__Group__1__Impl8281);
                    rulecomma();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordinate_pairAccess().getCommaParserRuleCall_1()); 

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
    // $ANTLR end "rule__Coordinate_pair__Group__1__Impl"


    // $ANTLR start "rule__Coordinate_pair__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4046:1: rule__Coordinate_pair__Group__2 : rule__Coordinate_pair__Group__2__Impl ;
    public final void rule__Coordinate_pair__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4050:1: ( rule__Coordinate_pair__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4051:2: rule__Coordinate_pair__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Coordinate_pair__Group__2__Impl_in_rule__Coordinate_pair__Group__28312);
            rule__Coordinate_pair__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Coordinate_pair__Group__2"


    // $ANTLR start "rule__Coordinate_pair__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4057:1: rule__Coordinate_pair__Group__2__Impl : ( ( rule__Coordinate_pair__C2Assignment_2 ) ) ;
    public final void rule__Coordinate_pair__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4061:1: ( ( ( rule__Coordinate_pair__C2Assignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4062:1: ( ( rule__Coordinate_pair__C2Assignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4062:1: ( ( rule__Coordinate_pair__C2Assignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4063:1: ( rule__Coordinate_pair__C2Assignment_2 )
            {
             before(grammarAccess.getCoordinate_pairAccess().getC2Assignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4064:1: ( rule__Coordinate_pair__C2Assignment_2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4064:2: rule__Coordinate_pair__C2Assignment_2
            {
            pushFollow(FOLLOW_rule__Coordinate_pair__C2Assignment_2_in_rule__Coordinate_pair__Group__2__Impl8339);
            rule__Coordinate_pair__C2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinate_pairAccess().getC2Assignment_2()); 

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
    // $ANTLR end "rule__Coordinate_pair__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4080:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4084:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4085:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__08375);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Number__Group__1_in_rule__Number__Group__08378);
            rule__Number__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4092:1: rule__Number__Group__0__Impl : ( ( rule__Number__SignAssignment_0 )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4096:1: ( ( ( rule__Number__SignAssignment_0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4097:1: ( ( rule__Number__SignAssignment_0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4097:1: ( ( rule__Number__SignAssignment_0 )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4098:1: ( rule__Number__SignAssignment_0 )?
            {
             before(grammarAccess.getNumberAccess().getSignAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4099:1: ( rule__Number__SignAssignment_0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=38 && LA45_0<=39)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4099:2: rule__Number__SignAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Number__SignAssignment_0_in_rule__Number__Group__0__Impl8405);
                    rule__Number__SignAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getSignAssignment_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4109:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4113:1: ( rule__Number__Group__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4114:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__18436);
            rule__Number__Group__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4120:1: rule__Number__Group__1__Impl : ( ( rule__Number__Nonnegative_numberAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4124:1: ( ( ( rule__Number__Nonnegative_numberAssignment_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4125:1: ( ( rule__Number__Nonnegative_numberAssignment_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4125:1: ( ( rule__Number__Nonnegative_numberAssignment_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4126:1: ( rule__Number__Nonnegative_numberAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getNonnegative_numberAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4127:1: ( rule__Number__Nonnegative_numberAssignment_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4127:2: rule__Number__Nonnegative_numberAssignment_1
            {
            pushFollow(FOLLOW_rule__Number__Nonnegative_numberAssignment_1_in_rule__Number__Group__1__Impl8463);
            rule__Number__Nonnegative_numberAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getNonnegative_numberAssignment_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Nonnegative_number__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4141:1: rule__Nonnegative_number__Group__0 : rule__Nonnegative_number__Group__0__Impl rule__Nonnegative_number__Group__1 ;
    public final void rule__Nonnegative_number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4145:1: ( rule__Nonnegative_number__Group__0__Impl rule__Nonnegative_number__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4146:2: rule__Nonnegative_number__Group__0__Impl rule__Nonnegative_number__Group__1
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__Group__0__Impl_in_rule__Nonnegative_number__Group__08497);
            rule__Nonnegative_number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nonnegative_number__Group__1_in_rule__Nonnegative_number__Group__08500);
            rule__Nonnegative_number__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Nonnegative_number__Group__0"


    // $ANTLR start "rule__Nonnegative_number__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4153:1: rule__Nonnegative_number__Group__0__Impl : ( ( rule__Nonnegative_number__IntseqAssignment_0 ) ) ;
    public final void rule__Nonnegative_number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4157:1: ( ( ( rule__Nonnegative_number__IntseqAssignment_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4158:1: ( ( rule__Nonnegative_number__IntseqAssignment_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4158:1: ( ( rule__Nonnegative_number__IntseqAssignment_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4159:1: ( rule__Nonnegative_number__IntseqAssignment_0 )
            {
             before(grammarAccess.getNonnegative_numberAccess().getIntseqAssignment_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4160:1: ( rule__Nonnegative_number__IntseqAssignment_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4160:2: rule__Nonnegative_number__IntseqAssignment_0
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__IntseqAssignment_0_in_rule__Nonnegative_number__Group__0__Impl8527);
            rule__Nonnegative_number__IntseqAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNonnegative_numberAccess().getIntseqAssignment_0()); 

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
    // $ANTLR end "rule__Nonnegative_number__Group__0__Impl"


    // $ANTLR start "rule__Nonnegative_number__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4170:1: rule__Nonnegative_number__Group__1 : rule__Nonnegative_number__Group__1__Impl rule__Nonnegative_number__Group__2 ;
    public final void rule__Nonnegative_number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4174:1: ( rule__Nonnegative_number__Group__1__Impl rule__Nonnegative_number__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4175:2: rule__Nonnegative_number__Group__1__Impl rule__Nonnegative_number__Group__2
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__Group__1__Impl_in_rule__Nonnegative_number__Group__18557);
            rule__Nonnegative_number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nonnegative_number__Group__2_in_rule__Nonnegative_number__Group__18560);
            rule__Nonnegative_number__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Nonnegative_number__Group__1"


    // $ANTLR start "rule__Nonnegative_number__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4182:1: rule__Nonnegative_number__Group__1__Impl : ( ( rule__Nonnegative_number__Group_1__0 )? ) ;
    public final void rule__Nonnegative_number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4186:1: ( ( ( rule__Nonnegative_number__Group_1__0 )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4187:1: ( ( rule__Nonnegative_number__Group_1__0 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4187:1: ( ( rule__Nonnegative_number__Group_1__0 )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4188:1: ( rule__Nonnegative_number__Group_1__0 )?
            {
             before(grammarAccess.getNonnegative_numberAccess().getGroup_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4189:1: ( rule__Nonnegative_number__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==40) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4189:2: rule__Nonnegative_number__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Nonnegative_number__Group_1__0_in_rule__Nonnegative_number__Group__1__Impl8587);
                    rule__Nonnegative_number__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonnegative_numberAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Nonnegative_number__Group__1__Impl"


    // $ANTLR start "rule__Nonnegative_number__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4199:1: rule__Nonnegative_number__Group__2 : rule__Nonnegative_number__Group__2__Impl ;
    public final void rule__Nonnegative_number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4203:1: ( rule__Nonnegative_number__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4204:2: rule__Nonnegative_number__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__Group__2__Impl_in_rule__Nonnegative_number__Group__28618);
            rule__Nonnegative_number__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Nonnegative_number__Group__2"


    // $ANTLR start "rule__Nonnegative_number__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4210:1: rule__Nonnegative_number__Group__2__Impl : ( ( rule__Nonnegative_number__ExponentAssignment_2 )? ) ;
    public final void rule__Nonnegative_number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4214:1: ( ( ( rule__Nonnegative_number__ExponentAssignment_2 )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4215:1: ( ( rule__Nonnegative_number__ExponentAssignment_2 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4215:1: ( ( rule__Nonnegative_number__ExponentAssignment_2 )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4216:1: ( rule__Nonnegative_number__ExponentAssignment_2 )?
            {
             before(grammarAccess.getNonnegative_numberAccess().getExponentAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4217:1: ( rule__Nonnegative_number__ExponentAssignment_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=26 && LA47_0<=27)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4217:2: rule__Nonnegative_number__ExponentAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Nonnegative_number__ExponentAssignment_2_in_rule__Nonnegative_number__Group__2__Impl8645);
                    rule__Nonnegative_number__ExponentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNonnegative_numberAccess().getExponentAssignment_2()); 

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
    // $ANTLR end "rule__Nonnegative_number__Group__2__Impl"


    // $ANTLR start "rule__Nonnegative_number__Group_1__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4233:1: rule__Nonnegative_number__Group_1__0 : rule__Nonnegative_number__Group_1__0__Impl rule__Nonnegative_number__Group_1__1 ;
    public final void rule__Nonnegative_number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4237:1: ( rule__Nonnegative_number__Group_1__0__Impl rule__Nonnegative_number__Group_1__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4238:2: rule__Nonnegative_number__Group_1__0__Impl rule__Nonnegative_number__Group_1__1
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__Group_1__0__Impl_in_rule__Nonnegative_number__Group_1__08682);
            rule__Nonnegative_number__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Nonnegative_number__Group_1__1_in_rule__Nonnegative_number__Group_1__08685);
            rule__Nonnegative_number__Group_1__1();

            state._fsp--;


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
    // $ANTLR end "rule__Nonnegative_number__Group_1__0"


    // $ANTLR start "rule__Nonnegative_number__Group_1__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4245:1: rule__Nonnegative_number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Nonnegative_number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4249:1: ( ( '.' ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4250:1: ( '.' )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4250:1: ( '.' )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4251:1: '.'
            {
             before(grammarAccess.getNonnegative_numberAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Nonnegative_number__Group_1__0__Impl8713); 
             after(grammarAccess.getNonnegative_numberAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__Nonnegative_number__Group_1__0__Impl"


    // $ANTLR start "rule__Nonnegative_number__Group_1__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4264:1: rule__Nonnegative_number__Group_1__1 : rule__Nonnegative_number__Group_1__1__Impl ;
    public final void rule__Nonnegative_number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4268:1: ( rule__Nonnegative_number__Group_1__1__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4269:2: rule__Nonnegative_number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__Group_1__1__Impl_in_rule__Nonnegative_number__Group_1__18744);
            rule__Nonnegative_number__Group_1__1__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Nonnegative_number__Group_1__1"


    // $ANTLR start "rule__Nonnegative_number__Group_1__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4275:1: rule__Nonnegative_number__Group_1__1__Impl : ( ( rule__Nonnegative_number__FloatseqAssignment_1_1 ) ) ;
    public final void rule__Nonnegative_number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4279:1: ( ( ( rule__Nonnegative_number__FloatseqAssignment_1_1 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4280:1: ( ( rule__Nonnegative_number__FloatseqAssignment_1_1 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4280:1: ( ( rule__Nonnegative_number__FloatseqAssignment_1_1 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4281:1: ( rule__Nonnegative_number__FloatseqAssignment_1_1 )
            {
             before(grammarAccess.getNonnegative_numberAccess().getFloatseqAssignment_1_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4282:1: ( rule__Nonnegative_number__FloatseqAssignment_1_1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4282:2: rule__Nonnegative_number__FloatseqAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Nonnegative_number__FloatseqAssignment_1_1_in_rule__Nonnegative_number__Group_1__1__Impl8771);
            rule__Nonnegative_number__FloatseqAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNonnegative_numberAccess().getFloatseqAssignment_1_1()); 

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
    // $ANTLR end "rule__Nonnegative_number__Group_1__1__Impl"


    // $ANTLR start "rule__Exponent__Group__0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4296:1: rule__Exponent__Group__0 : rule__Exponent__Group__0__Impl rule__Exponent__Group__1 ;
    public final void rule__Exponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4300:1: ( rule__Exponent__Group__0__Impl rule__Exponent__Group__1 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4301:2: rule__Exponent__Group__0__Impl rule__Exponent__Group__1
            {
            pushFollow(FOLLOW_rule__Exponent__Group__0__Impl_in_rule__Exponent__Group__08805);
            rule__Exponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exponent__Group__1_in_rule__Exponent__Group__08808);
            rule__Exponent__Group__1();

            state._fsp--;


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
    // $ANTLR end "rule__Exponent__Group__0"


    // $ANTLR start "rule__Exponent__Group__0__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4308:1: rule__Exponent__Group__0__Impl : ( ( rule__Exponent__Alternatives_0 ) ) ;
    public final void rule__Exponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4312:1: ( ( ( rule__Exponent__Alternatives_0 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4313:1: ( ( rule__Exponent__Alternatives_0 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4313:1: ( ( rule__Exponent__Alternatives_0 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4314:1: ( rule__Exponent__Alternatives_0 )
            {
             before(grammarAccess.getExponentAccess().getAlternatives_0()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4315:1: ( rule__Exponent__Alternatives_0 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4315:2: rule__Exponent__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Exponent__Alternatives_0_in_rule__Exponent__Group__0__Impl8835);
            rule__Exponent__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Exponent__Group__0__Impl"


    // $ANTLR start "rule__Exponent__Group__1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4325:1: rule__Exponent__Group__1 : rule__Exponent__Group__1__Impl rule__Exponent__Group__2 ;
    public final void rule__Exponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4329:1: ( rule__Exponent__Group__1__Impl rule__Exponent__Group__2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4330:2: rule__Exponent__Group__1__Impl rule__Exponent__Group__2
            {
            pushFollow(FOLLOW_rule__Exponent__Group__1__Impl_in_rule__Exponent__Group__18865);
            rule__Exponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Exponent__Group__2_in_rule__Exponent__Group__18868);
            rule__Exponent__Group__2();

            state._fsp--;


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
    // $ANTLR end "rule__Exponent__Group__1"


    // $ANTLR start "rule__Exponent__Group__1__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4337:1: rule__Exponent__Group__1__Impl : ( ( rule__Exponent__SignAssignment_1 )? ) ;
    public final void rule__Exponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4341:1: ( ( ( rule__Exponent__SignAssignment_1 )? ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4342:1: ( ( rule__Exponent__SignAssignment_1 )? )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4342:1: ( ( rule__Exponent__SignAssignment_1 )? )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4343:1: ( rule__Exponent__SignAssignment_1 )?
            {
             before(grammarAccess.getExponentAccess().getSignAssignment_1()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4344:1: ( rule__Exponent__SignAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=38 && LA48_0<=39)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4344:2: rule__Exponent__SignAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Exponent__SignAssignment_1_in_rule__Exponent__Group__1__Impl8895);
                    rule__Exponent__SignAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExponentAccess().getSignAssignment_1()); 

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
    // $ANTLR end "rule__Exponent__Group__1__Impl"


    // $ANTLR start "rule__Exponent__Group__2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4354:1: rule__Exponent__Group__2 : rule__Exponent__Group__2__Impl ;
    public final void rule__Exponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4358:1: ( rule__Exponent__Group__2__Impl )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4359:2: rule__Exponent__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Exponent__Group__2__Impl_in_rule__Exponent__Group__28926);
            rule__Exponent__Group__2__Impl();

            state._fsp--;


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
    // $ANTLR end "rule__Exponent__Group__2"


    // $ANTLR start "rule__Exponent__Group__2__Impl"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4365:1: rule__Exponent__Group__2__Impl : ( ( rule__Exponent__Digit_sequenceAssignment_2 ) ) ;
    public final void rule__Exponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4369:1: ( ( ( rule__Exponent__Digit_sequenceAssignment_2 ) ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4370:1: ( ( rule__Exponent__Digit_sequenceAssignment_2 ) )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4370:1: ( ( rule__Exponent__Digit_sequenceAssignment_2 ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4371:1: ( rule__Exponent__Digit_sequenceAssignment_2 )
            {
             before(grammarAccess.getExponentAccess().getDigit_sequenceAssignment_2()); 
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4372:1: ( rule__Exponent__Digit_sequenceAssignment_2 )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4372:2: rule__Exponent__Digit_sequenceAssignment_2
            {
            pushFollow(FOLLOW_rule__Exponent__Digit_sequenceAssignment_2_in_rule__Exponent__Group__2__Impl8953);
            rule__Exponent__Digit_sequenceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExponentAccess().getDigit_sequenceAssignment_2()); 

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
    // $ANTLR end "rule__Exponent__Group__2__Impl"


    // $ANTLR start "rule__Svg_path__Moveto_drawto_command_groupsAssignment"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4389:1: rule__Svg_path__Moveto_drawto_command_groupsAssignment : ( rulemoveto_drawto_command_groups ) ;
    public final void rule__Svg_path__Moveto_drawto_command_groupsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4393:1: ( ( rulemoveto_drawto_command_groups ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4394:1: ( rulemoveto_drawto_command_groups )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4394:1: ( rulemoveto_drawto_command_groups )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4395:1: rulemoveto_drawto_command_groups
            {
             before(grammarAccess.getSvg_pathAccess().getMoveto_drawto_command_groupsMoveto_drawto_command_groupsParserRuleCall_0()); 
            pushFollow(FOLLOW_rulemoveto_drawto_command_groups_in_rule__Svg_path__Moveto_drawto_command_groupsAssignment8994);
            rulemoveto_drawto_command_groups();

            state._fsp--;

             after(grammarAccess.getSvg_pathAccess().getMoveto_drawto_command_groupsMoveto_drawto_command_groupsParserRuleCall_0()); 

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
    // $ANTLR end "rule__Svg_path__Moveto_drawto_command_groupsAssignment"


    // $ANTLR start "rule__Moveto_drawto_command_groups__CommandsAssignment"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4404:1: rule__Moveto_drawto_command_groups__CommandsAssignment : ( rulemoveto_drawto_command_group ) ;
    public final void rule__Moveto_drawto_command_groups__CommandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4408:1: ( ( rulemoveto_drawto_command_group ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4409:1: ( rulemoveto_drawto_command_group )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4409:1: ( rulemoveto_drawto_command_group )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4410:1: rulemoveto_drawto_command_group
            {
             before(grammarAccess.getMoveto_drawto_command_groupsAccess().getCommandsMoveto_drawto_command_groupParserRuleCall_0()); 
            pushFollow(FOLLOW_rulemoveto_drawto_command_group_in_rule__Moveto_drawto_command_groups__CommandsAssignment9025);
            rulemoveto_drawto_command_group();

            state._fsp--;

             after(grammarAccess.getMoveto_drawto_command_groupsAccess().getCommandsMoveto_drawto_command_groupParserRuleCall_0()); 

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
    // $ANTLR end "rule__Moveto_drawto_command_groups__CommandsAssignment"


    // $ANTLR start "rule__Moveto_drawto_command_group__MovetoAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4419:1: rule__Moveto_drawto_command_group__MovetoAssignment_0 : ( rulemoveto ) ;
    public final void rule__Moveto_drawto_command_group__MovetoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4423:1: ( ( rulemoveto ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4424:1: ( rulemoveto )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4424:1: ( rulemoveto )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4425:1: rulemoveto
            {
             before(grammarAccess.getMoveto_drawto_command_groupAccess().getMovetoMovetoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulemoveto_in_rule__Moveto_drawto_command_group__MovetoAssignment_09056);
            rulemoveto();

            state._fsp--;

             after(grammarAccess.getMoveto_drawto_command_groupAccess().getMovetoMovetoParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Moveto_drawto_command_group__MovetoAssignment_0"


    // $ANTLR start "rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4434:1: rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1 : ( ruledrawto_commands ) ;
    public final void rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4438:1: ( ( ruledrawto_commands ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4439:1: ( ruledrawto_commands )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4439:1: ( ruledrawto_commands )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4440:1: ruledrawto_commands
            {
             before(grammarAccess.getMoveto_drawto_command_groupAccess().getDrawto_commandsDrawto_commandsParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruledrawto_commands_in_rule__Moveto_drawto_command_group__Drawto_commandsAssignment_19087);
            ruledrawto_commands();

            state._fsp--;

             after(grammarAccess.getMoveto_drawto_command_groupAccess().getDrawto_commandsDrawto_commandsParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1"


    // $ANTLR start "rule__Moveto__PointAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4449:1: rule__Moveto__PointAssignment_1 : ( rulecoordinate_pair ) ;
    public final void rule__Moveto__PointAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4453:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4454:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4454:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4455:1: rulecoordinate_pair
            {
             before(grammarAccess.getMovetoAccess().getPointCoordinate_pairParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Moveto__PointAssignment_19118);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getMovetoAccess().getPointCoordinate_pairParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Moveto__PointAssignment_1"


    // $ANTLR start "rule__Moveto__Lineto_argument_sequenceAssignment_3"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4464:1: rule__Moveto__Lineto_argument_sequenceAssignment_3 : ( rulelineto_argument_sequence ) ;
    public final void rule__Moveto__Lineto_argument_sequenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4468:1: ( ( rulelineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4469:1: ( rulelineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4469:1: ( rulelineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4470:1: rulelineto_argument_sequence
            {
             before(grammarAccess.getMovetoAccess().getLineto_argument_sequenceLineto_argument_sequenceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulelineto_argument_sequence_in_rule__Moveto__Lineto_argument_sequenceAssignment_39149);
            rulelineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getMovetoAccess().getLineto_argument_sequenceLineto_argument_sequenceParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Moveto__Lineto_argument_sequenceAssignment_3"


    // $ANTLR start "rule__Lineto_argument_sequence__PairsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4479:1: rule__Lineto_argument_sequence__PairsAssignment_0 : ( rulecoordinate_pair ) ;
    public final void rule__Lineto_argument_sequence__PairsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4483:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4484:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4484:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4485:1: rulecoordinate_pair
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getPairsCoordinate_pairParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Lineto_argument_sequence__PairsAssignment_09180);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getLineto_argument_sequenceAccess().getPairsCoordinate_pairParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Lineto_argument_sequence__PairsAssignment_0"


    // $ANTLR start "rule__Lineto_argument_sequence__PairsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4494:1: rule__Lineto_argument_sequence__PairsAssignment_1_1 : ( rulecoordinate_pair ) ;
    public final void rule__Lineto_argument_sequence__PairsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4498:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4499:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4499:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4500:1: rulecoordinate_pair
            {
             before(grammarAccess.getLineto_argument_sequenceAccess().getPairsCoordinate_pairParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Lineto_argument_sequence__PairsAssignment_1_19211);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getLineto_argument_sequenceAccess().getPairsCoordinate_pairParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Lineto_argument_sequence__PairsAssignment_1_1"


    // $ANTLR start "rule__Drawto_commands__Drawto_commandsAssignment"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4509:1: rule__Drawto_commands__Drawto_commandsAssignment : ( ruledrawto_command ) ;
    public final void rule__Drawto_commands__Drawto_commandsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4513:1: ( ( ruledrawto_command ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4514:1: ( ruledrawto_command )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4514:1: ( ruledrawto_command )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4515:1: ruledrawto_command
            {
             before(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsDrawto_commandParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledrawto_command_in_rule__Drawto_commands__Drawto_commandsAssignment9242);
            ruledrawto_command();

            state._fsp--;

             after(grammarAccess.getDrawto_commandsAccess().getDrawto_commandsDrawto_commandParserRuleCall_0()); 

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
    // $ANTLR end "rule__Drawto_commands__Drawto_commandsAssignment"


    // $ANTLR start "rule__Lineto__Lineto_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4524:1: rule__Lineto__Lineto_argument_sequenceAssignment_1 : ( rulelineto_argument_sequence ) ;
    public final void rule__Lineto__Lineto_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4528:1: ( ( rulelineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4529:1: ( rulelineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4529:1: ( rulelineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4530:1: rulelineto_argument_sequence
            {
             before(grammarAccess.getLinetoAccess().getLineto_argument_sequenceLineto_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulelineto_argument_sequence_in_rule__Lineto__Lineto_argument_sequenceAssignment_19273);
            rulelineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getLinetoAccess().getLineto_argument_sequenceLineto_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Lineto__Lineto_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4539:1: rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1 : ( rulehorizontal_lineto_argument_sequence ) ;
    public final void rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4543:1: ( ( rulehorizontal_lineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4544:1: ( rulehorizontal_lineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4544:1: ( rulehorizontal_lineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4545:1: rulehorizontal_lineto_argument_sequence
            {
             before(grammarAccess.getHorizontal_linetoAccess().getHorizontal_lineto_argument_sequenceHorizontal_lineto_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulehorizontal_lineto_argument_sequence_in_rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_19304);
            rulehorizontal_lineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getHorizontal_linetoAccess().getHorizontal_lineto_argument_sequenceHorizontal_lineto_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4554:1: rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0 : ( rulecoordinate ) ;
    public final void rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4558:1: ( ( rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4559:1: ( rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4559:1: ( rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4560:1: rulecoordinate
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_in_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_09335);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0"


    // $ANTLR start "rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4569:1: rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1 : ( rulecoordinate ) ;
    public final void rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4573:1: ( ( rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4574:1: ( rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4574:1: ( rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4575:1: rulecoordinate
            {
             before(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulecoordinate_in_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_19366);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getHorizontal_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1"


    // $ANTLR start "rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4584:1: rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1 : ( rulevertical_lineto_argument_sequence ) ;
    public final void rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4588:1: ( ( rulevertical_lineto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4589:1: ( rulevertical_lineto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4589:1: ( rulevertical_lineto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4590:1: rulevertical_lineto_argument_sequence
            {
             before(grammarAccess.getVertical_linetoAccess().getVertical_lineto_argument_sequenceVertical_lineto_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulevertical_lineto_argument_sequence_in_rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_19397);
            rulevertical_lineto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getVertical_linetoAccess().getVertical_lineto_argument_sequenceVertical_lineto_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4599:1: rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0 : ( rulecoordinate ) ;
    public final void rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4603:1: ( ( rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4604:1: ( rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4604:1: ( rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4605:1: rulecoordinate
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_in_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_09428);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0"


    // $ANTLR start "rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4614:1: rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1 : ( rulecoordinate ) ;
    public final void rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4618:1: ( ( rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4619:1: ( rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4619:1: ( rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4620:1: rulecoordinate
            {
             before(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulecoordinate_in_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_19459);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getVertical_lineto_argument_sequenceAccess().getCoordinatesCoordinateParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1"


    // $ANTLR start "rule__Curveto__Curveto_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4629:1: rule__Curveto__Curveto_argument_sequenceAssignment_1 : ( rulecurveto_argument_sequence ) ;
    public final void rule__Curveto__Curveto_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4633:1: ( ( rulecurveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4634:1: ( rulecurveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4634:1: ( rulecurveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4635:1: rulecurveto_argument_sequence
            {
             before(grammarAccess.getCurvetoAccess().getCurveto_argument_sequenceCurveto_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulecurveto_argument_sequence_in_rule__Curveto__Curveto_argument_sequenceAssignment_19490);
            rulecurveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getCurvetoAccess().getCurveto_argument_sequenceCurveto_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Curveto__Curveto_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4644:1: rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0 : ( rulecurveto_argument ) ;
    public final void rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4648:1: ( ( rulecurveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4649:1: ( rulecurveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4649:1: ( rulecurveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4650:1: rulecurveto_argument
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsCurveto_argumentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecurveto_argument_in_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_09521);
            rulecurveto_argument();

            state._fsp--;

             after(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsCurveto_argumentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0"


    // $ANTLR start "rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4659:1: rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1 : ( rulecurveto_argument ) ;
    public final void rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4663:1: ( ( rulecurveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4664:1: ( rulecurveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4664:1: ( rulecurveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4665:1: rulecurveto_argument
            {
             before(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsCurveto_argumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulecurveto_argument_in_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_19552);
            rulecurveto_argument();

            state._fsp--;

             after(grammarAccess.getCurveto_argument_sequenceAccess().getCurveto_argumentsCurveto_argumentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1"


    // $ANTLR start "rule__Curveto_argument__C1Assignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4674:1: rule__Curveto_argument__C1Assignment_0 : ( rulecoordinate_pair ) ;
    public final void rule__Curveto_argument__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4678:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4679:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4679:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4680:1: rulecoordinate_pair
            {
             before(grammarAccess.getCurveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Curveto_argument__C1Assignment_09583);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getCurveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Curveto_argument__C1Assignment_0"


    // $ANTLR start "rule__Curveto_argument__C2Assignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4689:1: rule__Curveto_argument__C2Assignment_2 : ( rulecoordinate_pair ) ;
    public final void rule__Curveto_argument__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4693:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4694:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4694:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4695:1: rulecoordinate_pair
            {
             before(grammarAccess.getCurveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Curveto_argument__C2Assignment_29614);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getCurveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Curveto_argument__C2Assignment_2"


    // $ANTLR start "rule__Curveto_argument__C3Assignment_4"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4704:1: rule__Curveto_argument__C3Assignment_4 : ( rulecoordinate_pair ) ;
    public final void rule__Curveto_argument__C3Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4708:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4709:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4709:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4710:1: rulecoordinate_pair
            {
             before(grammarAccess.getCurveto_argumentAccess().getC3Coordinate_pairParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Curveto_argument__C3Assignment_49645);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getCurveto_argumentAccess().getC3Coordinate_pairParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Curveto_argument__C3Assignment_4"


    // $ANTLR start "rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4719:1: rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1 : ( rulesmooth_curveto_argument_sequence ) ;
    public final void rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4723:1: ( ( rulesmooth_curveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4724:1: ( rulesmooth_curveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4724:1: ( rulesmooth_curveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4725:1: rulesmooth_curveto_argument_sequence
            {
             before(grammarAccess.getSmooth_curvetoAccess().getSmooth_curveto_argument_sequenceSmooth_curveto_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_sequence_in_rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_19676);
            rulesmooth_curveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getSmooth_curvetoAccess().getSmooth_curveto_argument_sequenceSmooth_curveto_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4734:1: rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0 : ( rulesmooth_curveto_argument ) ;
    public final void rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4738:1: ( ( rulesmooth_curveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4739:1: ( rulesmooth_curveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4739:1: ( rulesmooth_curveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4740:1: rulesmooth_curveto_argument
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsSmooth_curveto_argumentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_in_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_09707);
            rulesmooth_curveto_argument();

            state._fsp--;

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsSmooth_curveto_argumentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0"


    // $ANTLR start "rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4749:1: rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1 : ( rulesmooth_curveto_argument ) ;
    public final void rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4753:1: ( ( rulesmooth_curveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4754:1: ( rulesmooth_curveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4754:1: ( rulesmooth_curveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4755:1: rulesmooth_curveto_argument
            {
             before(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsSmooth_curveto_argumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulesmooth_curveto_argument_in_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_19738);
            rulesmooth_curveto_argument();

            state._fsp--;

             after(grammarAccess.getSmooth_curveto_argument_sequenceAccess().getSmooth_curveto_argumentsSmooth_curveto_argumentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1"


    // $ANTLR start "rule__Smooth_curveto_argument__C1Assignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4764:1: rule__Smooth_curveto_argument__C1Assignment_0 : ( rulecoordinate_pair ) ;
    public final void rule__Smooth_curveto_argument__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4768:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4769:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4769:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4770:1: rulecoordinate_pair
            {
             before(grammarAccess.getSmooth_curveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Smooth_curveto_argument__C1Assignment_09769);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getSmooth_curveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument__C1Assignment_0"


    // $ANTLR start "rule__Smooth_curveto_argument__C2Assignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4779:1: rule__Smooth_curveto_argument__C2Assignment_2 : ( rulecoordinate_pair ) ;
    public final void rule__Smooth_curveto_argument__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4783:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4784:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4784:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4785:1: rulecoordinate_pair
            {
             before(grammarAccess.getSmooth_curveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Smooth_curveto_argument__C2Assignment_29800);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getSmooth_curveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Smooth_curveto_argument__C2Assignment_2"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4794:1: rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0 : ( rulequadratic_bezier_curveto_argument ) ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4798:1: ( ( rulequadratic_bezier_curveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4799:1: ( rulequadratic_bezier_curveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4799:1: ( rulequadratic_bezier_curveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4800:1: rulequadratic_bezier_curveto_argument
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsQuadratic_bezier_curveto_argumentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_in_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_09831);
            rulequadratic_bezier_curveto_argument();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsQuadratic_bezier_curveto_argumentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4809:1: rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1 : ( rulequadratic_bezier_curveto_argument ) ;
    public final void rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4813:1: ( ( rulequadratic_bezier_curveto_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4814:1: ( rulequadratic_bezier_curveto_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4814:1: ( rulequadratic_bezier_curveto_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4815:1: rulequadratic_bezier_curveto_argument
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsQuadratic_bezier_curveto_argumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulequadratic_bezier_curveto_argument_in_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_19862);
            rulequadratic_bezier_curveto_argument();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curveto_argument_sequenceAccess().getQuadratic_bezier_curveto_argumentsQuadratic_bezier_curveto_argumentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__C1Assignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4824:1: rule__Quadratic_bezier_curveto_argument__C1Assignment_0 : ( rulecoordinate_pair ) ;
    public final void rule__Quadratic_bezier_curveto_argument__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4828:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4829:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4829:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4830:1: rulecoordinate_pair
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Quadratic_bezier_curveto_argument__C1Assignment_09893);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC1Coordinate_pairParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__C1Assignment_0"


    // $ANTLR start "rule__Quadratic_bezier_curveto_argument__C2Assignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4839:1: rule__Quadratic_bezier_curveto_argument__C2Assignment_2 : ( rulecoordinate_pair ) ;
    public final void rule__Quadratic_bezier_curveto_argument__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4843:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4844:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4844:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4845:1: rulecoordinate_pair
            {
             before(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Quadratic_bezier_curveto_argument__C2Assignment_29924);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getQuadratic_bezier_curveto_argumentAccess().getC2Coordinate_pairParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Quadratic_bezier_curveto_argument__C2Assignment_2"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4854:1: rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1 : ( rulesmooth_quadratic_bezier_curveto_argument_sequence ) ;
    public final void rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4858:1: ( ( rulesmooth_quadratic_bezier_curveto_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4859:1: ( rulesmooth_quadratic_bezier_curveto_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4859:1: ( rulesmooth_quadratic_bezier_curveto_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4860:1: rulesmooth_quadratic_bezier_curveto_argument_sequence
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getSmooth_quadratic_bezier_curveto_argument_sequenceSmooth_quadratic_bezier_curveto_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_19955);
            rulesmooth_quadratic_bezier_curveto_argument_sequence();

            state._fsp--;

             after(grammarAccess.getSmooth_quadratic_bezier_curvetoAccess().getSmooth_quadratic_bezier_curveto_argument_sequenceSmooth_quadratic_bezier_curveto_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4869:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0 : ( rulecoordinate_pair ) ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4873:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4874:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4874:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4875:1: rulecoordinate_pair
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsCoordinate_pairParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_09986);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsCoordinate_pairParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0"


    // $ANTLR start "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4884:1: rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1 : ( rulecoordinate_pair ) ;
    public final void rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4888:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4889:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4889:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4890:1: rulecoordinate_pair
            {
             before(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsCoordinate_pairParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_110017);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getSmooth_quadratic_bezier_curveto_argument_sequenceAccess().getCoordinate_pairsCoordinate_pairParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1"


    // $ANTLR start "rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4899:1: rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1 : ( ruleelliptical_arc_argument_sequence ) ;
    public final void rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4903:1: ( ( ruleelliptical_arc_argument_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4904:1: ( ruleelliptical_arc_argument_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4904:1: ( ruleelliptical_arc_argument_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4905:1: ruleelliptical_arc_argument_sequence
            {
             before(grammarAccess.getElliptical_arcAccess().getElliptical_arc_argument_sequenceElliptical_arc_argument_sequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_sequence_in_rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_110048);
            ruleelliptical_arc_argument_sequence();

            state._fsp--;

             after(grammarAccess.getElliptical_arcAccess().getElliptical_arc_argument_sequenceElliptical_arc_argument_sequenceParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4914:1: rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0 : ( ruleelliptical_arc_argument ) ;
    public final void rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4918:1: ( ( ruleelliptical_arc_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4919:1: ( ruleelliptical_arc_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4919:1: ( ruleelliptical_arc_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4920:1: ruleelliptical_arc_argument
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsElliptical_arc_argumentParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_in_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_010079);
            ruleelliptical_arc_argument();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsElliptical_arc_argumentParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0"


    // $ANTLR start "rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4929:1: rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1 : ( ruleelliptical_arc_argument ) ;
    public final void rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4933:1: ( ( ruleelliptical_arc_argument ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4934:1: ( ruleelliptical_arc_argument )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4934:1: ( ruleelliptical_arc_argument )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4935:1: ruleelliptical_arc_argument
            {
             before(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsElliptical_arc_argumentParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleelliptical_arc_argument_in_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_110110);
            ruleelliptical_arc_argument();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argument_sequenceAccess().getElliptical_arc_argumentsElliptical_arc_argumentParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1"


    // $ANTLR start "rule__Elliptical_arc_argument__RxAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4944:1: rule__Elliptical_arc_argument__RxAssignment_0 : ( rulenonnegative_number ) ;
    public final void rule__Elliptical_arc_argument__RxAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4948:1: ( ( rulenonnegative_number ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4949:1: ( rulenonnegative_number )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4949:1: ( rulenonnegative_number )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4950:1: rulenonnegative_number
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getRxNonnegative_numberParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulenonnegative_number_in_rule__Elliptical_arc_argument__RxAssignment_010141);
            rulenonnegative_number();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getRxNonnegative_numberParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__RxAssignment_0"


    // $ANTLR start "rule__Elliptical_arc_argument__RyAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4959:1: rule__Elliptical_arc_argument__RyAssignment_2 : ( rulenonnegative_number ) ;
    public final void rule__Elliptical_arc_argument__RyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4963:1: ( ( rulenonnegative_number ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4964:1: ( rulenonnegative_number )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4964:1: ( rulenonnegative_number )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4965:1: rulenonnegative_number
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getRyNonnegative_numberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulenonnegative_number_in_rule__Elliptical_arc_argument__RyAssignment_210172);
            rulenonnegative_number();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getRyNonnegative_numberParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__RyAssignment_2"


    // $ANTLR start "rule__Elliptical_arc_argument__RotationAssignment_4"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4974:1: rule__Elliptical_arc_argument__RotationAssignment_4 : ( rulenumber ) ;
    public final void rule__Elliptical_arc_argument__RotationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4978:1: ( ( rulenumber ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4979:1: ( rulenumber )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4979:1: ( rulenumber )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4980:1: rulenumber
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getRotationNumberParserRuleCall_4_0()); 
            pushFollow(FOLLOW_rulenumber_in_rule__Elliptical_arc_argument__RotationAssignment_410203);
            rulenumber();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getRotationNumberParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__RotationAssignment_4"


    // $ANTLR start "rule__Elliptical_arc_argument__LargearcflagAssignment_6"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4989:1: rule__Elliptical_arc_argument__LargearcflagAssignment_6 : ( ruleflag ) ;
    public final void rule__Elliptical_arc_argument__LargearcflagAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4993:1: ( ( ruleflag ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4994:1: ( ruleflag )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4994:1: ( ruleflag )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:4995:1: ruleflag
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getLargearcflagFlagParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleflag_in_rule__Elliptical_arc_argument__LargearcflagAssignment_610234);
            ruleflag();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getLargearcflagFlagParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__LargearcflagAssignment_6"


    // $ANTLR start "rule__Elliptical_arc_argument__SweepflagAssignment_8"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5004:1: rule__Elliptical_arc_argument__SweepflagAssignment_8 : ( ruleflag ) ;
    public final void rule__Elliptical_arc_argument__SweepflagAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5008:1: ( ( ruleflag ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5009:1: ( ruleflag )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5009:1: ( ruleflag )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5010:1: ruleflag
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getSweepflagFlagParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleflag_in_rule__Elliptical_arc_argument__SweepflagAssignment_810265);
            ruleflag();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getSweepflagFlagParserRuleCall_8_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__SweepflagAssignment_8"


    // $ANTLR start "rule__Elliptical_arc_argument__Coordinate_pairAssignment_10"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5019:1: rule__Elliptical_arc_argument__Coordinate_pairAssignment_10 : ( rulecoordinate_pair ) ;
    public final void rule__Elliptical_arc_argument__Coordinate_pairAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5023:1: ( ( rulecoordinate_pair ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5024:1: ( rulecoordinate_pair )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5024:1: ( rulecoordinate_pair )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5025:1: rulecoordinate_pair
            {
             before(grammarAccess.getElliptical_arc_argumentAccess().getCoordinate_pairCoordinate_pairParserRuleCall_10_0()); 
            pushFollow(FOLLOW_rulecoordinate_pair_in_rule__Elliptical_arc_argument__Coordinate_pairAssignment_1010296);
            rulecoordinate_pair();

            state._fsp--;

             after(grammarAccess.getElliptical_arc_argumentAccess().getCoordinate_pairCoordinate_pairParserRuleCall_10_0()); 

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
    // $ANTLR end "rule__Elliptical_arc_argument__Coordinate_pairAssignment_10"


    // $ANTLR start "rule__Coordinate_pair__C1Assignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5034:1: rule__Coordinate_pair__C1Assignment_0 : ( rulecoordinate ) ;
    public final void rule__Coordinate_pair__C1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5038:1: ( ( rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5039:1: ( rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5039:1: ( rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5040:1: rulecoordinate
            {
             before(grammarAccess.getCoordinate_pairAccess().getC1CoordinateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulecoordinate_in_rule__Coordinate_pair__C1Assignment_010327);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinate_pairAccess().getC1CoordinateParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Coordinate_pair__C1Assignment_0"


    // $ANTLR start "rule__Coordinate_pair__C2Assignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5049:1: rule__Coordinate_pair__C2Assignment_2 : ( rulecoordinate ) ;
    public final void rule__Coordinate_pair__C2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5053:1: ( ( rulecoordinate ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5054:1: ( rulecoordinate )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5054:1: ( rulecoordinate )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5055:1: rulecoordinate
            {
             before(grammarAccess.getCoordinate_pairAccess().getC2CoordinateParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulecoordinate_in_rule__Coordinate_pair__C2Assignment_210358);
            rulecoordinate();

            state._fsp--;

             after(grammarAccess.getCoordinate_pairAccess().getC2CoordinateParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Coordinate_pair__C2Assignment_2"


    // $ANTLR start "rule__Number__SignAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5064:1: rule__Number__SignAssignment_0 : ( rulesign ) ;
    public final void rule__Number__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5068:1: ( ( rulesign ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5069:1: ( rulesign )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5069:1: ( rulesign )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5070:1: rulesign
            {
             before(grammarAccess.getNumberAccess().getSignSignParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulesign_in_rule__Number__SignAssignment_010389);
            rulesign();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getSignSignParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Number__SignAssignment_0"


    // $ANTLR start "rule__Number__Nonnegative_numberAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5079:1: rule__Number__Nonnegative_numberAssignment_1 : ( rulenonnegative_number ) ;
    public final void rule__Number__Nonnegative_numberAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5083:1: ( ( rulenonnegative_number ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5084:1: ( rulenonnegative_number )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5084:1: ( rulenonnegative_number )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5085:1: rulenonnegative_number
            {
             before(grammarAccess.getNumberAccess().getNonnegative_numberNonnegative_numberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulenonnegative_number_in_rule__Number__Nonnegative_numberAssignment_110420);
            rulenonnegative_number();

            state._fsp--;

             after(grammarAccess.getNumberAccess().getNonnegative_numberNonnegative_numberParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Number__Nonnegative_numberAssignment_1"


    // $ANTLR start "rule__Nonnegative_number__IntseqAssignment_0"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5094:1: rule__Nonnegative_number__IntseqAssignment_0 : ( ruledigit_sequence ) ;
    public final void rule__Nonnegative_number__IntseqAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5098:1: ( ( ruledigit_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5099:1: ( ruledigit_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5099:1: ( ruledigit_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5100:1: ruledigit_sequence
            {
             before(grammarAccess.getNonnegative_numberAccess().getIntseqDigit_sequenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_rule__Nonnegative_number__IntseqAssignment_010451);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getNonnegative_numberAccess().getIntseqDigit_sequenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Nonnegative_number__IntseqAssignment_0"


    // $ANTLR start "rule__Nonnegative_number__FloatseqAssignment_1_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5109:1: rule__Nonnegative_number__FloatseqAssignment_1_1 : ( ruledigit_sequence ) ;
    public final void rule__Nonnegative_number__FloatseqAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5113:1: ( ( ruledigit_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5114:1: ( ruledigit_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5114:1: ( ruledigit_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5115:1: ruledigit_sequence
            {
             before(grammarAccess.getNonnegative_numberAccess().getFloatseqDigit_sequenceParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_rule__Nonnegative_number__FloatseqAssignment_1_110482);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getNonnegative_numberAccess().getFloatseqDigit_sequenceParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Nonnegative_number__FloatseqAssignment_1_1"


    // $ANTLR start "rule__Nonnegative_number__ExponentAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5124:1: rule__Nonnegative_number__ExponentAssignment_2 : ( ruleexponent ) ;
    public final void rule__Nonnegative_number__ExponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5128:1: ( ( ruleexponent ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5129:1: ( ruleexponent )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5129:1: ( ruleexponent )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5130:1: ruleexponent
            {
             before(grammarAccess.getNonnegative_numberAccess().getExponentExponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleexponent_in_rule__Nonnegative_number__ExponentAssignment_210513);
            ruleexponent();

            state._fsp--;

             after(grammarAccess.getNonnegative_numberAccess().getExponentExponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Nonnegative_number__ExponentAssignment_2"


    // $ANTLR start "rule__Exponent__SignAssignment_1"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5139:1: rule__Exponent__SignAssignment_1 : ( rulesign ) ;
    public final void rule__Exponent__SignAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5143:1: ( ( rulesign ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5144:1: ( rulesign )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5144:1: ( rulesign )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5145:1: rulesign
            {
             before(grammarAccess.getExponentAccess().getSignSignParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulesign_in_rule__Exponent__SignAssignment_110544);
            rulesign();

            state._fsp--;

             after(grammarAccess.getExponentAccess().getSignSignParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Exponent__SignAssignment_1"


    // $ANTLR start "rule__Exponent__Digit_sequenceAssignment_2"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5154:1: rule__Exponent__Digit_sequenceAssignment_2 : ( ruledigit_sequence ) ;
    public final void rule__Exponent__Digit_sequenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5158:1: ( ( ruledigit_sequence ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5159:1: ( ruledigit_sequence )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5159:1: ( ruledigit_sequence )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5160:1: ruledigit_sequence
            {
             before(grammarAccess.getExponentAccess().getDigit_sequenceDigit_sequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruledigit_sequence_in_rule__Exponent__Digit_sequenceAssignment_210575);
            ruledigit_sequence();

            state._fsp--;

             after(grammarAccess.getExponentAccess().getDigit_sequenceDigit_sequenceParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Exponent__Digit_sequenceAssignment_2"


    // $ANTLR start "rule__Digit_sequence__DigitsAssignment"
    // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5169:1: rule__Digit_sequence__DigitsAssignment : ( ruledigit ) ;
    public final void rule__Digit_sequence__DigitsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5173:1: ( ( ruledigit ) )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5174:1: ( ruledigit )
            {
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5174:1: ( ruledigit )
            // ../at.bestsolution.efxclipse.tooling.svgpath.ui/src-gen/at/bestsolution/efxclipse/tooling/svgpath/ui/contentassist/antlr/internal/InternalSvgPath.g:5175:1: ruledigit
            {
             before(grammarAccess.getDigit_sequenceAccess().getDigitsDigitParserRuleCall_0()); 
            pushFollow(FOLLOW_ruledigit_in_rule__Digit_sequence__DigitsAssignment10606);
            ruledigit();

            state._fsp--;

             after(grammarAccess.getDigit_sequenceAccess().getDigitsDigitParserRuleCall_0()); 

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
    // $ANTLR end "rule__Digit_sequence__DigitsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulesvg_path_in_entryRulesvg_path61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesvg_path68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Svg_path__Moveto_drawto_command_groupsAssignment_in_rulesvg_path94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_groups_in_entryRulemoveto_drawto_command_groups122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemoveto_drawto_command_groups129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_groups__CommandsAssignment_in_rulemoveto_drawto_command_groups155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_group_in_entryRulemoveto_drawto_command_group182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemoveto_drawto_command_group189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_group__Group__0_in_rulemoveto_drawto_command_group215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_in_entryRulemoveto242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemoveto249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Group__0_in_rulemoveto275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_argument_sequence_in_entryRulelineto_argument_sequence302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelineto_argument_sequence309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group__0_in_rulelineto_argument_sequence335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledrawto_commands_in_entryRuledrawto_commands362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledrawto_commands369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drawto_commands__Drawto_commandsAssignment_in_ruledrawto_commands397 = new BitSet(new long[]{0x0000000003FFFF02L});
    public static final BitSet FOLLOW_rule__Drawto_commands__Drawto_commandsAssignment_in_ruledrawto_commands409 = new BitSet(new long[]{0x0000000003FFFF02L});
    public static final BitSet FOLLOW_ruledrawto_command_in_entryRuledrawto_command439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledrawto_command446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Drawto_command__Alternatives_in_ruledrawto_command472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclosepath_in_entryRuleclosepath499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleclosepath506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Closepath__Group__0_in_ruleclosepath532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_in_entryRulelineto559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulelineto566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto__Group__0_in_rulelineto592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_in_entryRulehorizontal_lineto619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehorizontal_lineto626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto__Group__0_in_rulehorizontal_lineto652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_argument_sequence_in_entryRulehorizontal_lineto_argument_sequence679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulehorizontal_lineto_argument_sequence686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__0_in_rulehorizontal_lineto_argument_sequence712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_in_entryRulevertical_lineto739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevertical_lineto746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto__Group__0_in_rulevertical_lineto772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_argument_sequence_in_entryRulevertical_lineto_argument_sequence799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulevertical_lineto_argument_sequence806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group__0_in_rulevertical_lineto_argument_sequence832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_in_entryRulecurveto859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecurveto866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto__Group__0_in_rulecurveto892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_sequence_in_entryRulecurveto_argument_sequence919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecurveto_argument_sequence926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group__0_in_rulecurveto_argument_sequence952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_in_entryRulecurveto_argument979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecurveto_argument986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__0_in_rulecurveto_argument1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_in_entryRulesmooth_curveto1039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_curveto1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto__Group__0_in_rulesmooth_curveto1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_sequence_in_entryRulesmooth_curveto_argument_sequence1099 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_curveto_argument_sequence1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group__0_in_rulesmooth_curveto_argument_sequence1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_in_entryRulesmooth_curveto_argument1159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_curveto_argument1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__Group__0_in_rulesmooth_curveto_argument1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_in_entryRulequadratic_bezier_curveto1219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequadratic_bezier_curveto1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto__Group__0_in_rulequadratic_bezier_curveto1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_entryRulequadratic_bezier_curveto_argument_sequence1279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument_sequence1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__0_in_rulequadratic_bezier_curveto_argument_sequence1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_in_entryRulequadratic_bezier_curveto_argument1339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulequadratic_bezier_curveto_argument1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__0_in_rulequadratic_bezier_curveto_argument1372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_in_entryRulesmooth_quadratic_bezier_curveto1399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__0_in_rulesmooth_quadratic_bezier_curveto1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence1459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesmooth_quadratic_bezier_curveto_argument_sequence1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0_in_rulesmooth_quadratic_bezier_curveto_argument_sequence1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_in_entryRuleelliptical_arc1519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelliptical_arc1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc__Group__0_in_ruleelliptical_arc1552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_sequence_in_entryRuleelliptical_arc_argument_sequence1579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelliptical_arc_argument_sequence1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group__0_in_ruleelliptical_arc_argument_sequence1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_in_entryRuleelliptical_arc_argument1639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleelliptical_arc_argument1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__0_in_ruleelliptical_arc_argument1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_entryRulecoordinate_pair1699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecoordinate_pair1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__Group__0_in_rulecoordinate_pair1732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_entryRulecomma1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecomma1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_5_in_rulecomma1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_entryRulecoordinate1821 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulecoordinate1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rulecoordinate1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_entryRulenumber1880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenumber1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0_in_rulenumber1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_entryRulenonnegative_number1940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulenonnegative_number1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group__0_in_rulenonnegative_number1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexponent_in_entryRuleexponent2000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexponent2007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__Group__0_in_ruleexponent2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_entryRuledigit_sequence2060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit_sequence2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit_sequence__DigitsAssignment_in_ruledigit_sequence2093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_entryRuledigit2120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledigit2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Digit__Alternatives_in_ruledigit2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_entryRulesign2180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesign2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sign__Alternatives_in_rulesign2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleflag_in_entryRuleflag2240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleflag2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Flag__Alternatives_in_ruleflag2273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_6_in_rule__Moveto__Alternatives_02310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_rule__Moveto__Alternatives_02330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleclosepath_in_rule__Drawto_command__Alternatives2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_in_rule__Drawto_command__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_in_rule__Drawto_command__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_in_rule__Drawto_command__Alternatives2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_in_rule__Drawto_command__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_in_rule__Drawto_command__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_in_rule__Drawto_command__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_in_rule__Drawto_command__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_in_rule__Drawto_command__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Closepath__Alternatives_12533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Closepath__Alternatives_12553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Lineto__Alternatives_02588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Lineto__Alternatives_02608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Horizontal_lineto__Alternatives_02643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Horizontal_lineto__Alternatives_02663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Vertical_lineto__Alternatives_02698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Vertical_lineto__Alternatives_02718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Curveto__Alternatives_02753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Curveto__Alternatives_02773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Smooth_curveto__Alternatives_02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Smooth_curveto__Alternatives_02828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Quadratic_bezier_curveto__Alternatives_02863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Quadratic_bezier_curveto__Alternatives_02883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Smooth_quadratic_bezier_curveto__Alternatives_02918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Smooth_quadratic_bezier_curveto__Alternatives_02938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Elliptical_arc__Alternatives_02973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Elliptical_arc__Alternatives_02993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Exponent__Alternatives_03028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Exponent__Alternatives_03048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Digit__Alternatives3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Digit__Alternatives3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Digit__Alternatives3123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Digit__Alternatives3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Digit__Alternatives3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Digit__Alternatives3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Digit__Alternatives3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Digit__Alternatives3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Digit__Alternatives3243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Digit__Alternatives3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Sign__Alternatives3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Sign__Alternatives3318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Flag__Alternatives3353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Flag__Alternatives3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_group__Group__0__Impl_in_rule__Moveto_drawto_command_group__Group__03405 = new BitSet(new long[]{0x0000000003FFFF00L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_group__Group__1_in_rule__Moveto_drawto_command_group__Group__03408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_group__MovetoAssignment_0_in_rule__Moveto_drawto_command_group__Group__0__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_group__Group__1__Impl_in_rule__Moveto_drawto_command_group__Group__13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto_drawto_command_group__Drawto_commandsAssignment_1_in_rule__Moveto_drawto_command_group__Group__1__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Group__0__Impl_in_rule__Moveto__Group__03527 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Moveto__Group__1_in_rule__Moveto__Group__03530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Alternatives_0_in_rule__Moveto__Group__0__Impl3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Group__1__Impl_in_rule__Moveto__Group__13587 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Moveto__Group__2_in_rule__Moveto__Group__13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__PointAssignment_1_in_rule__Moveto__Group__1__Impl3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Group__2__Impl_in_rule__Moveto__Group__23647 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Moveto__Group__3_in_rule__Moveto__Group__23650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Moveto__Group__2__Impl3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Group__3__Impl_in_rule__Moveto__Group__33709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Moveto__Lineto_argument_sequenceAssignment_3_in_rule__Moveto__Group__3__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group__0__Impl_in_rule__Lineto_argument_sequence__Group__03774 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group__1_in_rule__Lineto_argument_sequence__Group__03777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__PairsAssignment_0_in_rule__Lineto_argument_sequence__Group__0__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group__1__Impl_in_rule__Lineto_argument_sequence__Group__13834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group_1__0_in_rule__Lineto_argument_sequence__Group__1__Impl3861 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group_1__0__Impl_in_rule__Lineto_argument_sequence__Group_1__03896 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group_1__1_in_rule__Lineto_argument_sequence__Group_1__03899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Lineto_argument_sequence__Group_1__0__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__Group_1__1__Impl_in_rule__Lineto_argument_sequence__Group_1__13958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto_argument_sequence__PairsAssignment_1_1_in_rule__Lineto_argument_sequence__Group_1__1__Impl3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Closepath__Group__0__Impl_in_rule__Closepath__Group__04019 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Closepath__Group__1_in_rule__Closepath__Group__04022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Closepath__Group__1__Impl_in_rule__Closepath__Group__14080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Closepath__Alternatives_1_in_rule__Closepath__Group__1__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto__Group__0__Impl_in_rule__Lineto__Group__04141 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Lineto__Group__1_in_rule__Lineto__Group__04144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto__Alternatives_0_in_rule__Lineto__Group__0__Impl4171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto__Group__1__Impl_in_rule__Lineto__Group__14201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lineto__Lineto_argument_sequenceAssignment_1_in_rule__Lineto__Group__1__Impl4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto__Group__0__Impl_in_rule__Horizontal_lineto__Group__04262 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto__Group__1_in_rule__Horizontal_lineto__Group__04265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto__Alternatives_0_in_rule__Horizontal_lineto__Group__0__Impl4292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto__Group__1__Impl_in_rule__Horizontal_lineto__Group__14322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_1_in_rule__Horizontal_lineto__Group__1__Impl4349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__0__Impl_in_rule__Horizontal_lineto_argument_sequence__Group__04383 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__1_in_rule__Horizontal_lineto_argument_sequence__Group__04386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_0_in_rule__Horizontal_lineto_argument_sequence__Group__0__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group__1__Impl_in_rule__Horizontal_lineto_argument_sequence__Group__14443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__0_in_rule__Horizontal_lineto_argument_sequence__Group__1__Impl4470 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl_in_rule__Horizontal_lineto_argument_sequence__Group_1__04505 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__1_in_rule__Horizontal_lineto_argument_sequence__Group_1__04508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Horizontal_lineto_argument_sequence__Group_1__0__Impl4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl_in_rule__Horizontal_lineto_argument_sequence__Group_1__14567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_1_in_rule__Horizontal_lineto_argument_sequence__Group_1__1__Impl4594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto__Group__0__Impl_in_rule__Vertical_lineto__Group__04628 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Vertical_lineto__Group__1_in_rule__Vertical_lineto__Group__04631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto__Alternatives_0_in_rule__Vertical_lineto__Group__0__Impl4658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto__Group__1__Impl_in_rule__Vertical_lineto__Group__14688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_1_in_rule__Vertical_lineto__Group__1__Impl4715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group__0__Impl_in_rule__Vertical_lineto_argument_sequence__Group__04749 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group__1_in_rule__Vertical_lineto_argument_sequence__Group__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_0_in_rule__Vertical_lineto_argument_sequence__Group__0__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group__1__Impl_in_rule__Vertical_lineto_argument_sequence__Group__14809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__0_in_rule__Vertical_lineto_argument_sequence__Group__1__Impl4836 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__0__Impl_in_rule__Vertical_lineto_argument_sequence__Group_1__04871 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__1_in_rule__Vertical_lineto_argument_sequence__Group_1__04874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Vertical_lineto_argument_sequence__Group_1__0__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__Group_1__1__Impl_in_rule__Vertical_lineto_argument_sequence__Group_1__14933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_1_in_rule__Vertical_lineto_argument_sequence__Group_1__1__Impl4960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto__Group__0__Impl_in_rule__Curveto__Group__04994 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Curveto__Group__1_in_rule__Curveto__Group__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto__Alternatives_0_in_rule__Curveto__Group__0__Impl5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto__Group__1__Impl_in_rule__Curveto__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto__Curveto_argument_sequenceAssignment_1_in_rule__Curveto__Group__1__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group__0__Impl_in_rule__Curveto_argument_sequence__Group__05115 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group__1_in_rule__Curveto_argument_sequence__Group__05118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_0_in_rule__Curveto_argument_sequence__Group__0__Impl5145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group__1__Impl_in_rule__Curveto_argument_sequence__Group__15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group_1__0_in_rule__Curveto_argument_sequence__Group__1__Impl5202 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group_1__0__Impl_in_rule__Curveto_argument_sequence__Group_1__05237 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group_1__1_in_rule__Curveto_argument_sequence__Group_1__05240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Curveto_argument_sequence__Group_1__0__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Group_1__1__Impl_in_rule__Curveto_argument_sequence__Group_1__15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_1_in_rule__Curveto_argument_sequence__Group_1__1__Impl5326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__0__Impl_in_rule__Curveto_argument__Group__05360 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__1_in_rule__Curveto_argument__Group__05363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__C1Assignment_0_in_rule__Curveto_argument__Group__0__Impl5390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__1__Impl_in_rule__Curveto_argument__Group__15420 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__2_in_rule__Curveto_argument__Group__15423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Curveto_argument__Group__1__Impl5451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__2__Impl_in_rule__Curveto_argument__Group__25482 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__3_in_rule__Curveto_argument__Group__25485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__C2Assignment_2_in_rule__Curveto_argument__Group__2__Impl5512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__3__Impl_in_rule__Curveto_argument__Group__35542 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__4_in_rule__Curveto_argument__Group__35545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Curveto_argument__Group__3__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__Group__4__Impl_in_rule__Curveto_argument__Group__45604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Curveto_argument__C3Assignment_4_in_rule__Curveto_argument__Group__4__Impl5631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto__Group__0__Impl_in_rule__Smooth_curveto__Group__05671 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Smooth_curveto__Group__1_in_rule__Smooth_curveto__Group__05674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto__Alternatives_0_in_rule__Smooth_curveto__Group__0__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto__Group__1__Impl_in_rule__Smooth_curveto__Group__15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_1_in_rule__Smooth_curveto__Group__1__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group__0__Impl_in_rule__Smooth_curveto_argument_sequence__Group__05792 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group__1_in_rule__Smooth_curveto_argument_sequence__Group__05795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_0_in_rule__Smooth_curveto_argument_sequence__Group__0__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group__1__Impl_in_rule__Smooth_curveto_argument_sequence__Group__15852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__0_in_rule__Smooth_curveto_argument_sequence__Group__1__Impl5879 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__0__Impl_in_rule__Smooth_curveto_argument_sequence__Group_1__05914 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__1_in_rule__Smooth_curveto_argument_sequence__Group_1__05917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Smooth_curveto_argument_sequence__Group_1__0__Impl5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Group_1__1__Impl_in_rule__Smooth_curveto_argument_sequence__Group_1__15976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_1_in_rule__Smooth_curveto_argument_sequence__Group_1__1__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__Group__0__Impl_in_rule__Smooth_curveto_argument__Group__06037 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__Group__1_in_rule__Smooth_curveto_argument__Group__06040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__C1Assignment_0_in_rule__Smooth_curveto_argument__Group__0__Impl6067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__Group__1__Impl_in_rule__Smooth_curveto_argument__Group__16097 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__Group__2_in_rule__Smooth_curveto_argument__Group__16100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Smooth_curveto_argument__Group__1__Impl6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__Group__2__Impl_in_rule__Smooth_curveto_argument__Group__26159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_curveto_argument__C2Assignment_2_in_rule__Smooth_curveto_argument__Group__2__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto__Group__0__Impl_in_rule__Quadratic_bezier_curveto__Group__06222 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto__Group__1_in_rule__Quadratic_bezier_curveto__Group__06225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto__Alternatives_0_in_rule__Quadratic_bezier_curveto__Group__0__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto__Group__1__Impl_in_rule__Quadratic_bezier_curveto__Group__16282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_sequence_in_rule__Quadratic_bezier_curveto__Group__1__Impl6309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__06342 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__1_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__06345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_0_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__0__Impl6372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__16402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0_in_rule__Quadratic_bezier_curveto_argument_sequence__Group__1__Impl6429 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__06464 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__06467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl6495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__16526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_1_in_rule__Quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl6553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__0__Impl_in_rule__Quadratic_bezier_curveto_argument__Group__06587 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__1_in_rule__Quadratic_bezier_curveto_argument__Group__06590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__C1Assignment_0_in_rule__Quadratic_bezier_curveto_argument__Group__0__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__1__Impl_in_rule__Quadratic_bezier_curveto_argument__Group__16647 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__2_in_rule__Quadratic_bezier_curveto_argument__Group__16650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Quadratic_bezier_curveto_argument__Group__1__Impl6678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__Group__2__Impl_in_rule__Quadratic_bezier_curveto_argument__Group__26709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Quadratic_bezier_curveto_argument__C2Assignment_2_in_rule__Quadratic_bezier_curveto_argument__Group__2__Impl6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__0__Impl_in_rule__Smooth_quadratic_bezier_curveto__Group__06772 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__1_in_rule__Smooth_quadratic_bezier_curveto__Group__06775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto__Alternatives_0_in_rule__Smooth_quadratic_bezier_curveto__Group__0__Impl6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto__Group__1__Impl_in_rule__Smooth_quadratic_bezier_curveto__Group__16832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_1_in_rule__Smooth_quadratic_bezier_curveto__Group__1__Impl6859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__06893 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__06896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_0_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__0__Impl6923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__16953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group__1__Impl6980 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__07015 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__07018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__0__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__17077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_1_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Group_1__1__Impl7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc__Group__0__Impl_in_rule__Elliptical_arc__Group__07138 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Elliptical_arc__Group__1_in_rule__Elliptical_arc__Group__07141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc__Alternatives_0_in_rule__Elliptical_arc__Group__0__Impl7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc__Group__1__Impl_in_rule__Elliptical_arc__Group__17198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_1_in_rule__Elliptical_arc__Group__1__Impl7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group__0__Impl_in_rule__Elliptical_arc_argument_sequence__Group__07259 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group__1_in_rule__Elliptical_arc_argument_sequence__Group__07262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_0_in_rule__Elliptical_arc_argument_sequence__Group__0__Impl7289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group__1__Impl_in_rule__Elliptical_arc_argument_sequence__Group__17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__0_in_rule__Elliptical_arc_argument_sequence__Group__1__Impl7346 = new BitSet(new long[]{0x000000FFF0000022L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__0__Impl_in_rule__Elliptical_arc_argument_sequence__Group_1__07381 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__1_in_rule__Elliptical_arc_argument_sequence__Group_1__07384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Elliptical_arc_argument_sequence__Group_1__0__Impl7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Group_1__1__Impl_in_rule__Elliptical_arc_argument_sequence__Group_1__17443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_1_in_rule__Elliptical_arc_argument_sequence__Group_1__1__Impl7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__0__Impl_in_rule__Elliptical_arc_argument__Group__07504 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__1_in_rule__Elliptical_arc_argument__Group__07507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__RxAssignment_0_in_rule__Elliptical_arc_argument__Group__0__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__1__Impl_in_rule__Elliptical_arc_argument__Group__17564 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__2_in_rule__Elliptical_arc_argument__Group__17567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__1__Impl7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__2__Impl_in_rule__Elliptical_arc_argument__Group__27626 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__3_in_rule__Elliptical_arc_argument__Group__27629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__RyAssignment_2_in_rule__Elliptical_arc_argument__Group__2__Impl7656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__3__Impl_in_rule__Elliptical_arc_argument__Group__37686 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__4_in_rule__Elliptical_arc_argument__Group__37689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__3__Impl7717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__4__Impl_in_rule__Elliptical_arc_argument__Group__47748 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__5_in_rule__Elliptical_arc_argument__Group__47751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__RotationAssignment_4_in_rule__Elliptical_arc_argument__Group__4__Impl7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__5__Impl_in_rule__Elliptical_arc_argument__Group__57808 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__6_in_rule__Elliptical_arc_argument__Group__57811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__5__Impl7838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__6__Impl_in_rule__Elliptical_arc_argument__Group__67867 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__7_in_rule__Elliptical_arc_argument__Group__67870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__LargearcflagAssignment_6_in_rule__Elliptical_arc_argument__Group__6__Impl7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__7__Impl_in_rule__Elliptical_arc_argument__Group__77927 = new BitSet(new long[]{0x0000000030000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__8_in_rule__Elliptical_arc_argument__Group__77930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__7__Impl7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__8__Impl_in_rule__Elliptical_arc_argument__Group__87989 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__9_in_rule__Elliptical_arc_argument__Group__87992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__SweepflagAssignment_8_in_rule__Elliptical_arc_argument__Group__8__Impl8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__9__Impl_in_rule__Elliptical_arc_argument__Group__98049 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__10_in_rule__Elliptical_arc_argument__Group__98052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Elliptical_arc_argument__Group__9__Impl8080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Group__10__Impl_in_rule__Elliptical_arc_argument__Group__108111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Elliptical_arc_argument__Coordinate_pairAssignment_10_in_rule__Elliptical_arc_argument__Group__10__Impl8138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__Group__0__Impl_in_rule__Coordinate_pair__Group__08190 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__Group__1_in_rule__Coordinate_pair__Group__08193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__C1Assignment_0_in_rule__Coordinate_pair__Group__0__Impl8220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__Group__1__Impl_in_rule__Coordinate_pair__Group__18250 = new BitSet(new long[]{0x000000FFF0000020L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__Group__2_in_rule__Coordinate_pair__Group__18253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecomma_in_rule__Coordinate_pair__Group__1__Impl8281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__Group__2__Impl_in_rule__Coordinate_pair__Group__28312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coordinate_pair__C2Assignment_2_in_rule__Coordinate_pair__Group__2__Impl8339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__0__Impl_in_rule__Number__Group__08375 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Number__Group__1_in_rule__Number__Group__08378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__SignAssignment_0_in_rule__Number__Group__0__Impl8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Group__1__Impl_in_rule__Number__Group__18436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Number__Nonnegative_numberAssignment_1_in_rule__Number__Group__1__Impl8463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group__0__Impl_in_rule__Nonnegative_number__Group__08497 = new BitSet(new long[]{0x000001000C000000L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group__1_in_rule__Nonnegative_number__Group__08500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__IntseqAssignment_0_in_rule__Nonnegative_number__Group__0__Impl8527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group__1__Impl_in_rule__Nonnegative_number__Group__18557 = new BitSet(new long[]{0x000001000C000000L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group__2_in_rule__Nonnegative_number__Group__18560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group_1__0_in_rule__Nonnegative_number__Group__1__Impl8587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group__2__Impl_in_rule__Nonnegative_number__Group__28618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__ExponentAssignment_2_in_rule__Nonnegative_number__Group__2__Impl8645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group_1__0__Impl_in_rule__Nonnegative_number__Group_1__08682 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group_1__1_in_rule__Nonnegative_number__Group_1__08685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Nonnegative_number__Group_1__0__Impl8713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__Group_1__1__Impl_in_rule__Nonnegative_number__Group_1__18744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nonnegative_number__FloatseqAssignment_1_1_in_rule__Nonnegative_number__Group_1__1__Impl8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__Group__0__Impl_in_rule__Exponent__Group__08805 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Exponent__Group__1_in_rule__Exponent__Group__08808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__Alternatives_0_in_rule__Exponent__Group__0__Impl8835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__Group__1__Impl_in_rule__Exponent__Group__18865 = new BitSet(new long[]{0x000000FFF0000000L});
    public static final BitSet FOLLOW_rule__Exponent__Group__2_in_rule__Exponent__Group__18868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__SignAssignment_1_in_rule__Exponent__Group__1__Impl8895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__Group__2__Impl_in_rule__Exponent__Group__28926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exponent__Digit_sequenceAssignment_2_in_rule__Exponent__Group__2__Impl8953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_groups_in_rule__Svg_path__Moveto_drawto_command_groupsAssignment8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_drawto_command_group_in_rule__Moveto_drawto_command_groups__CommandsAssignment9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemoveto_in_rule__Moveto_drawto_command_group__MovetoAssignment_09056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledrawto_commands_in_rule__Moveto_drawto_command_group__Drawto_commandsAssignment_19087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Moveto__PointAssignment_19118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_argument_sequence_in_rule__Moveto__Lineto_argument_sequenceAssignment_39149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Lineto_argument_sequence__PairsAssignment_09180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Lineto_argument_sequence__PairsAssignment_1_19211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledrawto_command_in_rule__Drawto_commands__Drawto_commandsAssignment9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulelineto_argument_sequence_in_rule__Lineto__Lineto_argument_sequenceAssignment_19273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulehorizontal_lineto_argument_sequence_in_rule__Horizontal_lineto__Horizontal_lineto_argument_sequenceAssignment_19304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_09335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rule__Horizontal_lineto_argument_sequence__CoordinatesAssignment_1_19366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulevertical_lineto_argument_sequence_in_rule__Vertical_lineto__Vertical_lineto_argument_sequenceAssignment_19397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_09428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rule__Vertical_lineto_argument_sequence__CoordinatesAssignment_1_19459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_sequence_in_rule__Curveto__Curveto_argument_sequenceAssignment_19490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_in_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_09521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecurveto_argument_in_rule__Curveto_argument_sequence__Curveto_argumentsAssignment_1_19552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Curveto_argument__C1Assignment_09583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Curveto_argument__C2Assignment_29614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Curveto_argument__C3Assignment_49645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_sequence_in_rule__Smooth_curveto__Smooth_curveto_argument_sequenceAssignment_19676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_in_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_09707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_curveto_argument_in_rule__Smooth_curveto_argument_sequence__Smooth_curveto_argumentsAssignment_1_19738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Smooth_curveto_argument__C1Assignment_09769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Smooth_curveto_argument__C2Assignment_29800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_in_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_09831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulequadratic_bezier_curveto_argument_in_rule__Quadratic_bezier_curveto_argument_sequence__Quadratic_bezier_curveto_argumentsAssignment_1_19862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Quadratic_bezier_curveto_argument__C1Assignment_09893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Quadratic_bezier_curveto_argument__C2Assignment_29924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesmooth_quadratic_bezier_curveto_argument_sequence_in_rule__Smooth_quadratic_bezier_curveto__Smooth_quadratic_bezier_curveto_argument_sequenceAssignment_19955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_09986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Smooth_quadratic_bezier_curveto_argument_sequence__Coordinate_pairsAssignment_1_110017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_sequence_in_rule__Elliptical_arc__Elliptical_arc_argument_sequenceAssignment_110048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_in_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_010079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleelliptical_arc_argument_in_rule__Elliptical_arc_argument_sequence__Elliptical_arc_argumentsAssignment_1_110110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_rule__Elliptical_arc_argument__RxAssignment_010141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_rule__Elliptical_arc_argument__RyAssignment_210172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenumber_in_rule__Elliptical_arc_argument__RotationAssignment_410203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleflag_in_rule__Elliptical_arc_argument__LargearcflagAssignment_610234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleflag_in_rule__Elliptical_arc_argument__SweepflagAssignment_810265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_pair_in_rule__Elliptical_arc_argument__Coordinate_pairAssignment_1010296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rule__Coordinate_pair__C1Assignment_010327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulecoordinate_in_rule__Coordinate_pair__C2Assignment_210358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rule__Number__SignAssignment_010389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulenonnegative_number_in_rule__Number__Nonnegative_numberAssignment_110420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rule__Nonnegative_number__IntseqAssignment_010451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rule__Nonnegative_number__FloatseqAssignment_1_110482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexponent_in_rule__Nonnegative_number__ExponentAssignment_210513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulesign_in_rule__Exponent__SignAssignment_110544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_sequence_in_rule__Exponent__Digit_sequenceAssignment_210575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledigit_in_rule__Digit_sequence__DigitsAssignment10606 = new BitSet(new long[]{0x0000000000000002L});

}