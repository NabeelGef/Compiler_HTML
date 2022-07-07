// Generated from C:/Users/maher/Desktop/algorithm\PARSER.g4 by ANTLR 4.10.1
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
		BODY_TAG=15, CHARS=16, HIDDEN_CHARS=17, HEADER_CURLYOPEN=18, TITLE=19, 
		H_SINGLE_QUOTE=20, H_SEMICOLON=21, H_COMMA=22, URLCONTROL=23, URL=24, 
		H_SIZES=25, H_SIZE=26, H_POSITION=27, H_POS=28, H_POINTS=29, H_COLOR=30, 
		H_COLORS=31, H_CHARS=32, HEADER_CURLYCLOSE=33, B_SPACE=34, UNB=35, UTB=36, 
		URB=37, B_CURLYOPEN=38, B_COMMA=39, TEXT_TAG=40, BUTTON_TAG=41, TI_TAG=42, 
		B_CURLYCLOSE=43, TEXT_SPACE=44, UNT=45, UTT=46, URT=47, TEXT_CURLYOPEN=48, 
		TEXT_COLON=49, TEXT_SINGLE_QUOTE=50, TEXT_COMMA=51, TEXT_SEMICOLON=52, 
		TEXT_COLOR=53, TEXT_COLORS=54, TEXT_CONTENT=55, TEXT_SIZE=56, TEXT_SIZES=57, 
		TEXT_ID=58, TEXT_POSITION=59, TEXT_POS=60, MARGIN_TAG=61, TEXT_CHARS=62, 
		TEXT_CURLYCLOSE=63, MARGIN_SPACE=64, UNM=65, UTM=66, URM=67, MARGIN_CURLYOPEN=68, 
		MARGIN_COLON=69, MARGIN_COMMA=70, MARGIN_SINGLE_QUOTE=71, MARGIN_SEMICOLON=72, 
		MARGIN_LOCATION=73, MARGIN_SIZES=74, MARGIN_CURLYCLOSE=75, BUTTON_SPACE=76, 
		UNBS=77, UTBS=78, URBS=79, BUTTON_CURLYOPEN=80, BUTTON_COLON=81, BUTTON_SINGLE_QUOTE=82, 
		BUTTON_COMMA=83, BUTTON_SEMICOLON=84, BUTTON_WIDTH=85, BUTTON_HEIGHT=86, 
		BUTTON_SIZES=87, BUTTON_COLOR=88, BUTTON_COLORS=89, BUTTON_BACKGROUND=90, 
		BUTTON_ID=91, BUTTON_TEXT=92, BUTTON_MARGIN=93, BUTTON_EVENT=94, BUTTON_CURLYCLOSE=95, 
		BUTTON_CHARS=96, EVENT_SPACE=97, UNE=98, UTE=99, URE=100, EVENT_CURLYOPEN=101, 
		EVENT_COLON=102, EVENT_SINGLE_QUOTE=103, EVENT_COMMA=104, EVENT_SEMICOLON=105, 
		GOTO=106, EVENT_SLASH=107, EVENT_CHARS=108, EVENT_CURLYCLOSE=109, TI_SPACE=110, 
		UNTI=111, UTTI=112, URTI=113, TI_CURLYOPEN=114, TI_COLON=115, TI_SINGLE_QUOTE=116, 
		TI_COMMA=117, TI_SEMICOLON=118, TI_WIDTH=119, TI_HEIGHT=120, TI_SIZES=121, 
		TI_COLOR=122, TI_COLORS=123, TI_BACKGROUND=124, TI_ID=125, TI_MARGIN=126, 
		TEXTHINT=127, TYPE=128, INPUT_TYPE=129, TI_CHARS=130, TI_CURLYCLOSE=131;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_attribute_header = 2, RULE_header_url_control = 3, 
		RULE_headerurl = 4, RULE_headertitle = 5, RULE_headerpos = 6, RULE_headersize = 7, 
		RULE_headercolor = 8, RULE_body = 9, RULE_attribute_body = 10, RULE_text = 11, 
		RULE_textattribute = 12, RULE_textcolor = 13, RULE_textsize = 14, RULE_textpos = 15, 
		RULE_textcontent = 16, RULE_textid = 17, RULE_textmargin = 18, RULE_marginattribute = 19, 
		RULE_button = 20, RULE_buttonattribute = 21, RULE_width = 22, RULE_height = 23, 
		RULE_buttoncolor = 24, RULE_buttonbackground = 25, RULE_textbutton = 26, 
		RULE_buttonid = 27, RULE_event = 28, RULE_eventattribute = 29, RULE_go_to = 30, 
		RULE_buttonmargin = 31, RULE_buttonmarginattribute = 32, RULE_textinput = 33, 
		RULE_textinputattribute = 34, RULE_textinputwidth = 35, RULE_textinputheight = 36, 
		RULE_textinputcolor = 37, RULE_textinputbackground = 38, RULE_textinputid = 39, 
		RULE_textinputmargin = 40, RULE_textinputmarginattribute = 41, RULE_type = 42, 
		RULE_text_hint = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "attribute_header", "header_url_control", "headerurl", 
			"headertitle", "headerpos", "headersize", "headercolor", "body", "attribute_body", 
			"text", "textattribute", "textcolor", "textsize", "textpos", "textcontent", 
			"textid", "textmargin", "marginattribute", "button", "buttonattribute", 
			"width", "height", "buttoncolor", "buttonbackground", "textbutton", "buttonid", 
			"event", "eventattribute", "go_to", "buttonmargin", "buttonmarginattribute", 
			"textinput", "textinputattribute", "textinputwidth", "textinputheight", 
			"textinputcolor", "textinputbackground", "textinputid", "textinputmargin", 
			"textinputmarginattribute", "type", "text_hint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", "'>'", "'start'", null, null, null, 
			null, null, null, "'header'", "'body'", null, null, null, "'Title'", 
			null, null, null, "'url_control'", "'url'", null, null, null, null, null, 
			"'Color '", null, null, null, null, null, null, null, null, null, "'Text'", 
			"'Button'", "'TextInput'", null, null, null, null, null, null, null, 
			null, null, null, null, null, "'Content'", null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'TextButton'", null, "'Event'", 
			null, null, null, null, null, null, null, null, null, null, null, "'go_to'", 
			"'/'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'TextHint'", "'Type '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "UN", "UT", "UR", "TAG_OPEN", "TAG_CLOSE", "START", "CURLYOPEN", 
			"CURLYCLOSE", "COLON", "SINGLE_QUOTE", "COMMA", "SEMICOLON", "HEADER_TAG", 
			"BODY_TAG", "CHARS", "HIDDEN_CHARS", "HEADER_CURLYOPEN", "TITLE", "H_SINGLE_QUOTE", 
			"H_SEMICOLON", "H_COMMA", "URLCONTROL", "URL", "H_SIZES", "H_SIZE", "H_POSITION", 
			"H_POS", "H_POINTS", "H_COLOR", "H_COLORS", "H_CHARS", "HEADER_CURLYCLOSE", 
			"B_SPACE", "UNB", "UTB", "URB", "B_CURLYOPEN", "B_COMMA", "TEXT_TAG", 
			"BUTTON_TAG", "TI_TAG", "B_CURLYCLOSE", "TEXT_SPACE", "UNT", "UTT", "URT", 
			"TEXT_CURLYOPEN", "TEXT_COLON", "TEXT_SINGLE_QUOTE", "TEXT_COMMA", "TEXT_SEMICOLON", 
			"TEXT_COLOR", "TEXT_COLORS", "TEXT_CONTENT", "TEXT_SIZE", "TEXT_SIZES", 
			"TEXT_ID", "TEXT_POSITION", "TEXT_POS", "MARGIN_TAG", "TEXT_CHARS", "TEXT_CURLYCLOSE", 
			"MARGIN_SPACE", "UNM", "UTM", "URM", "MARGIN_CURLYOPEN", "MARGIN_COLON", 
			"MARGIN_COMMA", "MARGIN_SINGLE_QUOTE", "MARGIN_SEMICOLON", "MARGIN_LOCATION", 
			"MARGIN_SIZES", "MARGIN_CURLYCLOSE", "BUTTON_SPACE", "UNBS", "UTBS", 
			"URBS", "BUTTON_CURLYOPEN", "BUTTON_COLON", "BUTTON_SINGLE_QUOTE", "BUTTON_COMMA", 
			"BUTTON_SEMICOLON", "BUTTON_WIDTH", "BUTTON_HEIGHT", "BUTTON_SIZES", 
			"BUTTON_COLOR", "BUTTON_COLORS", "BUTTON_BACKGROUND", "BUTTON_ID", "BUTTON_TEXT", 
			"BUTTON_MARGIN", "BUTTON_EVENT", "BUTTON_CURLYCLOSE", "BUTTON_CHARS", 
			"EVENT_SPACE", "UNE", "UTE", "URE", "EVENT_CURLYOPEN", "EVENT_COLON", 
			"EVENT_SINGLE_QUOTE", "EVENT_COMMA", "EVENT_SEMICOLON", "GOTO", "EVENT_SLASH", 
			"EVENT_CHARS", "EVENT_CURLYCLOSE", "TI_SPACE", "UNTI", "UTTI", "URTI", 
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_OPEN) {
				{
				setState(88);
				match(TAG_OPEN);
				setState(89);
				match(START);
				setState(90);
				match(TAG_CLOSE);
				}
			}

			setState(93);
			header();
			setState(94);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeader(this);
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
			setState(96);
			match(HEADER_TAG);
			setState(97);
			match(HEADER_CURLYOPEN);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					attribute_header();
					setState(99);
					match(H_COMMA);
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(106);
			attribute_header();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==H_COMMA) {
				{
				setState(107);
				match(H_COMMA);
				}
			}

			setState(110);
			match(HEADER_CURLYCLOSE);
			setState(111);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterAttribute_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitAttribute_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitAttribute_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_headerContext attribute_header() throws RecognitionException {
		Attribute_headerContext _localctx = new Attribute_headerContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute_header);
		try {
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				headertitle();
				}
				break;
			case H_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				headercolor();
				}
				break;
			case H_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				headersize();
				}
				break;
			case H_POS:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				headerpos();
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 5);
				{
				setState(117);
				headerurl();
				}
				break;
			case URLCONTROL:
				enterOuterAlt(_localctx, 6);
				{
				setState(118);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeader_url_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeader_url_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeader_url_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Header_url_controlContext header_url_control() throws RecognitionException {
		Header_url_controlContext _localctx = new Header_url_controlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header_url_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(URLCONTROL);
			setState(122);
			match(H_POINTS);
			setState(123);
			match(H_SINGLE_QUOTE);
			setState(124);
			match(H_CHARS);
			setState(125);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeaderurl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeaderurl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeaderurl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderurlContext headerurl() throws RecognitionException {
		HeaderurlContext _localctx = new HeaderurlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_headerurl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(URL);
			setState(128);
			match(H_POINTS);
			setState(129);
			match(H_SINGLE_QUOTE);
			setState(130);
			match(H_CHARS);
			setState(131);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeadertitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeadertitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeadertitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadertitleContext headertitle() throws RecognitionException {
		HeadertitleContext _localctx = new HeadertitleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_headertitle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(TITLE);
			setState(134);
			match(H_POINTS);
			setState(135);
			match(H_SINGLE_QUOTE);
			setState(136);
			match(H_CHARS);
			setState(137);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeaderpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeaderpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeaderpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderposContext headerpos() throws RecognitionException {
		HeaderposContext _localctx = new HeaderposContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_headerpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(H_POS);
			setState(140);
			match(H_POINTS);
			setState(141);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeadersize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeadersize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeadersize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadersizeContext headersize() throws RecognitionException {
		HeadersizeContext _localctx = new HeadersizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_headersize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(H_SIZE);
			setState(144);
			match(H_POINTS);
			setState(145);
			match(H_SINGLE_QUOTE);
			setState(146);
			match(H_SIZES);
			setState(147);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeadercolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeadercolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeadercolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadercolorContext headercolor() throws RecognitionException {
		HeadercolorContext _localctx = new HeadercolorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_headercolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(H_COLOR);
			setState(150);
			match(H_POINTS);
			setState(151);
			match(H_SINGLE_QUOTE);
			setState(152);
			match(H_COLORS);
			setState(153);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitBody(this);
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
			setState(155);
			match(BODY_TAG);
			setState(156);
			match(B_CURLYOPEN);
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					attribute_body();
					setState(158);
					match(B_COMMA);
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(165);
			attribute_body();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==B_COMMA) {
				{
				setState(166);
				match(B_COMMA);
				}
			}

			setState(169);
			match(B_CURLYCLOSE);
			setState(170);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterAttribute_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitAttribute_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitAttribute_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_bodyContext attribute_body() throws RecognitionException {
		Attribute_bodyContext _localctx = new Attribute_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attribute_body);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				text();
				}
				break;
			case TI_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				textinput();
				}
				break;
			case BUTTON_TAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitText(this);
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
			setState(177);
			match(TEXT_TAG);
			setState(178);
			match(TEXT_CURLYOPEN);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					textattribute();
					setState(180);
					match(TEXT_COMMA);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(187);
			textattribute();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT_COMMA) {
				{
				setState(188);
				match(TEXT_COMMA);
				}
			}

			setState(191);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextattributeContext textattribute() throws RecognitionException {
		TextattributeContext _localctx = new TextattributeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_textattribute);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				textcolor();
				}
				break;
			case TEXT_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				textsize();
				}
				break;
			case TEXT_POS:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				textpos();
				}
				break;
			case TEXT_CONTENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				textcontent();
				}
				break;
			case MARGIN_TAG:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				textmargin();
				}
				break;
			case TEXT_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextcolorContext textcolor() throws RecognitionException {
		TextcolorContext _localctx = new TextcolorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_textcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(TEXT_COLOR);
			setState(202);
			match(TEXT_COLON);
			setState(203);
			match(TEXT_SINGLE_QUOTE);
			setState(204);
			match(TEXT_COLORS);
			setState(205);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextsize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextsize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextsizeContext textsize() throws RecognitionException {
		TextsizeContext _localctx = new TextsizeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_textsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(TEXT_SIZE);
			setState(208);
			match(TEXT_COLON);
			setState(209);
			match(TEXT_SINGLE_QUOTE);
			setState(210);
			match(TEXT_SIZES);
			setState(211);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextpos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextpos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextpos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextposContext textpos() throws RecognitionException {
		TextposContext _localctx = new TextposContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(TEXT_POS);
			setState(214);
			match(TEXT_COLON);
			setState(215);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextcontentContext textcontent() throws RecognitionException {
		TextcontentContext _localctx = new TextcontentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_textcontent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TEXT_CONTENT);
			setState(218);
			match(TEXT_COLON);
			setState(219);
			match(TEXT_SINGLE_QUOTE);
			setState(220);
			match(TEXT_CHARS);
			setState(221);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextidContext textid() throws RecognitionException {
		TextidContext _localctx = new TextidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_textid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(TEXT_ID);
			setState(224);
			match(TEXT_COLON);
			setState(225);
			match(TEXT_SINGLE_QUOTE);
			setState(226);
			match(TEXT_CHARS);
			setState(227);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextmargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextmargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextmargin(this);
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
			setState(229);
			match(MARGIN_TAG);
			setState(230);
			match(MARGIN_CURLYOPEN);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					marginattribute();
					setState(232);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(239);
			marginattribute();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(240);
				match(MARGIN_COMMA);
				}
			}

			setState(243);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterMarginattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitMarginattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitMarginattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginattributeContext marginattribute() throws RecognitionException {
		MarginattributeContext _localctx = new MarginattributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_marginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(MARGIN_LOCATION);
			setState(246);
			match(MARGIN_COLON);
			setState(247);
			match(MARGIN_SINGLE_QUOTE);
			setState(248);
			match(MARGIN_SIZES);
			setState(249);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButton(this);
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
			setState(251);
			match(BUTTON_TAG);
			setState(252);
			match(BUTTON_CURLYOPEN);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					buttonattribute();
					setState(254);
					match(BUTTON_COMMA);
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(261);
			buttonattribute();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUTTON_COMMA) {
				{
				setState(262);
				match(BUTTON_COMMA);
				}
			}

			setState(265);
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
		public ButtonattributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buttonattribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButtonattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButtonattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButtonattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonattributeContext buttonattribute() throws RecognitionException {
		ButtonattributeContext _localctx = new ButtonattributeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_buttonattribute);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUTTON_WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				width();
				}
				break;
			case BUTTON_HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				height();
				}
				break;
			case BUTTON_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				buttoncolor();
				}
				break;
			case BUTTON_BACKGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(270);
				buttonbackground();
				}
				break;
			case BUTTON_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(271);
				textbutton();
				}
				break;
			case BUTTON_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				buttonid();
				}
				break;
			case BUTTON_MARGIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(273);
				buttonmargin();
				}
				break;
			case BUTTON_EVENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(274);
				event();
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(BUTTON_WIDTH);
			setState(278);
			match(BUTTON_COLON);
			setState(279);
			match(BUTTON_SINGLE_QUOTE);
			setState(280);
			match(BUTTON_SIZES);
			setState(281);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(BUTTON_HEIGHT);
			setState(284);
			match(BUTTON_COLON);
			setState(285);
			match(BUTTON_SINGLE_QUOTE);
			setState(286);
			match(BUTTON_SIZES);
			setState(287);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButtoncolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButtoncolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButtoncolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtoncolorContext buttoncolor() throws RecognitionException {
		ButtoncolorContext _localctx = new ButtoncolorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_buttoncolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(BUTTON_COLOR);
			setState(290);
			match(BUTTON_COLON);
			setState(291);
			match(BUTTON_SINGLE_QUOTE);
			setState(292);
			match(BUTTON_COLORS);
			setState(293);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButtonbackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButtonbackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButtonbackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonbackgroundContext buttonbackground() throws RecognitionException {
		ButtonbackgroundContext _localctx = new ButtonbackgroundContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_buttonbackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(BUTTON_BACKGROUND);
			setState(296);
			match(BUTTON_COLON);
			setState(297);
			match(BUTTON_SINGLE_QUOTE);
			setState(298);
			match(BUTTON_COLORS);
			setState(299);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextbutton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextbutton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextbutton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextbuttonContext textbutton() throws RecognitionException {
		TextbuttonContext _localctx = new TextbuttonContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_textbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(BUTTON_TEXT);
			setState(302);
			match(BUTTON_COLON);
			setState(303);
			match(BUTTON_SINGLE_QUOTE);
			setState(304);
			match(BUTTON_CHARS);
			setState(305);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButtonid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButtonid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButtonid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonidContext buttonid() throws RecognitionException {
		ButtonidContext _localctx = new ButtonidContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_buttonid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(BUTTON_ID);
			setState(308);
			match(BUTTON_COLON);
			setState(309);
			match(BUTTON_SINGLE_QUOTE);
			setState(310);
			match(BUTTON_CHARS);
			setState(311);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitEvent(this);
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
			setState(313);
			match(BUTTON_EVENT);
			setState(314);
			match(EVENT_CURLYOPEN);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					eventattribute();
					setState(316);
					match(EVENT_COMMA);
					}
					} 
				}
				setState(322);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(323);
			eventattribute();
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENT_COMMA) {
				{
				setState(324);
				match(EVENT_COMMA);
				}
			}

			setState(327);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterEventattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitEventattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitEventattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventattributeContext eventattribute() throws RecognitionException {
		EventattributeContext _localctx = new EventattributeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eventattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
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

	public static class Go_toContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(PARSER.GOTO, 0); }
		public TerminalNode EVENT_COLON() { return getToken(PARSER.EVENT_COLON, 0); }
		public List<TerminalNode> EVENT_SINGLE_QUOTE() { return getTokens(PARSER.EVENT_SINGLE_QUOTE); }
		public TerminalNode EVENT_SINGLE_QUOTE(int i) {
			return getToken(PARSER.EVENT_SINGLE_QUOTE, i);
		}
		public TerminalNode EVENT_SLASH() { return getToken(PARSER.EVENT_SLASH, 0); }
		public TerminalNode EVENT_CHARS() { return getToken(PARSER.EVENT_CHARS, 0); }
		public Go_toContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterGo_to(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitGo_to(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitGo_to(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Go_toContext go_to() throws RecognitionException {
		Go_toContext _localctx = new Go_toContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_go_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(GOTO);
			setState(332);
			match(EVENT_COLON);
			setState(333);
			match(EVENT_SINGLE_QUOTE);
			setState(334);
			match(EVENT_SLASH);
			setState(335);
			match(EVENT_CHARS);
			setState(336);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButtonmargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButtonmargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButtonmargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonmarginContext buttonmargin() throws RecognitionException {
		ButtonmarginContext _localctx = new ButtonmarginContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_buttonmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(BUTTON_MARGIN);
			setState(339);
			match(MARGIN_CURLYOPEN);
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					buttonmarginattribute();
					setState(341);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			setState(348);
			buttonmarginattribute();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(349);
				match(MARGIN_COMMA);
				}
			}

			setState(352);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterButtonmarginattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitButtonmarginattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitButtonmarginattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonmarginattributeContext buttonmarginattribute() throws RecognitionException {
		ButtonmarginattributeContext _localctx = new ButtonmarginattributeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_buttonmarginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(MARGIN_LOCATION);
			setState(355);
			match(MARGIN_COLON);
			setState(356);
			match(MARGIN_SINGLE_QUOTE);
			setState(357);
			match(MARGIN_SIZES);
			setState(358);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputContext textinput() throws RecognitionException {
		TextinputContext _localctx = new TextinputContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_textinput);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(TI_TAG);
			setState(361);
			match(TI_CURLYOPEN);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					textinputattribute();
					setState(363);
					match(TI_COMMA);
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(370);
			textinputattribute();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TI_COMMA) {
				{
				setState(371);
				match(TI_COMMA);
				}
			}

			setState(374);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputattributeContext textinputattribute() throws RecognitionException {
		TextinputattributeContext _localctx = new TextinputattributeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_textinputattribute);
		try {
			setState(384);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TI_WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				textinputwidth();
				}
				break;
			case TI_HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				textinputheight();
				}
				break;
			case TI_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				textinputcolor();
				}
				break;
			case TI_BACKGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(379);
				textinputbackground();
				}
				break;
			case TI_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				textinputid();
				}
				break;
			case TI_MARGIN:
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				textinputmargin();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 7);
				{
				setState(382);
				type();
				}
				break;
			case TEXTHINT:
				enterOuterAlt(_localctx, 8);
				{
				setState(383);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputwidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputwidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputwidthContext textinputwidth() throws RecognitionException {
		TextinputwidthContext _localctx = new TextinputwidthContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_textinputwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(TI_WIDTH);
			setState(387);
			match(TI_COLON);
			setState(388);
			match(TI_SINGLE_QUOTE);
			setState(389);
			match(TI_SIZES);
			setState(390);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputheight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputheight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputheight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputheightContext textinputheight() throws RecognitionException {
		TextinputheightContext _localctx = new TextinputheightContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_textinputheight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(TI_HEIGHT);
			setState(393);
			match(TI_COLON);
			setState(394);
			match(TI_SINGLE_QUOTE);
			setState(395);
			match(TI_SIZES);
			setState(396);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputcolorContext textinputcolor() throws RecognitionException {
		TextinputcolorContext _localctx = new TextinputcolorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_textinputcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(TI_COLOR);
			setState(399);
			match(TI_COLON);
			setState(400);
			match(TI_SINGLE_QUOTE);
			setState(401);
			match(TI_COLORS);
			setState(402);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputbackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputbackground(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputbackground(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputbackgroundContext textinputbackground() throws RecognitionException {
		TextinputbackgroundContext _localctx = new TextinputbackgroundContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_textinputbackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(TI_BACKGROUND);
			setState(405);
			match(TI_COLON);
			setState(406);
			match(TI_SINGLE_QUOTE);
			setState(407);
			match(TI_COLORS);
			setState(408);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputidContext textinputid() throws RecognitionException {
		TextinputidContext _localctx = new TextinputidContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_textinputid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			match(TI_ID);
			setState(411);
			match(TI_COLON);
			setState(412);
			match(TI_SINGLE_QUOTE);
			setState(413);
			match(TI_CHARS);
			setState(414);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputmargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputmargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputmargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputmarginContext textinputmargin() throws RecognitionException {
		TextinputmarginContext _localctx = new TextinputmarginContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_textinputmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(TI_MARGIN);
			setState(417);
			match(MARGIN_CURLYOPEN);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(418);
					textinputmarginattribute();
					setState(419);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(426);
			textinputmarginattribute();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(427);
				match(MARGIN_COMMA);
				}
			}

			setState(430);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterTextinputmarginattribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitTextinputmarginattribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitTextinputmarginattribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextinputmarginattributeContext textinputmarginattribute() throws RecognitionException {
		TextinputmarginattributeContext _localctx = new TextinputmarginattributeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_textinputmarginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(MARGIN_LOCATION);
			setState(433);
			match(MARGIN_COLON);
			setState(434);
			match(MARGIN_SINGLE_QUOTE);
			setState(435);
			match(MARGIN_SIZES);
			setState(436);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(TYPE);
			setState(439);
			match(TI_COLON);
			setState(440);
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
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).enterText_hint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener ) ((PARSERListener)listener).exitText_hint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor ) return ((PARSERVisitor<? extends T>)visitor).visitText_hint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_hintContext text_hint() throws RecognitionException {
		Text_hintContext _localctx = new Text_hintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_text_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(TEXTHINT);
			setState(443);
			match(TI_COLON);
			setState(444);
			match(TI_SINGLE_QUOTE);
			setState(445);
			match(TI_CHARS);
			setState(446);
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
		"\u0004\u0001\u0083\u01c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\\\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001f\b\u0001\n\u0001\f\u0001i\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001m\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"x\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t\u0001\t\u0001\t\u0003\t\u00a8\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0003\n\u00b0\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b7"+
		"\b\u000b\n\u000b\f\u000b\u00ba\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00be\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00c8\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00eb\b\u0012"+
		"\n\u0012\f\u0012\u00ee\t\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00f2"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0101\b\u0014\n\u0014\f\u0014\u0104\t\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0108\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0114\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u013f\b\u001c\n\u001c"+
		"\f\u001c\u0142\t\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0146\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0158\b\u001f"+
		"\n\u001f\f\u001f\u015b\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u015f"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u016e\b!\n!\f!\u0171\t!\u0001"+
		"!\u0001!\u0003!\u0175\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0181\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0005(\u01a6\b(\n(\f(\u01a9\t(\u0001(\u0001(\u0003"+
		"(\u01ad\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0000\u0000,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTV\u0000\u0000\u01c1"+
		"\u0000[\u0001\u0000\u0000\u0000\u0002`\u0001\u0000\u0000\u0000\u0004w"+
		"\u0001\u0000\u0000\u0000\u0006y\u0001\u0000\u0000\u0000\b\u007f\u0001"+
		"\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u008b\u0001\u0000"+
		"\u0000\u0000\u000e\u008f\u0001\u0000\u0000\u0000\u0010\u0095\u0001\u0000"+
		"\u0000\u0000\u0012\u009b\u0001\u0000\u0000\u0000\u0014\u00af\u0001\u0000"+
		"\u0000\u0000\u0016\u00b1\u0001\u0000\u0000\u0000\u0018\u00c7\u0001\u0000"+
		"\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c\u00cf\u0001\u0000"+
		"\u0000\u0000\u001e\u00d5\u0001\u0000\u0000\u0000 \u00d9\u0001\u0000\u0000"+
		"\u0000\"\u00df\u0001\u0000\u0000\u0000$\u00e5\u0001\u0000\u0000\u0000"+
		"&\u00f5\u0001\u0000\u0000\u0000(\u00fb\u0001\u0000\u0000\u0000*\u0113"+
		"\u0001\u0000\u0000\u0000,\u0115\u0001\u0000\u0000\u0000.\u011b\u0001\u0000"+
		"\u0000\u00000\u0121\u0001\u0000\u0000\u00002\u0127\u0001\u0000\u0000\u0000"+
		"4\u012d\u0001\u0000\u0000\u00006\u0133\u0001\u0000\u0000\u00008\u0139"+
		"\u0001\u0000\u0000\u0000:\u0149\u0001\u0000\u0000\u0000<\u014b\u0001\u0000"+
		"\u0000\u0000>\u0152\u0001\u0000\u0000\u0000@\u0162\u0001\u0000\u0000\u0000"+
		"B\u0168\u0001\u0000\u0000\u0000D\u0180\u0001\u0000\u0000\u0000F\u0182"+
		"\u0001\u0000\u0000\u0000H\u0188\u0001\u0000\u0000\u0000J\u018e\u0001\u0000"+
		"\u0000\u0000L\u0194\u0001\u0000\u0000\u0000N\u019a\u0001\u0000\u0000\u0000"+
		"P\u01a0\u0001\u0000\u0000\u0000R\u01b0\u0001\u0000\u0000\u0000T\u01b6"+
		"\u0001\u0000\u0000\u0000V\u01ba\u0001\u0000\u0000\u0000XY\u0005\u0005"+
		"\u0000\u0000YZ\u0005\u0007\u0000\u0000Z\\\u0005\u0006\u0000\u0000[X\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]^\u0003\u0002\u0001\u0000^_\u0003\u0012\t\u0000_\u0001\u0001\u0000\u0000"+
		"\u0000`a\u0005\u000e\u0000\u0000ag\u0005\u0012\u0000\u0000bc\u0003\u0004"+
		"\u0002\u0000cd\u0005\u0016\u0000\u0000df\u0001\u0000\u0000\u0000eb\u0001"+
		"\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jl\u0003\u0004\u0002\u0000km\u0005\u0016\u0000\u0000lk\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0005"+
		"!\u0000\u0000op\u0005\r\u0000\u0000p\u0003\u0001\u0000\u0000\u0000qx\u0003"+
		"\n\u0005\u0000rx\u0003\u0010\b\u0000sx\u0003\u000e\u0007\u0000tx\u0003"+
		"\f\u0006\u0000ux\u0003\b\u0004\u0000vx\u0003\u0006\u0003\u0000wq\u0001"+
		"\u0000\u0000\u0000wr\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000\u0000"+
		"wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000"+
		"\u0000x\u0005\u0001\u0000\u0000\u0000yz\u0005\u0017\u0000\u0000z{\u0005"+
		"\u001d\u0000\u0000{|\u0005\u0014\u0000\u0000|}\u0005 \u0000\u0000}~\u0005"+
		"\u0014\u0000\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0080\u0005\u0018"+
		"\u0000\u0000\u0080\u0081\u0005\u001d\u0000\u0000\u0081\u0082\u0005\u0014"+
		"\u0000\u0000\u0082\u0083\u0005 \u0000\u0000\u0083\u0084\u0005\u0014\u0000"+
		"\u0000\u0084\t\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0013\u0000\u0000"+
		"\u0086\u0087\u0005\u001d\u0000\u0000\u0087\u0088\u0005\u0014\u0000\u0000"+
		"\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0005\u0014\u0000\u0000\u008a"+
		"\u000b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u001c\u0000\u0000\u008c"+
		"\u008d\u0005\u001d\u0000\u0000\u008d\u008e\u0005\u001b\u0000\u0000\u008e"+
		"\r\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u001a\u0000\u0000\u0090\u0091"+
		"\u0005\u001d\u0000\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092\u0093"+
		"\u0005\u0019\u0000\u0000\u0093\u0094\u0005\u0014\u0000\u0000\u0094\u000f"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001e\u0000\u0000\u0096\u0097"+
		"\u0005\u001d\u0000\u0000\u0097\u0098\u0005\u0014\u0000\u0000\u0098\u0099"+
		"\u0005\u001f\u0000\u0000\u0099\u009a\u0005\u0014\u0000\u0000\u009a\u0011"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u000f\u0000\u0000\u009c\u00a2"+
		"\u0005&\u0000\u0000\u009d\u009e\u0003\u0014\n\u0000\u009e\u009f\u0005"+
		"\'\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009d\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0003\u0014"+
		"\n\u0000\u00a6\u00a8\u0005\'\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005+\u0000\u0000\u00aa\u00ab\u0005\r\u0000\u0000"+
		"\u00ab\u0013\u0001\u0000\u0000\u0000\u00ac\u00b0\u0003\u0016\u000b\u0000"+
		"\u00ad\u00b0\u0003B!\u0000\u00ae\u00b0\u0003(\u0014\u0000\u00af\u00ac"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u0015\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005(\u0000\u0000\u00b2\u00b8\u00050\u0000\u0000\u00b3\u00b4\u0003\u0018"+
		"\f\u0000\u00b4\u00b5\u00053\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bd\u0003\u0018\f\u0000\u00bc\u00be\u00053\u0000\u0000"+
		"\u00bd\u00bc\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005?\u0000\u0000\u00c0"+
		"\u0017\u0001\u0000\u0000\u0000\u00c1\u00c8\u0003\u001a\r\u0000\u00c2\u00c8"+
		"\u0003\u001c\u000e\u0000\u00c3\u00c8\u0003\u001e\u000f\u0000\u00c4\u00c8"+
		"\u0003 \u0010\u0000\u00c5\u00c8\u0003$\u0012\u0000\u00c6\u00c8\u0003\""+
		"\u0011\u0000\u00c7\u00c1\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c3\u0001\u0000\u0000\u0000\u00c7\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c8\u0019\u0001\u0000\u0000\u0000\u00c9\u00ca\u00055\u0000"+
		"\u0000\u00ca\u00cb\u00051\u0000\u0000\u00cb\u00cc\u00052\u0000\u0000\u00cc"+
		"\u00cd\u00056\u0000\u0000\u00cd\u00ce\u00052\u0000\u0000\u00ce\u001b\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u00058\u0000\u0000\u00d0\u00d1\u00051\u0000"+
		"\u0000\u00d1\u00d2\u00052\u0000\u0000\u00d2\u00d3\u00059\u0000\u0000\u00d3"+
		"\u00d4\u00052\u0000\u0000\u00d4\u001d\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005<\u0000\u0000\u00d6\u00d7\u00051\u0000\u0000\u00d7\u00d8\u0005;"+
		"\u0000\u0000\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9\u00da\u00057\u0000"+
		"\u0000\u00da\u00db\u00051\u0000\u0000\u00db\u00dc\u00052\u0000\u0000\u00dc"+
		"\u00dd\u0005>\u0000\u0000\u00dd\u00de\u00052\u0000\u0000\u00de!\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0005:\u0000\u0000\u00e0\u00e1\u00051\u0000"+
		"\u0000\u00e1\u00e2\u00052\u0000\u0000\u00e2\u00e3\u0005>\u0000\u0000\u00e3"+
		"\u00e4\u00052\u0000\u0000\u00e4#\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"=\u0000\u0000\u00e6\u00ec\u0005D\u0000\u0000\u00e7\u00e8\u0003&\u0013"+
		"\u0000\u00e8\u00e9\u0005F\u0000\u0000\u00e9\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0003&\u0013\u0000\u00f0\u00f2\u0005F\u0000\u0000\u00f1\u00f0"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005K\u0000\u0000\u00f4%\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005I\u0000\u0000\u00f6\u00f7\u0005E\u0000\u0000"+
		"\u00f7\u00f8\u0005G\u0000\u0000\u00f8\u00f9\u0005J\u0000\u0000\u00f9\u00fa"+
		"\u0005G\u0000\u0000\u00fa\'\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005"+
		")\u0000\u0000\u00fc\u0102\u0005P\u0000\u0000\u00fd\u00fe\u0003*\u0015"+
		"\u0000\u00fe\u00ff\u0005S\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000"+
		"\u0100\u00fd\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0105\u0107\u0003*\u0015\u0000\u0106\u0108\u0005S\u0000\u0000\u0107\u0106"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010a\u0005_\u0000\u0000\u010a)\u0001\u0000"+
		"\u0000\u0000\u010b\u0114\u0003,\u0016\u0000\u010c\u0114\u0003.\u0017\u0000"+
		"\u010d\u0114\u00030\u0018\u0000\u010e\u0114\u00032\u0019\u0000\u010f\u0114"+
		"\u00034\u001a\u0000\u0110\u0114\u00036\u001b\u0000\u0111\u0114\u0003>"+
		"\u001f\u0000\u0112\u0114\u00038\u001c\u0000\u0113\u010b\u0001\u0000\u0000"+
		"\u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113\u010d\u0001\u0000\u0000"+
		"\u0000\u0113\u010e\u0001\u0000\u0000\u0000\u0113\u010f\u0001\u0000\u0000"+
		"\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000"+
		"\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114+\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005U\u0000\u0000\u0116\u0117\u0005Q\u0000\u0000\u0117\u0118"+
		"\u0005R\u0000\u0000\u0118\u0119\u0005W\u0000\u0000\u0119\u011a\u0005R"+
		"\u0000\u0000\u011a-\u0001\u0000\u0000\u0000\u011b\u011c\u0005V\u0000\u0000"+
		"\u011c\u011d\u0005Q\u0000\u0000\u011d\u011e\u0005R\u0000\u0000\u011e\u011f"+
		"\u0005W\u0000\u0000\u011f\u0120\u0005R\u0000\u0000\u0120/\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005X\u0000\u0000\u0122\u0123\u0005Q\u0000\u0000"+
		"\u0123\u0124\u0005R\u0000\u0000\u0124\u0125\u0005Y\u0000\u0000\u0125\u0126"+
		"\u0005R\u0000\u0000\u01261\u0001\u0000\u0000\u0000\u0127\u0128\u0005Z"+
		"\u0000\u0000\u0128\u0129\u0005Q\u0000\u0000\u0129\u012a\u0005R\u0000\u0000"+
		"\u012a\u012b\u0005Y\u0000\u0000\u012b\u012c\u0005R\u0000\u0000\u012c3"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0005\\\u0000\u0000\u012e\u012f\u0005"+
		"Q\u0000\u0000\u012f\u0130\u0005R\u0000\u0000\u0130\u0131\u0005`\u0000"+
		"\u0000\u0131\u0132\u0005R\u0000\u0000\u01325\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005[\u0000\u0000\u0134\u0135\u0005Q\u0000\u0000\u0135\u0136\u0005"+
		"R\u0000\u0000\u0136\u0137\u0005`\u0000\u0000\u0137\u0138\u0005R\u0000"+
		"\u0000\u01387\u0001\u0000\u0000\u0000\u0139\u013a\u0005^\u0000\u0000\u013a"+
		"\u0140\u0005e\u0000\u0000\u013b\u013c\u0003:\u001d\u0000\u013c\u013d\u0005"+
		"h\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013b\u0001\u0000"+
		"\u0000\u0000\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000"+
		"\u0000\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0145\u0003:\u001d"+
		"\u0000\u0144\u0146\u0005h\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0148\u0005m\u0000\u0000\u01489\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0003<\u001e\u0000\u014a;\u0001\u0000\u0000\u0000\u014b\u014c\u0005j"+
		"\u0000\u0000\u014c\u014d\u0005f\u0000\u0000\u014d\u014e\u0005g\u0000\u0000"+
		"\u014e\u014f\u0005k\u0000\u0000\u014f\u0150\u0005l\u0000\u0000\u0150\u0151"+
		"\u0005g\u0000\u0000\u0151=\u0001\u0000\u0000\u0000\u0152\u0153\u0005]"+
		"\u0000\u0000\u0153\u0159\u0005D\u0000\u0000\u0154\u0155\u0003@ \u0000"+
		"\u0155\u0156\u0005F\u0000\u0000\u0156\u0158\u0001\u0000\u0000\u0000\u0157"+
		"\u0154\u0001\u0000\u0000\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159"+
		"\u0157\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a"+
		"\u015c\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015c"+
		"\u015e\u0003@ \u0000\u015d\u015f\u0005F\u0000\u0000\u015e\u015d\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0001\u0000\u0000\u0000\u015f\u0160\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0005K\u0000\u0000\u0161?\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005I\u0000\u0000\u0163\u0164\u0005E\u0000\u0000\u0164"+
		"\u0165\u0005G\u0000\u0000\u0165\u0166\u0005J\u0000\u0000\u0166\u0167\u0005"+
		"G\u0000\u0000\u0167A\u0001\u0000\u0000\u0000\u0168\u0169\u0005*\u0000"+
		"\u0000\u0169\u016f\u0005r\u0000\u0000\u016a\u016b\u0003D\"\u0000\u016b"+
		"\u016c\u0005u\u0000\u0000\u016c\u016e\u0001\u0000\u0000\u0000\u016d\u016a"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0172"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u0174"+
		"\u0003D\"\u0000\u0173\u0175\u0005u\u0000\u0000\u0174\u0173\u0001\u0000"+
		"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000"+
		"\u0000\u0000\u0176\u0177\u0005\u0083\u0000\u0000\u0177C\u0001\u0000\u0000"+
		"\u0000\u0178\u0181\u0003F#\u0000\u0179\u0181\u0003H$\u0000\u017a\u0181"+
		"\u0003J%\u0000\u017b\u0181\u0003L&\u0000\u017c\u0181\u0003N\'\u0000\u017d"+
		"\u0181\u0003P(\u0000\u017e\u0181\u0003T*\u0000\u017f\u0181\u0003V+\u0000"+
		"\u0180\u0178\u0001\u0000\u0000\u0000\u0180\u0179\u0001\u0000\u0000\u0000"+
		"\u0180\u017a\u0001\u0000\u0000\u0000\u0180\u017b\u0001\u0000\u0000\u0000"+
		"\u0180\u017c\u0001\u0000\u0000\u0000\u0180\u017d\u0001\u0000\u0000\u0000"+
		"\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u017f\u0001\u0000\u0000\u0000"+
		"\u0181E\u0001\u0000\u0000\u0000\u0182\u0183\u0005w\u0000\u0000\u0183\u0184"+
		"\u0005s\u0000\u0000\u0184\u0185\u0005t\u0000\u0000\u0185\u0186\u0005y"+
		"\u0000\u0000\u0186\u0187\u0005t\u0000\u0000\u0187G\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0005x\u0000\u0000\u0189\u018a\u0005s\u0000\u0000\u018a\u018b"+
		"\u0005t\u0000\u0000\u018b\u018c\u0005y\u0000\u0000\u018c\u018d\u0005t"+
		"\u0000\u0000\u018dI\u0001\u0000\u0000\u0000\u018e\u018f\u0005z\u0000\u0000"+
		"\u018f\u0190\u0005s\u0000\u0000\u0190\u0191\u0005t\u0000\u0000\u0191\u0192"+
		"\u0005{\u0000\u0000\u0192\u0193\u0005t\u0000\u0000\u0193K\u0001\u0000"+
		"\u0000\u0000\u0194\u0195\u0005|\u0000\u0000\u0195\u0196\u0005s\u0000\u0000"+
		"\u0196\u0197\u0005t\u0000\u0000\u0197\u0198\u0005{\u0000\u0000\u0198\u0199"+
		"\u0005t\u0000\u0000\u0199M\u0001\u0000\u0000\u0000\u019a\u019b\u0005}"+
		"\u0000\u0000\u019b\u019c\u0005s\u0000\u0000\u019c\u019d\u0005t\u0000\u0000"+
		"\u019d\u019e\u0005\u0082\u0000\u0000\u019e\u019f\u0005t\u0000\u0000\u019f"+
		"O\u0001\u0000\u0000\u0000\u01a0\u01a1\u0005~\u0000\u0000\u01a1\u01a7\u0005"+
		"D\u0000\u0000\u01a2\u01a3\u0003R)\u0000\u01a3\u01a4\u0005F\u0000\u0000"+
		"\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa\u0001\u0000\u0000\u0000"+
		"\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ac\u0003R)\u0000\u01ab\u01ad"+
		"\u0005F\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"K\u0000\u0000\u01afQ\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005I\u0000"+
		"\u0000\u01b1\u01b2\u0005E\u0000\u0000\u01b2\u01b3\u0005G\u0000\u0000\u01b3"+
		"\u01b4\u0005J\u0000\u0000\u01b4\u01b5\u0005G\u0000\u0000\u01b5S\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0005\u0080\u0000\u0000\u01b7\u01b8\u0005"+
		"s\u0000\u0000\u01b8\u01b9\u0005\u0081\u0000\u0000\u01b9U\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0005\u007f\u0000\u0000\u01bb\u01bc\u0005s\u0000\u0000"+
		"\u01bc\u01bd\u0005t\u0000\u0000\u01bd\u01be\u0005\u0082\u0000\u0000\u01be"+
		"\u01bf\u0005t\u0000\u0000\u01bfW\u0001\u0000\u0000\u0000\u0018[glw\u00a2"+
		"\u00a7\u00af\u00b8\u00bd\u00c7\u00ec\u00f1\u0102\u0107\u0113\u0140\u0145"+
		"\u0159\u015e\u016f\u0174\u0180\u01a7\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}