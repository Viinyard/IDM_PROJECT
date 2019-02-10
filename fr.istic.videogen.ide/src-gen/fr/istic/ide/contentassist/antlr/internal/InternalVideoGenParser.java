package fr.istic.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.istic.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TOP'", "'BOTTOM'", "'CENTER'", "'h'", "'horizontal'", "'v'", "'vertical'", "'VideoGen'", "'@author'", "'@version'", "'@creation'", "'mandatory'", "'optional'", "'alternatives'", "'image'", "'toptext'", "'bottomtext'", "'videoseq'", "'duration'", "'probability'", "'description'", "'filter'", "'text'", "'content'", "'position'", "'color'", "'size'", "'b&w'", "'negate'", "'flip'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoGen.g"; }


    	private VideoGenGrammarAccess grammarAccess;

    	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVideoGeneratorModel"
    // InternalVideoGen.g:53:1: entryRuleVideoGeneratorModel : ruleVideoGeneratorModel EOF ;
    public final void entryRuleVideoGeneratorModel() throws RecognitionException {
        try {
            // InternalVideoGen.g:54:1: ( ruleVideoGeneratorModel EOF )
            // InternalVideoGen.g:55:1: ruleVideoGeneratorModel EOF
            {
             before(grammarAccess.getVideoGeneratorModelRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoGeneratorModel();

            state._fsp--;

             after(grammarAccess.getVideoGeneratorModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVideoGeneratorModel"


    // $ANTLR start "ruleVideoGeneratorModel"
    // InternalVideoGen.g:62:1: ruleVideoGeneratorModel : ( ( rule__VideoGeneratorModel__Group__0 ) ) ;
    public final void ruleVideoGeneratorModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:66:2: ( ( ( rule__VideoGeneratorModel__Group__0 ) ) )
            // InternalVideoGen.g:67:2: ( ( rule__VideoGeneratorModel__Group__0 ) )
            {
            // InternalVideoGen.g:67:2: ( ( rule__VideoGeneratorModel__Group__0 ) )
            // InternalVideoGen.g:68:3: ( rule__VideoGeneratorModel__Group__0 )
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getGroup()); 
            // InternalVideoGen.g:69:3: ( rule__VideoGeneratorModel__Group__0 )
            // InternalVideoGen.g:69:4: rule__VideoGeneratorModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGeneratorModelAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoGeneratorModel"


    // $ANTLR start "entryRuleVideoGenInformation"
    // InternalVideoGen.g:78:1: entryRuleVideoGenInformation : ruleVideoGenInformation EOF ;
    public final void entryRuleVideoGenInformation() throws RecognitionException {
        try {
            // InternalVideoGen.g:79:1: ( ruleVideoGenInformation EOF )
            // InternalVideoGen.g:80:1: ruleVideoGenInformation EOF
            {
             before(grammarAccess.getVideoGenInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoGenInformation();

            state._fsp--;

             after(grammarAccess.getVideoGenInformationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVideoGenInformation"


    // $ANTLR start "ruleVideoGenInformation"
    // InternalVideoGen.g:87:1: ruleVideoGenInformation : ( ( rule__VideoGenInformation__Group__0 ) ) ;
    public final void ruleVideoGenInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:91:2: ( ( ( rule__VideoGenInformation__Group__0 ) ) )
            // InternalVideoGen.g:92:2: ( ( rule__VideoGenInformation__Group__0 ) )
            {
            // InternalVideoGen.g:92:2: ( ( rule__VideoGenInformation__Group__0 ) )
            // InternalVideoGen.g:93:3: ( rule__VideoGenInformation__Group__0 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup()); 
            // InternalVideoGen.g:94:3: ( rule__VideoGenInformation__Group__0 )
            // InternalVideoGen.g:94:4: rule__VideoGenInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoGenInformation"


    // $ANTLR start "entryRuleMedia"
    // InternalVideoGen.g:103:1: entryRuleMedia : ruleMedia EOF ;
    public final void entryRuleMedia() throws RecognitionException {
        try {
            // InternalVideoGen.g:104:1: ( ruleMedia EOF )
            // InternalVideoGen.g:105:1: ruleMedia EOF
            {
             before(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_1);
            ruleMedia();

            state._fsp--;

             after(grammarAccess.getMediaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalVideoGen.g:112:1: ruleMedia : ( ( rule__Media__Alternatives ) ) ;
    public final void ruleMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:116:2: ( ( ( rule__Media__Alternatives ) ) )
            // InternalVideoGen.g:117:2: ( ( rule__Media__Alternatives ) )
            {
            // InternalVideoGen.g:117:2: ( ( rule__Media__Alternatives ) )
            // InternalVideoGen.g:118:3: ( rule__Media__Alternatives )
            {
             before(grammarAccess.getMediaAccess().getAlternatives()); 
            // InternalVideoGen.g:119:3: ( rule__Media__Alternatives )
            // InternalVideoGen.g:119:4: rule__Media__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Media__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleMandatoryMedia"
    // InternalVideoGen.g:128:1: entryRuleMandatoryMedia : ruleMandatoryMedia EOF ;
    public final void entryRuleMandatoryMedia() throws RecognitionException {
        try {
            // InternalVideoGen.g:129:1: ( ruleMandatoryMedia EOF )
            // InternalVideoGen.g:130:1: ruleMandatoryMedia EOF
            {
             before(grammarAccess.getMandatoryMediaRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatoryMedia();

            state._fsp--;

             after(grammarAccess.getMandatoryMediaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMandatoryMedia"


    // $ANTLR start "ruleMandatoryMedia"
    // InternalVideoGen.g:137:1: ruleMandatoryMedia : ( ( rule__MandatoryMedia__Group__0 ) ) ;
    public final void ruleMandatoryMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:141:2: ( ( ( rule__MandatoryMedia__Group__0 ) ) )
            // InternalVideoGen.g:142:2: ( ( rule__MandatoryMedia__Group__0 ) )
            {
            // InternalVideoGen.g:142:2: ( ( rule__MandatoryMedia__Group__0 ) )
            // InternalVideoGen.g:143:3: ( rule__MandatoryMedia__Group__0 )
            {
             before(grammarAccess.getMandatoryMediaAccess().getGroup()); 
            // InternalVideoGen.g:144:3: ( rule__MandatoryMedia__Group__0 )
            // InternalVideoGen.g:144:4: rule__MandatoryMedia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryMedia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryMediaAccess().getGroup()); 

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
    // $ANTLR end "ruleMandatoryMedia"


    // $ANTLR start "entryRuleOptionalMedia"
    // InternalVideoGen.g:153:1: entryRuleOptionalMedia : ruleOptionalMedia EOF ;
    public final void entryRuleOptionalMedia() throws RecognitionException {
        try {
            // InternalVideoGen.g:154:1: ( ruleOptionalMedia EOF )
            // InternalVideoGen.g:155:1: ruleOptionalMedia EOF
            {
             before(grammarAccess.getOptionalMediaRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalMedia();

            state._fsp--;

             after(grammarAccess.getOptionalMediaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOptionalMedia"


    // $ANTLR start "ruleOptionalMedia"
    // InternalVideoGen.g:162:1: ruleOptionalMedia : ( ( rule__OptionalMedia__Group__0 ) ) ;
    public final void ruleOptionalMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:166:2: ( ( ( rule__OptionalMedia__Group__0 ) ) )
            // InternalVideoGen.g:167:2: ( ( rule__OptionalMedia__Group__0 ) )
            {
            // InternalVideoGen.g:167:2: ( ( rule__OptionalMedia__Group__0 ) )
            // InternalVideoGen.g:168:3: ( rule__OptionalMedia__Group__0 )
            {
             before(grammarAccess.getOptionalMediaAccess().getGroup()); 
            // InternalVideoGen.g:169:3: ( rule__OptionalMedia__Group__0 )
            // InternalVideoGen.g:169:4: rule__OptionalMedia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OptionalMedia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalMediaAccess().getGroup()); 

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
    // $ANTLR end "ruleOptionalMedia"


    // $ANTLR start "entryRuleAlternativesMedia"
    // InternalVideoGen.g:178:1: entryRuleAlternativesMedia : ruleAlternativesMedia EOF ;
    public final void entryRuleAlternativesMedia() throws RecognitionException {
        try {
            // InternalVideoGen.g:179:1: ( ruleAlternativesMedia EOF )
            // InternalVideoGen.g:180:1: ruleAlternativesMedia EOF
            {
             before(grammarAccess.getAlternativesMediaRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternativesMedia();

            state._fsp--;

             after(grammarAccess.getAlternativesMediaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAlternativesMedia"


    // $ANTLR start "ruleAlternativesMedia"
    // InternalVideoGen.g:187:1: ruleAlternativesMedia : ( ( rule__AlternativesMedia__Group__0 ) ) ;
    public final void ruleAlternativesMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:191:2: ( ( ( rule__AlternativesMedia__Group__0 ) ) )
            // InternalVideoGen.g:192:2: ( ( rule__AlternativesMedia__Group__0 ) )
            {
            // InternalVideoGen.g:192:2: ( ( rule__AlternativesMedia__Group__0 ) )
            // InternalVideoGen.g:193:3: ( rule__AlternativesMedia__Group__0 )
            {
             before(grammarAccess.getAlternativesMediaAccess().getGroup()); 
            // InternalVideoGen.g:194:3: ( rule__AlternativesMedia__Group__0 )
            // InternalVideoGen.g:194:4: rule__AlternativesMedia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlternativesMedia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesMediaAccess().getGroup()); 

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
    // $ANTLR end "ruleAlternativesMedia"


    // $ANTLR start "entryRuleMediaDescription"
    // InternalVideoGen.g:203:1: entryRuleMediaDescription : ruleMediaDescription EOF ;
    public final void entryRuleMediaDescription() throws RecognitionException {
        try {
            // InternalVideoGen.g:204:1: ( ruleMediaDescription EOF )
            // InternalVideoGen.g:205:1: ruleMediaDescription EOF
            {
             before(grammarAccess.getMediaDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleMediaDescription();

            state._fsp--;

             after(grammarAccess.getMediaDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMediaDescription"


    // $ANTLR start "ruleMediaDescription"
    // InternalVideoGen.g:212:1: ruleMediaDescription : ( ( rule__MediaDescription__Alternatives ) ) ;
    public final void ruleMediaDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:216:2: ( ( ( rule__MediaDescription__Alternatives ) ) )
            // InternalVideoGen.g:217:2: ( ( rule__MediaDescription__Alternatives ) )
            {
            // InternalVideoGen.g:217:2: ( ( rule__MediaDescription__Alternatives ) )
            // InternalVideoGen.g:218:3: ( rule__MediaDescription__Alternatives )
            {
             before(grammarAccess.getMediaDescriptionAccess().getAlternatives()); 
            // InternalVideoGen.g:219:3: ( rule__MediaDescription__Alternatives )
            // InternalVideoGen.g:219:4: rule__MediaDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MediaDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMediaDescriptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMediaDescription"


    // $ANTLR start "entryRuleImageDescription"
    // InternalVideoGen.g:228:1: entryRuleImageDescription : ruleImageDescription EOF ;
    public final void entryRuleImageDescription() throws RecognitionException {
        try {
            // InternalVideoGen.g:229:1: ( ruleImageDescription EOF )
            // InternalVideoGen.g:230:1: ruleImageDescription EOF
            {
             before(grammarAccess.getImageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageDescription();

            state._fsp--;

             after(grammarAccess.getImageDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImageDescription"


    // $ANTLR start "ruleImageDescription"
    // InternalVideoGen.g:237:1: ruleImageDescription : ( ( rule__ImageDescription__Group__0 ) ) ;
    public final void ruleImageDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:241:2: ( ( ( rule__ImageDescription__Group__0 ) ) )
            // InternalVideoGen.g:242:2: ( ( rule__ImageDescription__Group__0 ) )
            {
            // InternalVideoGen.g:242:2: ( ( rule__ImageDescription__Group__0 ) )
            // InternalVideoGen.g:243:3: ( rule__ImageDescription__Group__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup()); 
            // InternalVideoGen.g:244:3: ( rule__ImageDescription__Group__0 )
            // InternalVideoGen.g:244:4: rule__ImageDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleImageDescription"


    // $ANTLR start "entryRuleVideoDescription"
    // InternalVideoGen.g:253:1: entryRuleVideoDescription : ruleVideoDescription EOF ;
    public final void entryRuleVideoDescription() throws RecognitionException {
        try {
            // InternalVideoGen.g:254:1: ( ruleVideoDescription EOF )
            // InternalVideoGen.g:255:1: ruleVideoDescription EOF
            {
             before(grammarAccess.getVideoDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoDescription();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVideoDescription"


    // $ANTLR start "ruleVideoDescription"
    // InternalVideoGen.g:262:1: ruleVideoDescription : ( ( rule__VideoDescription__Group__0 ) ) ;
    public final void ruleVideoDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:266:2: ( ( ( rule__VideoDescription__Group__0 ) ) )
            // InternalVideoGen.g:267:2: ( ( rule__VideoDescription__Group__0 ) )
            {
            // InternalVideoGen.g:267:2: ( ( rule__VideoDescription__Group__0 ) )
            // InternalVideoGen.g:268:3: ( rule__VideoDescription__Group__0 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup()); 
            // InternalVideoGen.g:269:3: ( rule__VideoDescription__Group__0 )
            // InternalVideoGen.g:269:4: rule__VideoDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoDescription"


    // $ANTLR start "entryRuleVideoText"
    // InternalVideoGen.g:278:1: entryRuleVideoText : ruleVideoText EOF ;
    public final void entryRuleVideoText() throws RecognitionException {
        try {
            // InternalVideoGen.g:279:1: ( ruleVideoText EOF )
            // InternalVideoGen.g:280:1: ruleVideoText EOF
            {
             before(grammarAccess.getVideoTextRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoText();

            state._fsp--;

             after(grammarAccess.getVideoTextRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVideoText"


    // $ANTLR start "ruleVideoText"
    // InternalVideoGen.g:287:1: ruleVideoText : ( ( rule__VideoText__Group__0 ) ) ;
    public final void ruleVideoText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:291:2: ( ( ( rule__VideoText__Group__0 ) ) )
            // InternalVideoGen.g:292:2: ( ( rule__VideoText__Group__0 ) )
            {
            // InternalVideoGen.g:292:2: ( ( rule__VideoText__Group__0 ) )
            // InternalVideoGen.g:293:3: ( rule__VideoText__Group__0 )
            {
             before(grammarAccess.getVideoTextAccess().getGroup()); 
            // InternalVideoGen.g:294:3: ( rule__VideoText__Group__0 )
            // InternalVideoGen.g:294:4: rule__VideoText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getGroup()); 

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
    // $ANTLR end "ruleVideoText"


    // $ANTLR start "entryRulePosition"
    // InternalVideoGen.g:303:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalVideoGen.g:304:1: ( rulePosition EOF )
            // InternalVideoGen.g:305:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalVideoGen.g:312:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:316:2: ( ( ( rule__Position__Alternatives ) ) )
            // InternalVideoGen.g:317:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalVideoGen.g:317:2: ( ( rule__Position__Alternatives ) )
            // InternalVideoGen.g:318:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalVideoGen.g:319:3: ( rule__Position__Alternatives )
            // InternalVideoGen.g:319:4: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

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
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleFilter"
    // InternalVideoGen.g:328:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:329:1: ( ruleFilter EOF )
            // InternalVideoGen.g:330:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalVideoGen.g:337:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:341:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalVideoGen.g:342:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalVideoGen.g:342:2: ( ( rule__Filter__Alternatives ) )
            // InternalVideoGen.g:343:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalVideoGen.g:344:3: ( rule__Filter__Alternatives )
            // InternalVideoGen.g:344:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBlackWhiteFilter"
    // InternalVideoGen.g:353:1: entryRuleBlackWhiteFilter : ruleBlackWhiteFilter EOF ;
    public final void entryRuleBlackWhiteFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:354:1: ( ruleBlackWhiteFilter EOF )
            // InternalVideoGen.g:355:1: ruleBlackWhiteFilter EOF
            {
             before(grammarAccess.getBlackWhiteFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleBlackWhiteFilter();

            state._fsp--;

             after(grammarAccess.getBlackWhiteFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBlackWhiteFilter"


    // $ANTLR start "ruleBlackWhiteFilter"
    // InternalVideoGen.g:362:1: ruleBlackWhiteFilter : ( ( rule__BlackWhiteFilter__Group__0 ) ) ;
    public final void ruleBlackWhiteFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:366:2: ( ( ( rule__BlackWhiteFilter__Group__0 ) ) )
            // InternalVideoGen.g:367:2: ( ( rule__BlackWhiteFilter__Group__0 ) )
            {
            // InternalVideoGen.g:367:2: ( ( rule__BlackWhiteFilter__Group__0 ) )
            // InternalVideoGen.g:368:3: ( rule__BlackWhiteFilter__Group__0 )
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getGroup()); 
            // InternalVideoGen.g:369:3: ( rule__BlackWhiteFilter__Group__0 )
            // InternalVideoGen.g:369:4: rule__BlackWhiteFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlackWhiteFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleBlackWhiteFilter"


    // $ANTLR start "entryRuleNegateFilter"
    // InternalVideoGen.g:378:1: entryRuleNegateFilter : ruleNegateFilter EOF ;
    public final void entryRuleNegateFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:379:1: ( ruleNegateFilter EOF )
            // InternalVideoGen.g:380:1: ruleNegateFilter EOF
            {
             before(grammarAccess.getNegateFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleNegateFilter();

            state._fsp--;

             after(grammarAccess.getNegateFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegateFilter"


    // $ANTLR start "ruleNegateFilter"
    // InternalVideoGen.g:387:1: ruleNegateFilter : ( ( rule__NegateFilter__Group__0 ) ) ;
    public final void ruleNegateFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:391:2: ( ( ( rule__NegateFilter__Group__0 ) ) )
            // InternalVideoGen.g:392:2: ( ( rule__NegateFilter__Group__0 ) )
            {
            // InternalVideoGen.g:392:2: ( ( rule__NegateFilter__Group__0 ) )
            // InternalVideoGen.g:393:3: ( rule__NegateFilter__Group__0 )
            {
             before(grammarAccess.getNegateFilterAccess().getGroup()); 
            // InternalVideoGen.g:394:3: ( rule__NegateFilter__Group__0 )
            // InternalVideoGen.g:394:4: rule__NegateFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegateFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleNegateFilter"


    // $ANTLR start "entryRuleFlipFilter"
    // InternalVideoGen.g:403:1: entryRuleFlipFilter : ruleFlipFilter EOF ;
    public final void entryRuleFlipFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:404:1: ( ruleFlipFilter EOF )
            // InternalVideoGen.g:405:1: ruleFlipFilter EOF
            {
             before(grammarAccess.getFlipFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFlipFilter();

            state._fsp--;

             after(grammarAccess.getFlipFilterRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFlipFilter"


    // $ANTLR start "ruleFlipFilter"
    // InternalVideoGen.g:412:1: ruleFlipFilter : ( ( rule__FlipFilter__Group__0 ) ) ;
    public final void ruleFlipFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:416:2: ( ( ( rule__FlipFilter__Group__0 ) ) )
            // InternalVideoGen.g:417:2: ( ( rule__FlipFilter__Group__0 ) )
            {
            // InternalVideoGen.g:417:2: ( ( rule__FlipFilter__Group__0 ) )
            // InternalVideoGen.g:418:3: ( rule__FlipFilter__Group__0 )
            {
             before(grammarAccess.getFlipFilterAccess().getGroup()); 
            // InternalVideoGen.g:419:3: ( rule__FlipFilter__Group__0 )
            // InternalVideoGen.g:419:4: rule__FlipFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleFlipFilter"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalVideoGen.g:428:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalVideoGen.g:429:1: ( ruleDOUBLE EOF )
            // InternalVideoGen.g:430:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalVideoGen.g:437:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:441:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalVideoGen.g:442:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalVideoGen.g:442:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalVideoGen.g:443:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalVideoGen.g:444:3: ( rule__DOUBLE__Group__0 )
            // InternalVideoGen.g:444:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

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
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "rule__Media__Alternatives"
    // InternalVideoGen.g:452:1: rule__Media__Alternatives : ( ( ruleMandatoryMedia ) | ( ruleOptionalMedia ) | ( ruleAlternativesMedia ) );
    public final void rule__Media__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:456:1: ( ( ruleMandatoryMedia ) | ( ruleOptionalMedia ) | ( ruleAlternativesMedia ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 26:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalVideoGen.g:457:2: ( ruleMandatoryMedia )
                    {
                    // InternalVideoGen.g:457:2: ( ruleMandatoryMedia )
                    // InternalVideoGen.g:458:3: ruleMandatoryMedia
                    {
                     before(grammarAccess.getMediaAccess().getMandatoryMediaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMandatoryMedia();

                    state._fsp--;

                     after(grammarAccess.getMediaAccess().getMandatoryMediaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:463:2: ( ruleOptionalMedia )
                    {
                    // InternalVideoGen.g:463:2: ( ruleOptionalMedia )
                    // InternalVideoGen.g:464:3: ruleOptionalMedia
                    {
                     before(grammarAccess.getMediaAccess().getOptionalMediaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOptionalMedia();

                    state._fsp--;

                     after(grammarAccess.getMediaAccess().getOptionalMediaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:469:2: ( ruleAlternativesMedia )
                    {
                    // InternalVideoGen.g:469:2: ( ruleAlternativesMedia )
                    // InternalVideoGen.g:470:3: ruleAlternativesMedia
                    {
                     before(grammarAccess.getMediaAccess().getAlternativesMediaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternativesMedia();

                    state._fsp--;

                     after(grammarAccess.getMediaAccess().getAlternativesMediaParserRuleCall_2()); 

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
    // $ANTLR end "rule__Media__Alternatives"


    // $ANTLR start "rule__MediaDescription__Alternatives"
    // InternalVideoGen.g:479:1: rule__MediaDescription__Alternatives : ( ( ruleImageDescription ) | ( ruleVideoDescription ) );
    public final void rule__MediaDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:483:1: ( ( ruleImageDescription ) | ( ruleVideoDescription ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalVideoGen.g:484:2: ( ruleImageDescription )
                    {
                    // InternalVideoGen.g:484:2: ( ruleImageDescription )
                    // InternalVideoGen.g:485:3: ruleImageDescription
                    {
                     before(grammarAccess.getMediaDescriptionAccess().getImageDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImageDescription();

                    state._fsp--;

                     after(grammarAccess.getMediaDescriptionAccess().getImageDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:490:2: ( ruleVideoDescription )
                    {
                    // InternalVideoGen.g:490:2: ( ruleVideoDescription )
                    // InternalVideoGen.g:491:3: ruleVideoDescription
                    {
                     before(grammarAccess.getMediaDescriptionAccess().getVideoDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVideoDescription();

                    state._fsp--;

                     after(grammarAccess.getMediaDescriptionAccess().getVideoDescriptionParserRuleCall_1()); 

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
    // $ANTLR end "rule__MediaDescription__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // InternalVideoGen.g:500:1: rule__Position__Alternatives : ( ( 'TOP' ) | ( 'BOTTOM' ) | ( 'CENTER' ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:504:1: ( ( 'TOP' ) | ( 'BOTTOM' ) | ( 'CENTER' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVideoGen.g:505:2: ( 'TOP' )
                    {
                    // InternalVideoGen.g:505:2: ( 'TOP' )
                    // InternalVideoGen.g:506:3: 'TOP'
                    {
                     before(grammarAccess.getPositionAccess().getTOPKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getTOPKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:511:2: ( 'BOTTOM' )
                    {
                    // InternalVideoGen.g:511:2: ( 'BOTTOM' )
                    // InternalVideoGen.g:512:3: 'BOTTOM'
                    {
                     before(grammarAccess.getPositionAccess().getBOTTOMKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getBOTTOMKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:517:2: ( 'CENTER' )
                    {
                    // InternalVideoGen.g:517:2: ( 'CENTER' )
                    // InternalVideoGen.g:518:3: 'CENTER'
                    {
                     before(grammarAccess.getPositionAccess().getCENTERKeyword_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getCENTERKeyword_2()); 

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
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalVideoGen.g:527:1: rule__Filter__Alternatives : ( ( ruleFlipFilter ) | ( ruleNegateFilter ) | ( ruleBlackWhiteFilter ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:531:1: ( ( ruleFlipFilter ) | ( ruleNegateFilter ) | ( ruleBlackWhiteFilter ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt4=1;
                }
                break;
            case 41:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVideoGen.g:532:2: ( ruleFlipFilter )
                    {
                    // InternalVideoGen.g:532:2: ( ruleFlipFilter )
                    // InternalVideoGen.g:533:3: ruleFlipFilter
                    {
                     before(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFlipFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:538:2: ( ruleNegateFilter )
                    {
                    // InternalVideoGen.g:538:2: ( ruleNegateFilter )
                    // InternalVideoGen.g:539:3: ruleNegateFilter
                    {
                     before(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNegateFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:544:2: ( ruleBlackWhiteFilter )
                    {
                    // InternalVideoGen.g:544:2: ( ruleBlackWhiteFilter )
                    // InternalVideoGen.g:545:3: ruleBlackWhiteFilter
                    {
                     before(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBlackWhiteFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2()); 

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
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__FlipFilter__OrientationAlternatives_1_0"
    // InternalVideoGen.g:554:1: rule__FlipFilter__OrientationAlternatives_1_0 : ( ( 'h' ) | ( 'horizontal' ) | ( 'v' ) | ( 'vertical' ) );
    public final void rule__FlipFilter__OrientationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:558:1: ( ( 'h' ) | ( 'horizontal' ) | ( 'v' ) | ( 'vertical' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt5=1;
                }
                break;
            case 17:
                {
                alt5=2;
                }
                break;
            case 18:
                {
                alt5=3;
                }
                break;
            case 19:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVideoGen.g:559:2: ( 'h' )
                    {
                    // InternalVideoGen.g:559:2: ( 'h' )
                    // InternalVideoGen.g:560:3: 'h'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:565:2: ( 'horizontal' )
                    {
                    // InternalVideoGen.g:565:2: ( 'horizontal' )
                    // InternalVideoGen.g:566:3: 'horizontal'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:571:2: ( 'v' )
                    {
                    // InternalVideoGen.g:571:2: ( 'v' )
                    // InternalVideoGen.g:572:3: 'v'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoGen.g:577:2: ( 'vertical' )
                    {
                    // InternalVideoGen.g:577:2: ( 'vertical' )
                    // InternalVideoGen.g:578:3: 'vertical'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3()); 

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
    // $ANTLR end "rule__FlipFilter__OrientationAlternatives_1_0"


    // $ANTLR start "rule__VideoGeneratorModel__Group__0"
    // InternalVideoGen.g:587:1: rule__VideoGeneratorModel__Group__0 : rule__VideoGeneratorModel__Group__0__Impl rule__VideoGeneratorModel__Group__1 ;
    public final void rule__VideoGeneratorModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:591:1: ( rule__VideoGeneratorModel__Group__0__Impl rule__VideoGeneratorModel__Group__1 )
            // InternalVideoGen.g:592:2: rule__VideoGeneratorModel__Group__0__Impl rule__VideoGeneratorModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VideoGeneratorModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__1();

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__0"


    // $ANTLR start "rule__VideoGeneratorModel__Group__0__Impl"
    // InternalVideoGen.g:599:1: rule__VideoGeneratorModel__Group__0__Impl : ( ( rule__VideoGeneratorModel__InformationAssignment_0 )? ) ;
    public final void rule__VideoGeneratorModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:603:1: ( ( ( rule__VideoGeneratorModel__InformationAssignment_0 )? ) )
            // InternalVideoGen.g:604:1: ( ( rule__VideoGeneratorModel__InformationAssignment_0 )? )
            {
            // InternalVideoGen.g:604:1: ( ( rule__VideoGeneratorModel__InformationAssignment_0 )? )
            // InternalVideoGen.g:605:2: ( rule__VideoGeneratorModel__InformationAssignment_0 )?
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getInformationAssignment_0()); 
            // InternalVideoGen.g:606:2: ( rule__VideoGeneratorModel__InformationAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:606:3: rule__VideoGeneratorModel__InformationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoGeneratorModel__InformationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoGeneratorModelAccess().getInformationAssignment_0()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__0__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__1"
    // InternalVideoGen.g:614:1: rule__VideoGeneratorModel__Group__1 : rule__VideoGeneratorModel__Group__1__Impl rule__VideoGeneratorModel__Group__2 ;
    public final void rule__VideoGeneratorModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:618:1: ( rule__VideoGeneratorModel__Group__1__Impl rule__VideoGeneratorModel__Group__2 )
            // InternalVideoGen.g:619:2: rule__VideoGeneratorModel__Group__1__Impl rule__VideoGeneratorModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VideoGeneratorModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__2();

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__1"


    // $ANTLR start "rule__VideoGeneratorModel__Group__1__Impl"
    // InternalVideoGen.g:626:1: rule__VideoGeneratorModel__Group__1__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGeneratorModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:630:1: ( ( 'VideoGen' ) )
            // InternalVideoGen.g:631:1: ( 'VideoGen' )
            {
            // InternalVideoGen.g:631:1: ( 'VideoGen' )
            // InternalVideoGen.g:632:2: 'VideoGen'
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getVideoGenKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVideoGeneratorModelAccess().getVideoGenKeyword_1()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__1__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__2"
    // InternalVideoGen.g:641:1: rule__VideoGeneratorModel__Group__2 : rule__VideoGeneratorModel__Group__2__Impl rule__VideoGeneratorModel__Group__3 ;
    public final void rule__VideoGeneratorModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:645:1: ( rule__VideoGeneratorModel__Group__2__Impl rule__VideoGeneratorModel__Group__3 )
            // InternalVideoGen.g:646:2: rule__VideoGeneratorModel__Group__2__Impl rule__VideoGeneratorModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VideoGeneratorModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__3();

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__2"


    // $ANTLR start "rule__VideoGeneratorModel__Group__2__Impl"
    // InternalVideoGen.g:653:1: rule__VideoGeneratorModel__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGeneratorModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:657:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:658:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:658:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:659:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoGeneratorModelAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__2__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__3"
    // InternalVideoGen.g:668:1: rule__VideoGeneratorModel__Group__3 : rule__VideoGeneratorModel__Group__3__Impl rule__VideoGeneratorModel__Group__4 ;
    public final void rule__VideoGeneratorModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:672:1: ( rule__VideoGeneratorModel__Group__3__Impl rule__VideoGeneratorModel__Group__4 )
            // InternalVideoGen.g:673:2: rule__VideoGeneratorModel__Group__3__Impl rule__VideoGeneratorModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VideoGeneratorModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__4();

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__3"


    // $ANTLR start "rule__VideoGeneratorModel__Group__3__Impl"
    // InternalVideoGen.g:680:1: rule__VideoGeneratorModel__Group__3__Impl : ( ( ( rule__VideoGeneratorModel__MediasAssignment_3 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_3 )* ) ) ;
    public final void rule__VideoGeneratorModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:684:1: ( ( ( ( rule__VideoGeneratorModel__MediasAssignment_3 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_3 )* ) ) )
            // InternalVideoGen.g:685:1: ( ( ( rule__VideoGeneratorModel__MediasAssignment_3 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_3 )* ) )
            {
            // InternalVideoGen.g:685:1: ( ( ( rule__VideoGeneratorModel__MediasAssignment_3 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_3 )* ) )
            // InternalVideoGen.g:686:2: ( ( rule__VideoGeneratorModel__MediasAssignment_3 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_3 )* )
            {
            // InternalVideoGen.g:686:2: ( ( rule__VideoGeneratorModel__MediasAssignment_3 ) )
            // InternalVideoGen.g:687:3: ( rule__VideoGeneratorModel__MediasAssignment_3 )
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_3()); 
            // InternalVideoGen.g:688:3: ( rule__VideoGeneratorModel__MediasAssignment_3 )
            // InternalVideoGen.g:688:4: rule__VideoGeneratorModel__MediasAssignment_3
            {
            pushFollow(FOLLOW_7);
            rule__VideoGeneratorModel__MediasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_3()); 

            }

            // InternalVideoGen.g:691:2: ( ( rule__VideoGeneratorModel__MediasAssignment_3 )* )
            // InternalVideoGen.g:692:3: ( rule__VideoGeneratorModel__MediasAssignment_3 )*
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_3()); 
            // InternalVideoGen.g:693:3: ( rule__VideoGeneratorModel__MediasAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=24 && LA7_0<=26)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVideoGen.g:693:4: rule__VideoGeneratorModel__MediasAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__VideoGeneratorModel__MediasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_3()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__3__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__4"
    // InternalVideoGen.g:702:1: rule__VideoGeneratorModel__Group__4 : rule__VideoGeneratorModel__Group__4__Impl ;
    public final void rule__VideoGeneratorModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:706:1: ( rule__VideoGeneratorModel__Group__4__Impl )
            // InternalVideoGen.g:707:2: rule__VideoGeneratorModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__4__Impl();

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__4"


    // $ANTLR start "rule__VideoGeneratorModel__Group__4__Impl"
    // InternalVideoGen.g:713:1: rule__VideoGeneratorModel__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGeneratorModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:717:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:718:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:718:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:719:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoGeneratorModelAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__Group__4__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__0"
    // InternalVideoGen.g:729:1: rule__VideoGenInformation__Group__0 : rule__VideoGenInformation__Group__0__Impl rule__VideoGenInformation__Group__1 ;
    public final void rule__VideoGenInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:733:1: ( rule__VideoGenInformation__Group__0__Impl rule__VideoGenInformation__Group__1 )
            // InternalVideoGen.g:734:2: rule__VideoGenInformation__Group__0__Impl rule__VideoGenInformation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VideoGenInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__1();

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
    // $ANTLR end "rule__VideoGenInformation__Group__0"


    // $ANTLR start "rule__VideoGenInformation__Group__0__Impl"
    // InternalVideoGen.g:741:1: rule__VideoGenInformation__Group__0__Impl : ( () ) ;
    public final void rule__VideoGenInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:745:1: ( ( () ) )
            // InternalVideoGen.g:746:1: ( () )
            {
            // InternalVideoGen.g:746:1: ( () )
            // InternalVideoGen.g:747:2: ()
            {
             before(grammarAccess.getVideoGenInformationAccess().getVideoGenInformationAction_0()); 
            // InternalVideoGen.g:748:2: ()
            // InternalVideoGen.g:748:3: 
            {
            }

             after(grammarAccess.getVideoGenInformationAccess().getVideoGenInformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__1"
    // InternalVideoGen.g:756:1: rule__VideoGenInformation__Group__1 : rule__VideoGenInformation__Group__1__Impl rule__VideoGenInformation__Group__2 ;
    public final void rule__VideoGenInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:760:1: ( rule__VideoGenInformation__Group__1__Impl rule__VideoGenInformation__Group__2 )
            // InternalVideoGen.g:761:2: rule__VideoGenInformation__Group__1__Impl rule__VideoGenInformation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__VideoGenInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__2();

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
    // $ANTLR end "rule__VideoGenInformation__Group__1"


    // $ANTLR start "rule__VideoGenInformation__Group__1__Impl"
    // InternalVideoGen.g:768:1: rule__VideoGenInformation__Group__1__Impl : ( ( rule__VideoGenInformation__Group_1__0 ) ) ;
    public final void rule__VideoGenInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:772:1: ( ( ( rule__VideoGenInformation__Group_1__0 ) ) )
            // InternalVideoGen.g:773:1: ( ( rule__VideoGenInformation__Group_1__0 ) )
            {
            // InternalVideoGen.g:773:1: ( ( rule__VideoGenInformation__Group_1__0 ) )
            // InternalVideoGen.g:774:2: ( rule__VideoGenInformation__Group_1__0 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup_1()); 
            // InternalVideoGen.g:775:2: ( rule__VideoGenInformation__Group_1__0 )
            // InternalVideoGen.g:775:3: rule__VideoGenInformation__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup_1()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group__1__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__2"
    // InternalVideoGen.g:783:1: rule__VideoGenInformation__Group__2 : rule__VideoGenInformation__Group__2__Impl rule__VideoGenInformation__Group__3 ;
    public final void rule__VideoGenInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:787:1: ( rule__VideoGenInformation__Group__2__Impl rule__VideoGenInformation__Group__3 )
            // InternalVideoGen.g:788:2: rule__VideoGenInformation__Group__2__Impl rule__VideoGenInformation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__VideoGenInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__3();

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
    // $ANTLR end "rule__VideoGenInformation__Group__2"


    // $ANTLR start "rule__VideoGenInformation__Group__2__Impl"
    // InternalVideoGen.g:795:1: rule__VideoGenInformation__Group__2__Impl : ( ( rule__VideoGenInformation__Group_2__0 )? ) ;
    public final void rule__VideoGenInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:799:1: ( ( ( rule__VideoGenInformation__Group_2__0 )? ) )
            // InternalVideoGen.g:800:1: ( ( rule__VideoGenInformation__Group_2__0 )? )
            {
            // InternalVideoGen.g:800:1: ( ( rule__VideoGenInformation__Group_2__0 )? )
            // InternalVideoGen.g:801:2: ( rule__VideoGenInformation__Group_2__0 )?
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup_2()); 
            // InternalVideoGen.g:802:2: ( rule__VideoGenInformation__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoGen.g:802:3: rule__VideoGenInformation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoGenInformation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group__2__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__3"
    // InternalVideoGen.g:810:1: rule__VideoGenInformation__Group__3 : rule__VideoGenInformation__Group__3__Impl ;
    public final void rule__VideoGenInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:814:1: ( rule__VideoGenInformation__Group__3__Impl )
            // InternalVideoGen.g:815:2: rule__VideoGenInformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__3__Impl();

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
    // $ANTLR end "rule__VideoGenInformation__Group__3"


    // $ANTLR start "rule__VideoGenInformation__Group__3__Impl"
    // InternalVideoGen.g:821:1: rule__VideoGenInformation__Group__3__Impl : ( ( rule__VideoGenInformation__Group_3__0 )? ) ;
    public final void rule__VideoGenInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:825:1: ( ( ( rule__VideoGenInformation__Group_3__0 )? ) )
            // InternalVideoGen.g:826:1: ( ( rule__VideoGenInformation__Group_3__0 )? )
            {
            // InternalVideoGen.g:826:1: ( ( rule__VideoGenInformation__Group_3__0 )? )
            // InternalVideoGen.g:827:2: ( rule__VideoGenInformation__Group_3__0 )?
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup_3()); 
            // InternalVideoGen.g:828:2: ( rule__VideoGenInformation__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoGen.g:828:3: rule__VideoGenInformation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoGenInformation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup_3()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group__3__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_1__0"
    // InternalVideoGen.g:837:1: rule__VideoGenInformation__Group_1__0 : rule__VideoGenInformation__Group_1__0__Impl rule__VideoGenInformation__Group_1__1 ;
    public final void rule__VideoGenInformation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:841:1: ( rule__VideoGenInformation__Group_1__0__Impl rule__VideoGenInformation__Group_1__1 )
            // InternalVideoGen.g:842:2: rule__VideoGenInformation__Group_1__0__Impl rule__VideoGenInformation__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoGenInformation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_1__1();

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
    // $ANTLR end "rule__VideoGenInformation__Group_1__0"


    // $ANTLR start "rule__VideoGenInformation__Group_1__0__Impl"
    // InternalVideoGen.g:849:1: rule__VideoGenInformation__Group_1__0__Impl : ( '@author' ) ;
    public final void rule__VideoGenInformation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:853:1: ( ( '@author' ) )
            // InternalVideoGen.g:854:1: ( '@author' )
            {
            // InternalVideoGen.g:854:1: ( '@author' )
            // InternalVideoGen.g:855:2: '@author'
            {
             before(grammarAccess.getVideoGenInformationAccess().getAuthorKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getAuthorKeyword_1_0()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group_1__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_1__1"
    // InternalVideoGen.g:864:1: rule__VideoGenInformation__Group_1__1 : rule__VideoGenInformation__Group_1__1__Impl ;
    public final void rule__VideoGenInformation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:868:1: ( rule__VideoGenInformation__Group_1__1__Impl )
            // InternalVideoGen.g:869:2: rule__VideoGenInformation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_1__1__Impl();

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
    // $ANTLR end "rule__VideoGenInformation__Group_1__1"


    // $ANTLR start "rule__VideoGenInformation__Group_1__1__Impl"
    // InternalVideoGen.g:875:1: rule__VideoGenInformation__Group_1__1__Impl : ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) ) ;
    public final void rule__VideoGenInformation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:879:1: ( ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) ) )
            // InternalVideoGen.g:880:1: ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) )
            {
            // InternalVideoGen.g:880:1: ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) )
            // InternalVideoGen.g:881:2: ( rule__VideoGenInformation__AuthorNameAssignment_1_1 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getAuthorNameAssignment_1_1()); 
            // InternalVideoGen.g:882:2: ( rule__VideoGenInformation__AuthorNameAssignment_1_1 )
            // InternalVideoGen.g:882:3: rule__VideoGenInformation__AuthorNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__AuthorNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getAuthorNameAssignment_1_1()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group_1__1__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_2__0"
    // InternalVideoGen.g:891:1: rule__VideoGenInformation__Group_2__0 : rule__VideoGenInformation__Group_2__0__Impl rule__VideoGenInformation__Group_2__1 ;
    public final void rule__VideoGenInformation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:895:1: ( rule__VideoGenInformation__Group_2__0__Impl rule__VideoGenInformation__Group_2__1 )
            // InternalVideoGen.g:896:2: rule__VideoGenInformation__Group_2__0__Impl rule__VideoGenInformation__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoGenInformation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_2__1();

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
    // $ANTLR end "rule__VideoGenInformation__Group_2__0"


    // $ANTLR start "rule__VideoGenInformation__Group_2__0__Impl"
    // InternalVideoGen.g:903:1: rule__VideoGenInformation__Group_2__0__Impl : ( '@version' ) ;
    public final void rule__VideoGenInformation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:907:1: ( ( '@version' ) )
            // InternalVideoGen.g:908:1: ( '@version' )
            {
            // InternalVideoGen.g:908:1: ( '@version' )
            // InternalVideoGen.g:909:2: '@version'
            {
             before(grammarAccess.getVideoGenInformationAccess().getVersionKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getVersionKeyword_2_0()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group_2__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_2__1"
    // InternalVideoGen.g:918:1: rule__VideoGenInformation__Group_2__1 : rule__VideoGenInformation__Group_2__1__Impl ;
    public final void rule__VideoGenInformation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:922:1: ( rule__VideoGenInformation__Group_2__1__Impl )
            // InternalVideoGen.g:923:2: rule__VideoGenInformation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_2__1__Impl();

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
    // $ANTLR end "rule__VideoGenInformation__Group_2__1"


    // $ANTLR start "rule__VideoGenInformation__Group_2__1__Impl"
    // InternalVideoGen.g:929:1: rule__VideoGenInformation__Group_2__1__Impl : ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) ) ;
    public final void rule__VideoGenInformation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:933:1: ( ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) ) )
            // InternalVideoGen.g:934:1: ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) )
            {
            // InternalVideoGen.g:934:1: ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) )
            // InternalVideoGen.g:935:2: ( rule__VideoGenInformation__VersionAssignment_2_1 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getVersionAssignment_2_1()); 
            // InternalVideoGen.g:936:2: ( rule__VideoGenInformation__VersionAssignment_2_1 )
            // InternalVideoGen.g:936:3: rule__VideoGenInformation__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getVersionAssignment_2_1()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group_2__1__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_3__0"
    // InternalVideoGen.g:945:1: rule__VideoGenInformation__Group_3__0 : rule__VideoGenInformation__Group_3__0__Impl rule__VideoGenInformation__Group_3__1 ;
    public final void rule__VideoGenInformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:949:1: ( rule__VideoGenInformation__Group_3__0__Impl rule__VideoGenInformation__Group_3__1 )
            // InternalVideoGen.g:950:2: rule__VideoGenInformation__Group_3__0__Impl rule__VideoGenInformation__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoGenInformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_3__1();

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
    // $ANTLR end "rule__VideoGenInformation__Group_3__0"


    // $ANTLR start "rule__VideoGenInformation__Group_3__0__Impl"
    // InternalVideoGen.g:957:1: rule__VideoGenInformation__Group_3__0__Impl : ( '@creation' ) ;
    public final void rule__VideoGenInformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:961:1: ( ( '@creation' ) )
            // InternalVideoGen.g:962:1: ( '@creation' )
            {
            // InternalVideoGen.g:962:1: ( '@creation' )
            // InternalVideoGen.g:963:2: '@creation'
            {
             before(grammarAccess.getVideoGenInformationAccess().getCreationKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getCreationKeyword_3_0()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group_3__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_3__1"
    // InternalVideoGen.g:972:1: rule__VideoGenInformation__Group_3__1 : rule__VideoGenInformation__Group_3__1__Impl ;
    public final void rule__VideoGenInformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:976:1: ( rule__VideoGenInformation__Group_3__1__Impl )
            // InternalVideoGen.g:977:2: rule__VideoGenInformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_3__1__Impl();

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
    // $ANTLR end "rule__VideoGenInformation__Group_3__1"


    // $ANTLR start "rule__VideoGenInformation__Group_3__1__Impl"
    // InternalVideoGen.g:983:1: rule__VideoGenInformation__Group_3__1__Impl : ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) ) ;
    public final void rule__VideoGenInformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:987:1: ( ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) ) )
            // InternalVideoGen.g:988:1: ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) )
            {
            // InternalVideoGen.g:988:1: ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) )
            // InternalVideoGen.g:989:2: ( rule__VideoGenInformation__CreationDateAssignment_3_1 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getCreationDateAssignment_3_1()); 
            // InternalVideoGen.g:990:2: ( rule__VideoGenInformation__CreationDateAssignment_3_1 )
            // InternalVideoGen.g:990:3: rule__VideoGenInformation__CreationDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__CreationDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getCreationDateAssignment_3_1()); 

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
    // $ANTLR end "rule__VideoGenInformation__Group_3__1__Impl"


    // $ANTLR start "rule__MandatoryMedia__Group__0"
    // InternalVideoGen.g:999:1: rule__MandatoryMedia__Group__0 : rule__MandatoryMedia__Group__0__Impl rule__MandatoryMedia__Group__1 ;
    public final void rule__MandatoryMedia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1003:1: ( rule__MandatoryMedia__Group__0__Impl rule__MandatoryMedia__Group__1 )
            // InternalVideoGen.g:1004:2: rule__MandatoryMedia__Group__0__Impl rule__MandatoryMedia__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MandatoryMedia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MandatoryMedia__Group__1();

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
    // $ANTLR end "rule__MandatoryMedia__Group__0"


    // $ANTLR start "rule__MandatoryMedia__Group__0__Impl"
    // InternalVideoGen.g:1011:1: rule__MandatoryMedia__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryMedia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1015:1: ( ( 'mandatory' ) )
            // InternalVideoGen.g:1016:1: ( 'mandatory' )
            {
            // InternalVideoGen.g:1016:1: ( 'mandatory' )
            // InternalVideoGen.g:1017:2: 'mandatory'
            {
             before(grammarAccess.getMandatoryMediaAccess().getMandatoryKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMandatoryMediaAccess().getMandatoryKeyword_0()); 

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
    // $ANTLR end "rule__MandatoryMedia__Group__0__Impl"


    // $ANTLR start "rule__MandatoryMedia__Group__1"
    // InternalVideoGen.g:1026:1: rule__MandatoryMedia__Group__1 : rule__MandatoryMedia__Group__1__Impl ;
    public final void rule__MandatoryMedia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1030:1: ( rule__MandatoryMedia__Group__1__Impl )
            // InternalVideoGen.g:1031:2: rule__MandatoryMedia__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryMedia__Group__1__Impl();

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
    // $ANTLR end "rule__MandatoryMedia__Group__1"


    // $ANTLR start "rule__MandatoryMedia__Group__1__Impl"
    // InternalVideoGen.g:1037:1: rule__MandatoryMedia__Group__1__Impl : ( ( rule__MandatoryMedia__DescriptionAssignment_1 ) ) ;
    public final void rule__MandatoryMedia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1041:1: ( ( ( rule__MandatoryMedia__DescriptionAssignment_1 ) ) )
            // InternalVideoGen.g:1042:1: ( ( rule__MandatoryMedia__DescriptionAssignment_1 ) )
            {
            // InternalVideoGen.g:1042:1: ( ( rule__MandatoryMedia__DescriptionAssignment_1 ) )
            // InternalVideoGen.g:1043:2: ( rule__MandatoryMedia__DescriptionAssignment_1 )
            {
             before(grammarAccess.getMandatoryMediaAccess().getDescriptionAssignment_1()); 
            // InternalVideoGen.g:1044:2: ( rule__MandatoryMedia__DescriptionAssignment_1 )
            // InternalVideoGen.g:1044:3: rule__MandatoryMedia__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryMedia__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryMediaAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__MandatoryMedia__Group__1__Impl"


    // $ANTLR start "rule__OptionalMedia__Group__0"
    // InternalVideoGen.g:1053:1: rule__OptionalMedia__Group__0 : rule__OptionalMedia__Group__0__Impl rule__OptionalMedia__Group__1 ;
    public final void rule__OptionalMedia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1057:1: ( rule__OptionalMedia__Group__0__Impl rule__OptionalMedia__Group__1 )
            // InternalVideoGen.g:1058:2: rule__OptionalMedia__Group__0__Impl rule__OptionalMedia__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__OptionalMedia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalMedia__Group__1();

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
    // $ANTLR end "rule__OptionalMedia__Group__0"


    // $ANTLR start "rule__OptionalMedia__Group__0__Impl"
    // InternalVideoGen.g:1065:1: rule__OptionalMedia__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalMedia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1069:1: ( ( 'optional' ) )
            // InternalVideoGen.g:1070:1: ( 'optional' )
            {
            // InternalVideoGen.g:1070:1: ( 'optional' )
            // InternalVideoGen.g:1071:2: 'optional'
            {
             before(grammarAccess.getOptionalMediaAccess().getOptionalKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOptionalMediaAccess().getOptionalKeyword_0()); 

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
    // $ANTLR end "rule__OptionalMedia__Group__0__Impl"


    // $ANTLR start "rule__OptionalMedia__Group__1"
    // InternalVideoGen.g:1080:1: rule__OptionalMedia__Group__1 : rule__OptionalMedia__Group__1__Impl ;
    public final void rule__OptionalMedia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1084:1: ( rule__OptionalMedia__Group__1__Impl )
            // InternalVideoGen.g:1085:2: rule__OptionalMedia__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalMedia__Group__1__Impl();

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
    // $ANTLR end "rule__OptionalMedia__Group__1"


    // $ANTLR start "rule__OptionalMedia__Group__1__Impl"
    // InternalVideoGen.g:1091:1: rule__OptionalMedia__Group__1__Impl : ( ( rule__OptionalMedia__DescriptionAssignment_1 ) ) ;
    public final void rule__OptionalMedia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1095:1: ( ( ( rule__OptionalMedia__DescriptionAssignment_1 ) ) )
            // InternalVideoGen.g:1096:1: ( ( rule__OptionalMedia__DescriptionAssignment_1 ) )
            {
            // InternalVideoGen.g:1096:1: ( ( rule__OptionalMedia__DescriptionAssignment_1 ) )
            // InternalVideoGen.g:1097:2: ( rule__OptionalMedia__DescriptionAssignment_1 )
            {
             before(grammarAccess.getOptionalMediaAccess().getDescriptionAssignment_1()); 
            // InternalVideoGen.g:1098:2: ( rule__OptionalMedia__DescriptionAssignment_1 )
            // InternalVideoGen.g:1098:3: rule__OptionalMedia__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OptionalMedia__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalMediaAccess().getDescriptionAssignment_1()); 

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
    // $ANTLR end "rule__OptionalMedia__Group__1__Impl"


    // $ANTLR start "rule__AlternativesMedia__Group__0"
    // InternalVideoGen.g:1107:1: rule__AlternativesMedia__Group__0 : rule__AlternativesMedia__Group__0__Impl rule__AlternativesMedia__Group__1 ;
    public final void rule__AlternativesMedia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1111:1: ( rule__AlternativesMedia__Group__0__Impl rule__AlternativesMedia__Group__1 )
            // InternalVideoGen.g:1112:2: rule__AlternativesMedia__Group__0__Impl rule__AlternativesMedia__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AlternativesMedia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativesMedia__Group__1();

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
    // $ANTLR end "rule__AlternativesMedia__Group__0"


    // $ANTLR start "rule__AlternativesMedia__Group__0__Impl"
    // InternalVideoGen.g:1119:1: rule__AlternativesMedia__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__AlternativesMedia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1123:1: ( ( 'alternatives' ) )
            // InternalVideoGen.g:1124:1: ( 'alternatives' )
            {
            // InternalVideoGen.g:1124:1: ( 'alternatives' )
            // InternalVideoGen.g:1125:2: 'alternatives'
            {
             before(grammarAccess.getAlternativesMediaAccess().getAlternativesKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAlternativesMediaAccess().getAlternativesKeyword_0()); 

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
    // $ANTLR end "rule__AlternativesMedia__Group__0__Impl"


    // $ANTLR start "rule__AlternativesMedia__Group__1"
    // InternalVideoGen.g:1134:1: rule__AlternativesMedia__Group__1 : rule__AlternativesMedia__Group__1__Impl rule__AlternativesMedia__Group__2 ;
    public final void rule__AlternativesMedia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1138:1: ( rule__AlternativesMedia__Group__1__Impl rule__AlternativesMedia__Group__2 )
            // InternalVideoGen.g:1139:2: rule__AlternativesMedia__Group__1__Impl rule__AlternativesMedia__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AlternativesMedia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativesMedia__Group__2();

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
    // $ANTLR end "rule__AlternativesMedia__Group__1"


    // $ANTLR start "rule__AlternativesMedia__Group__1__Impl"
    // InternalVideoGen.g:1146:1: rule__AlternativesMedia__Group__1__Impl : ( ( rule__AlternativesMedia__IdAssignment_1 )? ) ;
    public final void rule__AlternativesMedia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1150:1: ( ( ( rule__AlternativesMedia__IdAssignment_1 )? ) )
            // InternalVideoGen.g:1151:1: ( ( rule__AlternativesMedia__IdAssignment_1 )? )
            {
            // InternalVideoGen.g:1151:1: ( ( rule__AlternativesMedia__IdAssignment_1 )? )
            // InternalVideoGen.g:1152:2: ( rule__AlternativesMedia__IdAssignment_1 )?
            {
             before(grammarAccess.getAlternativesMediaAccess().getIdAssignment_1()); 
            // InternalVideoGen.g:1153:2: ( rule__AlternativesMedia__IdAssignment_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:1153:3: rule__AlternativesMedia__IdAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlternativesMedia__IdAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativesMediaAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__AlternativesMedia__Group__1__Impl"


    // $ANTLR start "rule__AlternativesMedia__Group__2"
    // InternalVideoGen.g:1161:1: rule__AlternativesMedia__Group__2 : rule__AlternativesMedia__Group__2__Impl rule__AlternativesMedia__Group__3 ;
    public final void rule__AlternativesMedia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1165:1: ( rule__AlternativesMedia__Group__2__Impl rule__AlternativesMedia__Group__3 )
            // InternalVideoGen.g:1166:2: rule__AlternativesMedia__Group__2__Impl rule__AlternativesMedia__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AlternativesMedia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativesMedia__Group__3();

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
    // $ANTLR end "rule__AlternativesMedia__Group__2"


    // $ANTLR start "rule__AlternativesMedia__Group__2__Impl"
    // InternalVideoGen.g:1173:1: rule__AlternativesMedia__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__AlternativesMedia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1177:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:1178:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:1178:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:1179:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativesMediaAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAlternativesMediaAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__AlternativesMedia__Group__2__Impl"


    // $ANTLR start "rule__AlternativesMedia__Group__3"
    // InternalVideoGen.g:1188:1: rule__AlternativesMedia__Group__3 : rule__AlternativesMedia__Group__3__Impl rule__AlternativesMedia__Group__4 ;
    public final void rule__AlternativesMedia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1192:1: ( rule__AlternativesMedia__Group__3__Impl rule__AlternativesMedia__Group__4 )
            // InternalVideoGen.g:1193:2: rule__AlternativesMedia__Group__3__Impl rule__AlternativesMedia__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AlternativesMedia__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativesMedia__Group__4();

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
    // $ANTLR end "rule__AlternativesMedia__Group__3"


    // $ANTLR start "rule__AlternativesMedia__Group__3__Impl"
    // InternalVideoGen.g:1200:1: rule__AlternativesMedia__Group__3__Impl : ( ( ( rule__AlternativesMedia__MediasAssignment_3 ) ) ( ( rule__AlternativesMedia__MediasAssignment_3 )* ) ) ;
    public final void rule__AlternativesMedia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1204:1: ( ( ( ( rule__AlternativesMedia__MediasAssignment_3 ) ) ( ( rule__AlternativesMedia__MediasAssignment_3 )* ) ) )
            // InternalVideoGen.g:1205:1: ( ( ( rule__AlternativesMedia__MediasAssignment_3 ) ) ( ( rule__AlternativesMedia__MediasAssignment_3 )* ) )
            {
            // InternalVideoGen.g:1205:1: ( ( ( rule__AlternativesMedia__MediasAssignment_3 ) ) ( ( rule__AlternativesMedia__MediasAssignment_3 )* ) )
            // InternalVideoGen.g:1206:2: ( ( rule__AlternativesMedia__MediasAssignment_3 ) ) ( ( rule__AlternativesMedia__MediasAssignment_3 )* )
            {
            // InternalVideoGen.g:1206:2: ( ( rule__AlternativesMedia__MediasAssignment_3 ) )
            // InternalVideoGen.g:1207:3: ( rule__AlternativesMedia__MediasAssignment_3 )
            {
             before(grammarAccess.getAlternativesMediaAccess().getMediasAssignment_3()); 
            // InternalVideoGen.g:1208:3: ( rule__AlternativesMedia__MediasAssignment_3 )
            // InternalVideoGen.g:1208:4: rule__AlternativesMedia__MediasAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__AlternativesMedia__MediasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesMediaAccess().getMediasAssignment_3()); 

            }

            // InternalVideoGen.g:1211:2: ( ( rule__AlternativesMedia__MediasAssignment_3 )* )
            // InternalVideoGen.g:1212:3: ( rule__AlternativesMedia__MediasAssignment_3 )*
            {
             before(grammarAccess.getAlternativesMediaAccess().getMediasAssignment_3()); 
            // InternalVideoGen.g:1213:3: ( rule__AlternativesMedia__MediasAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27||LA11_0==30) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalVideoGen.g:1213:4: rule__AlternativesMedia__MediasAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AlternativesMedia__MediasAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAlternativesMediaAccess().getMediasAssignment_3()); 

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
    // $ANTLR end "rule__AlternativesMedia__Group__3__Impl"


    // $ANTLR start "rule__AlternativesMedia__Group__4"
    // InternalVideoGen.g:1222:1: rule__AlternativesMedia__Group__4 : rule__AlternativesMedia__Group__4__Impl ;
    public final void rule__AlternativesMedia__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1226:1: ( rule__AlternativesMedia__Group__4__Impl )
            // InternalVideoGen.g:1227:2: rule__AlternativesMedia__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlternativesMedia__Group__4__Impl();

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
    // $ANTLR end "rule__AlternativesMedia__Group__4"


    // $ANTLR start "rule__AlternativesMedia__Group__4__Impl"
    // InternalVideoGen.g:1233:1: rule__AlternativesMedia__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__AlternativesMedia__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1237:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1238:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1238:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1239:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativesMediaAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAlternativesMediaAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

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
    // $ANTLR end "rule__AlternativesMedia__Group__4__Impl"


    // $ANTLR start "rule__ImageDescription__Group__0"
    // InternalVideoGen.g:1249:1: rule__ImageDescription__Group__0 : rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1 ;
    public final void rule__ImageDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1253:1: ( rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1 )
            // InternalVideoGen.g:1254:2: rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ImageDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__1();

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
    // $ANTLR end "rule__ImageDescription__Group__0"


    // $ANTLR start "rule__ImageDescription__Group__0__Impl"
    // InternalVideoGen.g:1261:1: rule__ImageDescription__Group__0__Impl : ( 'image' ) ;
    public final void rule__ImageDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1265:1: ( ( 'image' ) )
            // InternalVideoGen.g:1266:1: ( 'image' )
            {
            // InternalVideoGen.g:1266:1: ( 'image' )
            // InternalVideoGen.g:1267:2: 'image'
            {
             before(grammarAccess.getImageDescriptionAccess().getImageKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getImageKeyword_0()); 

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
    // $ANTLR end "rule__ImageDescription__Group__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group__1"
    // InternalVideoGen.g:1276:1: rule__ImageDescription__Group__1 : rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2 ;
    public final void rule__ImageDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1280:1: ( rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2 )
            // InternalVideoGen.g:1281:2: rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ImageDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__2();

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
    // $ANTLR end "rule__ImageDescription__Group__1"


    // $ANTLR start "rule__ImageDescription__Group__1__Impl"
    // InternalVideoGen.g:1288:1: rule__ImageDescription__Group__1__Impl : ( ( rule__ImageDescription__ImageidAssignment_1 )? ) ;
    public final void rule__ImageDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1292:1: ( ( ( rule__ImageDescription__ImageidAssignment_1 )? ) )
            // InternalVideoGen.g:1293:1: ( ( rule__ImageDescription__ImageidAssignment_1 )? )
            {
            // InternalVideoGen.g:1293:1: ( ( rule__ImageDescription__ImageidAssignment_1 )? )
            // InternalVideoGen.g:1294:2: ( rule__ImageDescription__ImageidAssignment_1 )?
            {
             before(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1()); 
            // InternalVideoGen.g:1295:2: ( rule__ImageDescription__ImageidAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoGen.g:1295:3: rule__ImageDescription__ImageidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageDescription__ImageidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1()); 

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
    // $ANTLR end "rule__ImageDescription__Group__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group__2"
    // InternalVideoGen.g:1303:1: rule__ImageDescription__Group__2 : rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3 ;
    public final void rule__ImageDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1307:1: ( rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3 )
            // InternalVideoGen.g:1308:2: rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ImageDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__3();

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
    // $ANTLR end "rule__ImageDescription__Group__2"


    // $ANTLR start "rule__ImageDescription__Group__2__Impl"
    // InternalVideoGen.g:1315:1: rule__ImageDescription__Group__2__Impl : ( ( rule__ImageDescription__LocationAssignment_2 ) ) ;
    public final void rule__ImageDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1319:1: ( ( ( rule__ImageDescription__LocationAssignment_2 ) ) )
            // InternalVideoGen.g:1320:1: ( ( rule__ImageDescription__LocationAssignment_2 ) )
            {
            // InternalVideoGen.g:1320:1: ( ( rule__ImageDescription__LocationAssignment_2 ) )
            // InternalVideoGen.g:1321:2: ( rule__ImageDescription__LocationAssignment_2 )
            {
             before(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2()); 
            // InternalVideoGen.g:1322:2: ( rule__ImageDescription__LocationAssignment_2 )
            // InternalVideoGen.g:1322:3: rule__ImageDescription__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2()); 

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
    // $ANTLR end "rule__ImageDescription__Group__2__Impl"


    // $ANTLR start "rule__ImageDescription__Group__3"
    // InternalVideoGen.g:1330:1: rule__ImageDescription__Group__3 : rule__ImageDescription__Group__3__Impl ;
    public final void rule__ImageDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1334:1: ( rule__ImageDescription__Group__3__Impl )
            // InternalVideoGen.g:1335:2: rule__ImageDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__3__Impl();

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
    // $ANTLR end "rule__ImageDescription__Group__3"


    // $ANTLR start "rule__ImageDescription__Group__3__Impl"
    // InternalVideoGen.g:1341:1: rule__ImageDescription__Group__3__Impl : ( ( rule__ImageDescription__Group_3__0 )? ) ;
    public final void rule__ImageDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1345:1: ( ( ( rule__ImageDescription__Group_3__0 )? ) )
            // InternalVideoGen.g:1346:1: ( ( rule__ImageDescription__Group_3__0 )? )
            {
            // InternalVideoGen.g:1346:1: ( ( rule__ImageDescription__Group_3__0 )? )
            // InternalVideoGen.g:1347:2: ( rule__ImageDescription__Group_3__0 )?
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3()); 
            // InternalVideoGen.g:1348:2: ( rule__ImageDescription__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LEFT_BRACKET) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoGen.g:1348:3: rule__ImageDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ImageDescription__Group__3__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__0"
    // InternalVideoGen.g:1357:1: rule__ImageDescription__Group_3__0 : rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1 ;
    public final void rule__ImageDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1361:1: ( rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1 )
            // InternalVideoGen.g:1362:2: rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ImageDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__1();

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
    // $ANTLR end "rule__ImageDescription__Group_3__0"


    // $ANTLR start "rule__ImageDescription__Group_3__0__Impl"
    // InternalVideoGen.g:1369:1: rule__ImageDescription__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__ImageDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1373:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:1374:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:1374:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:1375:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__1"
    // InternalVideoGen.g:1384:1: rule__ImageDescription__Group_3__1 : rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2 ;
    public final void rule__ImageDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1388:1: ( rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2 )
            // InternalVideoGen.g:1389:2: rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ImageDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__2();

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
    // $ANTLR end "rule__ImageDescription__Group_3__1"


    // $ANTLR start "rule__ImageDescription__Group_3__1__Impl"
    // InternalVideoGen.g:1396:1: rule__ImageDescription__Group_3__1__Impl : ( ( rule__ImageDescription__Group_3_1__0 ) ) ;
    public final void rule__ImageDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1400:1: ( ( ( rule__ImageDescription__Group_3_1__0 ) ) )
            // InternalVideoGen.g:1401:1: ( ( rule__ImageDescription__Group_3_1__0 ) )
            {
            // InternalVideoGen.g:1401:1: ( ( rule__ImageDescription__Group_3_1__0 ) )
            // InternalVideoGen.g:1402:2: ( rule__ImageDescription__Group_3_1__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3_1()); 
            // InternalVideoGen.g:1403:2: ( rule__ImageDescription__Group_3_1__0 )
            // InternalVideoGen.g:1403:3: rule__ImageDescription__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__2"
    // InternalVideoGen.g:1411:1: rule__ImageDescription__Group_3__2 : rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3 ;
    public final void rule__ImageDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1415:1: ( rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3 )
            // InternalVideoGen.g:1416:2: rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__ImageDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__3();

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
    // $ANTLR end "rule__ImageDescription__Group_3__2"


    // $ANTLR start "rule__ImageDescription__Group_3__2__Impl"
    // InternalVideoGen.g:1423:1: rule__ImageDescription__Group_3__2__Impl : ( ( rule__ImageDescription__Group_3_2__0 ) ) ;
    public final void rule__ImageDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1427:1: ( ( ( rule__ImageDescription__Group_3_2__0 ) ) )
            // InternalVideoGen.g:1428:1: ( ( rule__ImageDescription__Group_3_2__0 ) )
            {
            // InternalVideoGen.g:1428:1: ( ( rule__ImageDescription__Group_3_2__0 ) )
            // InternalVideoGen.g:1429:2: ( rule__ImageDescription__Group_3_2__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3_2()); 
            // InternalVideoGen.g:1430:2: ( rule__ImageDescription__Group_3_2__0 )
            // InternalVideoGen.g:1430:3: rule__ImageDescription__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3__2__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__3"
    // InternalVideoGen.g:1438:1: rule__ImageDescription__Group_3__3 : rule__ImageDescription__Group_3__3__Impl ;
    public final void rule__ImageDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1442:1: ( rule__ImageDescription__Group_3__3__Impl )
            // InternalVideoGen.g:1443:2: rule__ImageDescription__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__3__Impl();

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
    // $ANTLR end "rule__ImageDescription__Group_3__3"


    // $ANTLR start "rule__ImageDescription__Group_3__3__Impl"
    // InternalVideoGen.g:1449:1: rule__ImageDescription__Group_3__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__ImageDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1453:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1454:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1454:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1455:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3__3__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_1__0"
    // InternalVideoGen.g:1465:1: rule__ImageDescription__Group_3_1__0 : rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1 ;
    public final void rule__ImageDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1469:1: ( rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1 )
            // InternalVideoGen.g:1470:2: rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ImageDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__1();

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
    // $ANTLR end "rule__ImageDescription__Group_3_1__0"


    // $ANTLR start "rule__ImageDescription__Group_3_1__0__Impl"
    // InternalVideoGen.g:1477:1: rule__ImageDescription__Group_3_1__0__Impl : ( 'toptext' ) ;
    public final void rule__ImageDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1481:1: ( ( 'toptext' ) )
            // InternalVideoGen.g:1482:1: ( 'toptext' )
            {
            // InternalVideoGen.g:1482:1: ( 'toptext' )
            // InternalVideoGen.g:1483:2: 'toptext'
            {
             before(grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_1__1"
    // InternalVideoGen.g:1492:1: rule__ImageDescription__Group_3_1__1 : rule__ImageDescription__Group_3_1__1__Impl ;
    public final void rule__ImageDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1496:1: ( rule__ImageDescription__Group_3_1__1__Impl )
            // InternalVideoGen.g:1497:2: rule__ImageDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__ImageDescription__Group_3_1__1"


    // $ANTLR start "rule__ImageDescription__Group_3_1__1__Impl"
    // InternalVideoGen.g:1503:1: rule__ImageDescription__Group_3_1__1__Impl : ( ( rule__ImageDescription__TopAssignment_3_1_1 ) ) ;
    public final void rule__ImageDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1507:1: ( ( ( rule__ImageDescription__TopAssignment_3_1_1 ) ) )
            // InternalVideoGen.g:1508:1: ( ( rule__ImageDescription__TopAssignment_3_1_1 ) )
            {
            // InternalVideoGen.g:1508:1: ( ( rule__ImageDescription__TopAssignment_3_1_1 ) )
            // InternalVideoGen.g:1509:2: ( rule__ImageDescription__TopAssignment_3_1_1 )
            {
             before(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1()); 
            // InternalVideoGen.g:1510:2: ( rule__ImageDescription__TopAssignment_3_1_1 )
            // InternalVideoGen.g:1510:3: rule__ImageDescription__TopAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__TopAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_2__0"
    // InternalVideoGen.g:1519:1: rule__ImageDescription__Group_3_2__0 : rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1 ;
    public final void rule__ImageDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1523:1: ( rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1 )
            // InternalVideoGen.g:1524:2: rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ImageDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__1();

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
    // $ANTLR end "rule__ImageDescription__Group_3_2__0"


    // $ANTLR start "rule__ImageDescription__Group_3_2__0__Impl"
    // InternalVideoGen.g:1531:1: rule__ImageDescription__Group_3_2__0__Impl : ( 'bottomtext' ) ;
    public final void rule__ImageDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1535:1: ( ( 'bottomtext' ) )
            // InternalVideoGen.g:1536:1: ( 'bottomtext' )
            {
            // InternalVideoGen.g:1536:1: ( 'bottomtext' )
            // InternalVideoGen.g:1537:2: 'bottomtext'
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_2__1"
    // InternalVideoGen.g:1546:1: rule__ImageDescription__Group_3_2__1 : rule__ImageDescription__Group_3_2__1__Impl ;
    public final void rule__ImageDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1550:1: ( rule__ImageDescription__Group_3_2__1__Impl )
            // InternalVideoGen.g:1551:2: rule__ImageDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__ImageDescription__Group_3_2__1"


    // $ANTLR start "rule__ImageDescription__Group_3_2__1__Impl"
    // InternalVideoGen.g:1557:1: rule__ImageDescription__Group_3_2__1__Impl : ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) ) ;
    public final void rule__ImageDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1561:1: ( ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) ) )
            // InternalVideoGen.g:1562:1: ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) )
            {
            // InternalVideoGen.g:1562:1: ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) )
            // InternalVideoGen.g:1563:2: ( rule__ImageDescription__BottomAssignment_3_2_1 )
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1()); 
            // InternalVideoGen.g:1564:2: ( rule__ImageDescription__BottomAssignment_3_2_1 )
            // InternalVideoGen.g:1564:3: rule__ImageDescription__BottomAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__BottomAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1()); 

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
    // $ANTLR end "rule__ImageDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group__0"
    // InternalVideoGen.g:1573:1: rule__VideoDescription__Group__0 : rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1 ;
    public final void rule__VideoDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1577:1: ( rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1 )
            // InternalVideoGen.g:1578:2: rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VideoDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__1();

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
    // $ANTLR end "rule__VideoDescription__Group__0"


    // $ANTLR start "rule__VideoDescription__Group__0__Impl"
    // InternalVideoGen.g:1585:1: rule__VideoDescription__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1589:1: ( ( 'videoseq' ) )
            // InternalVideoGen.g:1590:1: ( 'videoseq' )
            {
            // InternalVideoGen.g:1590:1: ( 'videoseq' )
            // InternalVideoGen.g:1591:2: 'videoseq'
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group__1"
    // InternalVideoGen.g:1600:1: rule__VideoDescription__Group__1 : rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2 ;
    public final void rule__VideoDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1604:1: ( rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2 )
            // InternalVideoGen.g:1605:2: rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VideoDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__2();

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
    // $ANTLR end "rule__VideoDescription__Group__1"


    // $ANTLR start "rule__VideoDescription__Group__1__Impl"
    // InternalVideoGen.g:1612:1: rule__VideoDescription__Group__1__Impl : ( ( rule__VideoDescription__VideoidAssignment_1 )? ) ;
    public final void rule__VideoDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1616:1: ( ( ( rule__VideoDescription__VideoidAssignment_1 )? ) )
            // InternalVideoGen.g:1617:1: ( ( rule__VideoDescription__VideoidAssignment_1 )? )
            {
            // InternalVideoGen.g:1617:1: ( ( rule__VideoDescription__VideoidAssignment_1 )? )
            // InternalVideoGen.g:1618:2: ( rule__VideoDescription__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1()); 
            // InternalVideoGen.g:1619:2: ( rule__VideoDescription__VideoidAssignment_1 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoGen.g:1619:3: rule__VideoDescription__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group__2"
    // InternalVideoGen.g:1627:1: rule__VideoDescription__Group__2 : rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3 ;
    public final void rule__VideoDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1631:1: ( rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3 )
            // InternalVideoGen.g:1632:2: rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__VideoDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__3();

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
    // $ANTLR end "rule__VideoDescription__Group__2"


    // $ANTLR start "rule__VideoDescription__Group__2__Impl"
    // InternalVideoGen.g:1639:1: rule__VideoDescription__Group__2__Impl : ( ( rule__VideoDescription__LocationAssignment_2 ) ) ;
    public final void rule__VideoDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1643:1: ( ( ( rule__VideoDescription__LocationAssignment_2 ) ) )
            // InternalVideoGen.g:1644:1: ( ( rule__VideoDescription__LocationAssignment_2 ) )
            {
            // InternalVideoGen.g:1644:1: ( ( rule__VideoDescription__LocationAssignment_2 ) )
            // InternalVideoGen.g:1645:2: ( rule__VideoDescription__LocationAssignment_2 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2()); 
            // InternalVideoGen.g:1646:2: ( rule__VideoDescription__LocationAssignment_2 )
            // InternalVideoGen.g:1646:3: rule__VideoDescription__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2()); 

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
    // $ANTLR end "rule__VideoDescription__Group__2__Impl"


    // $ANTLR start "rule__VideoDescription__Group__3"
    // InternalVideoGen.g:1654:1: rule__VideoDescription__Group__3 : rule__VideoDescription__Group__3__Impl ;
    public final void rule__VideoDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1658:1: ( rule__VideoDescription__Group__3__Impl )
            // InternalVideoGen.g:1659:2: rule__VideoDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__3__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group__3"


    // $ANTLR start "rule__VideoDescription__Group__3__Impl"
    // InternalVideoGen.g:1665:1: rule__VideoDescription__Group__3__Impl : ( ( rule__VideoDescription__Group_3__0 )? ) ;
    public final void rule__VideoDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1669:1: ( ( ( rule__VideoDescription__Group_3__0 )? ) )
            // InternalVideoGen.g:1670:1: ( ( rule__VideoDescription__Group_3__0 )? )
            {
            // InternalVideoGen.g:1670:1: ( ( rule__VideoDescription__Group_3__0 )? )
            // InternalVideoGen.g:1671:2: ( rule__VideoDescription__Group_3__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3()); 
            // InternalVideoGen.g:1672:2: ( rule__VideoDescription__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LEFT_BRACKET) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVideoGen.g:1672:3: rule__VideoDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__VideoDescription__Group__3__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__0"
    // InternalVideoGen.g:1681:1: rule__VideoDescription__Group_3__0 : rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1 ;
    public final void rule__VideoDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1685:1: ( rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1 )
            // InternalVideoGen.g:1686:2: rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__VideoDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__1();

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
    // $ANTLR end "rule__VideoDescription__Group_3__0"


    // $ANTLR start "rule__VideoDescription__Group_3__0__Impl"
    // InternalVideoGen.g:1693:1: rule__VideoDescription__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1697:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:1698:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:1698:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:1699:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__1"
    // InternalVideoGen.g:1708:1: rule__VideoDescription__Group_3__1 : rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2 ;
    public final void rule__VideoDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1712:1: ( rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2 )
            // InternalVideoGen.g:1713:2: rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__VideoDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__2();

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
    // $ANTLR end "rule__VideoDescription__Group_3__1"


    // $ANTLR start "rule__VideoDescription__Group_3__1__Impl"
    // InternalVideoGen.g:1720:1: rule__VideoDescription__Group_3__1__Impl : ( ( rule__VideoDescription__Group_3_1__0 )? ) ;
    public final void rule__VideoDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1724:1: ( ( ( rule__VideoDescription__Group_3_1__0 )? ) )
            // InternalVideoGen.g:1725:1: ( ( rule__VideoDescription__Group_3_1__0 )? )
            {
            // InternalVideoGen.g:1725:1: ( ( rule__VideoDescription__Group_3_1__0 )? )
            // InternalVideoGen.g:1726:2: ( rule__VideoDescription__Group_3_1__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_1()); 
            // InternalVideoGen.g:1727:2: ( rule__VideoDescription__Group_3_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoGen.g:1727:3: rule__VideoDescription__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__2"
    // InternalVideoGen.g:1735:1: rule__VideoDescription__Group_3__2 : rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3 ;
    public final void rule__VideoDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1739:1: ( rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3 )
            // InternalVideoGen.g:1740:2: rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3
            {
            pushFollow(FOLLOW_17);
            rule__VideoDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__3();

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
    // $ANTLR end "rule__VideoDescription__Group_3__2"


    // $ANTLR start "rule__VideoDescription__Group_3__2__Impl"
    // InternalVideoGen.g:1747:1: rule__VideoDescription__Group_3__2__Impl : ( ( rule__VideoDescription__Group_3_2__0 )? ) ;
    public final void rule__VideoDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1751:1: ( ( ( rule__VideoDescription__Group_3_2__0 )? ) )
            // InternalVideoGen.g:1752:1: ( ( rule__VideoDescription__Group_3_2__0 )? )
            {
            // InternalVideoGen.g:1752:1: ( ( rule__VideoDescription__Group_3_2__0 )? )
            // InternalVideoGen.g:1753:2: ( rule__VideoDescription__Group_3_2__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_2()); 
            // InternalVideoGen.g:1754:2: ( rule__VideoDescription__Group_3_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoGen.g:1754:3: rule__VideoDescription__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__2__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__3"
    // InternalVideoGen.g:1762:1: rule__VideoDescription__Group_3__3 : rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4 ;
    public final void rule__VideoDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1766:1: ( rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4 )
            // InternalVideoGen.g:1767:2: rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4
            {
            pushFollow(FOLLOW_17);
            rule__VideoDescription__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__4();

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
    // $ANTLR end "rule__VideoDescription__Group_3__3"


    // $ANTLR start "rule__VideoDescription__Group_3__3__Impl"
    // InternalVideoGen.g:1774:1: rule__VideoDescription__Group_3__3__Impl : ( ( rule__VideoDescription__Group_3_3__0 )? ) ;
    public final void rule__VideoDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1778:1: ( ( ( rule__VideoDescription__Group_3_3__0 )? ) )
            // InternalVideoGen.g:1779:1: ( ( rule__VideoDescription__Group_3_3__0 )? )
            {
            // InternalVideoGen.g:1779:1: ( ( rule__VideoDescription__Group_3_3__0 )? )
            // InternalVideoGen.g:1780:2: ( rule__VideoDescription__Group_3_3__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_3()); 
            // InternalVideoGen.g:1781:2: ( rule__VideoDescription__Group_3_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVideoGen.g:1781:3: rule__VideoDescription__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__3__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__4"
    // InternalVideoGen.g:1789:1: rule__VideoDescription__Group_3__4 : rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5 ;
    public final void rule__VideoDescription__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1793:1: ( rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5 )
            // InternalVideoGen.g:1794:2: rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5
            {
            pushFollow(FOLLOW_17);
            rule__VideoDescription__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__5();

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
    // $ANTLR end "rule__VideoDescription__Group_3__4"


    // $ANTLR start "rule__VideoDescription__Group_3__4__Impl"
    // InternalVideoGen.g:1801:1: rule__VideoDescription__Group_3__4__Impl : ( ( rule__VideoDescription__Group_3_4__0 )? ) ;
    public final void rule__VideoDescription__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1805:1: ( ( ( rule__VideoDescription__Group_3_4__0 )? ) )
            // InternalVideoGen.g:1806:1: ( ( rule__VideoDescription__Group_3_4__0 )? )
            {
            // InternalVideoGen.g:1806:1: ( ( rule__VideoDescription__Group_3_4__0 )? )
            // InternalVideoGen.g:1807:2: ( rule__VideoDescription__Group_3_4__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_4()); 
            // InternalVideoGen.g:1808:2: ( rule__VideoDescription__Group_3_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoGen.g:1808:3: rule__VideoDescription__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_4()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__4__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__5"
    // InternalVideoGen.g:1816:1: rule__VideoDescription__Group_3__5 : rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6 ;
    public final void rule__VideoDescription__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1820:1: ( rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6 )
            // InternalVideoGen.g:1821:2: rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6
            {
            pushFollow(FOLLOW_17);
            rule__VideoDescription__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__6();

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
    // $ANTLR end "rule__VideoDescription__Group_3__5"


    // $ANTLR start "rule__VideoDescription__Group_3__5__Impl"
    // InternalVideoGen.g:1828:1: rule__VideoDescription__Group_3__5__Impl : ( ( rule__VideoDescription__Group_3_5__0 )? ) ;
    public final void rule__VideoDescription__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1832:1: ( ( ( rule__VideoDescription__Group_3_5__0 )? ) )
            // InternalVideoGen.g:1833:1: ( ( rule__VideoDescription__Group_3_5__0 )? )
            {
            // InternalVideoGen.g:1833:1: ( ( rule__VideoDescription__Group_3_5__0 )? )
            // InternalVideoGen.g:1834:2: ( rule__VideoDescription__Group_3_5__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_5()); 
            // InternalVideoGen.g:1835:2: ( rule__VideoDescription__Group_3_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoGen.g:1835:3: rule__VideoDescription__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_5()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__5__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__6"
    // InternalVideoGen.g:1843:1: rule__VideoDescription__Group_3__6 : rule__VideoDescription__Group_3__6__Impl ;
    public final void rule__VideoDescription__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1847:1: ( rule__VideoDescription__Group_3__6__Impl )
            // InternalVideoGen.g:1848:2: rule__VideoDescription__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__6__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group_3__6"


    // $ANTLR start "rule__VideoDescription__Group_3__6__Impl"
    // InternalVideoGen.g:1854:1: rule__VideoDescription__Group_3__6__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoDescription__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1858:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1859:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1859:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1860:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3__6__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_1__0"
    // InternalVideoGen.g:1870:1: rule__VideoDescription__Group_3_1__0 : rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1 ;
    public final void rule__VideoDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1874:1: ( rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1 )
            // InternalVideoGen.g:1875:2: rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_18);
            rule__VideoDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_1__1();

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
    // $ANTLR end "rule__VideoDescription__Group_3_1__0"


    // $ANTLR start "rule__VideoDescription__Group_3_1__0__Impl"
    // InternalVideoGen.g:1882:1: rule__VideoDescription__Group_3_1__0__Impl : ( 'duration' ) ;
    public final void rule__VideoDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1886:1: ( ( 'duration' ) )
            // InternalVideoGen.g:1887:1: ( 'duration' )
            {
            // InternalVideoGen.g:1887:1: ( 'duration' )
            // InternalVideoGen.g:1888:2: 'duration'
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_1__1"
    // InternalVideoGen.g:1897:1: rule__VideoDescription__Group_3_1__1 : rule__VideoDescription__Group_3_1__1__Impl ;
    public final void rule__VideoDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1901:1: ( rule__VideoDescription__Group_3_1__1__Impl )
            // InternalVideoGen.g:1902:2: rule__VideoDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group_3_1__1"


    // $ANTLR start "rule__VideoDescription__Group_3_1__1__Impl"
    // InternalVideoGen.g:1908:1: rule__VideoDescription__Group_3_1__1__Impl : ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) ) ;
    public final void rule__VideoDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1912:1: ( ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) ) )
            // InternalVideoGen.g:1913:1: ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) )
            {
            // InternalVideoGen.g:1913:1: ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) )
            // InternalVideoGen.g:1914:2: ( rule__VideoDescription__DurationAssignment_3_1_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1()); 
            // InternalVideoGen.g:1915:2: ( rule__VideoDescription__DurationAssignment_3_1_1 )
            // InternalVideoGen.g:1915:3: rule__VideoDescription__DurationAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__DurationAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_2__0"
    // InternalVideoGen.g:1924:1: rule__VideoDescription__Group_3_2__0 : rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1 ;
    public final void rule__VideoDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1928:1: ( rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1 )
            // InternalVideoGen.g:1929:2: rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_18);
            rule__VideoDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_2__1();

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
    // $ANTLR end "rule__VideoDescription__Group_3_2__0"


    // $ANTLR start "rule__VideoDescription__Group_3_2__0__Impl"
    // InternalVideoGen.g:1936:1: rule__VideoDescription__Group_3_2__0__Impl : ( 'probability' ) ;
    public final void rule__VideoDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1940:1: ( ( 'probability' ) )
            // InternalVideoGen.g:1941:1: ( 'probability' )
            {
            // InternalVideoGen.g:1941:1: ( 'probability' )
            // InternalVideoGen.g:1942:2: 'probability'
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_2__1"
    // InternalVideoGen.g:1951:1: rule__VideoDescription__Group_3_2__1 : rule__VideoDescription__Group_3_2__1__Impl ;
    public final void rule__VideoDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1955:1: ( rule__VideoDescription__Group_3_2__1__Impl )
            // InternalVideoGen.g:1956:2: rule__VideoDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group_3_2__1"


    // $ANTLR start "rule__VideoDescription__Group_3_2__1__Impl"
    // InternalVideoGen.g:1962:1: rule__VideoDescription__Group_3_2__1__Impl : ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) ) ;
    public final void rule__VideoDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1966:1: ( ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) ) )
            // InternalVideoGen.g:1967:1: ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) )
            {
            // InternalVideoGen.g:1967:1: ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) )
            // InternalVideoGen.g:1968:2: ( rule__VideoDescription__ProbabilityAssignment_3_2_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1()); 
            // InternalVideoGen.g:1969:2: ( rule__VideoDescription__ProbabilityAssignment_3_2_1 )
            // InternalVideoGen.g:1969:3: rule__VideoDescription__ProbabilityAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__ProbabilityAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_3__0"
    // InternalVideoGen.g:1978:1: rule__VideoDescription__Group_3_3__0 : rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1 ;
    public final void rule__VideoDescription__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1982:1: ( rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1 )
            // InternalVideoGen.g:1983:2: rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoDescription__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_3__1();

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
    // $ANTLR end "rule__VideoDescription__Group_3_3__0"


    // $ANTLR start "rule__VideoDescription__Group_3_3__0__Impl"
    // InternalVideoGen.g:1990:1: rule__VideoDescription__Group_3_3__0__Impl : ( 'description' ) ;
    public final void rule__VideoDescription__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1994:1: ( ( 'description' ) )
            // InternalVideoGen.g:1995:1: ( 'description' )
            {
            // InternalVideoGen.g:1995:1: ( 'description' )
            // InternalVideoGen.g:1996:2: 'description'
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_3__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_3__1"
    // InternalVideoGen.g:2005:1: rule__VideoDescription__Group_3_3__1 : rule__VideoDescription__Group_3_3__1__Impl ;
    public final void rule__VideoDescription__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2009:1: ( rule__VideoDescription__Group_3_3__1__Impl )
            // InternalVideoGen.g:2010:2: rule__VideoDescription__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group_3_3__1"


    // $ANTLR start "rule__VideoDescription__Group_3_3__1__Impl"
    // InternalVideoGen.g:2016:1: rule__VideoDescription__Group_3_3__1__Impl : ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) ) ;
    public final void rule__VideoDescription__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2020:1: ( ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) ) )
            // InternalVideoGen.g:2021:1: ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) )
            {
            // InternalVideoGen.g:2021:1: ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) )
            // InternalVideoGen.g:2022:2: ( rule__VideoDescription__DescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1()); 
            // InternalVideoGen.g:2023:2: ( rule__VideoDescription__DescriptionAssignment_3_3_1 )
            // InternalVideoGen.g:2023:3: rule__VideoDescription__DescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__DescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_3__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_4__0"
    // InternalVideoGen.g:2032:1: rule__VideoDescription__Group_3_4__0 : rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1 ;
    public final void rule__VideoDescription__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2036:1: ( rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1 )
            // InternalVideoGen.g:2037:2: rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_4__1();

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
    // $ANTLR end "rule__VideoDescription__Group_3_4__0"


    // $ANTLR start "rule__VideoDescription__Group_3_4__0__Impl"
    // InternalVideoGen.g:2044:1: rule__VideoDescription__Group_3_4__0__Impl : ( 'filter' ) ;
    public final void rule__VideoDescription__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2048:1: ( ( 'filter' ) )
            // InternalVideoGen.g:2049:1: ( 'filter' )
            {
            // InternalVideoGen.g:2049:1: ( 'filter' )
            // InternalVideoGen.g:2050:2: 'filter'
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_4__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_4__1"
    // InternalVideoGen.g:2059:1: rule__VideoDescription__Group_3_4__1 : rule__VideoDescription__Group_3_4__1__Impl ;
    public final void rule__VideoDescription__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2063:1: ( rule__VideoDescription__Group_3_4__1__Impl )
            // InternalVideoGen.g:2064:2: rule__VideoDescription__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_4__1__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group_3_4__1"


    // $ANTLR start "rule__VideoDescription__Group_3_4__1__Impl"
    // InternalVideoGen.g:2070:1: rule__VideoDescription__Group_3_4__1__Impl : ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) ) ;
    public final void rule__VideoDescription__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2074:1: ( ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) ) )
            // InternalVideoGen.g:2075:1: ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) )
            {
            // InternalVideoGen.g:2075:1: ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) )
            // InternalVideoGen.g:2076:2: ( rule__VideoDescription__FilterAssignment_3_4_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1()); 
            // InternalVideoGen.g:2077:2: ( rule__VideoDescription__FilterAssignment_3_4_1 )
            // InternalVideoGen.g:2077:3: rule__VideoDescription__FilterAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__FilterAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_4__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_5__0"
    // InternalVideoGen.g:2086:1: rule__VideoDescription__Group_3_5__0 : rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1 ;
    public final void rule__VideoDescription__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2090:1: ( rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1 )
            // InternalVideoGen.g:2091:2: rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1
            {
            pushFollow(FOLLOW_4);
            rule__VideoDescription__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_5__1();

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
    // $ANTLR end "rule__VideoDescription__Group_3_5__0"


    // $ANTLR start "rule__VideoDescription__Group_3_5__0__Impl"
    // InternalVideoGen.g:2098:1: rule__VideoDescription__Group_3_5__0__Impl : ( 'text' ) ;
    public final void rule__VideoDescription__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2102:1: ( ( 'text' ) )
            // InternalVideoGen.g:2103:1: ( 'text' )
            {
            // InternalVideoGen.g:2103:1: ( 'text' )
            // InternalVideoGen.g:2104:2: 'text'
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_5__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_5__1"
    // InternalVideoGen.g:2113:1: rule__VideoDescription__Group_3_5__1 : rule__VideoDescription__Group_3_5__1__Impl ;
    public final void rule__VideoDescription__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2117:1: ( rule__VideoDescription__Group_3_5__1__Impl )
            // InternalVideoGen.g:2118:2: rule__VideoDescription__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_5__1__Impl();

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
    // $ANTLR end "rule__VideoDescription__Group_3_5__1"


    // $ANTLR start "rule__VideoDescription__Group_3_5__1__Impl"
    // InternalVideoGen.g:2124:1: rule__VideoDescription__Group_3_5__1__Impl : ( ( rule__VideoDescription__TextAssignment_3_5_1 ) ) ;
    public final void rule__VideoDescription__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2128:1: ( ( ( rule__VideoDescription__TextAssignment_3_5_1 ) ) )
            // InternalVideoGen.g:2129:1: ( ( rule__VideoDescription__TextAssignment_3_5_1 ) )
            {
            // InternalVideoGen.g:2129:1: ( ( rule__VideoDescription__TextAssignment_3_5_1 ) )
            // InternalVideoGen.g:2130:2: ( rule__VideoDescription__TextAssignment_3_5_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1()); 
            // InternalVideoGen.g:2131:2: ( rule__VideoDescription__TextAssignment_3_5_1 )
            // InternalVideoGen.g:2131:3: rule__VideoDescription__TextAssignment_3_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__TextAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1()); 

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
    // $ANTLR end "rule__VideoDescription__Group_3_5__1__Impl"


    // $ANTLR start "rule__VideoText__Group__0"
    // InternalVideoGen.g:2140:1: rule__VideoText__Group__0 : rule__VideoText__Group__0__Impl rule__VideoText__Group__1 ;
    public final void rule__VideoText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2144:1: ( rule__VideoText__Group__0__Impl rule__VideoText__Group__1 )
            // InternalVideoGen.g:2145:2: rule__VideoText__Group__0__Impl rule__VideoText__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__VideoText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__1();

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
    // $ANTLR end "rule__VideoText__Group__0"


    // $ANTLR start "rule__VideoText__Group__0__Impl"
    // InternalVideoGen.g:2152:1: rule__VideoText__Group__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2156:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:2157:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:2157:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:2158:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoTextAccess().getLEFT_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getLEFT_BRACKETTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__VideoText__Group__0__Impl"


    // $ANTLR start "rule__VideoText__Group__1"
    // InternalVideoGen.g:2167:1: rule__VideoText__Group__1 : rule__VideoText__Group__1__Impl rule__VideoText__Group__2 ;
    public final void rule__VideoText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2171:1: ( rule__VideoText__Group__1__Impl rule__VideoText__Group__2 )
            // InternalVideoGen.g:2172:2: rule__VideoText__Group__1__Impl rule__VideoText__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__VideoText__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__2();

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
    // $ANTLR end "rule__VideoText__Group__1"


    // $ANTLR start "rule__VideoText__Group__1__Impl"
    // InternalVideoGen.g:2179:1: rule__VideoText__Group__1__Impl : ( 'content' ) ;
    public final void rule__VideoText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2183:1: ( ( 'content' ) )
            // InternalVideoGen.g:2184:1: ( 'content' )
            {
            // InternalVideoGen.g:2184:1: ( 'content' )
            // InternalVideoGen.g:2185:2: 'content'
            {
             before(grammarAccess.getVideoTextAccess().getContentKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getContentKeyword_1()); 

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
    // $ANTLR end "rule__VideoText__Group__1__Impl"


    // $ANTLR start "rule__VideoText__Group__2"
    // InternalVideoGen.g:2194:1: rule__VideoText__Group__2 : rule__VideoText__Group__2__Impl rule__VideoText__Group__3 ;
    public final void rule__VideoText__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2198:1: ( rule__VideoText__Group__2__Impl rule__VideoText__Group__3 )
            // InternalVideoGen.g:2199:2: rule__VideoText__Group__2__Impl rule__VideoText__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__VideoText__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__3();

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
    // $ANTLR end "rule__VideoText__Group__2"


    // $ANTLR start "rule__VideoText__Group__2__Impl"
    // InternalVideoGen.g:2206:1: rule__VideoText__Group__2__Impl : ( ( rule__VideoText__ContentAssignment_2 ) ) ;
    public final void rule__VideoText__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2210:1: ( ( ( rule__VideoText__ContentAssignment_2 ) ) )
            // InternalVideoGen.g:2211:1: ( ( rule__VideoText__ContentAssignment_2 ) )
            {
            // InternalVideoGen.g:2211:1: ( ( rule__VideoText__ContentAssignment_2 ) )
            // InternalVideoGen.g:2212:2: ( rule__VideoText__ContentAssignment_2 )
            {
             before(grammarAccess.getVideoTextAccess().getContentAssignment_2()); 
            // InternalVideoGen.g:2213:2: ( rule__VideoText__ContentAssignment_2 )
            // InternalVideoGen.g:2213:3: rule__VideoText__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getContentAssignment_2()); 

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
    // $ANTLR end "rule__VideoText__Group__2__Impl"


    // $ANTLR start "rule__VideoText__Group__3"
    // InternalVideoGen.g:2221:1: rule__VideoText__Group__3 : rule__VideoText__Group__3__Impl rule__VideoText__Group__4 ;
    public final void rule__VideoText__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2225:1: ( rule__VideoText__Group__3__Impl rule__VideoText__Group__4 )
            // InternalVideoGen.g:2226:2: rule__VideoText__Group__3__Impl rule__VideoText__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__VideoText__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__4();

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
    // $ANTLR end "rule__VideoText__Group__3"


    // $ANTLR start "rule__VideoText__Group__3__Impl"
    // InternalVideoGen.g:2233:1: rule__VideoText__Group__3__Impl : ( 'position' ) ;
    public final void rule__VideoText__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2237:1: ( ( 'position' ) )
            // InternalVideoGen.g:2238:1: ( 'position' )
            {
            // InternalVideoGen.g:2238:1: ( 'position' )
            // InternalVideoGen.g:2239:2: 'position'
            {
             before(grammarAccess.getVideoTextAccess().getPositionKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getPositionKeyword_3()); 

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
    // $ANTLR end "rule__VideoText__Group__3__Impl"


    // $ANTLR start "rule__VideoText__Group__4"
    // InternalVideoGen.g:2248:1: rule__VideoText__Group__4 : rule__VideoText__Group__4__Impl rule__VideoText__Group__5 ;
    public final void rule__VideoText__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2252:1: ( rule__VideoText__Group__4__Impl rule__VideoText__Group__5 )
            // InternalVideoGen.g:2253:2: rule__VideoText__Group__4__Impl rule__VideoText__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__VideoText__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__5();

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
    // $ANTLR end "rule__VideoText__Group__4"


    // $ANTLR start "rule__VideoText__Group__4__Impl"
    // InternalVideoGen.g:2260:1: rule__VideoText__Group__4__Impl : ( ( rule__VideoText__PositionAssignment_4 ) ) ;
    public final void rule__VideoText__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2264:1: ( ( ( rule__VideoText__PositionAssignment_4 ) ) )
            // InternalVideoGen.g:2265:1: ( ( rule__VideoText__PositionAssignment_4 ) )
            {
            // InternalVideoGen.g:2265:1: ( ( rule__VideoText__PositionAssignment_4 ) )
            // InternalVideoGen.g:2266:2: ( rule__VideoText__PositionAssignment_4 )
            {
             before(grammarAccess.getVideoTextAccess().getPositionAssignment_4()); 
            // InternalVideoGen.g:2267:2: ( rule__VideoText__PositionAssignment_4 )
            // InternalVideoGen.g:2267:3: rule__VideoText__PositionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__PositionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getPositionAssignment_4()); 

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
    // $ANTLR end "rule__VideoText__Group__4__Impl"


    // $ANTLR start "rule__VideoText__Group__5"
    // InternalVideoGen.g:2275:1: rule__VideoText__Group__5 : rule__VideoText__Group__5__Impl rule__VideoText__Group__6 ;
    public final void rule__VideoText__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2279:1: ( rule__VideoText__Group__5__Impl rule__VideoText__Group__6 )
            // InternalVideoGen.g:2280:2: rule__VideoText__Group__5__Impl rule__VideoText__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__VideoText__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__6();

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
    // $ANTLR end "rule__VideoText__Group__5"


    // $ANTLR start "rule__VideoText__Group__5__Impl"
    // InternalVideoGen.g:2287:1: rule__VideoText__Group__5__Impl : ( ( rule__VideoText__Group_5__0 )? ) ;
    public final void rule__VideoText__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2291:1: ( ( ( rule__VideoText__Group_5__0 )? ) )
            // InternalVideoGen.g:2292:1: ( ( rule__VideoText__Group_5__0 )? )
            {
            // InternalVideoGen.g:2292:1: ( ( rule__VideoText__Group_5__0 )? )
            // InternalVideoGen.g:2293:2: ( rule__VideoText__Group_5__0 )?
            {
             before(grammarAccess.getVideoTextAccess().getGroup_5()); 
            // InternalVideoGen.g:2294:2: ( rule__VideoText__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoGen.g:2294:3: rule__VideoText__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoText__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoTextAccess().getGroup_5()); 

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
    // $ANTLR end "rule__VideoText__Group__5__Impl"


    // $ANTLR start "rule__VideoText__Group__6"
    // InternalVideoGen.g:2302:1: rule__VideoText__Group__6 : rule__VideoText__Group__6__Impl rule__VideoText__Group__7 ;
    public final void rule__VideoText__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2306:1: ( rule__VideoText__Group__6__Impl rule__VideoText__Group__7 )
            // InternalVideoGen.g:2307:2: rule__VideoText__Group__6__Impl rule__VideoText__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__VideoText__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group__7();

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
    // $ANTLR end "rule__VideoText__Group__6"


    // $ANTLR start "rule__VideoText__Group__6__Impl"
    // InternalVideoGen.g:2314:1: rule__VideoText__Group__6__Impl : ( ( rule__VideoText__Group_6__0 )? ) ;
    public final void rule__VideoText__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2318:1: ( ( ( rule__VideoText__Group_6__0 )? ) )
            // InternalVideoGen.g:2319:1: ( ( rule__VideoText__Group_6__0 )? )
            {
            // InternalVideoGen.g:2319:1: ( ( rule__VideoText__Group_6__0 )? )
            // InternalVideoGen.g:2320:2: ( rule__VideoText__Group_6__0 )?
            {
             before(grammarAccess.getVideoTextAccess().getGroup_6()); 
            // InternalVideoGen.g:2321:2: ( rule__VideoText__Group_6__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoGen.g:2321:3: rule__VideoText__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoText__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoTextAccess().getGroup_6()); 

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
    // $ANTLR end "rule__VideoText__Group__6__Impl"


    // $ANTLR start "rule__VideoText__Group__7"
    // InternalVideoGen.g:2329:1: rule__VideoText__Group__7 : rule__VideoText__Group__7__Impl ;
    public final void rule__VideoText__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2333:1: ( rule__VideoText__Group__7__Impl )
            // InternalVideoGen.g:2334:2: rule__VideoText__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group__7__Impl();

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
    // $ANTLR end "rule__VideoText__Group__7"


    // $ANTLR start "rule__VideoText__Group__7__Impl"
    // InternalVideoGen.g:2340:1: rule__VideoText__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoText__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2344:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:2345:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:2345:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:2346:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoTextAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 

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
    // $ANTLR end "rule__VideoText__Group__7__Impl"


    // $ANTLR start "rule__VideoText__Group_5__0"
    // InternalVideoGen.g:2356:1: rule__VideoText__Group_5__0 : rule__VideoText__Group_5__0__Impl rule__VideoText__Group_5__1 ;
    public final void rule__VideoText__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2360:1: ( rule__VideoText__Group_5__0__Impl rule__VideoText__Group_5__1 )
            // InternalVideoGen.g:2361:2: rule__VideoText__Group_5__0__Impl rule__VideoText__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoText__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group_5__1();

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
    // $ANTLR end "rule__VideoText__Group_5__0"


    // $ANTLR start "rule__VideoText__Group_5__0__Impl"
    // InternalVideoGen.g:2368:1: rule__VideoText__Group_5__0__Impl : ( 'color' ) ;
    public final void rule__VideoText__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2372:1: ( ( 'color' ) )
            // InternalVideoGen.g:2373:1: ( 'color' )
            {
            // InternalVideoGen.g:2373:1: ( 'color' )
            // InternalVideoGen.g:2374:2: 'color'
            {
             before(grammarAccess.getVideoTextAccess().getColorKeyword_5_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getColorKeyword_5_0()); 

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
    // $ANTLR end "rule__VideoText__Group_5__0__Impl"


    // $ANTLR start "rule__VideoText__Group_5__1"
    // InternalVideoGen.g:2383:1: rule__VideoText__Group_5__1 : rule__VideoText__Group_5__1__Impl ;
    public final void rule__VideoText__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2387:1: ( rule__VideoText__Group_5__1__Impl )
            // InternalVideoGen.g:2388:2: rule__VideoText__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group_5__1__Impl();

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
    // $ANTLR end "rule__VideoText__Group_5__1"


    // $ANTLR start "rule__VideoText__Group_5__1__Impl"
    // InternalVideoGen.g:2394:1: rule__VideoText__Group_5__1__Impl : ( ( rule__VideoText__ColorAssignment_5_1 ) ) ;
    public final void rule__VideoText__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2398:1: ( ( ( rule__VideoText__ColorAssignment_5_1 ) ) )
            // InternalVideoGen.g:2399:1: ( ( rule__VideoText__ColorAssignment_5_1 ) )
            {
            // InternalVideoGen.g:2399:1: ( ( rule__VideoText__ColorAssignment_5_1 ) )
            // InternalVideoGen.g:2400:2: ( rule__VideoText__ColorAssignment_5_1 )
            {
             before(grammarAccess.getVideoTextAccess().getColorAssignment_5_1()); 
            // InternalVideoGen.g:2401:2: ( rule__VideoText__ColorAssignment_5_1 )
            // InternalVideoGen.g:2401:3: rule__VideoText__ColorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__ColorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getColorAssignment_5_1()); 

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
    // $ANTLR end "rule__VideoText__Group_5__1__Impl"


    // $ANTLR start "rule__VideoText__Group_6__0"
    // InternalVideoGen.g:2410:1: rule__VideoText__Group_6__0 : rule__VideoText__Group_6__0__Impl rule__VideoText__Group_6__1 ;
    public final void rule__VideoText__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2414:1: ( rule__VideoText__Group_6__0__Impl rule__VideoText__Group_6__1 )
            // InternalVideoGen.g:2415:2: rule__VideoText__Group_6__0__Impl rule__VideoText__Group_6__1
            {
            pushFollow(FOLLOW_18);
            rule__VideoText__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoText__Group_6__1();

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
    // $ANTLR end "rule__VideoText__Group_6__0"


    // $ANTLR start "rule__VideoText__Group_6__0__Impl"
    // InternalVideoGen.g:2422:1: rule__VideoText__Group_6__0__Impl : ( 'size' ) ;
    public final void rule__VideoText__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2426:1: ( ( 'size' ) )
            // InternalVideoGen.g:2427:1: ( 'size' )
            {
            // InternalVideoGen.g:2427:1: ( 'size' )
            // InternalVideoGen.g:2428:2: 'size'
            {
             before(grammarAccess.getVideoTextAccess().getSizeKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getSizeKeyword_6_0()); 

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
    // $ANTLR end "rule__VideoText__Group_6__0__Impl"


    // $ANTLR start "rule__VideoText__Group_6__1"
    // InternalVideoGen.g:2437:1: rule__VideoText__Group_6__1 : rule__VideoText__Group_6__1__Impl ;
    public final void rule__VideoText__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2441:1: ( rule__VideoText__Group_6__1__Impl )
            // InternalVideoGen.g:2442:2: rule__VideoText__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__Group_6__1__Impl();

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
    // $ANTLR end "rule__VideoText__Group_6__1"


    // $ANTLR start "rule__VideoText__Group_6__1__Impl"
    // InternalVideoGen.g:2448:1: rule__VideoText__Group_6__1__Impl : ( ( rule__VideoText__SizeAssignment_6_1 ) ) ;
    public final void rule__VideoText__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2452:1: ( ( ( rule__VideoText__SizeAssignment_6_1 ) ) )
            // InternalVideoGen.g:2453:1: ( ( rule__VideoText__SizeAssignment_6_1 ) )
            {
            // InternalVideoGen.g:2453:1: ( ( rule__VideoText__SizeAssignment_6_1 ) )
            // InternalVideoGen.g:2454:2: ( rule__VideoText__SizeAssignment_6_1 )
            {
             before(grammarAccess.getVideoTextAccess().getSizeAssignment_6_1()); 
            // InternalVideoGen.g:2455:2: ( rule__VideoText__SizeAssignment_6_1 )
            // InternalVideoGen.g:2455:3: rule__VideoText__SizeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoText__SizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoTextAccess().getSizeAssignment_6_1()); 

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
    // $ANTLR end "rule__VideoText__Group_6__1__Impl"


    // $ANTLR start "rule__BlackWhiteFilter__Group__0"
    // InternalVideoGen.g:2464:1: rule__BlackWhiteFilter__Group__0 : rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1 ;
    public final void rule__BlackWhiteFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2468:1: ( rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1 )
            // InternalVideoGen.g:2469:2: rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BlackWhiteFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__1();

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
    // $ANTLR end "rule__BlackWhiteFilter__Group__0"


    // $ANTLR start "rule__BlackWhiteFilter__Group__0__Impl"
    // InternalVideoGen.g:2476:1: rule__BlackWhiteFilter__Group__0__Impl : ( () ) ;
    public final void rule__BlackWhiteFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2480:1: ( ( () ) )
            // InternalVideoGen.g:2481:1: ( () )
            {
            // InternalVideoGen.g:2481:1: ( () )
            // InternalVideoGen.g:2482:2: ()
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0()); 
            // InternalVideoGen.g:2483:2: ()
            // InternalVideoGen.g:2483:3: 
            {
            }

             after(grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__0__Impl"


    // $ANTLR start "rule__BlackWhiteFilter__Group__1"
    // InternalVideoGen.g:2491:1: rule__BlackWhiteFilter__Group__1 : rule__BlackWhiteFilter__Group__1__Impl ;
    public final void rule__BlackWhiteFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2495:1: ( rule__BlackWhiteFilter__Group__1__Impl )
            // InternalVideoGen.g:2496:2: rule__BlackWhiteFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__1__Impl();

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
    // $ANTLR end "rule__BlackWhiteFilter__Group__1"


    // $ANTLR start "rule__BlackWhiteFilter__Group__1__Impl"
    // InternalVideoGen.g:2502:1: rule__BlackWhiteFilter__Group__1__Impl : ( 'b&w' ) ;
    public final void rule__BlackWhiteFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2506:1: ( ( 'b&w' ) )
            // InternalVideoGen.g:2507:1: ( 'b&w' )
            {
            // InternalVideoGen.g:2507:1: ( 'b&w' )
            // InternalVideoGen.g:2508:2: 'b&w'
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1()); 

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
    // $ANTLR end "rule__BlackWhiteFilter__Group__1__Impl"


    // $ANTLR start "rule__NegateFilter__Group__0"
    // InternalVideoGen.g:2518:1: rule__NegateFilter__Group__0 : rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1 ;
    public final void rule__NegateFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2522:1: ( rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1 )
            // InternalVideoGen.g:2523:2: rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__NegateFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__1();

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
    // $ANTLR end "rule__NegateFilter__Group__0"


    // $ANTLR start "rule__NegateFilter__Group__0__Impl"
    // InternalVideoGen.g:2530:1: rule__NegateFilter__Group__0__Impl : ( () ) ;
    public final void rule__NegateFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2534:1: ( ( () ) )
            // InternalVideoGen.g:2535:1: ( () )
            {
            // InternalVideoGen.g:2535:1: ( () )
            // InternalVideoGen.g:2536:2: ()
            {
             before(grammarAccess.getNegateFilterAccess().getNegateFilterAction_0()); 
            // InternalVideoGen.g:2537:2: ()
            // InternalVideoGen.g:2537:3: 
            {
            }

             after(grammarAccess.getNegateFilterAccess().getNegateFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__0__Impl"


    // $ANTLR start "rule__NegateFilter__Group__1"
    // InternalVideoGen.g:2545:1: rule__NegateFilter__Group__1 : rule__NegateFilter__Group__1__Impl ;
    public final void rule__NegateFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2549:1: ( rule__NegateFilter__Group__1__Impl )
            // InternalVideoGen.g:2550:2: rule__NegateFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__1__Impl();

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
    // $ANTLR end "rule__NegateFilter__Group__1"


    // $ANTLR start "rule__NegateFilter__Group__1__Impl"
    // InternalVideoGen.g:2556:1: rule__NegateFilter__Group__1__Impl : ( 'negate' ) ;
    public final void rule__NegateFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2560:1: ( ( 'negate' ) )
            // InternalVideoGen.g:2561:1: ( 'negate' )
            {
            // InternalVideoGen.g:2561:1: ( 'negate' )
            // InternalVideoGen.g:2562:2: 'negate'
            {
             before(grammarAccess.getNegateFilterAccess().getNegateKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getNegateFilterAccess().getNegateKeyword_1()); 

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
    // $ANTLR end "rule__NegateFilter__Group__1__Impl"


    // $ANTLR start "rule__FlipFilter__Group__0"
    // InternalVideoGen.g:2572:1: rule__FlipFilter__Group__0 : rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1 ;
    public final void rule__FlipFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2576:1: ( rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1 )
            // InternalVideoGen.g:2577:2: rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__FlipFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__1();

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
    // $ANTLR end "rule__FlipFilter__Group__0"


    // $ANTLR start "rule__FlipFilter__Group__0__Impl"
    // InternalVideoGen.g:2584:1: rule__FlipFilter__Group__0__Impl : ( 'flip' ) ;
    public final void rule__FlipFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2588:1: ( ( 'flip' ) )
            // InternalVideoGen.g:2589:1: ( 'flip' )
            {
            // InternalVideoGen.g:2589:1: ( 'flip' )
            // InternalVideoGen.g:2590:2: 'flip'
            {
             before(grammarAccess.getFlipFilterAccess().getFlipKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getFlipFilterAccess().getFlipKeyword_0()); 

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
    // $ANTLR end "rule__FlipFilter__Group__0__Impl"


    // $ANTLR start "rule__FlipFilter__Group__1"
    // InternalVideoGen.g:2599:1: rule__FlipFilter__Group__1 : rule__FlipFilter__Group__1__Impl ;
    public final void rule__FlipFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2603:1: ( rule__FlipFilter__Group__1__Impl )
            // InternalVideoGen.g:2604:2: rule__FlipFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__1__Impl();

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
    // $ANTLR end "rule__FlipFilter__Group__1"


    // $ANTLR start "rule__FlipFilter__Group__1__Impl"
    // InternalVideoGen.g:2610:1: rule__FlipFilter__Group__1__Impl : ( ( rule__FlipFilter__OrientationAssignment_1 ) ) ;
    public final void rule__FlipFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2614:1: ( ( ( rule__FlipFilter__OrientationAssignment_1 ) ) )
            // InternalVideoGen.g:2615:1: ( ( rule__FlipFilter__OrientationAssignment_1 ) )
            {
            // InternalVideoGen.g:2615:1: ( ( rule__FlipFilter__OrientationAssignment_1 ) )
            // InternalVideoGen.g:2616:2: ( rule__FlipFilter__OrientationAssignment_1 )
            {
             before(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1()); 
            // InternalVideoGen.g:2617:2: ( rule__FlipFilter__OrientationAssignment_1 )
            // InternalVideoGen.g:2617:3: rule__FlipFilter__OrientationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__OrientationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1()); 

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
    // $ANTLR end "rule__FlipFilter__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalVideoGen.g:2626:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2630:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalVideoGen.g:2631:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

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
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalVideoGen.g:2638:1: rule__DOUBLE__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2642:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:2643:1: ( RULE_INT )
            {
            // InternalVideoGen.g:2643:1: ( RULE_INT )
            // InternalVideoGen.g:2644:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalVideoGen.g:2653:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2657:1: ( rule__DOUBLE__Group__1__Impl )
            // InternalVideoGen.g:2658:2: rule__DOUBLE__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalVideoGen.g:2664:1: rule__DOUBLE__Group__1__Impl : ( ( rule__DOUBLE__Group_1__0 )? ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2668:1: ( ( ( rule__DOUBLE__Group_1__0 )? ) )
            // InternalVideoGen.g:2669:1: ( ( rule__DOUBLE__Group_1__0 )? )
            {
            // InternalVideoGen.g:2669:1: ( ( rule__DOUBLE__Group_1__0 )? )
            // InternalVideoGen.g:2670:2: ( rule__DOUBLE__Group_1__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_1()); 
            // InternalVideoGen.g:2671:2: ( rule__DOUBLE__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoGen.g:2671:3: rule__DOUBLE__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__0"
    // InternalVideoGen.g:2680:1: rule__DOUBLE__Group_1__0 : rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 ;
    public final void rule__DOUBLE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2684:1: ( rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1 )
            // InternalVideoGen.g:2685:2: rule__DOUBLE__Group_1__0__Impl rule__DOUBLE__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__DOUBLE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__1();

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
    // $ANTLR end "rule__DOUBLE__Group_1__0"


    // $ANTLR start "rule__DOUBLE__Group_1__0__Impl"
    // InternalVideoGen.g:2692:1: rule__DOUBLE__Group_1__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2696:1: ( ( '.' ) )
            // InternalVideoGen.g:2697:1: ( '.' )
            {
            // InternalVideoGen.g:2697:1: ( '.' )
            // InternalVideoGen.g:2698:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__DOUBLE__Group_1__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_1__1"
    // InternalVideoGen.g:2707:1: rule__DOUBLE__Group_1__1 : rule__DOUBLE__Group_1__1__Impl ;
    public final void rule__DOUBLE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2711:1: ( rule__DOUBLE__Group_1__1__Impl )
            // InternalVideoGen.g:2712:2: rule__DOUBLE__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_1__1__Impl();

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
    // $ANTLR end "rule__DOUBLE__Group_1__1"


    // $ANTLR start "rule__DOUBLE__Group_1__1__Impl"
    // InternalVideoGen.g:2718:1: rule__DOUBLE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2722:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:2723:1: ( RULE_INT )
            {
            // InternalVideoGen.g:2723:1: ( RULE_INT )
            // InternalVideoGen.g:2724:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__DOUBLE__Group_1__1__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__InformationAssignment_0"
    // InternalVideoGen.g:2734:1: rule__VideoGeneratorModel__InformationAssignment_0 : ( ruleVideoGenInformation ) ;
    public final void rule__VideoGeneratorModel__InformationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2738:1: ( ( ruleVideoGenInformation ) )
            // InternalVideoGen.g:2739:2: ( ruleVideoGenInformation )
            {
            // InternalVideoGen.g:2739:2: ( ruleVideoGenInformation )
            // InternalVideoGen.g:2740:3: ruleVideoGenInformation
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getInformationVideoGenInformationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoGenInformation();

            state._fsp--;

             after(grammarAccess.getVideoGeneratorModelAccess().getInformationVideoGenInformationParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__InformationAssignment_0"


    // $ANTLR start "rule__VideoGeneratorModel__MediasAssignment_3"
    // InternalVideoGen.g:2749:1: rule__VideoGeneratorModel__MediasAssignment_3 : ( ruleMedia ) ;
    public final void rule__VideoGeneratorModel__MediasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2753:1: ( ( ruleMedia ) )
            // InternalVideoGen.g:2754:2: ( ruleMedia )
            {
            // InternalVideoGen.g:2754:2: ( ruleMedia )
            // InternalVideoGen.g:2755:3: ruleMedia
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getMediasMediaParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMedia();

            state._fsp--;

             after(grammarAccess.getVideoGeneratorModelAccess().getMediasMediaParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__VideoGeneratorModel__MediasAssignment_3"


    // $ANTLR start "rule__VideoGenInformation__AuthorNameAssignment_1_1"
    // InternalVideoGen.g:2764:1: rule__VideoGenInformation__AuthorNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__VideoGenInformation__AuthorNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2768:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2769:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2769:2: ( RULE_STRING )
            // InternalVideoGen.g:2770:3: RULE_STRING
            {
             before(grammarAccess.getVideoGenInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__VideoGenInformation__AuthorNameAssignment_1_1"


    // $ANTLR start "rule__VideoGenInformation__VersionAssignment_2_1"
    // InternalVideoGen.g:2779:1: rule__VideoGenInformation__VersionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__VideoGenInformation__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2783:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2784:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2784:2: ( RULE_STRING )
            // InternalVideoGen.g:2785:3: RULE_STRING
            {
             before(grammarAccess.getVideoGenInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VideoGenInformation__VersionAssignment_2_1"


    // $ANTLR start "rule__VideoGenInformation__CreationDateAssignment_3_1"
    // InternalVideoGen.g:2794:1: rule__VideoGenInformation__CreationDateAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__VideoGenInformation__CreationDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2798:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2799:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2799:2: ( RULE_STRING )
            // InternalVideoGen.g:2800:3: RULE_STRING
            {
             before(grammarAccess.getVideoGenInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__VideoGenInformation__CreationDateAssignment_3_1"


    // $ANTLR start "rule__MandatoryMedia__DescriptionAssignment_1"
    // InternalVideoGen.g:2809:1: rule__MandatoryMedia__DescriptionAssignment_1 : ( ruleMediaDescription ) ;
    public final void rule__MandatoryMedia__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2813:1: ( ( ruleMediaDescription ) )
            // InternalVideoGen.g:2814:2: ( ruleMediaDescription )
            {
            // InternalVideoGen.g:2814:2: ( ruleMediaDescription )
            // InternalVideoGen.g:2815:3: ruleMediaDescription
            {
             before(grammarAccess.getMandatoryMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMediaDescription();

            state._fsp--;

             after(grammarAccess.getMandatoryMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MandatoryMedia__DescriptionAssignment_1"


    // $ANTLR start "rule__OptionalMedia__DescriptionAssignment_1"
    // InternalVideoGen.g:2824:1: rule__OptionalMedia__DescriptionAssignment_1 : ( ruleMediaDescription ) ;
    public final void rule__OptionalMedia__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2828:1: ( ( ruleMediaDescription ) )
            // InternalVideoGen.g:2829:2: ( ruleMediaDescription )
            {
            // InternalVideoGen.g:2829:2: ( ruleMediaDescription )
            // InternalVideoGen.g:2830:3: ruleMediaDescription
            {
             before(grammarAccess.getOptionalMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMediaDescription();

            state._fsp--;

             after(grammarAccess.getOptionalMediaAccess().getDescriptionMediaDescriptionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__OptionalMedia__DescriptionAssignment_1"


    // $ANTLR start "rule__AlternativesMedia__IdAssignment_1"
    // InternalVideoGen.g:2839:1: rule__AlternativesMedia__IdAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativesMedia__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2843:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:2844:2: ( RULE_ID )
            {
            // InternalVideoGen.g:2844:2: ( RULE_ID )
            // InternalVideoGen.g:2845:3: RULE_ID
            {
             before(grammarAccess.getAlternativesMediaAccess().getIdIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativesMediaAccess().getIdIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__AlternativesMedia__IdAssignment_1"


    // $ANTLR start "rule__AlternativesMedia__MediasAssignment_3"
    // InternalVideoGen.g:2854:1: rule__AlternativesMedia__MediasAssignment_3 : ( ruleMediaDescription ) ;
    public final void rule__AlternativesMedia__MediasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2858:1: ( ( ruleMediaDescription ) )
            // InternalVideoGen.g:2859:2: ( ruleMediaDescription )
            {
            // InternalVideoGen.g:2859:2: ( ruleMediaDescription )
            // InternalVideoGen.g:2860:3: ruleMediaDescription
            {
             before(grammarAccess.getAlternativesMediaAccess().getMediasMediaDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMediaDescription();

            state._fsp--;

             after(grammarAccess.getAlternativesMediaAccess().getMediasMediaDescriptionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__AlternativesMedia__MediasAssignment_3"


    // $ANTLR start "rule__ImageDescription__ImageidAssignment_1"
    // InternalVideoGen.g:2869:1: rule__ImageDescription__ImageidAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImageDescription__ImageidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2873:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:2874:2: ( RULE_ID )
            {
            // InternalVideoGen.g:2874:2: ( RULE_ID )
            // InternalVideoGen.g:2875:3: RULE_ID
            {
             before(grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ImageDescription__ImageidAssignment_1"


    // $ANTLR start "rule__ImageDescription__LocationAssignment_2"
    // InternalVideoGen.g:2884:1: rule__ImageDescription__LocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2888:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2889:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2889:2: ( RULE_STRING )
            // InternalVideoGen.g:2890:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__ImageDescription__LocationAssignment_2"


    // $ANTLR start "rule__ImageDescription__TopAssignment_3_1_1"
    // InternalVideoGen.g:2899:1: rule__ImageDescription__TopAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__TopAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2903:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2904:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2904:2: ( RULE_STRING )
            // InternalVideoGen.g:2905:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__ImageDescription__TopAssignment_3_1_1"


    // $ANTLR start "rule__ImageDescription__BottomAssignment_3_2_1"
    // InternalVideoGen.g:2914:1: rule__ImageDescription__BottomAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__BottomAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2918:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2919:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2919:2: ( RULE_STRING )
            // InternalVideoGen.g:2920:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__ImageDescription__BottomAssignment_3_2_1"


    // $ANTLR start "rule__VideoDescription__VideoidAssignment_1"
    // InternalVideoGen.g:2929:1: rule__VideoDescription__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoDescription__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2933:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:2934:2: ( RULE_ID )
            {
            // InternalVideoGen.g:2934:2: ( RULE_ID )
            // InternalVideoGen.g:2935:3: RULE_ID
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__VideoidAssignment_1"


    // $ANTLR start "rule__VideoDescription__LocationAssignment_2"
    // InternalVideoGen.g:2944:1: rule__VideoDescription__LocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoDescription__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2948:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2949:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2949:2: ( RULE_STRING )
            // InternalVideoGen.g:2950:3: RULE_STRING
            {
             before(grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__VideoDescription__LocationAssignment_2"


    // $ANTLR start "rule__VideoDescription__DurationAssignment_3_1_1"
    // InternalVideoGen.g:2959:1: rule__VideoDescription__DurationAssignment_3_1_1 : ( ruleDOUBLE ) ;
    public final void rule__VideoDescription__DurationAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2963:1: ( ( ruleDOUBLE ) )
            // InternalVideoGen.g:2964:2: ( ruleDOUBLE )
            {
            // InternalVideoGen.g:2964:2: ( ruleDOUBLE )
            // InternalVideoGen.g:2965:3: ruleDOUBLE
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationDOUBLEParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getDurationDOUBLEParserRuleCall_3_1_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__DurationAssignment_3_1_1"


    // $ANTLR start "rule__VideoDescription__ProbabilityAssignment_3_2_1"
    // InternalVideoGen.g:2974:1: rule__VideoDescription__ProbabilityAssignment_3_2_1 : ( ruleDOUBLE ) ;
    public final void rule__VideoDescription__ProbabilityAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2978:1: ( ( ruleDOUBLE ) )
            // InternalVideoGen.g:2979:2: ( ruleDOUBLE )
            {
            // InternalVideoGen.g:2979:2: ( ruleDOUBLE )
            // InternalVideoGen.g:2980:3: ruleDOUBLE
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityDOUBLEParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getProbabilityDOUBLEParserRuleCall_3_2_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__ProbabilityAssignment_3_2_1"


    // $ANTLR start "rule__VideoDescription__DescriptionAssignment_3_3_1"
    // InternalVideoGen.g:2989:1: rule__VideoDescription__DescriptionAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__VideoDescription__DescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2993:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:2994:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:2994:2: ( RULE_STRING )
            // InternalVideoGen.g:2995:3: RULE_STRING
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__DescriptionAssignment_3_3_1"


    // $ANTLR start "rule__VideoDescription__FilterAssignment_3_4_1"
    // InternalVideoGen.g:3004:1: rule__VideoDescription__FilterAssignment_3_4_1 : ( ruleFilter ) ;
    public final void rule__VideoDescription__FilterAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3008:1: ( ( ruleFilter ) )
            // InternalVideoGen.g:3009:2: ( ruleFilter )
            {
            // InternalVideoGen.g:3009:2: ( ruleFilter )
            // InternalVideoGen.g:3010:3: ruleFilter
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__FilterAssignment_3_4_1"


    // $ANTLR start "rule__VideoDescription__TextAssignment_3_5_1"
    // InternalVideoGen.g:3019:1: rule__VideoDescription__TextAssignment_3_5_1 : ( ruleVideoText ) ;
    public final void rule__VideoDescription__TextAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3023:1: ( ( ruleVideoText ) )
            // InternalVideoGen.g:3024:2: ( ruleVideoText )
            {
            // InternalVideoGen.g:3024:2: ( ruleVideoText )
            // InternalVideoGen.g:3025:3: ruleVideoText
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextVideoTextParserRuleCall_3_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoText();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getTextVideoTextParserRuleCall_3_5_1_0()); 

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
    // $ANTLR end "rule__VideoDescription__TextAssignment_3_5_1"


    // $ANTLR start "rule__VideoText__ContentAssignment_2"
    // InternalVideoGen.g:3034:1: rule__VideoText__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoText__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3038:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3039:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3039:2: ( RULE_STRING )
            // InternalVideoGen.g:3040:3: RULE_STRING
            {
             before(grammarAccess.getVideoTextAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getContentSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__VideoText__ContentAssignment_2"


    // $ANTLR start "rule__VideoText__PositionAssignment_4"
    // InternalVideoGen.g:3049:1: rule__VideoText__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__VideoText__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3053:1: ( ( rulePosition ) )
            // InternalVideoGen.g:3054:2: ( rulePosition )
            {
            // InternalVideoGen.g:3054:2: ( rulePosition )
            // InternalVideoGen.g:3055:3: rulePosition
            {
             before(grammarAccess.getVideoTextAccess().getPositionPositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getVideoTextAccess().getPositionPositionParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__VideoText__PositionAssignment_4"


    // $ANTLR start "rule__VideoText__ColorAssignment_5_1"
    // InternalVideoGen.g:3064:1: rule__VideoText__ColorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__VideoText__ColorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3068:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3069:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3069:2: ( RULE_STRING )
            // InternalVideoGen.g:3070:3: RULE_STRING
            {
             before(grammarAccess.getVideoTextAccess().getColorSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getColorSTRINGTerminalRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__VideoText__ColorAssignment_5_1"


    // $ANTLR start "rule__VideoText__SizeAssignment_6_1"
    // InternalVideoGen.g:3079:1: rule__VideoText__SizeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__VideoText__SizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3083:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:3084:2: ( RULE_INT )
            {
            // InternalVideoGen.g:3084:2: ( RULE_INT )
            // InternalVideoGen.g:3085:3: RULE_INT
            {
             before(grammarAccess.getVideoTextAccess().getSizeINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVideoTextAccess().getSizeINTTerminalRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__VideoText__SizeAssignment_6_1"


    // $ANTLR start "rule__FlipFilter__OrientationAssignment_1"
    // InternalVideoGen.g:3094:1: rule__FlipFilter__OrientationAssignment_1 : ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) ) ;
    public final void rule__FlipFilter__OrientationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3098:1: ( ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) ) )
            // InternalVideoGen.g:3099:2: ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) )
            {
            // InternalVideoGen.g:3099:2: ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) )
            // InternalVideoGen.g:3100:3: ( rule__FlipFilter__OrientationAlternatives_1_0 )
            {
             before(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0()); 
            // InternalVideoGen.g:3101:3: ( rule__FlipFilter__OrientationAlternatives_1_0 )
            // InternalVideoGen.g:3101:4: rule__FlipFilter__OrientationAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__OrientationAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0()); 

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
    // $ANTLR end "rule__FlipFilter__OrientationAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000048000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000F80000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});

}