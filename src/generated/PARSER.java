package generated;// Generated from C:/Users/maher/Desktop/algorithm\PARSER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PARSER extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, UN=2, UT=3, UR=4, TAG_OPEN=5, TAG_CLOSE=6, START=7, CURLYOPEN=8, 
		CURLYCLOSE=9, COLON=10, SINGLE_QUOTE=11, COMMA=12, SEMICOLON=13, HEADER_TAG=14, 
		BODY_TAG=15, CHARS=16, HEADER_SPACE=17, UNH=18, UTH=19, URH=20, HEADER_CURLYOPEN=21, 
		TITLE=22, H_SINGLE_QUOTE=23, H_SEMICOLON=24, H_COMMA=25, URLCONTROL=26, 
		URL=27, H_SIZES=28, H_SIZE=29, H_POSITION=30, H_POS=31, H_POINTS=32, H_COLOR=33, 
		H_COLORS=34, H_CHARS=35, HEADER_CURLYCLOSE=36, B_SPACE=37, UNB=38, UTB=39, 
		URB=40, B_CURLYOPEN=41, B_COMMA=42, TEXT_TAG=43, BUTTON_TAG=44, TI_TAG=45, 
		B_CURLYCLOSE=46, TEXT_SPACE=47, UNT=48, UTT=49, URT=50, TEXT_CURLYOPEN=51, 
		TEXT_COLON=52, TEXT_SINGLE_QUOTE=53, TEXT_COMMA=54, TEXT_SEMICOLON=55, 
		TEXT_COLOR=56, TEXT_COLORS=57, TEXT_CONTENT=58, TEXT_SIZE=59, TEXT_SIZES=60, 
		TEXT_ID=61, TEXT_POSITION=62, TEXT_POS=63, MARGIN_TAG=64, TEXT_CHARS=65, 
		TEXT_CURLYCLOSE=66, MARGIN_SPACE=67, UNM=68, UTM=69, URM=70, MARGIN_CURLYOPEN=71, 
		MARGIN_COLON=72, MARGIN_COMMA=73, MARGIN_SINGLE_QUOTE=74, MARGIN_SEMICOLON=75, 
		MARGIN_LOCATION=76, MARGIN_SIZES=77, MARGIN_CURLYCLOSE=78, BUTTON_SPACE=79, 
		UNBS=80, UTBS=81, URBS=82, BUTTON_POS=83, BUTTON_POSITION=84, BUTTON_CURLYOPEN=85, 
		BUTTON_COLON=86, BUTTON_SINGLE_QUOTE=87, BUTTON_COMMA=88, BUTTON_SEMICOLON=89, 
		BUTTON_WIDTH=90, BUTTON_HEIGHT=91, BUTTON_SIZES=92, BUTTON_COLOR=93, BUTTON_COLORS=94, 
		BUTTON_BACKGROUND=95, BUTTON_ID=96, BUTTON_TEXT=97, BUTTON_MARGIN=98, 
		BUTTON_EVENT=99, BUTTON_CURLYCLOSE=100, BUTTON_CHARS=101, EVENT_SPACE=102, 
		UNE=103, UTE=104, URE=105, EVENT_CURLYOPEN=106, EVENT_COLON=107, EVENT_SINGLE_QUOTE=108, 
		EVENT_COMMA=109, EVENT_SEMICOLON=110, GOTO=111, EVENT_CHARS=112, EVENT_CURLYCLOSE=113, 
		TI_SPACE=114, UNTI=115, UTTI=116, URTI=117, TI_POS=118, TI_POSITION=119, 
		TI_CURLYOPEN=120, TI_COLON=121, TI_SINGLE_QUOTE=122, TI_COMMA=123, TI_SEMICOLON=124, 
		TI_WIDTH=125, TI_HEIGHT=126, TI_SIZES=127, TI_COLOR=128, TI_COLORS=129, 
		TI_BACKGROUND=130, TI_ID=131, TI_MARGIN=132, TEXTHINT=133, TYPE=134, INPUT_TYPE=135, 
		TI_CHARS=136, TI_CURLYCLOSE=137;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_attribute_header = 2, RULE_header_url_control = 3, 
		RULE_headerurl = 4, RULE_headertitle = 5, RULE_headerpos = 6, RULE_headersize = 7, 
		RULE_headercolor = 8, RULE_body = 9, RULE_attribute_body = 10, RULE_text = 11, 
		RULE_textattribute = 12, RULE_textcolor = 13, RULE_textsize = 14, RULE_textpos = 15, 
		RULE_textcontent = 16, RULE_textid = 17, RULE_textmargin = 18, RULE_marginattribute = 19, 
		RULE_button = 20, RULE_buttonattribute = 21, RULE_width = 22, RULE_height = 23, 
		RULE_buttoncolor = 24, RULE_buttonbackground = 25, RULE_textbutton = 26, 
		RULE_buttonid = 27, RULE_event = 28, RULE_eventattribute = 29, RULE_buttonpos = 30, 
		RULE_go_to = 31, RULE_buttonmargin = 32, RULE_buttonmarginattribute = 33, 
		RULE_textinput = 34, RULE_textinputattribute = 35, RULE_textinputwidth = 36, 
		RULE_textinputheight = 37, RULE_textinputcolor = 38, RULE_textinputbackground = 39, 
		RULE_textinputpos = 40, RULE_textinputid = 41, RULE_textinputmargin = 42, 
		RULE_textinputmarginattribute = 43, RULE_type = 44, RULE_text_hint = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "attribute_header", "header_url_control", "headerurl", 
			"headertitle", "headerpos", "headersize", "headercolor", "body", "attribute_body", 
			"text", "textattribute", "textcolor", "textsize", "textpos", "textcontent", 
			"textid", "textmargin", "marginattribute", "button", "buttonattribute", 
			"width", "height", "buttoncolor", "buttonbackground", "textbutton", "buttonid", 
			"event", "eventattribute", "buttonpos", "go_to", "buttonmargin", "buttonmarginattribute", 
			"textinput", "textinputattribute", "textinputwidth", "textinputheight", 
			"textinputcolor", "textinputbackground", "textinputpos", "textinputid", 
			"textinputmargin", "textinputmarginattribute", "type", "text_hint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", "'>'", "'start'", null, null, null, 
			null, null, null, "'header'", "'body'", null, null, null, null, null, 
			null, "'Title'", null, null, null, "'url_control'", "'url'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'Text'", "'Button'", "'TextInput'", null, null, null, null, null, 
			null, null, null, null, null, null, null, "'Content'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'TextButton'", 
			null, "'Event'", null, null, null, null, null, null, null, null, null, 
			null, null, "'go_to'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'TextHint'", "'Type '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "UN", "UT", "UR", "TAG_OPEN", "TAG_CLOSE", "START", "CURLYOPEN", 
			"CURLYCLOSE", "COLON", "SINGLE_QUOTE", "COMMA", "SEMICOLON", "HEADER_TAG", 
			"BODY_TAG", "CHARS", "HEADER_SPACE", "UNH", "UTH", "URH", "HEADER_CURLYOPEN", 
			"TITLE", "H_SINGLE_QUOTE", "H_SEMICOLON", "H_COMMA", "URLCONTROL", "URL", 
			"H_SIZES", "H_SIZE", "H_POSITION", "H_POS", "H_POINTS", "H_COLOR", "H_COLORS", 
			"H_CHARS", "HEADER_CURLYCLOSE", "B_SPACE", "UNB", "UTB", "URB", "B_CURLYOPEN", 
			"B_COMMA", "TEXT_TAG", "BUTTON_TAG", "TI_TAG", "B_CURLYCLOSE", "TEXT_SPACE", 
			"UNT", "UTT", "URT", "TEXT_CURLYOPEN", "TEXT_COLON", "TEXT_SINGLE_QUOTE", 
			"TEXT_COMMA", "TEXT_SEMICOLON", "TEXT_COLOR", "TEXT_COLORS", "TEXT_CONTENT", 
			"TEXT_SIZE", "TEXT_SIZES", "TEXT_ID", "TEXT_POSITION", "TEXT_POS", "MARGIN_TAG", 
			"TEXT_CHARS", "TEXT_CURLYCLOSE", "MARGIN_SPACE", "UNM", "UTM", "URM", 
			"MARGIN_CURLYOPEN", "MARGIN_COLON", "MARGIN_COMMA", "MARGIN_SINGLE_QUOTE", 
			"MARGIN_SEMICOLON", "MARGIN_LOCATION", "MARGIN_SIZES", "MARGIN_CURLYCLOSE", 
			"BUTTON_SPACE", "UNBS", "UTBS", "URBS", "BUTTON_POS", "BUTTON_POSITION", 
			"BUTTON_CURLYOPEN", "BUTTON_COLON", "BUTTON_SINGLE_QUOTE", "BUTTON_COMMA", 
			"BUTTON_SEMICOLON", "BUTTON_WIDTH", "BUTTON_HEIGHT", "BUTTON_SIZES", 
			"BUTTON_COLOR", "BUTTON_COLORS", "BUTTON_BACKGROUND", "BUTTON_ID", "BUTTON_TEXT", 
			"BUTTON_MARGIN", "BUTTON_EVENT", "BUTTON_CURLYCLOSE", "BUTTON_CHARS", 
			"EVENT_SPACE", "UNE", "UTE", "URE", "EVENT_CURLYOPEN", "EVENT_COLON", 
			"EVENT_SINGLE_QUOTE", "EVENT_COMMA", "EVENT_SEMICOLON", "GOTO", "EVENT_CHARS", 
			"EVENT_CURLYCLOSE", "TI_SPACE", "UNTI", "UTTI", "URTI", "TI_POS", "TI_POSITION", 
			"TI_CURLYOPEN", "TI_COLON", "TI_SINGLE_QUOTE", "TI_COMMA", "TI_SEMICOLON", 
			"TI_WIDTH", "TI_HEIGHT", "TI_SIZES", "TI_COLOR", "TI_COLORS", "TI_BACKGROUND", 
			"TI_ID", "TI_MARGIN", "TEXTHINT", "TYPE", "INPUT_TYPE", "TI_CHARS", "TI_CURLYCLOSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PARSER.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PARSER(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode TAG_OPEN() { return getToken(PARSER.TAG_OPEN, 0); }
		public TerminalNode START() { return getToken(PARSER.START, 0); }
		public TerminalNode TAG_CLOSE() { return getToken(PARSER.TAG_CLOSE, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_OPEN) {
				{
				setState(92);
				match(TAG_OPEN);
				setState(93);
				match(START);
				setState(94);
				match(TAG_CLOSE);
				}
			}

			setState(97);
			header();
			setState(98);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER_TAG() { return getToken(PARSER.HEADER_TAG, 0); }
		public TerminalNode HEADER_CURLYOPEN() { return getToken(PARSER.HEADER_CURLYOPEN, 0); }
		public List<Attribute_headerContext> attribute_header() {
			return getRuleContexts(Attribute_headerContext.class);
		}
		public Attribute_headerContext attribute_header(int i) {
			return getRuleContext(Attribute_headerContext.class,i);
		}
		public TerminalNode HEADER_CURLYCLOSE() { return getToken(PARSER.HEADER_CURLYCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSER.SEMICOLON, 0); }
		public List<TerminalNode> H_COMMA() { return getTokens(PARSER.H_COMMA); }
		public TerminalNode H_COMMA(int i) {
			return getToken(PARSER.H_COMMA, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(HEADER_TAG);
			setState(101);
			match(HEADER_CURLYOPEN);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					attribute_header();
					setState(103);
					match(H_COMMA);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(110);
			attribute_header();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==H_COMMA) {
				{
				setState(111);
				match(H_COMMA);
				}
			}

			setState(114);
			match(HEADER_CURLYCLOSE);
			setState(115);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_headerContext extends ParserRuleContext {
		public HeadertitleContext headertitle() {
			return getRuleContext(HeadertitleContext.class,0);
		}
		public HeadercolorContext headercolor() {
			return getRuleContext(HeadercolorContext.class,0);
		}
		public HeadersizeContext headersize() {
			return getRuleContext(HeadersizeContext.class,0);
		}
		public HeaderposContext headerpos() {
			return getRuleContext(HeaderposContext.class,0);
		}
		public HeaderurlContext headerurl() {
			return getRuleContext(HeaderurlContext.class,0);
		}
		public Header_url_controlContext header_url_control() {
			return getRuleContext(Header_url_controlContext.class,0);
		}
		public Attribute_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterAttribute_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitAttribute_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitAttribute_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_headerContext attribute_header() throws RecognitionException {
		Attribute_headerContext _localctx = new Attribute_headerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute_header);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				headertitle();
				}
				break;
			case H_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				headercolor();
				}
				break;
			case H_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				headersize();
				}
				break;
			case H_POS:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				headerpos();
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 5);
				{
				setState(121);
				headerurl();
				}
				break;
			case URLCONTROL:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				header_url_control();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Header_url_controlContext extends ParserRuleContext {
		public TerminalNode URLCONTROL() { return getToken(PARSER.URLCONTROL, 0); }
		public TerminalNode H_POINTS() { return getToken(PARSER.H_POINTS, 0); }
		public List<TerminalNode> H_SINGLE_QUOTE() { return getTokens(PARSER.H_SINGLE_QUOTE); }
		public TerminalNode H_SINGLE_QUOTE(int i) {
			return getToken(PARSER.H_SINGLE_QUOTE, i);
		}
		public TerminalNode H_CHARS() { return getToken(PARSER.H_CHARS, 0); }
		public Header_url_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header_url_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeader_url_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeader_url_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeader_url_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_url_controlContext header_url_control() throws RecognitionException {
		Header_url_controlContext _localctx = new Header_url_controlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header_url_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(URLCONTROL);
			setState(126);
			match(H_POINTS);
			setState(127);
			match(H_SINGLE_QUOTE);
			setState(128);
			match(H_CHARS);
			setState(129);
			match(H_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderurlContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(PARSER.URL, 0); }
		public TerminalNode H_POINTS() { return getToken(PARSER.H_POINTS, 0); }
		public List<TerminalNode> H_SINGLE_QUOTE() { return getTokens(PARSER.H_SINGLE_QUOTE); }
		public TerminalNode H_SINGLE_QUOTE(int i) {
			return getToken(PARSER.H_SINGLE_QUOTE, i);
		}
		public TerminalNode H_CHARS() { return getToken(PARSER.H_CHARS, 0); }
		public HeaderurlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerurl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeaderurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeaderurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeaderurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderurlContext headerurl() throws RecognitionException {
		HeaderurlContext _localctx = new HeaderurlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_headerurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(URL);
			setState(132);
			match(H_POINTS);
			setState(133);
			match(H_SINGLE_QUOTE);
			setState(134);
			match(H_CHARS);
			setState(135);
			match(H_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadertitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(PARSER.TITLE, 0); }
		public TerminalNode H_POINTS() { return getToken(PARSER.H_POINTS, 0); }
		public List<TerminalNode> H_SINGLE_QUOTE() { return getTokens(PARSER.H_SINGLE_QUOTE); }
		public TerminalNode H_SINGLE_QUOTE(int i) {
			return getToken(PARSER.H_SINGLE_QUOTE, i);
		}
		public TerminalNode H_CHARS() { return getToken(PARSER.H_CHARS, 0); }
		public HeadertitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headertitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeadertitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeadertitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeadertitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadertitleContext headertitle() throws RecognitionException {
		HeadertitleContext _localctx = new HeadertitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_headertitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TITLE);
			setState(138);
			match(H_POINTS);
			setState(139);
			match(H_SINGLE_QUOTE);
			setState(140);
			match(H_CHARS);
			setState(141);
			match(H_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderposContext extends ParserRuleContext {
		public TerminalNode H_POS() { return getToken(PARSER.H_POS, 0); }
		public TerminalNode H_POINTS() { return getToken(PARSER.H_POINTS, 0); }
		public TerminalNode H_POSITION() { return getToken(PARSER.H_POSITION, 0); }
		public HeaderposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headerpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeaderpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeaderpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeaderpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderposContext headerpos() throws RecognitionException {
		HeaderposContext _localctx = new HeaderposContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_headerpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(H_POS);
			setState(144);
			match(H_POINTS);
			setState(145);
			match(H_POSITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadersizeContext extends ParserRuleContext {
		public TerminalNode H_SIZE() { return getToken(PARSER.H_SIZE, 0); }
		public TerminalNode H_POINTS() { return getToken(PARSER.H_POINTS, 0); }
		public List<TerminalNode> H_SINGLE_QUOTE() { return getTokens(PARSER.H_SINGLE_QUOTE); }
		public TerminalNode H_SINGLE_QUOTE(int i) {
			return getToken(PARSER.H_SINGLE_QUOTE, i);
		}
		public TerminalNode H_SIZES() { return getToken(PARSER.H_SIZES, 0); }
		public HeadersizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headersize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeadersize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeadersize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeadersize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersizeContext headersize() throws RecognitionException {
		HeadersizeContext _localctx = new HeadersizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headersize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(H_SIZE);
			setState(148);
			match(H_POINTS);
			setState(149);
			match(H_SINGLE_QUOTE);
			setState(150);
			match(H_SIZES);
			setState(151);
			match(H_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadercolorContext extends ParserRuleContext {
		public TerminalNode H_COLOR() { return getToken(PARSER.H_COLOR, 0); }
		public TerminalNode H_POINTS() { return getToken(PARSER.H_POINTS, 0); }
		public List<TerminalNode> H_SINGLE_QUOTE() { return getTokens(PARSER.H_SINGLE_QUOTE); }
		public TerminalNode H_SINGLE_QUOTE(int i) {
			return getToken(PARSER.H_SINGLE_QUOTE, i);
		}
		public TerminalNode H_COLORS() { return getToken(PARSER.H_COLORS, 0); }
		public HeadercolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headercolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeadercolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeadercolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeadercolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadercolorContext headercolor() throws RecognitionException {
		HeadercolorContext _localctx = new HeadercolorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_headercolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(H_COLOR);
			setState(154);
			match(H_POINTS);
			setState(155);
			match(H_SINGLE_QUOTE);
			setState(156);
			match(H_COLORS);
			setState(157);
			match(H_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode BODY_TAG() { return getToken(PARSER.BODY_TAG, 0); }
		public TerminalNode B_CURLYOPEN() { return getToken(PARSER.B_CURLYOPEN, 0); }
		public List<Attribute_bodyContext> attribute_body() {
			return getRuleContexts(Attribute_bodyContext.class);
		}
		public Attribute_bodyContext attribute_body(int i) {
			return getRuleContext(Attribute_bodyContext.class,i);
		}
		public TerminalNode B_CURLYCLOSE() { return getToken(PARSER.B_CURLYCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(PARSER.SEMICOLON, 0); }
		public List<TerminalNode> B_COMMA() { return getTokens(PARSER.B_COMMA); }
		public TerminalNode B_COMMA(int i) {
			return getToken(PARSER.B_COMMA, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(BODY_TAG);
			setState(160);
			match(B_CURLYOPEN);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					attribute_body();
					setState(162);
					match(B_COMMA);
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(169);
			attribute_body();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==B_COMMA) {
				{
				setState(170);
				match(B_COMMA);
				}
			}

			setState(173);
			match(B_CURLYCLOSE);
			setState(174);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_bodyContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TextinputContext textinput() {
			return getRuleContext(TextinputContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public Attribute_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterAttribute_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitAttribute_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitAttribute_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_bodyContext attribute_body() throws RecognitionException {
		Attribute_bodyContext _localctx = new Attribute_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute_body);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				text();
				}
				break;
			case TI_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				textinput();
				}
				break;
			case BUTTON_TAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				button();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT_TAG() { return getToken(PARSER.TEXT_TAG, 0); }
		public TerminalNode TEXT_CURLYOPEN() { return getToken(PARSER.TEXT_CURLYOPEN, 0); }
		public List<TextattributeContext> textattribute() {
			return getRuleContexts(TextattributeContext.class);
		}
		public TextattributeContext textattribute(int i) {
			return getRuleContext(TextattributeContext.class,i);
		}
		public TerminalNode TEXT_CURLYCLOSE() { return getToken(PARSER.TEXT_CURLYCLOSE, 0); }
		public List<TerminalNode> TEXT_COMMA() { return getTokens(PARSER.TEXT_COMMA); }
		public TerminalNode TEXT_COMMA(int i) {
			return getToken(PARSER.TEXT_COMMA, i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(TEXT_TAG);
			setState(182);
			match(TEXT_CURLYOPEN);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					textattribute();
					setState(184);
					match(TEXT_COMMA);
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(191);
			textattribute();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT_COMMA) {
				{
				setState(192);
				match(TEXT_COMMA);
				}
			}

			setState(195);
			match(TEXT_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextattributeContext extends ParserRuleContext {
		public TextcolorContext textcolor() {
			return getRuleContext(TextcolorContext.class,0);
		}
		public TextsizeContext textsize() {
			return getRuleContext(TextsizeContext.class,0);
		}
		public TextposContext textpos() {
			return getRuleContext(TextposContext.class,0);
		}
		public TextcontentContext textcontent() {
			return getRuleContext(TextcontentContext.class,0);
		}
		public TextmarginContext textmargin() {
			return getRuleContext(TextmarginContext.class,0);
		}
		public TextidContext textid() {
			return getRuleContext(TextidContext.class,0);
		}
		public TextattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextattributeContext textattribute() throws RecognitionException {
		TextattributeContext _localctx = new TextattributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textattribute);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				textcolor();
				}
				break;
			case TEXT_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				textsize();
				}
				break;
			case TEXT_POS:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				textpos();
				}
				break;
			case TEXT_CONTENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				textcontent();
				}
				break;
			case MARGIN_TAG:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				textmargin();
				}
				break;
			case TEXT_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				textid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextcolorContext extends ParserRuleContext {
		public TerminalNode TEXT_COLOR() { return getToken(PARSER.TEXT_COLOR, 0); }
		public TerminalNode TEXT_COLON() { return getToken(PARSER.TEXT_COLON, 0); }
		public List<TerminalNode> TEXT_SINGLE_QUOTE() { return getTokens(PARSER.TEXT_SINGLE_QUOTE); }
		public TerminalNode TEXT_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TEXT_SINGLE_QUOTE, i);
		}
		public TerminalNode TEXT_COLORS() { return getToken(PARSER.TEXT_COLORS, 0); }
		public TextcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextcolorContext textcolor() throws RecognitionException {
		TextcolorContext _localctx = new TextcolorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_textcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(TEXT_COLOR);
			setState(206);
			match(TEXT_COLON);
			setState(207);
			match(TEXT_SINGLE_QUOTE);
			setState(208);
			match(TEXT_COLORS);
			setState(209);
			match(TEXT_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextsizeContext extends ParserRuleContext {
		public TerminalNode TEXT_SIZE() { return getToken(PARSER.TEXT_SIZE, 0); }
		public TerminalNode TEXT_COLON() { return getToken(PARSER.TEXT_COLON, 0); }
		public List<TerminalNode> TEXT_SINGLE_QUOTE() { return getTokens(PARSER.TEXT_SINGLE_QUOTE); }
		public TerminalNode TEXT_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TEXT_SINGLE_QUOTE, i);
		}
		public TerminalNode TEXT_SIZES() { return getToken(PARSER.TEXT_SIZES, 0); }
		public TextsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextsize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextsizeContext textsize() throws RecognitionException {
		TextsizeContext _localctx = new TextsizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_textsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TEXT_SIZE);
			setState(212);
			match(TEXT_COLON);
			setState(213);
			match(TEXT_SINGLE_QUOTE);
			setState(214);
			match(TEXT_SIZES);
			setState(215);
			match(TEXT_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextposContext extends ParserRuleContext {
		public TerminalNode TEXT_POS() { return getToken(PARSER.TEXT_POS, 0); }
		public TerminalNode TEXT_COLON() { return getToken(PARSER.TEXT_COLON, 0); }
		public TerminalNode TEXT_POSITION() { return getToken(PARSER.TEXT_POSITION, 0); }
		public TextposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextposContext textpos() throws RecognitionException {
		TextposContext _localctx = new TextposContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TEXT_POS);
			setState(218);
			match(TEXT_COLON);
			setState(219);
			match(TEXT_POSITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextcontentContext extends ParserRuleContext {
		public TerminalNode TEXT_CONTENT() { return getToken(PARSER.TEXT_CONTENT, 0); }
		public TerminalNode TEXT_COLON() { return getToken(PARSER.TEXT_COLON, 0); }
		public List<TerminalNode> TEXT_SINGLE_QUOTE() { return getTokens(PARSER.TEXT_SINGLE_QUOTE); }
		public TerminalNode TEXT_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TEXT_SINGLE_QUOTE, i);
		}
		public TerminalNode TEXT_CHARS() { return getToken(PARSER.TEXT_CHARS, 0); }
		public TextcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextcontentContext textcontent() throws RecognitionException {
		TextcontentContext _localctx = new TextcontentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textcontent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(TEXT_CONTENT);
			setState(222);
			match(TEXT_COLON);
			setState(223);
			match(TEXT_SINGLE_QUOTE);
			setState(224);
			match(TEXT_CHARS);
			setState(225);
			match(TEXT_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextidContext extends ParserRuleContext {
		public TerminalNode TEXT_ID() { return getToken(PARSER.TEXT_ID, 0); }
		public TerminalNode TEXT_COLON() { return getToken(PARSER.TEXT_COLON, 0); }
		public List<TerminalNode> TEXT_SINGLE_QUOTE() { return getTokens(PARSER.TEXT_SINGLE_QUOTE); }
		public TerminalNode TEXT_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TEXT_SINGLE_QUOTE, i);
		}
		public TerminalNode TEXT_CHARS() { return getToken(PARSER.TEXT_CHARS, 0); }
		public TextidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextidContext textid() throws RecognitionException {
		TextidContext _localctx = new TextidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_textid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(TEXT_ID);
			setState(228);
			match(TEXT_COLON);
			setState(229);
			match(TEXT_SINGLE_QUOTE);
			setState(230);
			match(TEXT_CHARS);
			setState(231);
			match(TEXT_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextmarginContext extends ParserRuleContext {
		public TerminalNode MARGIN_TAG() { return getToken(PARSER.MARGIN_TAG, 0); }
		public TerminalNode MARGIN_CURLYOPEN() { return getToken(PARSER.MARGIN_CURLYOPEN, 0); }
		public List<MarginattributeContext> marginattribute() {
			return getRuleContexts(MarginattributeContext.class);
		}
		public MarginattributeContext marginattribute(int i) {
			return getRuleContext(MarginattributeContext.class,i);
		}
		public TerminalNode MARGIN_CURLYCLOSE() { return getToken(PARSER.MARGIN_CURLYCLOSE, 0); }
		public List<TerminalNode> MARGIN_COMMA() { return getTokens(PARSER.MARGIN_COMMA); }
		public TerminalNode MARGIN_COMMA(int i) {
			return getToken(PARSER.MARGIN_COMMA, i);
		}
		public TextmarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textmargin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextmargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextmargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextmargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextmarginContext textmargin() throws RecognitionException {
		TextmarginContext _localctx = new TextmarginContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_textmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(MARGIN_TAG);
			setState(234);
			match(MARGIN_CURLYOPEN);
			setState(240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(235);
					marginattribute();
					setState(236);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(243);
			marginattribute();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(244);
				match(MARGIN_COMMA);
				}
			}

			setState(247);
			match(MARGIN_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MarginattributeContext extends ParserRuleContext {
		public TerminalNode MARGIN_LOCATION() { return getToken(PARSER.MARGIN_LOCATION, 0); }
		public TerminalNode MARGIN_COLON() { return getToken(PARSER.MARGIN_COLON, 0); }
		public List<TerminalNode> MARGIN_SINGLE_QUOTE() { return getTokens(PARSER.MARGIN_SINGLE_QUOTE); }
		public TerminalNode MARGIN_SINGLE_QUOTE(int i) {
			return getToken(PARSER.MARGIN_SINGLE_QUOTE, i);
		}
		public TerminalNode MARGIN_SIZES() { return getToken(PARSER.MARGIN_SIZES, 0); }
		public MarginattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marginattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterMarginattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitMarginattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitMarginattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginattributeContext marginattribute() throws RecognitionException {
		MarginattributeContext _localctx = new MarginattributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_marginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(MARGIN_LOCATION);
			setState(250);
			match(MARGIN_COLON);
			setState(251);
			match(MARGIN_SINGLE_QUOTE);
			setState(252);
			match(MARGIN_SIZES);
			setState(253);
			match(MARGIN_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode BUTTON_TAG() { return getToken(PARSER.BUTTON_TAG, 0); }
		public TerminalNode BUTTON_CURLYOPEN() { return getToken(PARSER.BUTTON_CURLYOPEN, 0); }
		public List<ButtonattributeContext> buttonattribute() {
			return getRuleContexts(ButtonattributeContext.class);
		}
		public ButtonattributeContext buttonattribute(int i) {
			return getRuleContext(ButtonattributeContext.class,i);
		}
		public TerminalNode BUTTON_CURLYCLOSE() { return getToken(PARSER.BUTTON_CURLYCLOSE, 0); }
		public List<TerminalNode> BUTTON_COMMA() { return getTokens(PARSER.BUTTON_COMMA); }
		public TerminalNode BUTTON_COMMA(int i) {
			return getToken(PARSER.BUTTON_COMMA, i);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(BUTTON_TAG);
			setState(256);
			match(BUTTON_CURLYOPEN);
			setState(262);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					buttonattribute();
					setState(258);
					match(BUTTON_COMMA);
					}
					} 
				}
				setState(264);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(265);
			buttonattribute();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUTTON_COMMA) {
				{
				setState(266);
				match(BUTTON_COMMA);
				}
			}

			setState(269);
			match(BUTTON_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonattributeContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public ButtoncolorContext buttoncolor() {
			return getRuleContext(ButtoncolorContext.class,0);
		}
		public ButtonbackgroundContext buttonbackground() {
			return getRuleContext(ButtonbackgroundContext.class,0);
		}
		public TextbuttonContext textbutton() {
			return getRuleContext(TextbuttonContext.class,0);
		}
		public ButtonidContext buttonid() {
			return getRuleContext(ButtonidContext.class,0);
		}
		public ButtonmarginContext buttonmargin() {
			return getRuleContext(ButtonmarginContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public ButtonposContext buttonpos() {
			return getRuleContext(ButtonposContext.class,0);
		}
		public ButtonattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtonattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtonattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtonattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonattributeContext buttonattribute() throws RecognitionException {
		ButtonattributeContext _localctx = new ButtonattributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_buttonattribute);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUTTON_WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				width();
				}
				break;
			case BUTTON_HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				height();
				}
				break;
			case BUTTON_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				buttoncolor();
				}
				break;
			case BUTTON_BACKGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(274);
				buttonbackground();
				}
				break;
			case BUTTON_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(275);
				textbutton();
				}
				break;
			case BUTTON_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				buttonid();
				}
				break;
			case BUTTON_MARGIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(277);
				buttonmargin();
				}
				break;
			case BUTTON_EVENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(278);
				event();
				}
				break;
			case BUTTON_POS:
				enterOuterAlt(_localctx, 9);
				{
				setState(279);
				buttonpos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidthContext extends ParserRuleContext {
		public TerminalNode BUTTON_WIDTH() { return getToken(PARSER.BUTTON_WIDTH, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public List<TerminalNode> BUTTON_SINGLE_QUOTE() { return getTokens(PARSER.BUTTON_SINGLE_QUOTE); }
		public TerminalNode BUTTON_SINGLE_QUOTE(int i) {
			return getToken(PARSER.BUTTON_SINGLE_QUOTE, i);
		}
		public TerminalNode BUTTON_SIZES() { return getToken(PARSER.BUTTON_SIZES, 0); }
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(BUTTON_WIDTH);
			setState(283);
			match(BUTTON_COLON);
			setState(284);
			match(BUTTON_SINGLE_QUOTE);
			setState(285);
			match(BUTTON_SIZES);
			setState(286);
			match(BUTTON_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeightContext extends ParserRuleContext {
		public TerminalNode BUTTON_HEIGHT() { return getToken(PARSER.BUTTON_HEIGHT, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public List<TerminalNode> BUTTON_SINGLE_QUOTE() { return getTokens(PARSER.BUTTON_SINGLE_QUOTE); }
		public TerminalNode BUTTON_SINGLE_QUOTE(int i) {
			return getToken(PARSER.BUTTON_SINGLE_QUOTE, i);
		}
		public TerminalNode BUTTON_SIZES() { return getToken(PARSER.BUTTON_SIZES, 0); }
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(BUTTON_HEIGHT);
			setState(289);
			match(BUTTON_COLON);
			setState(290);
			match(BUTTON_SINGLE_QUOTE);
			setState(291);
			match(BUTTON_SIZES);
			setState(292);
			match(BUTTON_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtoncolorContext extends ParserRuleContext {
		public TerminalNode BUTTON_COLOR() { return getToken(PARSER.BUTTON_COLOR, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public List<TerminalNode> BUTTON_SINGLE_QUOTE() { return getTokens(PARSER.BUTTON_SINGLE_QUOTE); }
		public TerminalNode BUTTON_SINGLE_QUOTE(int i) {
			return getToken(PARSER.BUTTON_SINGLE_QUOTE, i);
		}
		public TerminalNode BUTTON_COLORS() { return getToken(PARSER.BUTTON_COLORS, 0); }
		public ButtoncolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttoncolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtoncolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtoncolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtoncolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtoncolorContext buttoncolor() throws RecognitionException {
		ButtoncolorContext _localctx = new ButtoncolorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_buttoncolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(BUTTON_COLOR);
			setState(295);
			match(BUTTON_COLON);
			setState(296);
			match(BUTTON_SINGLE_QUOTE);
			setState(297);
			match(BUTTON_COLORS);
			setState(298);
			match(BUTTON_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonbackgroundContext extends ParserRuleContext {
		public TerminalNode BUTTON_BACKGROUND() { return getToken(PARSER.BUTTON_BACKGROUND, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public List<TerminalNode> BUTTON_SINGLE_QUOTE() { return getTokens(PARSER.BUTTON_SINGLE_QUOTE); }
		public TerminalNode BUTTON_SINGLE_QUOTE(int i) {
			return getToken(PARSER.BUTTON_SINGLE_QUOTE, i);
		}
		public TerminalNode BUTTON_COLORS() { return getToken(PARSER.BUTTON_COLORS, 0); }
		public ButtonbackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonbackground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtonbackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtonbackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtonbackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonbackgroundContext buttonbackground() throws RecognitionException {
		ButtonbackgroundContext _localctx = new ButtonbackgroundContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_buttonbackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(BUTTON_BACKGROUND);
			setState(301);
			match(BUTTON_COLON);
			setState(302);
			match(BUTTON_SINGLE_QUOTE);
			setState(303);
			match(BUTTON_COLORS);
			setState(304);
			match(BUTTON_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextbuttonContext extends ParserRuleContext {
		public TerminalNode BUTTON_TEXT() { return getToken(PARSER.BUTTON_TEXT, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public List<TerminalNode> BUTTON_SINGLE_QUOTE() { return getTokens(PARSER.BUTTON_SINGLE_QUOTE); }
		public TerminalNode BUTTON_SINGLE_QUOTE(int i) {
			return getToken(PARSER.BUTTON_SINGLE_QUOTE, i);
		}
		public TerminalNode BUTTON_CHARS() { return getToken(PARSER.BUTTON_CHARS, 0); }
		public TextbuttonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textbutton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextbutton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextbutton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextbutton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextbuttonContext textbutton() throws RecognitionException {
		TextbuttonContext _localctx = new TextbuttonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_textbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(BUTTON_TEXT);
			setState(307);
			match(BUTTON_COLON);
			setState(308);
			match(BUTTON_SINGLE_QUOTE);
			setState(309);
			match(BUTTON_CHARS);
			setState(310);
			match(BUTTON_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonidContext extends ParserRuleContext {
		public TerminalNode BUTTON_ID() { return getToken(PARSER.BUTTON_ID, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public List<TerminalNode> BUTTON_SINGLE_QUOTE() { return getTokens(PARSER.BUTTON_SINGLE_QUOTE); }
		public TerminalNode BUTTON_SINGLE_QUOTE(int i) {
			return getToken(PARSER.BUTTON_SINGLE_QUOTE, i);
		}
		public TerminalNode BUTTON_CHARS() { return getToken(PARSER.BUTTON_CHARS, 0); }
		public ButtonidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtonid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtonid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtonid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonidContext buttonid() throws RecognitionException {
		ButtonidContext _localctx = new ButtonidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_buttonid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(BUTTON_ID);
			setState(313);
			match(BUTTON_COLON);
			setState(314);
			match(BUTTON_SINGLE_QUOTE);
			setState(315);
			match(BUTTON_CHARS);
			setState(316);
			match(BUTTON_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public TerminalNode BUTTON_EVENT() { return getToken(PARSER.BUTTON_EVENT, 0); }
		public TerminalNode EVENT_CURLYOPEN() { return getToken(PARSER.EVENT_CURLYOPEN, 0); }
		public List<EventattributeContext> eventattribute() {
			return getRuleContexts(EventattributeContext.class);
		}
		public EventattributeContext eventattribute(int i) {
			return getRuleContext(EventattributeContext.class,i);
		}
		public TerminalNode EVENT_CURLYCLOSE() { return getToken(PARSER.EVENT_CURLYCLOSE, 0); }
		public List<TerminalNode> EVENT_COMMA() { return getTokens(PARSER.EVENT_COMMA); }
		public TerminalNode EVENT_COMMA(int i) {
			return getToken(PARSER.EVENT_COMMA, i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_event);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(BUTTON_EVENT);
			setState(319);
			match(EVENT_CURLYOPEN);
			setState(325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(320);
					eventattribute();
					setState(321);
					match(EVENT_COMMA);
					}
					} 
				}
				setState(327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(328);
			eventattribute();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENT_COMMA) {
				{
				setState(329);
				match(EVENT_COMMA);
				}
			}

			setState(332);
			match(EVENT_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventattributeContext extends ParserRuleContext {
		public Go_toContext go_to() {
			return getRuleContext(Go_toContext.class,0);
		}
		public EventattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterEventattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitEventattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitEventattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventattributeContext eventattribute() throws RecognitionException {
		EventattributeContext _localctx = new EventattributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eventattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			go_to();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonposContext extends ParserRuleContext {
		public TerminalNode BUTTON_POS() { return getToken(PARSER.BUTTON_POS, 0); }
		public TerminalNode BUTTON_COLON() { return getToken(PARSER.BUTTON_COLON, 0); }
		public TerminalNode BUTTON_POSITION() { return getToken(PARSER.BUTTON_POSITION, 0); }
		public ButtonposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtonpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtonpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtonpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonposContext buttonpos() throws RecognitionException {
		ButtonposContext _localctx = new ButtonposContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_buttonpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(BUTTON_POS);
			setState(337);
			match(BUTTON_COLON);
			setState(338);
			match(BUTTON_POSITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Go_toContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(PARSER.GOTO, 0); }
		public TerminalNode EVENT_COLON() { return getToken(PARSER.EVENT_COLON, 0); }
		public List<TerminalNode> EVENT_SINGLE_QUOTE() { return getTokens(PARSER.EVENT_SINGLE_QUOTE); }
		public TerminalNode EVENT_SINGLE_QUOTE(int i) {
			return getToken(PARSER.EVENT_SINGLE_QUOTE, i);
		}
		public TerminalNode EVENT_CHARS() { return getToken(PARSER.EVENT_CHARS, 0); }
		public Go_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterGo_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitGo_to(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitGo_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Go_toContext go_to() throws RecognitionException {
		Go_toContext _localctx = new Go_toContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_go_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(GOTO);
			setState(341);
			match(EVENT_COLON);
			setState(342);
			match(EVENT_SINGLE_QUOTE);
			setState(343);
			match(EVENT_CHARS);
			setState(344);
			match(EVENT_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonmarginContext extends ParserRuleContext {
		public TerminalNode BUTTON_MARGIN() { return getToken(PARSER.BUTTON_MARGIN, 0); }
		public TerminalNode MARGIN_CURLYOPEN() { return getToken(PARSER.MARGIN_CURLYOPEN, 0); }
		public List<ButtonmarginattributeContext> buttonmarginattribute() {
			return getRuleContexts(ButtonmarginattributeContext.class);
		}
		public ButtonmarginattributeContext buttonmarginattribute(int i) {
			return getRuleContext(ButtonmarginattributeContext.class,i);
		}
		public TerminalNode MARGIN_CURLYCLOSE() { return getToken(PARSER.MARGIN_CURLYCLOSE, 0); }
		public List<TerminalNode> MARGIN_COMMA() { return getTokens(PARSER.MARGIN_COMMA); }
		public TerminalNode MARGIN_COMMA(int i) {
			return getToken(PARSER.MARGIN_COMMA, i);
		}
		public ButtonmarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonmargin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtonmargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtonmargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtonmargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonmarginContext buttonmargin() throws RecognitionException {
		ButtonmarginContext _localctx = new ButtonmarginContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_buttonmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(BUTTON_MARGIN);
			setState(347);
			match(MARGIN_CURLYOPEN);
			setState(353);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(348);
					buttonmarginattribute();
					setState(349);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(356);
			buttonmarginattribute();
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(357);
				match(MARGIN_COMMA);
				}
			}

			setState(360);
			match(MARGIN_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ButtonmarginattributeContext extends ParserRuleContext {
		public TerminalNode MARGIN_LOCATION() { return getToken(PARSER.MARGIN_LOCATION, 0); }
		public TerminalNode MARGIN_COLON() { return getToken(PARSER.MARGIN_COLON, 0); }
		public List<TerminalNode> MARGIN_SINGLE_QUOTE() { return getTokens(PARSER.MARGIN_SINGLE_QUOTE); }
		public TerminalNode MARGIN_SINGLE_QUOTE(int i) {
			return getToken(PARSER.MARGIN_SINGLE_QUOTE, i);
		}
		public TerminalNode MARGIN_SIZES() { return getToken(PARSER.MARGIN_SIZES, 0); }
		public ButtonmarginattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonmarginattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterButtonmarginattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitButtonmarginattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitButtonmarginattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonmarginattributeContext buttonmarginattribute() throws RecognitionException {
		ButtonmarginattributeContext _localctx = new ButtonmarginattributeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_buttonmarginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(MARGIN_LOCATION);
			setState(363);
			match(MARGIN_COLON);
			setState(364);
			match(MARGIN_SINGLE_QUOTE);
			setState(365);
			match(MARGIN_SIZES);
			setState(366);
			match(MARGIN_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputContext extends ParserRuleContext {
		public TerminalNode TI_TAG() { return getToken(PARSER.TI_TAG, 0); }
		public TerminalNode TI_CURLYOPEN() { return getToken(PARSER.TI_CURLYOPEN, 0); }
		public List<TextinputattributeContext> textinputattribute() {
			return getRuleContexts(TextinputattributeContext.class);
		}
		public TextinputattributeContext textinputattribute(int i) {
			return getRuleContext(TextinputattributeContext.class,i);
		}
		public TerminalNode TI_CURLYCLOSE() { return getToken(PARSER.TI_CURLYCLOSE, 0); }
		public List<TerminalNode> TI_COMMA() { return getTokens(PARSER.TI_COMMA); }
		public TerminalNode TI_COMMA(int i) {
			return getToken(PARSER.TI_COMMA, i);
		}
		public TextinputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputContext textinput() throws RecognitionException {
		TextinputContext _localctx = new TextinputContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_textinput);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(TI_TAG);
			setState(369);
			match(TI_CURLYOPEN);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					textinputattribute();
					setState(371);
					match(TI_COMMA);
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(378);
			textinputattribute();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TI_COMMA) {
				{
				setState(379);
				match(TI_COMMA);
				}
			}

			setState(382);
			match(TI_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputattributeContext extends ParserRuleContext {
		public TextinputwidthContext textinputwidth() {
			return getRuleContext(TextinputwidthContext.class,0);
		}
		public TextinputposContext textinputpos() {
			return getRuleContext(TextinputposContext.class,0);
		}
		public TextinputheightContext textinputheight() {
			return getRuleContext(TextinputheightContext.class,0);
		}
		public TextinputcolorContext textinputcolor() {
			return getRuleContext(TextinputcolorContext.class,0);
		}
		public TextinputbackgroundContext textinputbackground() {
			return getRuleContext(TextinputbackgroundContext.class,0);
		}
		public TextinputidContext textinputid() {
			return getRuleContext(TextinputidContext.class,0);
		}
		public TextinputmarginContext textinputmargin() {
			return getRuleContext(TextinputmarginContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Text_hintContext text_hint() {
			return getRuleContext(Text_hintContext.class,0);
		}
		public TextinputattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputattributeContext textinputattribute() throws RecognitionException {
		TextinputattributeContext _localctx = new TextinputattributeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_textinputattribute);
		try {
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TI_WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				textinputwidth();
				}
				break;
			case TI_POS:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				textinputpos();
				}
				break;
			case TI_HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				textinputheight();
				}
				break;
			case TI_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				textinputcolor();
				}
				break;
			case TI_BACKGROUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				textinputbackground();
				}
				break;
			case TI_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				textinputid();
				}
				break;
			case TI_MARGIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
				textinputmargin();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(391);
				type();
				}
				break;
			case TEXTHINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(392);
				text_hint();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputwidthContext extends ParserRuleContext {
		public TerminalNode TI_WIDTH() { return getToken(PARSER.TI_WIDTH, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public List<TerminalNode> TI_SINGLE_QUOTE() { return getTokens(PARSER.TI_SINGLE_QUOTE); }
		public TerminalNode TI_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TI_SINGLE_QUOTE, i);
		}
		public TerminalNode TI_SIZES() { return getToken(PARSER.TI_SIZES, 0); }
		public TextinputwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputwidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputwidthContext textinputwidth() throws RecognitionException {
		TextinputwidthContext _localctx = new TextinputwidthContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_textinputwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(TI_WIDTH);
			setState(396);
			match(TI_COLON);
			setState(397);
			match(TI_SINGLE_QUOTE);
			setState(398);
			match(TI_SIZES);
			setState(399);
			match(TI_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputheightContext extends ParserRuleContext {
		public TerminalNode TI_HEIGHT() { return getToken(PARSER.TI_HEIGHT, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public List<TerminalNode> TI_SINGLE_QUOTE() { return getTokens(PARSER.TI_SINGLE_QUOTE); }
		public TerminalNode TI_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TI_SINGLE_QUOTE, i);
		}
		public TerminalNode TI_SIZES() { return getToken(PARSER.TI_SIZES, 0); }
		public TextinputheightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputheight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputheight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputheight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputheight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputheightContext textinputheight() throws RecognitionException {
		TextinputheightContext _localctx = new TextinputheightContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_textinputheight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(TI_HEIGHT);
			setState(402);
			match(TI_COLON);
			setState(403);
			match(TI_SINGLE_QUOTE);
			setState(404);
			match(TI_SIZES);
			setState(405);
			match(TI_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputcolorContext extends ParserRuleContext {
		public TerminalNode TI_COLOR() { return getToken(PARSER.TI_COLOR, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public List<TerminalNode> TI_SINGLE_QUOTE() { return getTokens(PARSER.TI_SINGLE_QUOTE); }
		public TerminalNode TI_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TI_SINGLE_QUOTE, i);
		}
		public TerminalNode TI_COLORS() { return getToken(PARSER.TI_COLORS, 0); }
		public TextinputcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputcolorContext textinputcolor() throws RecognitionException {
		TextinputcolorContext _localctx = new TextinputcolorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_textinputcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(TI_COLOR);
			setState(408);
			match(TI_COLON);
			setState(409);
			match(TI_SINGLE_QUOTE);
			setState(410);
			match(TI_COLORS);
			setState(411);
			match(TI_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputbackgroundContext extends ParserRuleContext {
		public TerminalNode TI_BACKGROUND() { return getToken(PARSER.TI_BACKGROUND, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public List<TerminalNode> TI_SINGLE_QUOTE() { return getTokens(PARSER.TI_SINGLE_QUOTE); }
		public TerminalNode TI_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TI_SINGLE_QUOTE, i);
		}
		public TerminalNode TI_COLORS() { return getToken(PARSER.TI_COLORS, 0); }
		public TextinputbackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputbackground; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputbackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputbackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputbackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputbackgroundContext textinputbackground() throws RecognitionException {
		TextinputbackgroundContext _localctx = new TextinputbackgroundContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_textinputbackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(TI_BACKGROUND);
			setState(414);
			match(TI_COLON);
			setState(415);
			match(TI_SINGLE_QUOTE);
			setState(416);
			match(TI_COLORS);
			setState(417);
			match(TI_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputposContext extends ParserRuleContext {
		public TerminalNode TI_POS() { return getToken(PARSER.TI_POS, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public TerminalNode TI_POSITION() { return getToken(PARSER.TI_POSITION, 0); }
		public TextinputposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputpos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputposContext textinputpos() throws RecognitionException {
		TextinputposContext _localctx = new TextinputposContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_textinputpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(TI_POS);
			setState(420);
			match(TI_COLON);
			setState(421);
			match(TI_POSITION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputidContext extends ParserRuleContext {
		public TerminalNode TI_ID() { return getToken(PARSER.TI_ID, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public List<TerminalNode> TI_SINGLE_QUOTE() { return getTokens(PARSER.TI_SINGLE_QUOTE); }
		public TerminalNode TI_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TI_SINGLE_QUOTE, i);
		}
		public TerminalNode TI_CHARS() { return getToken(PARSER.TI_CHARS, 0); }
		public TextinputidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputidContext textinputid() throws RecognitionException {
		TextinputidContext _localctx = new TextinputidContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_textinputid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(TI_ID);
			setState(424);
			match(TI_COLON);
			setState(425);
			match(TI_SINGLE_QUOTE);
			setState(426);
			match(TI_CHARS);
			setState(427);
			match(TI_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputmarginContext extends ParserRuleContext {
		public TerminalNode TI_MARGIN() { return getToken(PARSER.TI_MARGIN, 0); }
		public TerminalNode MARGIN_CURLYOPEN() { return getToken(PARSER.MARGIN_CURLYOPEN, 0); }
		public List<TextinputmarginattributeContext> textinputmarginattribute() {
			return getRuleContexts(TextinputmarginattributeContext.class);
		}
		public TextinputmarginattributeContext textinputmarginattribute(int i) {
			return getRuleContext(TextinputmarginattributeContext.class,i);
		}
		public TerminalNode MARGIN_CURLYCLOSE() { return getToken(PARSER.MARGIN_CURLYCLOSE, 0); }
		public List<TerminalNode> MARGIN_COMMA() { return getTokens(PARSER.MARGIN_COMMA); }
		public TerminalNode MARGIN_COMMA(int i) {
			return getToken(PARSER.MARGIN_COMMA, i);
		}
		public TextinputmarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputmargin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputmargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputmargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputmargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputmarginContext textinputmargin() throws RecognitionException {
		TextinputmarginContext _localctx = new TextinputmarginContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_textinputmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(TI_MARGIN);
			setState(430);
			match(MARGIN_CURLYOPEN);
			setState(436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					textinputmarginattribute();
					setState(432);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(439);
			textinputmarginattribute();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(440);
				match(MARGIN_COMMA);
				}
			}

			setState(443);
			match(MARGIN_CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextinputmarginattributeContext extends ParserRuleContext {
		public TerminalNode MARGIN_LOCATION() { return getToken(PARSER.MARGIN_LOCATION, 0); }
		public TerminalNode MARGIN_COLON() { return getToken(PARSER.MARGIN_COLON, 0); }
		public List<TerminalNode> MARGIN_SINGLE_QUOTE() { return getTokens(PARSER.MARGIN_SINGLE_QUOTE); }
		public TerminalNode MARGIN_SINGLE_QUOTE(int i) {
			return getToken(PARSER.MARGIN_SINGLE_QUOTE, i);
		}
		public TerminalNode MARGIN_SIZES() { return getToken(PARSER.MARGIN_SIZES, 0); }
		public TextinputmarginattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textinputmarginattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterTextinputmarginattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitTextinputmarginattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitTextinputmarginattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputmarginattributeContext textinputmarginattribute() throws RecognitionException {
		TextinputmarginattributeContext _localctx = new TextinputmarginattributeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_textinputmarginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(MARGIN_LOCATION);
			setState(446);
			match(MARGIN_COLON);
			setState(447);
			match(MARGIN_SINGLE_QUOTE);
			setState(448);
			match(MARGIN_SIZES);
			setState(449);
			match(MARGIN_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(PARSER.TYPE, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public TerminalNode INPUT_TYPE() { return getToken(PARSER.INPUT_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(TYPE);
			setState(452);
			match(TI_COLON);
			setState(453);
			match(INPUT_TYPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Text_hintContext extends ParserRuleContext {
		public TerminalNode TEXTHINT() { return getToken(PARSER.TEXTHINT, 0); }
		public TerminalNode TI_COLON() { return getToken(PARSER.TI_COLON, 0); }
		public List<TerminalNode> TI_SINGLE_QUOTE() { return getTokens(PARSER.TI_SINGLE_QUOTE); }
		public TerminalNode TI_SINGLE_QUOTE(int i) {
			return getToken(PARSER.TI_SINGLE_QUOTE, i);
		}
		public TerminalNode TI_CHARS() { return getToken(PARSER.TI_CHARS, 0); }
		public Text_hintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterText_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitText_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitText_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_hintContext text_hint() throws RecognitionException {
		Text_hintContext _localctx = new Text_hintContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_text_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			match(TEXTHINT);
			setState(456);
			match(TI_COLON);
			setState(457);
			match(TI_SINGLE_QUOTE);
			setState(458);
			match(TI_CHARS);
			setState(459);
			match(TI_SINGLE_QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0089\u01ce\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000`\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001j\b\u0001\n\u0001\f\u0001m\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001q\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002|\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a5\b\t\n\t\f\t\u00a8\t\t\u0001\t"+
		"\u0001\t\u0003\t\u00ac\b\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00b4\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00bb\b\u000b\n\u000b\f\u000b\u00be\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00c2\b\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00cc\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00ef\b\u0012\n\u0012\f\u0012\u00f2\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00f6\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0105\b\u0014\n"+
		"\u0014\f\u0014\u0108\t\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u010c"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0119\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u0144\b\u001c\n\u001c\f\u001c\u0147\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u014b\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0005 \u0160\b \n \f \u0163\t \u0001 \u0001 \u0003"+
		" \u0167\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u0176\b\"\n\"\f\"\u0179\t\""+
		"\u0001\"\u0001\"\u0003\"\u017d\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u018a\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u01b3\b*\n*"+
		"\f*\u01b6\t*\u0001*\u0001*\u0003*\u01ba\b*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0000\u0000.\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\u0000\u0000\u01ce\u0000_\u0001\u0000\u0000\u0000"+
		"\u0002d\u0001\u0000\u0000\u0000\u0004{\u0001\u0000\u0000\u0000\u0006}"+
		"\u0001\u0000\u0000\u0000\b\u0083\u0001\u0000\u0000\u0000\n\u0089\u0001"+
		"\u0000\u0000\u0000\f\u008f\u0001\u0000\u0000\u0000\u000e\u0093\u0001\u0000"+
		"\u0000\u0000\u0010\u0099\u0001\u0000\u0000\u0000\u0012\u009f\u0001\u0000"+
		"\u0000\u0000\u0014\u00b3\u0001\u0000\u0000\u0000\u0016\u00b5\u0001\u0000"+
		"\u0000\u0000\u0018\u00cb\u0001\u0000\u0000\u0000\u001a\u00cd\u0001\u0000"+
		"\u0000\u0000\u001c\u00d3\u0001\u0000\u0000\u0000\u001e\u00d9\u0001\u0000"+
		"\u0000\u0000 \u00dd\u0001\u0000\u0000\u0000\"\u00e3\u0001\u0000\u0000"+
		"\u0000$\u00e9\u0001\u0000\u0000\u0000&\u00f9\u0001\u0000\u0000\u0000("+
		"\u00ff\u0001\u0000\u0000\u0000*\u0118\u0001\u0000\u0000\u0000,\u011a\u0001"+
		"\u0000\u0000\u0000.\u0120\u0001\u0000\u0000\u00000\u0126\u0001\u0000\u0000"+
		"\u00002\u012c\u0001\u0000\u0000\u00004\u0132\u0001\u0000\u0000\u00006"+
		"\u0138\u0001\u0000\u0000\u00008\u013e\u0001\u0000\u0000\u0000:\u014e\u0001"+
		"\u0000\u0000\u0000<\u0150\u0001\u0000\u0000\u0000>\u0154\u0001\u0000\u0000"+
		"\u0000@\u015a\u0001\u0000\u0000\u0000B\u016a\u0001\u0000\u0000\u0000D"+
		"\u0170\u0001\u0000\u0000\u0000F\u0189\u0001\u0000\u0000\u0000H\u018b\u0001"+
		"\u0000\u0000\u0000J\u0191\u0001\u0000\u0000\u0000L\u0197\u0001\u0000\u0000"+
		"\u0000N\u019d\u0001\u0000\u0000\u0000P\u01a3\u0001\u0000\u0000\u0000R"+
		"\u01a7\u0001\u0000\u0000\u0000T\u01ad\u0001\u0000\u0000\u0000V\u01bd\u0001"+
		"\u0000\u0000\u0000X\u01c3\u0001\u0000\u0000\u0000Z\u01c7\u0001\u0000\u0000"+
		"\u0000\\]\u0005\u0005\u0000\u0000]^\u0005\u0007\u0000\u0000^`\u0005\u0006"+
		"\u0000\u0000_\\\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0003\u0002\u0001\u0000bc\u0003\u0012\t\u0000c\u0001"+
		"\u0001\u0000\u0000\u0000de\u0005\u000e\u0000\u0000ek\u0005\u0015\u0000"+
		"\u0000fg\u0003\u0004\u0002\u0000gh\u0005\u0019\u0000\u0000hj\u0001\u0000"+
		"\u0000\u0000if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000np\u0003\u0004\u0002\u0000oq\u0005\u0019\u0000"+
		"\u0000po\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rs\u0005$\u0000\u0000st\u0005\r\u0000\u0000t\u0003\u0001\u0000"+
		"\u0000\u0000u|\u0003\n\u0005\u0000v|\u0003\u0010\b\u0000w|\u0003\u000e"+
		"\u0007\u0000x|\u0003\f\u0006\u0000y|\u0003\b\u0004\u0000z|\u0003\u0006"+
		"\u0003\u0000{u\u0001\u0000\u0000\u0000{v\u0001\u0000\u0000\u0000{w\u0001"+
		"\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{z\u0001\u0000\u0000\u0000|\u0005\u0001\u0000\u0000\u0000}~\u0005\u001a"+
		"\u0000\u0000~\u007f\u0005 \u0000\u0000\u007f\u0080\u0005\u0017\u0000\u0000"+
		"\u0080\u0081\u0005#\u0000\u0000\u0081\u0082\u0005\u0017\u0000\u0000\u0082"+
		"\u0007\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u001b\u0000\u0000\u0084"+
		"\u0085\u0005 \u0000\u0000\u0085\u0086\u0005\u0017\u0000\u0000\u0086\u0087"+
		"\u0005#\u0000\u0000\u0087\u0088\u0005\u0017\u0000\u0000\u0088\t\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\u0016\u0000\u0000\u008a\u008b\u0005"+
		" \u0000\u0000\u008b\u008c\u0005\u0017\u0000\u0000\u008c\u008d\u0005#\u0000"+
		"\u0000\u008d\u008e\u0005\u0017\u0000\u0000\u008e\u000b\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0005\u001f\u0000\u0000\u0090\u0091\u0005 \u0000\u0000"+
		"\u0091\u0092\u0005\u001e\u0000\u0000\u0092\r\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005\u001d\u0000\u0000\u0094\u0095\u0005 \u0000\u0000\u0095\u0096"+
		"\u0005\u0017\u0000\u0000\u0096\u0097\u0005\u001c\u0000\u0000\u0097\u0098"+
		"\u0005\u0017\u0000\u0000\u0098\u000f\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005!\u0000\u0000\u009a\u009b\u0005 \u0000\u0000\u009b\u009c\u0005\u0017"+
		"\u0000\u0000\u009c\u009d\u0005\"\u0000\u0000\u009d\u009e\u0005\u0017\u0000"+
		"\u0000\u009e\u0011\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000f\u0000"+
		"\u0000\u00a0\u00a6\u0005)\u0000\u0000\u00a1\u00a2\u0003\u0014\n\u0000"+
		"\u00a2\u00a3\u0005*\u0000\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0003\u0014\n\u0000\u00aa\u00ac\u0005*\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005.\u0000\u0000\u00ae\u00af\u0005"+
		"\r\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000\u00b0\u00b4\u0003\u0016"+
		"\u000b\u0000\u00b1\u00b4\u0003D\"\u0000\u00b2\u00b4\u0003(\u0014\u0000"+
		"\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u0015\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0005+\u0000\u0000\u00b6\u00bc\u00053\u0000\u0000\u00b7\u00b8"+
		"\u0003\u0018\f\u0000\u00b8\u00b9\u00056\u0000\u0000\u00b9\u00bb\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb\u00be\u0001"+
		"\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0003\u0018\f\u0000\u00c0\u00c2\u00056"+
		"\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005B\u0000"+
		"\u0000\u00c4\u0017\u0001\u0000\u0000\u0000\u00c5\u00cc\u0003\u001a\r\u0000"+
		"\u00c6\u00cc\u0003\u001c\u000e\u0000\u00c7\u00cc\u0003\u001e\u000f\u0000"+
		"\u00c8\u00cc\u0003 \u0010\u0000\u00c9\u00cc\u0003$\u0012\u0000\u00ca\u00cc"+
		"\u0003\"\u0011\u0000\u00cb\u00c5\u0001\u0000\u0000\u0000\u00cb\u00c6\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c7\u0001\u0000\u0000\u0000\u00cb\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u0019\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"8\u0000\u0000\u00ce\u00cf\u00054\u0000\u0000\u00cf\u00d0\u00055\u0000"+
		"\u0000\u00d0\u00d1\u00059\u0000\u0000\u00d1\u00d2\u00055\u0000\u0000\u00d2"+
		"\u001b\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005;\u0000\u0000\u00d4\u00d5"+
		"\u00054\u0000\u0000\u00d5\u00d6\u00055\u0000\u0000\u00d6\u00d7\u0005<"+
		"\u0000\u0000\u00d7\u00d8\u00055\u0000\u0000\u00d8\u001d\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005?\u0000\u0000\u00da\u00db\u00054\u0000\u0000\u00db"+
		"\u00dc\u0005>\u0000\u0000\u00dc\u001f\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005:\u0000\u0000\u00de\u00df\u00054\u0000\u0000\u00df\u00e0\u00055"+
		"\u0000\u0000\u00e0\u00e1\u0005A\u0000\u0000\u00e1\u00e2\u00055\u0000\u0000"+
		"\u00e2!\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005=\u0000\u0000\u00e4\u00e5"+
		"\u00054\u0000\u0000\u00e5\u00e6\u00055\u0000\u0000\u00e6\u00e7\u0005A"+
		"\u0000\u0000\u00e7\u00e8\u00055\u0000\u0000\u00e8#\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005@\u0000\u0000\u00ea\u00f0\u0005G\u0000\u0000\u00eb\u00ec"+
		"\u0003&\u0013\u0000\u00ec\u00ed\u0005I\u0000\u0000\u00ed\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ee\u00eb\u0001\u0000\u0000\u0000\u00ef\u00f2\u0001\u0000"+
		"\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0003&\u0013\u0000\u00f4\u00f6\u0005I\u0000\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005N\u0000\u0000\u00f8"+
		"%\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005L\u0000\u0000\u00fa\u00fb\u0005"+
		"H\u0000\u0000\u00fb\u00fc\u0005J\u0000\u0000\u00fc\u00fd\u0005M\u0000"+
		"\u0000\u00fd\u00fe\u0005J\u0000\u0000\u00fe\'\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005,\u0000\u0000\u0100\u0106\u0005U\u0000\u0000\u0101\u0102"+
		"\u0003*\u0015\u0000\u0102\u0103\u0005X\u0000\u0000\u0103\u0105\u0001\u0000"+
		"\u0000\u0000\u0104\u0101\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000"+
		"\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0003*\u0015\u0000\u010a\u010c\u0005X\u0000\u0000"+
		"\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0005d\u0000\u0000\u010e"+
		")\u0001\u0000\u0000\u0000\u010f\u0119\u0003,\u0016\u0000\u0110\u0119\u0003"+
		".\u0017\u0000\u0111\u0119\u00030\u0018\u0000\u0112\u0119\u00032\u0019"+
		"\u0000\u0113\u0119\u00034\u001a\u0000\u0114\u0119\u00036\u001b\u0000\u0115"+
		"\u0119\u0003@ \u0000\u0116\u0119\u00038\u001c\u0000\u0117\u0119\u0003"+
		"<\u001e\u0000\u0118\u010f\u0001\u0000\u0000\u0000\u0118\u0110\u0001\u0000"+
		"\u0000\u0000\u0118\u0111\u0001\u0000\u0000\u0000\u0118\u0112\u0001\u0000"+
		"\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000\u0118\u0114\u0001\u0000"+
		"\u0000\u0000\u0118\u0115\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000"+
		"\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0119+\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005Z\u0000\u0000\u011b\u011c\u0005V\u0000\u0000\u011c"+
		"\u011d\u0005W\u0000\u0000\u011d\u011e\u0005\\\u0000\u0000\u011e\u011f"+
		"\u0005W\u0000\u0000\u011f-\u0001\u0000\u0000\u0000\u0120\u0121\u0005["+
		"\u0000\u0000\u0121\u0122\u0005V\u0000\u0000\u0122\u0123\u0005W\u0000\u0000"+
		"\u0123\u0124\u0005\\\u0000\u0000\u0124\u0125\u0005W\u0000\u0000\u0125"+
		"/\u0001\u0000\u0000\u0000\u0126\u0127\u0005]\u0000\u0000\u0127\u0128\u0005"+
		"V\u0000\u0000\u0128\u0129\u0005W\u0000\u0000\u0129\u012a\u0005^\u0000"+
		"\u0000\u012a\u012b\u0005W\u0000\u0000\u012b1\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005_\u0000\u0000\u012d\u012e\u0005V\u0000\u0000\u012e\u012f\u0005"+
		"W\u0000\u0000\u012f\u0130\u0005^\u0000\u0000\u0130\u0131\u0005W\u0000"+
		"\u0000\u01313\u0001\u0000\u0000\u0000\u0132\u0133\u0005a\u0000\u0000\u0133"+
		"\u0134\u0005V\u0000\u0000\u0134\u0135\u0005W\u0000\u0000\u0135\u0136\u0005"+
		"e\u0000\u0000\u0136\u0137\u0005W\u0000\u0000\u01375\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005`\u0000\u0000\u0139\u013a\u0005V\u0000\u0000\u013a"+
		"\u013b\u0005W\u0000\u0000\u013b\u013c\u0005e\u0000\u0000\u013c\u013d\u0005"+
		"W\u0000\u0000\u013d7\u0001\u0000\u0000\u0000\u013e\u013f\u0005c\u0000"+
		"\u0000\u013f\u0145\u0005j\u0000\u0000\u0140\u0141\u0003:\u001d\u0000\u0141"+
		"\u0142\u0005m\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0140"+
		"\u0001\u0000\u0000\u0000\u0144\u0147\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0148"+
		"\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014a"+
		"\u0003:\u001d\u0000\u0149\u014b\u0005m\u0000\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0005q\u0000\u0000\u014d9\u0001\u0000\u0000\u0000"+
		"\u014e\u014f\u0003>\u001f\u0000\u014f;\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0005S\u0000\u0000\u0151\u0152\u0005V\u0000\u0000\u0152\u0153\u0005T"+
		"\u0000\u0000\u0153=\u0001\u0000\u0000\u0000\u0154\u0155\u0005o\u0000\u0000"+
		"\u0155\u0156\u0005k\u0000\u0000\u0156\u0157\u0005l\u0000\u0000\u0157\u0158"+
		"\u0005p\u0000\u0000\u0158\u0159\u0005l\u0000\u0000\u0159?\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005b\u0000\u0000\u015b\u0161\u0005G\u0000\u0000"+
		"\u015c\u015d\u0003B!\u0000\u015d\u015e\u0005I\u0000\u0000\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u0160\u0163"+
		"\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162"+
		"\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000\u0000\u0163\u0161"+
		"\u0001\u0000\u0000\u0000\u0164\u0166\u0003B!\u0000\u0165\u0167\u0005I"+
		"\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000"+
		"\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005N\u0000"+
		"\u0000\u0169A\u0001\u0000\u0000\u0000\u016a\u016b\u0005L\u0000\u0000\u016b"+
		"\u016c\u0005H\u0000\u0000\u016c\u016d\u0005J\u0000\u0000\u016d\u016e\u0005"+
		"M\u0000\u0000\u016e\u016f\u0005J\u0000\u0000\u016fC\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0005-\u0000\u0000\u0171\u0177\u0005x\u0000\u0000\u0172"+
		"\u0173\u0003F#\u0000\u0173\u0174\u0005{\u0000\u0000\u0174\u0176\u0001"+
		"\u0000\u0000\u0000\u0175\u0172\u0001\u0000\u0000\u0000\u0176\u0179\u0001"+
		"\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001"+
		"\u0000\u0000\u0000\u017a\u017c\u0003F#\u0000\u017b\u017d\u0005{\u0000"+
		"\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0089\u0000"+
		"\u0000\u017fE\u0001\u0000\u0000\u0000\u0180\u018a\u0003H$\u0000\u0181"+
		"\u018a\u0003P(\u0000\u0182\u018a\u0003J%\u0000\u0183\u018a\u0003L&\u0000"+
		"\u0184\u018a\u0003N\'\u0000\u0185\u018a\u0003R)\u0000\u0186\u018a\u0003"+
		"T*\u0000\u0187\u018a\u0003X,\u0000\u0188\u018a\u0003Z-\u0000\u0189\u0180"+
		"\u0001\u0000\u0000\u0000\u0189\u0181\u0001\u0000\u0000\u0000\u0189\u0182"+
		"\u0001\u0000\u0000\u0000\u0189\u0183\u0001\u0000\u0000\u0000\u0189\u0184"+
		"\u0001\u0000\u0000\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u0189\u0186"+
		"\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u018aG\u0001\u0000\u0000\u0000\u018b\u018c\u0005"+
		"}\u0000\u0000\u018c\u018d\u0005y\u0000\u0000\u018d\u018e\u0005z\u0000"+
		"\u0000\u018e\u018f\u0005\u007f\u0000\u0000\u018f\u0190\u0005z\u0000\u0000"+
		"\u0190I\u0001\u0000\u0000\u0000\u0191\u0192\u0005~\u0000\u0000\u0192\u0193"+
		"\u0005y\u0000\u0000\u0193\u0194\u0005z\u0000\u0000\u0194\u0195\u0005\u007f"+
		"\u0000\u0000\u0195\u0196\u0005z\u0000\u0000\u0196K\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0005\u0080\u0000\u0000\u0198\u0199\u0005y\u0000\u0000\u0199"+
		"\u019a\u0005z\u0000\u0000\u019a\u019b\u0005\u0081\u0000\u0000\u019b\u019c"+
		"\u0005z\u0000\u0000\u019cM\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u0082"+
		"\u0000\u0000\u019e\u019f\u0005y\u0000\u0000\u019f\u01a0\u0005z\u0000\u0000"+
		"\u01a0\u01a1\u0005\u0081\u0000\u0000\u01a1\u01a2\u0005z\u0000\u0000\u01a2"+
		"O\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005v\u0000\u0000\u01a4\u01a5\u0005"+
		"y\u0000\u0000\u01a5\u01a6\u0005w\u0000\u0000\u01a6Q\u0001\u0000\u0000"+
		"\u0000\u01a7\u01a8\u0005\u0083\u0000\u0000\u01a8\u01a9\u0005y\u0000\u0000"+
		"\u01a9\u01aa\u0005z\u0000\u0000\u01aa\u01ab\u0005\u0088\u0000\u0000\u01ab"+
		"\u01ac\u0005z\u0000\u0000\u01acS\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005"+
		"\u0084\u0000\u0000\u01ae\u01b4\u0005G\u0000\u0000\u01af\u01b0\u0003V+"+
		"\u0000\u01b0\u01b1\u0005I\u0000\u0000\u01b1\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b2\u01af\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b9\u0003V+\u0000\u01b8\u01ba\u0005I\u0000\u0000\u01b9\u01b8"+
		"\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005N\u0000\u0000\u01bcU\u0001\u0000"+
		"\u0000\u0000\u01bd\u01be\u0005L\u0000\u0000\u01be\u01bf\u0005H\u0000\u0000"+
		"\u01bf\u01c0\u0005J\u0000\u0000\u01c0\u01c1\u0005M\u0000\u0000\u01c1\u01c2"+
		"\u0005J\u0000\u0000\u01c2W\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u0086"+
		"\u0000\u0000\u01c4\u01c5\u0005y\u0000\u0000\u01c5\u01c6\u0005\u0087\u0000"+
		"\u0000\u01c6Y\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u0085\u0000\u0000"+
		"\u01c8\u01c9\u0005y\u0000\u0000\u01c9\u01ca\u0005z\u0000\u0000\u01ca\u01cb"+
		"\u0005\u0088\u0000\u0000\u01cb\u01cc\u0005z\u0000\u0000\u01cc[\u0001\u0000"+
		"\u0000\u0000\u0018_kp{\u00a6\u00ab\u00b3\u00bc\u00c1\u00cb\u00f0\u00f5"+
		"\u0106\u010b\u0118\u0145\u014a\u0161\u0166\u0177\u017c\u0189\u01b4\u01b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}