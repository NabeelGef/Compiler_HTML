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
		ON_CLICK=46, B_CURLYCLOSE=47, SPACE_ONCLICK=48, UN_ONCLICK=49, UT_ONCLICK=50, 
		UR_ONCLICK=51, CURLYOPEN_ONCLICK=52, CURLYCLOSE_ONCLICK=53, DOT_ONCLICK=54, 
		GET_DATA=55, OPEN_GETDATA=56, CLOSE_GETDATA=57, ONCLICK_FUNCTION=58, SINGLE_QUOTE_ONCLICK=59, 
		SEMICOLON_ONCLICK=60, EQUAL_ONCLICK=61, CHARS_ONCLICK=62, SPACEI=63, UNI=64, 
		UTI=65, URI=66, CURLYOPEN_INNERONCLICK=67, CURLYCLOSE_INNERONCLICK=68, 
		SEMICOLON_INNERONCLICK=69, COLORS_INNERONCLICK=70, SIZES_INNERONCLICK=71, 
		WIDTH_INNERONCLICK=72, CONTENT_INNERONCLICK=73, COLOR_INNERONCLICK=74, 
		BACKGROUND_INNERONCLICK=75, HEIGHT_INNERONCLICK=76, SIZE_INNERONCLICK=77, 
		DOT_INNERONCLICK=78, EQUAL_INNERONCLICK=79, SINGLE_QUOTE_INNERONCLICK=80, 
		COMMA_INNERONCLICK=81, CHARS_INNERONCLICK=82, TEXT_SPACE=83, UNT=84, UTT=85, 
		URT=86, TEXT_CURLYOPEN=87, TEXT_COLON=88, TEXT_SINGLE_QUOTE=89, TEXT_COMMA=90, 
		TEXT_SEMICOLON=91, TEXT_COLOR=92, TEXT_COLORS=93, TEXT_CONTENT=94, TEXT_SIZE=95, 
		TEXT_SIZES=96, TEXT_ID=97, TEXT_POSITION=98, TEXT_POS=99, MARGIN_TAG=100, 
		TEXT_CHARS=101, TEXT_CURLYCLOSE=102, MARGIN_SPACE=103, UNM=104, UTM=105, 
		URM=106, MARGIN_CURLYOPEN=107, MARGIN_COLON=108, MARGIN_COMMA=109, MARGIN_SINGLE_QUOTE=110, 
		MARGIN_SEMICOLON=111, MARGIN_LOCATION=112, MARGIN_SIZES=113, MARGIN_CURLYCLOSE=114, 
		BUTTON_SPACE=115, UNBS=116, UTBS=117, URBS=118, BUTTON_POS=119, BUTTON_POSITION=120, 
		BUTTON_CURLYOPEN=121, BUTTON_COLON=122, BUTTON_SINGLE_QUOTE=123, BUTTON_COMMA=124, 
		BUTTON_SEMICOLON=125, BUTTON_WIDTH=126, BUTTON_HEIGHT=127, BUTTON_SIZES=128, 
		BUTTON_COLOR=129, BUTTON_COLORS=130, BUTTON_BACKGROUND=131, BUTTON_ID=132, 
		BUTTON_TEXT=133, BUTTON_MARGIN=134, BUTTON_EVENT=135, BUTTON_CURLYCLOSE=136, 
		BUTTON_CHARS=137, EVENT_SPACE=138, UNE=139, UTE=140, URE=141, EVENT_CURLYOPEN=142, 
		EVENT_COLON=143, EVENT_SINGLE_QUOTE=144, EVENT_COMMA=145, EVENT_SEMICOLON=146, 
		GOTO=147, EVENT_CHARS=148, EVENT_CURLYCLOSE=149, TI_SPACE=150, UNTI=151, 
		UTTI=152, URTI=153, TI_POS=154, TI_POSITION=155, TI_CURLYOPEN=156, TI_COLON=157, 
		TI_SINGLE_QUOTE=158, TI_COMMA=159, TI_SEMICOLON=160, TI_WIDTH=161, TI_HEIGHT=162, 
		TI_SIZES=163, TI_COLOR=164, TI_COLORS=165, TI_BACKGROUND=166, TI_ID=167, 
		TI_MARGIN=168, TEXTHINT=169, TYPE=170, INPUT_TYPE=171, TI_CHARS=172, TI_CURLYCLOSE=173;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_attribute_header = 2, RULE_header_url_control = 3, 
		RULE_headerurl = 4, RULE_headertitle = 5, RULE_headerpos = 6, RULE_headersize = 7, 
		RULE_headercolor = 8, RULE_body = 9, RULE_attribute_body = 10, RULE_onclick = 11, 
		RULE_attrbuite_onclickparent = 12, RULE_getData = 13, RULE_equalization = 14, 
		RULE_dot_onClick = 15, RULE_attrbuite_onclick = 16, RULE_size_onClick = 17, 
		RULE_height_onClick = 18, RULE_background_onClick = 19, RULE_color_onClick = 20, 
		RULE_content_onClick = 21, RULE_width_onClick = 22, RULE_text = 23, RULE_textattribute = 24, 
		RULE_textcolor = 25, RULE_textsize = 26, RULE_textpos = 27, RULE_textcontent = 28, 
		RULE_textid = 29, RULE_textmargin = 30, RULE_marginattribute = 31, RULE_button = 32, 
		RULE_buttonattribute = 33, RULE_width = 34, RULE_height = 35, RULE_buttoncolor = 36, 
		RULE_buttonbackground = 37, RULE_textbutton = 38, RULE_buttonid = 39, 
		RULE_event = 40, RULE_eventattribute = 41, RULE_buttonpos = 42, RULE_go_to = 43, 
		RULE_buttonmargin = 44, RULE_buttonmarginattribute = 45, RULE_textinput = 46, 
		RULE_textinputattribute = 47, RULE_textinputwidth = 48, RULE_textinputheight = 49, 
		RULE_textinputcolor = 50, RULE_textinputbackground = 51, RULE_textinputpos = 52, 
		RULE_textinputid = 53, RULE_textinputmargin = 54, RULE_textinputmarginattribute = 55, 
		RULE_type = 56, RULE_text_hint = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "attribute_header", "header_url_control", "headerurl", 
			"headertitle", "headerpos", "headersize", "headercolor", "body", "attribute_body", 
			"onclick", "attrbuite_onclickparent", "getData", "equalization", "dot_onClick", 
			"attrbuite_onclick", "size_onClick", "height_onClick", "background_onClick", 
			"color_onClick", "content_onClick", "width_onClick", "text", "textattribute", 
			"textcolor", "textsize", "textpos", "textcontent", "textid", "textmargin", 
			"marginattribute", "button", "buttonattribute", "width", "height", "buttoncolor", 
			"buttonbackground", "textbutton", "buttonid", "event", "eventattribute", 
			"buttonpos", "go_to", "buttonmargin", "buttonmarginattribute", "textinput", 
			"textinputattribute", "textinputwidth", "textinputheight", "textinputcolor", 
			"textinputbackground", "textinputpos", "textinputid", "textinputmargin", 
			"textinputmarginattribute", "type", "text_hint"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'<'", "'>'", "'start'", null, null, null, 
			null, null, null, "'header'", "'body'", null, null, null, null, null, 
			null, "'Title'", null, null, null, "'url_control'", "'url'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'Text'", "'Button'", "'TextInput'", "'OnClick'", null, null, null, 
			null, null, null, null, null, "'getData'", "'('", "')'", "'onClick()'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'TextButton'", null, "'Event'", null, null, null, null, 
			null, null, null, null, null, null, null, "'go_to'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'TextHint'", "'Type '"
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
			"B_COMMA", "TEXT_TAG", "BUTTON_TAG", "TI_TAG", "ON_CLICK", "B_CURLYCLOSE", 
			"SPACE_ONCLICK", "UN_ONCLICK", "UT_ONCLICK", "UR_ONCLICK", "CURLYOPEN_ONCLICK", 
			"CURLYCLOSE_ONCLICK", "DOT_ONCLICK", "GET_DATA", "OPEN_GETDATA", "CLOSE_GETDATA", 
			"ONCLICK_FUNCTION", "SINGLE_QUOTE_ONCLICK", "SEMICOLON_ONCLICK", "EQUAL_ONCLICK", 
			"CHARS_ONCLICK", "SPACEI", "UNI", "UTI", "URI", "CURLYOPEN_INNERONCLICK", 
			"CURLYCLOSE_INNERONCLICK", "SEMICOLON_INNERONCLICK", "COLORS_INNERONCLICK", 
			"SIZES_INNERONCLICK", "WIDTH_INNERONCLICK", "CONTENT_INNERONCLICK", "COLOR_INNERONCLICK", 
			"BACKGROUND_INNERONCLICK", "HEIGHT_INNERONCLICK", "SIZE_INNERONCLICK", 
			"DOT_INNERONCLICK", "EQUAL_INNERONCLICK", "SINGLE_QUOTE_INNERONCLICK", 
			"COMMA_INNERONCLICK", "CHARS_INNERONCLICK", "TEXT_SPACE", "UNT", "UTT", 
			"URT", "TEXT_CURLYOPEN", "TEXT_COLON", "TEXT_SINGLE_QUOTE", "TEXT_COMMA", 
			"TEXT_SEMICOLON", "TEXT_COLOR", "TEXT_COLORS", "TEXT_CONTENT", "TEXT_SIZE", 
			"TEXT_SIZES", "TEXT_ID", "TEXT_POSITION", "TEXT_POS", "MARGIN_TAG", "TEXT_CHARS", 
			"TEXT_CURLYCLOSE", "MARGIN_SPACE", "UNM", "UTM", "URM", "MARGIN_CURLYOPEN", 
			"MARGIN_COLON", "MARGIN_COMMA", "MARGIN_SINGLE_QUOTE", "MARGIN_SEMICOLON", 
			"MARGIN_LOCATION", "MARGIN_SIZES", "MARGIN_CURLYCLOSE", "BUTTON_SPACE", 
			"UNBS", "UTBS", "URBS", "BUTTON_POS", "BUTTON_POSITION", "BUTTON_CURLYOPEN", 
			"BUTTON_COLON", "BUTTON_SINGLE_QUOTE", "BUTTON_COMMA", "BUTTON_SEMICOLON", 
			"BUTTON_WIDTH", "BUTTON_HEIGHT", "BUTTON_SIZES", "BUTTON_COLOR", "BUTTON_COLORS", 
			"BUTTON_BACKGROUND", "BUTTON_ID", "BUTTON_TEXT", "BUTTON_MARGIN", "BUTTON_EVENT", 
			"BUTTON_CURLYCLOSE", "BUTTON_CHARS", "EVENT_SPACE", "UNE", "UTE", "URE", 
			"EVENT_CURLYOPEN", "EVENT_COLON", "EVENT_SINGLE_QUOTE", "EVENT_COMMA", 
			"EVENT_SEMICOLON", "GOTO", "EVENT_CHARS", "EVENT_CURLYCLOSE", "TI_SPACE", 
			"UNTI", "UTTI", "URTI", "TI_POS", "TI_POSITION", "TI_CURLYOPEN", "TI_COLON", 
			"TI_SINGLE_QUOTE", "TI_COMMA", "TI_SEMICOLON", "TI_WIDTH", "TI_HEIGHT", 
			"TI_SIZES", "TI_COLOR", "TI_COLORS", "TI_BACKGROUND", "TI_ID", "TI_MARGIN", 
			"TEXTHINT", "TYPE", "INPUT_TYPE", "TI_CHARS", "TI_CURLYCLOSE"
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_OPEN) {
				{
				setState(116);
				match(TAG_OPEN);
				setState(117);
				match(START);
				setState(118);
				match(TAG_CLOSE);
				}
			}

			setState(121);
			header();
			setState(122);
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
			setState(124);
			match(HEADER_TAG);
			setState(125);
			match(HEADER_CURLYOPEN);
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					attribute_header();
					setState(127);
					match(H_COMMA);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(134);
			attribute_header();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==H_COMMA) {
				{
				setState(135);
				match(H_COMMA);
				}
			}

			setState(138);
			match(HEADER_CURLYCLOSE);
			setState(139);
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
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TITLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				headertitle();
				}
				break;
			case H_COLOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				headercolor();
				}
				break;
			case H_SIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
				headersize();
				}
				break;
			case H_POS:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				headerpos();
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				headerurl();
				}
				break;
			case URLCONTROL:
				enterOuterAlt(_localctx, 6);
				{
				setState(146);
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
			setState(149);
			match(URLCONTROL);
			setState(150);
			match(H_POINTS);
			setState(151);
			match(H_SINGLE_QUOTE);
			setState(152);
			match(H_CHARS);
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
			setState(155);
			match(URL);
			setState(156);
			match(H_POINTS);
			setState(157);
			match(H_SINGLE_QUOTE);
			setState(158);
			match(H_CHARS);
			setState(159);
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
			setState(161);
			match(TITLE);
			setState(162);
			match(H_POINTS);
			setState(163);
			match(H_SINGLE_QUOTE);
			setState(164);
			match(H_CHARS);
			setState(165);
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
			setState(167);
			match(H_POS);
			setState(168);
			match(H_POINTS);
			setState(169);
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
			setState(171);
			match(H_SIZE);
			setState(172);
			match(H_POINTS);
			setState(173);
			match(H_SINGLE_QUOTE);
			setState(174);
			match(H_SIZES);
			setState(175);
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
			setState(177);
			match(H_COLOR);
			setState(178);
			match(H_POINTS);
			setState(179);
			match(H_SINGLE_QUOTE);
			setState(180);
			match(H_COLORS);
			setState(181);
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
			setState(183);
			match(BODY_TAG);
			setState(184);
			match(B_CURLYOPEN);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					attribute_body();
					setState(186);
					match(B_COMMA);
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(193);
			attribute_body();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==B_COMMA) {
				{
				setState(194);
				match(B_COMMA);
				}
			}

			setState(197);
			match(B_CURLYCLOSE);
			setState(198);
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
		public OnclickContext onclick() {
			return getRuleContext(OnclickContext.class,0);
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
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_TAG:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				text();
				}
				break;
			case TI_TAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				textinput();
				}
				break;
			case BUTTON_TAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(202);
				button();
				}
				break;
			case ON_CLICK:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				onclick();
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

	public static class OnclickContext extends ParserRuleContext {
		public TerminalNode ON_CLICK() { return getToken(PARSER.ON_CLICK, 0); }
		public TerminalNode CURLYOPEN_ONCLICK() { return getToken(PARSER.CURLYOPEN_ONCLICK, 0); }
		public TerminalNode CURLYCLOSE_ONCLICK() { return getToken(PARSER.CURLYCLOSE_ONCLICK, 0); }
		public List<Attrbuite_onclickparentContext> attrbuite_onclickparent() {
			return getRuleContexts(Attrbuite_onclickparentContext.class);
		}
		public Attrbuite_onclickparentContext attrbuite_onclickparent(int i) {
			return getRuleContext(Attrbuite_onclickparentContext.class,i);
		}
		public OnclickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onclick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterOnclick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitOnclick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitOnclick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnclickContext onclick() throws RecognitionException {
		OnclickContext _localctx = new OnclickContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_onclick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ON_CLICK);
			setState(207);
			match(CURLYOPEN_ONCLICK);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARS_ONCLICK) {
				{
				{
				setState(208);
				attrbuite_onclickparent();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(CURLYCLOSE_ONCLICK);
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

	public static class Attrbuite_onclickparentContext extends ParserRuleContext {
		public GetDataContext getData() {
			return getRuleContext(GetDataContext.class,0);
		}
		public EqualizationContext equalization() {
			return getRuleContext(EqualizationContext.class,0);
		}
		public Dot_onClickContext dot_onClick() {
			return getRuleContext(Dot_onClickContext.class,0);
		}
		public Attrbuite_onclickparentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrbuite_onclickparent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterAttrbuite_onclickparent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitAttrbuite_onclickparent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitAttrbuite_onclickparent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attrbuite_onclickparentContext attrbuite_onclickparent() throws RecognitionException {
		Attrbuite_onclickparentContext _localctx = new Attrbuite_onclickparentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attrbuite_onclickparent);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				getData();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				equalization();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				dot_onClick();
				}
				break;
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

	public static class GetDataContext extends ParserRuleContext {
		public List<TerminalNode> CHARS_ONCLICK() { return getTokens(PARSER.CHARS_ONCLICK); }
		public TerminalNode CHARS_ONCLICK(int i) {
			return getToken(PARSER.CHARS_ONCLICK, i);
		}
		public TerminalNode EQUAL_ONCLICK() { return getToken(PARSER.EQUAL_ONCLICK, 0); }
		public TerminalNode GET_DATA() { return getToken(PARSER.GET_DATA, 0); }
		public TerminalNode OPEN_GETDATA() { return getToken(PARSER.OPEN_GETDATA, 0); }
		public TerminalNode CLOSE_GETDATA() { return getToken(PARSER.CLOSE_GETDATA, 0); }
		public TerminalNode SEMICOLON_ONCLICK() { return getToken(PARSER.SEMICOLON_ONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_ONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_ONCLICK); }
		public TerminalNode SINGLE_QUOTE_ONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_ONCLICK, i);
		}
		public GetDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterGetData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitGetData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitGetData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetDataContext getData() throws RecognitionException {
		GetDataContext _localctx = new GetDataContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_getData);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(CHARS_ONCLICK);
			setState(222);
			match(EQUAL_ONCLICK);
			setState(223);
			match(GET_DATA);
			setState(224);
			match(OPEN_GETDATA);
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE_ONCLICK:
				{
				{
				setState(225);
				match(SINGLE_QUOTE_ONCLICK);
				setState(226);
				match(CHARS_ONCLICK);
				setState(227);
				match(SINGLE_QUOTE_ONCLICK);
				}
				}
				break;
			case CHARS_ONCLICK:
				{
				{
				setState(228);
				match(CHARS_ONCLICK);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(231);
			match(CLOSE_GETDATA);
			setState(232);
			match(SEMICOLON_ONCLICK);
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

	public static class EqualizationContext extends ParserRuleContext {
		public List<TerminalNode> CHARS_ONCLICK() { return getTokens(PARSER.CHARS_ONCLICK); }
		public TerminalNode CHARS_ONCLICK(int i) {
			return getToken(PARSER.CHARS_ONCLICK, i);
		}
		public TerminalNode EQUAL_ONCLICK() { return getToken(PARSER.EQUAL_ONCLICK, 0); }
		public TerminalNode SEMICOLON_ONCLICK() { return getToken(PARSER.SEMICOLON_ONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_ONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_ONCLICK); }
		public TerminalNode SINGLE_QUOTE_ONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_ONCLICK, i);
		}
		public EqualizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterEqualization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitEqualization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitEqualization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualizationContext equalization() throws RecognitionException {
		EqualizationContext _localctx = new EqualizationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_equalization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(CHARS_ONCLICK);
			setState(235);
			match(EQUAL_ONCLICK);
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTE_ONCLICK:
				{
				{
				setState(236);
				match(SINGLE_QUOTE_ONCLICK);
				setState(237);
				match(CHARS_ONCLICK);
				setState(238);
				match(SINGLE_QUOTE_ONCLICK);
				}
				}
				break;
			case CHARS_ONCLICK:
				{
				{
				setState(239);
				match(CHARS_ONCLICK);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			match(SEMICOLON_ONCLICK);
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

	public static class Dot_onClickContext extends ParserRuleContext {
		public TerminalNode CHARS_ONCLICK() { return getToken(PARSER.CHARS_ONCLICK, 0); }
		public TerminalNode DOT_ONCLICK() { return getToken(PARSER.DOT_ONCLICK, 0); }
		public TerminalNode ONCLICK_FUNCTION() { return getToken(PARSER.ONCLICK_FUNCTION, 0); }
		public TerminalNode CURLYOPEN_INNERONCLICK() { return getToken(PARSER.CURLYOPEN_INNERONCLICK, 0); }
		public Attrbuite_onclickContext attrbuite_onclick() {
			return getRuleContext(Attrbuite_onclickContext.class,0);
		}
		public Dot_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterDot_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitDot_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitDot_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dot_onClickContext dot_onClick() throws RecognitionException {
		Dot_onClickContext _localctx = new Dot_onClickContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dot_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(CHARS_ONCLICK);
			{
			setState(245);
			match(DOT_ONCLICK);
			setState(246);
			match(ONCLICK_FUNCTION);
			setState(247);
			match(CURLYOPEN_INNERONCLICK);
			setState(248);
			attrbuite_onclick();
			}
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

	public static class Attrbuite_onclickContext extends ParserRuleContext {
		public TerminalNode CURLYCLOSE_INNERONCLICK() { return getToken(PARSER.CURLYCLOSE_INNERONCLICK, 0); }
		public TerminalNode SEMICOLON_INNERONCLICK() { return getToken(PARSER.SEMICOLON_INNERONCLICK, 0); }
		public List<TerminalNode> COMMA_INNERONCLICK() { return getTokens(PARSER.COMMA_INNERONCLICK); }
		public TerminalNode COMMA_INNERONCLICK(int i) {
			return getToken(PARSER.COMMA_INNERONCLICK, i);
		}
		public List<Width_onClickContext> width_onClick() {
			return getRuleContexts(Width_onClickContext.class);
		}
		public Width_onClickContext width_onClick(int i) {
			return getRuleContext(Width_onClickContext.class,i);
		}
		public List<Content_onClickContext> content_onClick() {
			return getRuleContexts(Content_onClickContext.class);
		}
		public Content_onClickContext content_onClick(int i) {
			return getRuleContext(Content_onClickContext.class,i);
		}
		public List<Color_onClickContext> color_onClick() {
			return getRuleContexts(Color_onClickContext.class);
		}
		public Color_onClickContext color_onClick(int i) {
			return getRuleContext(Color_onClickContext.class,i);
		}
		public List<Size_onClickContext> size_onClick() {
			return getRuleContexts(Size_onClickContext.class);
		}
		public Size_onClickContext size_onClick(int i) {
			return getRuleContext(Size_onClickContext.class,i);
		}
		public List<Height_onClickContext> height_onClick() {
			return getRuleContexts(Height_onClickContext.class);
		}
		public Height_onClickContext height_onClick(int i) {
			return getRuleContext(Height_onClickContext.class,i);
		}
		public List<Background_onClickContext> background_onClick() {
			return getRuleContexts(Background_onClickContext.class);
		}
		public Background_onClickContext background_onClick(int i) {
			return getRuleContext(Background_onClickContext.class,i);
		}
		public Attrbuite_onclickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrbuite_onclick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterAttrbuite_onclick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitAttrbuite_onclick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitAttrbuite_onclick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attrbuite_onclickContext attrbuite_onclick() throws RecognitionException {
		Attrbuite_onclickContext _localctx = new Attrbuite_onclickContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_attrbuite_onclick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARS_INNERONCLICK) {
				{
				{
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(250);
					width_onClick();
					}
					break;
				case 2:
					{
					setState(251);
					content_onClick();
					}
					break;
				case 3:
					{
					setState(252);
					color_onClick();
					}
					break;
				case 4:
					{
					setState(253);
					size_onClick();
					}
					break;
				case 5:
					{
					setState(254);
					height_onClick();
					}
					break;
				case 6:
					{
					setState(255);
					background_onClick();
					}
					break;
				}
				setState(258);
				match(COMMA_INNERONCLICK);
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(CURLYCLOSE_INNERONCLICK);
			setState(266);
			match(SEMICOLON_INNERONCLICK);
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

	public static class Size_onClickContext extends ParserRuleContext {
		public TerminalNode CHARS_INNERONCLICK() { return getToken(PARSER.CHARS_INNERONCLICK, 0); }
		public TerminalNode DOT_INNERONCLICK() { return getToken(PARSER.DOT_INNERONCLICK, 0); }
		public TerminalNode SIZE_INNERONCLICK() { return getToken(PARSER.SIZE_INNERONCLICK, 0); }
		public TerminalNode EQUAL_INNERONCLICK() { return getToken(PARSER.EQUAL_INNERONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_INNERONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_INNERONCLICK); }
		public TerminalNode SINGLE_QUOTE_INNERONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_INNERONCLICK, i);
		}
		public TerminalNode SIZES_INNERONCLICK() { return getToken(PARSER.SIZES_INNERONCLICK, 0); }
		public Size_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterSize_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitSize_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitSize_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Size_onClickContext size_onClick() throws RecognitionException {
		Size_onClickContext _localctx = new Size_onClickContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_size_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(CHARS_INNERONCLICK);
			setState(269);
			match(DOT_INNERONCLICK);
			setState(270);
			match(SIZE_INNERONCLICK);
			setState(271);
			match(EQUAL_INNERONCLICK);
			setState(272);
			match(SINGLE_QUOTE_INNERONCLICK);
			setState(273);
			match(SIZES_INNERONCLICK);
			setState(274);
			match(SINGLE_QUOTE_INNERONCLICK);
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

	public static class Height_onClickContext extends ParserRuleContext {
		public TerminalNode CHARS_INNERONCLICK() { return getToken(PARSER.CHARS_INNERONCLICK, 0); }
		public TerminalNode DOT_INNERONCLICK() { return getToken(PARSER.DOT_INNERONCLICK, 0); }
		public TerminalNode HEIGHT_INNERONCLICK() { return getToken(PARSER.HEIGHT_INNERONCLICK, 0); }
		public TerminalNode EQUAL_INNERONCLICK() { return getToken(PARSER.EQUAL_INNERONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_INNERONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_INNERONCLICK); }
		public TerminalNode SINGLE_QUOTE_INNERONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_INNERONCLICK, i);
		}
		public TerminalNode SIZES_INNERONCLICK() { return getToken(PARSER.SIZES_INNERONCLICK, 0); }
		public Height_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterHeight_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitHeight_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitHeight_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Height_onClickContext height_onClick() throws RecognitionException {
		Height_onClickContext _localctx = new Height_onClickContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_height_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(CHARS_INNERONCLICK);
			setState(277);
			match(DOT_INNERONCLICK);
			setState(278);
			match(HEIGHT_INNERONCLICK);
			setState(279);
			match(EQUAL_INNERONCLICK);
			setState(280);
			match(SINGLE_QUOTE_INNERONCLICK);
			setState(281);
			match(SIZES_INNERONCLICK);
			setState(282);
			match(SINGLE_QUOTE_INNERONCLICK);
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

	public static class Background_onClickContext extends ParserRuleContext {
		public TerminalNode CHARS_INNERONCLICK() { return getToken(PARSER.CHARS_INNERONCLICK, 0); }
		public TerminalNode DOT_INNERONCLICK() { return getToken(PARSER.DOT_INNERONCLICK, 0); }
		public TerminalNode BACKGROUND_INNERONCLICK() { return getToken(PARSER.BACKGROUND_INNERONCLICK, 0); }
		public TerminalNode EQUAL_INNERONCLICK() { return getToken(PARSER.EQUAL_INNERONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_INNERONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_INNERONCLICK); }
		public TerminalNode SINGLE_QUOTE_INNERONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_INNERONCLICK, i);
		}
		public TerminalNode COLORS_INNERONCLICK() { return getToken(PARSER.COLORS_INNERONCLICK, 0); }
		public Background_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterBackground_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitBackground_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitBackground_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Background_onClickContext background_onClick() throws RecognitionException {
		Background_onClickContext _localctx = new Background_onClickContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_background_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(CHARS_INNERONCLICK);
			setState(285);
			match(DOT_INNERONCLICK);
			setState(286);
			match(BACKGROUND_INNERONCLICK);
			setState(287);
			match(EQUAL_INNERONCLICK);
			setState(288);
			match(SINGLE_QUOTE_INNERONCLICK);
			setState(289);
			match(COLORS_INNERONCLICK);
			setState(290);
			match(SINGLE_QUOTE_INNERONCLICK);
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

	public static class Color_onClickContext extends ParserRuleContext {
		public TerminalNode CHARS_INNERONCLICK() { return getToken(PARSER.CHARS_INNERONCLICK, 0); }
		public TerminalNode DOT_INNERONCLICK() { return getToken(PARSER.DOT_INNERONCLICK, 0); }
		public TerminalNode COLOR_INNERONCLICK() { return getToken(PARSER.COLOR_INNERONCLICK, 0); }
		public TerminalNode EQUAL_INNERONCLICK() { return getToken(PARSER.EQUAL_INNERONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_INNERONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_INNERONCLICK); }
		public TerminalNode SINGLE_QUOTE_INNERONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_INNERONCLICK, i);
		}
		public TerminalNode COLORS_INNERONCLICK() { return getToken(PARSER.COLORS_INNERONCLICK, 0); }
		public Color_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterColor_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitColor_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitColor_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Color_onClickContext color_onClick() throws RecognitionException {
		Color_onClickContext _localctx = new Color_onClickContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_color_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(CHARS_INNERONCLICK);
			setState(293);
			match(DOT_INNERONCLICK);
			setState(294);
			match(COLOR_INNERONCLICK);
			setState(295);
			match(EQUAL_INNERONCLICK);
			setState(296);
			match(SINGLE_QUOTE_INNERONCLICK);
			setState(297);
			match(COLORS_INNERONCLICK);
			setState(298);
			match(SINGLE_QUOTE_INNERONCLICK);
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

	public static class Content_onClickContext extends ParserRuleContext {
		public List<TerminalNode> CHARS_INNERONCLICK() { return getTokens(PARSER.CHARS_INNERONCLICK); }
		public TerminalNode CHARS_INNERONCLICK(int i) {
			return getToken(PARSER.CHARS_INNERONCLICK, i);
		}
		public TerminalNode DOT_INNERONCLICK() { return getToken(PARSER.DOT_INNERONCLICK, 0); }
		public TerminalNode CONTENT_INNERONCLICK() { return getToken(PARSER.CONTENT_INNERONCLICK, 0); }
		public TerminalNode EQUAL_INNERONCLICK() { return getToken(PARSER.EQUAL_INNERONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_INNERONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_INNERONCLICK); }
		public TerminalNode SINGLE_QUOTE_INNERONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_INNERONCLICK, i);
		}
		public Content_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterContent_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitContent_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitContent_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Content_onClickContext content_onClick() throws RecognitionException {
		Content_onClickContext _localctx = new Content_onClickContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_content_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CHARS_INNERONCLICK);
			setState(301);
			match(DOT_INNERONCLICK);
			setState(302);
			match(CONTENT_INNERONCLICK);
			setState(303);
			match(EQUAL_INNERONCLICK);
			setState(304);
			match(SINGLE_QUOTE_INNERONCLICK);
			setState(305);
			match(CHARS_INNERONCLICK);
			setState(306);
			match(SINGLE_QUOTE_INNERONCLICK);
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

	public static class Width_onClickContext extends ParserRuleContext {
		public TerminalNode CHARS_INNERONCLICK() { return getToken(PARSER.CHARS_INNERONCLICK, 0); }
		public TerminalNode DOT_INNERONCLICK() { return getToken(PARSER.DOT_INNERONCLICK, 0); }
		public TerminalNode WIDTH_INNERONCLICK() { return getToken(PARSER.WIDTH_INNERONCLICK, 0); }
		public TerminalNode EQUAL_INNERONCLICK() { return getToken(PARSER.EQUAL_INNERONCLICK, 0); }
		public List<TerminalNode> SINGLE_QUOTE_INNERONCLICK() { return getTokens(PARSER.SINGLE_QUOTE_INNERONCLICK); }
		public TerminalNode SINGLE_QUOTE_INNERONCLICK(int i) {
			return getToken(PARSER.SINGLE_QUOTE_INNERONCLICK, i);
		}
		public TerminalNode SIZES_INNERONCLICK() { return getToken(PARSER.SIZES_INNERONCLICK, 0); }
		public Width_onClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).enterWidth_onClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PARSERListener) ((PARSERListener)listener).exitWidth_onClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PARSERVisitor) return ((PARSERVisitor<? extends T>)visitor).visitWidth_onClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Width_onClickContext width_onClick() throws RecognitionException {
		Width_onClickContext _localctx = new Width_onClickContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_width_onClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(CHARS_INNERONCLICK);
			setState(309);
			match(DOT_INNERONCLICK);
			setState(310);
			match(WIDTH_INNERONCLICK);
			setState(311);
			match(EQUAL_INNERONCLICK);
			setState(312);
			match(SINGLE_QUOTE_INNERONCLICK);
			setState(313);
			match(SIZES_INNERONCLICK);
			setState(314);
			match(SINGLE_QUOTE_INNERONCLICK);
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
		enterRule(_localctx, 46, RULE_text);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TEXT_TAG);
			setState(317);
			match(TEXT_CURLYOPEN);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(318);
					textattribute();
					setState(319);
					match(TEXT_COMMA);
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(326);
			textattribute();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT_COMMA) {
				{
				setState(327);
				match(TEXT_COMMA);
				}
			}

			setState(330);
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
		enterRule(_localctx, 48, RULE_textattribute);
		try {
			setState(338);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT_COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				textcolor();
				}
				break;
			case TEXT_SIZE:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				textsize();
				}
				break;
			case TEXT_POS:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				textpos();
				}
				break;
			case TEXT_CONTENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				textcontent();
				}
				break;
			case MARGIN_TAG:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				textmargin();
				}
				break;
			case TEXT_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
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
		enterRule(_localctx, 50, RULE_textcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(TEXT_COLOR);
			setState(341);
			match(TEXT_COLON);
			setState(342);
			match(TEXT_SINGLE_QUOTE);
			setState(343);
			match(TEXT_COLORS);
			setState(344);
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
		enterRule(_localctx, 52, RULE_textsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(TEXT_SIZE);
			setState(347);
			match(TEXT_COLON);
			setState(348);
			match(TEXT_SINGLE_QUOTE);
			setState(349);
			match(TEXT_SIZES);
			setState(350);
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
		enterRule(_localctx, 54, RULE_textpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(TEXT_POS);
			setState(353);
			match(TEXT_COLON);
			setState(354);
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
		enterRule(_localctx, 56, RULE_textcontent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(TEXT_CONTENT);
			setState(357);
			match(TEXT_COLON);
			setState(358);
			match(TEXT_SINGLE_QUOTE);
			setState(359);
			match(TEXT_CHARS);
			setState(360);
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
		enterRule(_localctx, 58, RULE_textid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(TEXT_ID);
			setState(363);
			match(TEXT_COLON);
			setState(364);
			match(TEXT_SINGLE_QUOTE);
			setState(365);
			match(TEXT_CHARS);
			setState(366);
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
		enterRule(_localctx, 60, RULE_textmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(MARGIN_TAG);
			setState(369);
			match(MARGIN_CURLYOPEN);
			setState(375);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(370);
					marginattribute();
					setState(371);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(378);
			marginattribute();
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(379);
				match(MARGIN_COMMA);
				}
			}

			setState(382);
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
		enterRule(_localctx, 62, RULE_marginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(MARGIN_LOCATION);
			setState(385);
			match(MARGIN_COLON);
			setState(386);
			match(MARGIN_SINGLE_QUOTE);
			setState(387);
			match(MARGIN_SIZES);
			setState(388);
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
		enterRule(_localctx, 64, RULE_button);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(BUTTON_TAG);
			setState(391);
			match(BUTTON_CURLYOPEN);
			setState(397);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					buttonattribute();
					setState(393);
					match(BUTTON_COMMA);
					}
					} 
				}
				setState(399);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(400);
			buttonattribute();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BUTTON_COMMA) {
				{
				setState(401);
				match(BUTTON_COMMA);
				}
			}

			setState(404);
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
		enterRule(_localctx, 66, RULE_buttonattribute);
		try {
			setState(415);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BUTTON_WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				width();
				}
				break;
			case BUTTON_HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				height();
				}
				break;
			case BUTTON_COLOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				buttoncolor();
				}
				break;
			case BUTTON_BACKGROUND:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
				buttonbackground();
				}
				break;
			case BUTTON_TEXT:
				enterOuterAlt(_localctx, 5);
				{
				setState(410);
				textbutton();
				}
				break;
			case BUTTON_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(411);
				buttonid();
				}
				break;
			case BUTTON_MARGIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(412);
				buttonmargin();
				}
				break;
			case BUTTON_EVENT:
				enterOuterAlt(_localctx, 8);
				{
				setState(413);
				event();
				}
				break;
			case BUTTON_POS:
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
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
		enterRule(_localctx, 68, RULE_width);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(BUTTON_WIDTH);
			setState(418);
			match(BUTTON_COLON);
			setState(419);
			match(BUTTON_SINGLE_QUOTE);
			setState(420);
			match(BUTTON_SIZES);
			setState(421);
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
		enterRule(_localctx, 70, RULE_height);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(BUTTON_HEIGHT);
			setState(424);
			match(BUTTON_COLON);
			setState(425);
			match(BUTTON_SINGLE_QUOTE);
			setState(426);
			match(BUTTON_SIZES);
			setState(427);
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
		enterRule(_localctx, 72, RULE_buttoncolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(BUTTON_COLOR);
			setState(430);
			match(BUTTON_COLON);
			setState(431);
			match(BUTTON_SINGLE_QUOTE);
			setState(432);
			match(BUTTON_COLORS);
			setState(433);
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
		enterRule(_localctx, 74, RULE_buttonbackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(BUTTON_BACKGROUND);
			setState(436);
			match(BUTTON_COLON);
			setState(437);
			match(BUTTON_SINGLE_QUOTE);
			setState(438);
			match(BUTTON_COLORS);
			setState(439);
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
		enterRule(_localctx, 76, RULE_textbutton);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(BUTTON_TEXT);
			setState(442);
			match(BUTTON_COLON);
			setState(443);
			match(BUTTON_SINGLE_QUOTE);
			setState(444);
			match(BUTTON_CHARS);
			setState(445);
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
		enterRule(_localctx, 78, RULE_buttonid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(BUTTON_ID);
			setState(448);
			match(BUTTON_COLON);
			setState(449);
			match(BUTTON_SINGLE_QUOTE);
			setState(450);
			match(BUTTON_CHARS);
			setState(451);
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
		enterRule(_localctx, 80, RULE_event);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(BUTTON_EVENT);
			setState(454);
			match(EVENT_CURLYOPEN);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(455);
					eventattribute();
					setState(456);
					match(EVENT_COMMA);
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(463);
			eventattribute();
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVENT_COMMA) {
				{
				setState(464);
				match(EVENT_COMMA);
				}
			}

			setState(467);
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
		enterRule(_localctx, 82, RULE_eventattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
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
		enterRule(_localctx, 84, RULE_buttonpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(BUTTON_POS);
			setState(472);
			match(BUTTON_COLON);
			setState(473);
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
		enterRule(_localctx, 86, RULE_go_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(GOTO);
			setState(476);
			match(EVENT_COLON);
			setState(477);
			match(EVENT_SINGLE_QUOTE);
			setState(478);
			match(EVENT_CHARS);
			setState(479);
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
		enterRule(_localctx, 88, RULE_buttonmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(BUTTON_MARGIN);
			setState(482);
			match(MARGIN_CURLYOPEN);
			setState(488);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					buttonmarginattribute();
					setState(484);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(490);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(491);
			buttonmarginattribute();
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(492);
				match(MARGIN_COMMA);
				}
			}

			setState(495);
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
		enterRule(_localctx, 90, RULE_buttonmarginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(MARGIN_LOCATION);
			setState(498);
			match(MARGIN_COLON);
			setState(499);
			match(MARGIN_SINGLE_QUOTE);
			setState(500);
			match(MARGIN_SIZES);
			setState(501);
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
		enterRule(_localctx, 92, RULE_textinput);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(TI_TAG);
			setState(504);
			match(TI_CURLYOPEN);
			setState(510);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(505);
					textinputattribute();
					setState(506);
					match(TI_COMMA);
					}
					} 
				}
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(513);
			textinputattribute();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TI_COMMA) {
				{
				setState(514);
				match(TI_COMMA);
				}
			}

			setState(517);
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
		enterRule(_localctx, 94, RULE_textinputattribute);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TI_WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				textinputwidth();
				}
				break;
			case TI_POS:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				textinputpos();
				}
				break;
			case TI_HEIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				textinputheight();
				}
				break;
			case TI_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				textinputcolor();
				}
				break;
			case TI_BACKGROUND:
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				textinputbackground();
				}
				break;
			case TI_ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(524);
				textinputid();
				}
				break;
			case TI_MARGIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(525);
				textinputmargin();
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 8);
				{
				setState(526);
				type();
				}
				break;
			case TEXTHINT:
				enterOuterAlt(_localctx, 9);
				{
				setState(527);
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
		enterRule(_localctx, 96, RULE_textinputwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			match(TI_WIDTH);
			setState(531);
			match(TI_COLON);
			setState(532);
			match(TI_SINGLE_QUOTE);
			setState(533);
			match(TI_SIZES);
			setState(534);
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
		enterRule(_localctx, 98, RULE_textinputheight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(TI_HEIGHT);
			setState(537);
			match(TI_COLON);
			setState(538);
			match(TI_SINGLE_QUOTE);
			setState(539);
			match(TI_SIZES);
			setState(540);
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
		enterRule(_localctx, 100, RULE_textinputcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(TI_COLOR);
			setState(543);
			match(TI_COLON);
			setState(544);
			match(TI_SINGLE_QUOTE);
			setState(545);
			match(TI_COLORS);
			setState(546);
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
		enterRule(_localctx, 102, RULE_textinputbackground);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(TI_BACKGROUND);
			setState(549);
			match(TI_COLON);
			setState(550);
			match(TI_SINGLE_QUOTE);
			setState(551);
			match(TI_COLORS);
			setState(552);
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
		enterRule(_localctx, 104, RULE_textinputpos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(TI_POS);
			setState(555);
			match(TI_COLON);
			setState(556);
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
		enterRule(_localctx, 106, RULE_textinputid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(TI_ID);
			setState(559);
			match(TI_COLON);
			setState(560);
			match(TI_SINGLE_QUOTE);
			setState(561);
			match(TI_CHARS);
			setState(562);
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
		enterRule(_localctx, 108, RULE_textinputmargin);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(TI_MARGIN);
			setState(565);
			match(MARGIN_CURLYOPEN);
			setState(571);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(566);
					textinputmarginattribute();
					setState(567);
					match(MARGIN_COMMA);
					}
					} 
				}
				setState(573);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(574);
			textinputmarginattribute();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MARGIN_COMMA) {
				{
				setState(575);
				match(MARGIN_COMMA);
				}
			}

			setState(578);
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
		enterRule(_localctx, 110, RULE_textinputmarginattribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(MARGIN_LOCATION);
			setState(581);
			match(MARGIN_COLON);
			setState(582);
			match(MARGIN_SINGLE_QUOTE);
			setState(583);
			match(MARGIN_SIZES);
			setState(584);
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
		enterRule(_localctx, 112, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			match(TYPE);
			setState(587);
			match(TI_COLON);
			setState(588);
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
		enterRule(_localctx, 114, RULE_text_hint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(TEXTHINT);
			setState(591);
			match(TI_COLON);
			setState(592);
			match(TI_SINGLE_QUOTE);
			setState(593);
			match(TI_CHARS);
			setState(594);
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
		"\u0004\u0001\u00ad\u0255\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000x\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0082"+
		"\b\u0001\n\u0001\f\u0001\u0085\t\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0089\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0094\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u00bd\b\t\n\t\f\t\u00c0\t\t\u0001\t\u0001\t\u0003\t\u00c4\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00cd\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d2\b\u000b\n\u000b\f\u000b"+
		"\u00d5\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00dc\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00e6\b\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f1\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0101\b\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0105\b\u0010\n\u0010\f\u0010\u0108\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u0142\b\u0017\n\u0017\f\u0017\u0145\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0149\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0153"+
		"\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0176\b\u001e\n"+
		"\u001e\f\u001e\u0179\t\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u017d"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u018c\b \n \f \u018f\t \u0001 \u0001 \u0003 \u0193\b \u0001 \u0001 "+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003"+
		"!\u01a0\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0005(\u01cb\b(\n(\f(\u01ce\t(\u0001(\u0001"+
		"(\u0003(\u01d2\b(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u01e7\b,\n,\f,\u01ea\t,\u0001,\u0001,\u0003,\u01ee\b,"+
		"\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0005.\u01fd\b.\n.\f.\u0200\t.\u0001.\u0001.\u0003"+
		".\u0204\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u0211\b/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00016\u0001"+
		"6\u00016\u00016\u00016\u00056\u023a\b6\n6\f6\u023d\t6\u00016\u00016\u0003"+
		"6\u0241\b6\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u0000\u0000:\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000"+
		"\u0000\u0255\u0000w\u0001\u0000\u0000\u0000\u0002|\u0001\u0000\u0000\u0000"+
		"\u0004\u0093\u0001\u0000\u0000\u0000\u0006\u0095\u0001\u0000\u0000\u0000"+
		"\b\u009b\u0001\u0000\u0000\u0000\n\u00a1\u0001\u0000\u0000\u0000\f\u00a7"+
		"\u0001\u0000\u0000\u0000\u000e\u00ab\u0001\u0000\u0000\u0000\u0010\u00b1"+
		"\u0001\u0000\u0000\u0000\u0012\u00b7\u0001\u0000\u0000\u0000\u0014\u00cc"+
		"\u0001\u0000\u0000\u0000\u0016\u00ce\u0001\u0000\u0000\u0000\u0018\u00db"+
		"\u0001\u0000\u0000\u0000\u001a\u00dd\u0001\u0000\u0000\u0000\u001c\u00ea"+
		"\u0001\u0000\u0000\u0000\u001e\u00f4\u0001\u0000\u0000\u0000 \u0106\u0001"+
		"\u0000\u0000\u0000\"\u010c\u0001\u0000\u0000\u0000$\u0114\u0001\u0000"+
		"\u0000\u0000&\u011c\u0001\u0000\u0000\u0000(\u0124\u0001\u0000\u0000\u0000"+
		"*\u012c\u0001\u0000\u0000\u0000,\u0134\u0001\u0000\u0000\u0000.\u013c"+
		"\u0001\u0000\u0000\u00000\u0152\u0001\u0000\u0000\u00002\u0154\u0001\u0000"+
		"\u0000\u00004\u015a\u0001\u0000\u0000\u00006\u0160\u0001\u0000\u0000\u0000"+
		"8\u0164\u0001\u0000\u0000\u0000:\u016a\u0001\u0000\u0000\u0000<\u0170"+
		"\u0001\u0000\u0000\u0000>\u0180\u0001\u0000\u0000\u0000@\u0186\u0001\u0000"+
		"\u0000\u0000B\u019f\u0001\u0000\u0000\u0000D\u01a1\u0001\u0000\u0000\u0000"+
		"F\u01a7\u0001\u0000\u0000\u0000H\u01ad\u0001\u0000\u0000\u0000J\u01b3"+
		"\u0001\u0000\u0000\u0000L\u01b9\u0001\u0000\u0000\u0000N\u01bf\u0001\u0000"+
		"\u0000\u0000P\u01c5\u0001\u0000\u0000\u0000R\u01d5\u0001\u0000\u0000\u0000"+
		"T\u01d7\u0001\u0000\u0000\u0000V\u01db\u0001\u0000\u0000\u0000X\u01e1"+
		"\u0001\u0000\u0000\u0000Z\u01f1\u0001\u0000\u0000\u0000\\\u01f7\u0001"+
		"\u0000\u0000\u0000^\u0210\u0001\u0000\u0000\u0000`\u0212\u0001\u0000\u0000"+
		"\u0000b\u0218\u0001\u0000\u0000\u0000d\u021e\u0001\u0000\u0000\u0000f"+
		"\u0224\u0001\u0000\u0000\u0000h\u022a\u0001\u0000\u0000\u0000j\u022e\u0001"+
		"\u0000\u0000\u0000l\u0234\u0001\u0000\u0000\u0000n\u0244\u0001\u0000\u0000"+
		"\u0000p\u024a\u0001\u0000\u0000\u0000r\u024e\u0001\u0000\u0000\u0000t"+
		"u\u0005\u0005\u0000\u0000uv\u0005\u0007\u0000\u0000vx\u0005\u0006\u0000"+
		"\u0000wt\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000yz\u0003\u0002\u0001\u0000z{\u0003\u0012\t\u0000{\u0001\u0001"+
		"\u0000\u0000\u0000|}\u0005\u000e\u0000\u0000}\u0083\u0005\u0015\u0000"+
		"\u0000~\u007f\u0003\u0004\u0002\u0000\u007f\u0080\u0005\u0019\u0000\u0000"+
		"\u0080\u0082\u0001\u0000\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u0088\u0003\u0004\u0002\u0000\u0087"+
		"\u0089\u0005\u0019\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005$\u0000\u0000\u008b\u008c\u0005\r\u0000\u0000\u008c\u0003"+
		"\u0001\u0000\u0000\u0000\u008d\u0094\u0003\n\u0005\u0000\u008e\u0094\u0003"+
		"\u0010\b\u0000\u008f\u0094\u0003\u000e\u0007\u0000\u0090\u0094\u0003\f"+
		"\u0006\u0000\u0091\u0094\u0003\b\u0004\u0000\u0092\u0094\u0003\u0006\u0003"+
		"\u0000\u0093\u008d\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000"+
		"\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000"+
		"\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0005\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001a\u0000"+
		"\u0000\u0096\u0097\u0005 \u0000\u0000\u0097\u0098\u0005\u0017\u0000\u0000"+
		"\u0098\u0099\u0005#\u0000\u0000\u0099\u009a\u0005\u0017\u0000\u0000\u009a"+
		"\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u001b\u0000\u0000\u009c"+
		"\u009d\u0005 \u0000\u0000\u009d\u009e\u0005\u0017\u0000\u0000\u009e\u009f"+
		"\u0005#\u0000\u0000\u009f\u00a0\u0005\u0017\u0000\u0000\u00a0\t\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005\u0016\u0000\u0000\u00a2\u00a3\u0005"+
		" \u0000\u0000\u00a3\u00a4\u0005\u0017\u0000\u0000\u00a4\u00a5\u0005#\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0017\u0000\u0000\u00a6\u000b\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\u0005\u001f\u0000\u0000\u00a8\u00a9\u0005 \u0000\u0000"+
		"\u00a9\u00aa\u0005\u001e\u0000\u0000\u00aa\r\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u001d\u0000\u0000\u00ac\u00ad\u0005 \u0000\u0000\u00ad\u00ae"+
		"\u0005\u0017\u0000\u0000\u00ae\u00af\u0005\u001c\u0000\u0000\u00af\u00b0"+
		"\u0005\u0017\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0005!\u0000\u0000\u00b2\u00b3\u0005 \u0000\u0000\u00b3\u00b4\u0005\u0017"+
		"\u0000\u0000\u00b4\u00b5\u0005\"\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000"+
		"\u0000\u00b6\u0011\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000f\u0000"+
		"\u0000\u00b8\u00be\u0005)\u0000\u0000\u00b9\u00ba\u0003\u0014\n\u0000"+
		"\u00ba\u00bb\u0005*\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c3\u0003\u0014\n\u0000\u00c2\u00c4\u0005*\u0000\u0000\u00c3\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005/\u0000\u0000\u00c6\u00c7\u0005"+
		"\r\u0000\u0000\u00c7\u0013\u0001\u0000\u0000\u0000\u00c8\u00cd\u0003."+
		"\u0017\u0000\u00c9\u00cd\u0003\\.\u0000\u00ca\u00cd\u0003@ \u0000\u00cb"+
		"\u00cd\u0003\u0016\u000b\u0000\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cd\u0015\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005.\u0000\u0000\u00cf\u00d3\u00054\u0000\u0000\u00d0\u00d2\u0003"+
		"\u0018\f\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u00055\u0000\u0000\u00d7\u0017\u0001\u0000\u0000"+
		"\u0000\u00d8\u00dc\u0003\u001a\r\u0000\u00d9\u00dc\u0003\u001c\u000e\u0000"+
		"\u00da\u00dc\u0003\u001e\u000f\u0000\u00db\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u0019\u0001\u0000\u0000\u0000\u00dd\u00de\u0005>\u0000\u0000\u00de"+
		"\u00df\u0005=\u0000\u0000\u00df\u00e0\u00057\u0000\u0000\u00e0\u00e5\u0005"+
		"8\u0000\u0000\u00e1\u00e2\u0005;\u0000\u0000\u00e2\u00e3\u0005>\u0000"+
		"\u0000\u00e3\u00e6\u0005;\u0000\u0000\u00e4\u00e6\u0005>\u0000\u0000\u00e5"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u00059\u0000\u0000\u00e8\u00e9"+
		"\u0005<\u0000\u0000\u00e9\u001b\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		">\u0000\u0000\u00eb\u00f0\u0005=\u0000\u0000\u00ec\u00ed\u0005;\u0000"+
		"\u0000\u00ed\u00ee\u0005>\u0000\u0000\u00ee\u00f1\u0005;\u0000\u0000\u00ef"+
		"\u00f1\u0005>\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f3"+
		"\u0005<\u0000\u0000\u00f3\u001d\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005"+
		">\u0000\u0000\u00f5\u00f6\u00056\u0000\u0000\u00f6\u00f7\u0005:\u0000"+
		"\u0000\u00f7\u00f8\u0005C\u0000\u0000\u00f8\u00f9\u0003 \u0010\u0000\u00f9"+
		"\u001f\u0001\u0000\u0000\u0000\u00fa\u0101\u0003,\u0016\u0000\u00fb\u0101"+
		"\u0003*\u0015\u0000\u00fc\u0101\u0003(\u0014\u0000\u00fd\u0101\u0003\""+
		"\u0011\u0000\u00fe\u0101\u0003$\u0012\u0000\u00ff\u0101\u0003&\u0013\u0000"+
		"\u0100\u00fa\u0001\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000"+
		"\u0100\u00fc\u0001\u0000\u0000\u0000\u0100\u00fd\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0005Q\u0000\u0000\u0103"+
		"\u0105\u0001\u0000\u0000\u0000\u0104\u0100\u0001\u0000\u0000\u0000\u0105"+
		"\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0005D\u0000\u0000\u010a\u010b"+
		"\u0005E\u0000\u0000\u010b!\u0001\u0000\u0000\u0000\u010c\u010d\u0005R"+
		"\u0000\u0000\u010d\u010e\u0005N\u0000\u0000\u010e\u010f\u0005M\u0000\u0000"+
		"\u010f\u0110\u0005O\u0000\u0000\u0110\u0111\u0005P\u0000\u0000\u0111\u0112"+
		"\u0005G\u0000\u0000\u0112\u0113\u0005P\u0000\u0000\u0113#\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005R\u0000\u0000\u0115\u0116\u0005N\u0000\u0000"+
		"\u0116\u0117\u0005L\u0000\u0000\u0117\u0118\u0005O\u0000\u0000\u0118\u0119"+
		"\u0005P\u0000\u0000\u0119\u011a\u0005G\u0000\u0000\u011a\u011b\u0005P"+
		"\u0000\u0000\u011b%\u0001\u0000\u0000\u0000\u011c\u011d\u0005R\u0000\u0000"+
		"\u011d\u011e\u0005N\u0000\u0000\u011e\u011f\u0005K\u0000\u0000\u011f\u0120"+
		"\u0005O\u0000\u0000\u0120\u0121\u0005P\u0000\u0000\u0121\u0122\u0005F"+
		"\u0000\u0000\u0122\u0123\u0005P\u0000\u0000\u0123\'\u0001\u0000\u0000"+
		"\u0000\u0124\u0125\u0005R\u0000\u0000\u0125\u0126\u0005N\u0000\u0000\u0126"+
		"\u0127\u0005J\u0000\u0000\u0127\u0128\u0005O\u0000\u0000\u0128\u0129\u0005"+
		"P\u0000\u0000\u0129\u012a\u0005F\u0000\u0000\u012a\u012b\u0005P\u0000"+
		"\u0000\u012b)\u0001\u0000\u0000\u0000\u012c\u012d\u0005R\u0000\u0000\u012d"+
		"\u012e\u0005N\u0000\u0000\u012e\u012f\u0005I\u0000\u0000\u012f\u0130\u0005"+
		"O\u0000\u0000\u0130\u0131\u0005P\u0000\u0000\u0131\u0132\u0005R\u0000"+
		"\u0000\u0132\u0133\u0005P\u0000\u0000\u0133+\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0005R\u0000\u0000\u0135\u0136\u0005N\u0000\u0000\u0136\u0137\u0005"+
		"H\u0000\u0000\u0137\u0138\u0005O\u0000\u0000\u0138\u0139\u0005P\u0000"+
		"\u0000\u0139\u013a\u0005G\u0000\u0000\u013a\u013b\u0005P\u0000\u0000\u013b"+
		"-\u0001\u0000\u0000\u0000\u013c\u013d\u0005+\u0000\u0000\u013d\u0143\u0005"+
		"W\u0000\u0000\u013e\u013f\u00030\u0018\u0000\u013f\u0140\u0005Z\u0000"+
		"\u0000\u0140\u0142\u0001\u0000\u0000\u0000\u0141\u013e\u0001\u0000\u0000"+
		"\u0000\u0142\u0145\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000"+
		"\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0146\u0148\u00030\u0018\u0000"+
		"\u0147\u0149\u0005Z\u0000\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005f\u0000\u0000\u014b/\u0001\u0000\u0000\u0000\u014c\u0153\u0003"+
		"2\u0019\u0000\u014d\u0153\u00034\u001a\u0000\u014e\u0153\u00036\u001b"+
		"\u0000\u014f\u0153\u00038\u001c\u0000\u0150\u0153\u0003<\u001e\u0000\u0151"+
		"\u0153\u0003:\u001d\u0000\u0152\u014c\u0001\u0000\u0000\u0000\u0152\u014d"+
		"\u0001\u0000\u0000\u0000\u0152\u014e\u0001\u0000\u0000\u0000\u0152\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0152\u0151"+
		"\u0001\u0000\u0000\u0000\u01531\u0001\u0000\u0000\u0000\u0154\u0155\u0005"+
		"\\\u0000\u0000\u0155\u0156\u0005X\u0000\u0000\u0156\u0157\u0005Y\u0000"+
		"\u0000\u0157\u0158\u0005]\u0000\u0000\u0158\u0159\u0005Y\u0000\u0000\u0159"+
		"3\u0001\u0000\u0000\u0000\u015a\u015b\u0005_\u0000\u0000\u015b\u015c\u0005"+
		"X\u0000\u0000\u015c\u015d\u0005Y\u0000\u0000\u015d\u015e\u0005`\u0000"+
		"\u0000\u015e\u015f\u0005Y\u0000\u0000\u015f5\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0005c\u0000\u0000\u0161\u0162\u0005X\u0000\u0000\u0162\u0163\u0005"+
		"b\u0000\u0000\u01637\u0001\u0000\u0000\u0000\u0164\u0165\u0005^\u0000"+
		"\u0000\u0165\u0166\u0005X\u0000\u0000\u0166\u0167\u0005Y\u0000\u0000\u0167"+
		"\u0168\u0005e\u0000\u0000\u0168\u0169\u0005Y\u0000\u0000\u01699\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0005a\u0000\u0000\u016b\u016c\u0005X\u0000"+
		"\u0000\u016c\u016d\u0005Y\u0000\u0000\u016d\u016e\u0005e\u0000\u0000\u016e"+
		"\u016f\u0005Y\u0000\u0000\u016f;\u0001\u0000\u0000\u0000\u0170\u0171\u0005"+
		"d\u0000\u0000\u0171\u0177\u0005k\u0000\u0000\u0172\u0173\u0003>\u001f"+
		"\u0000\u0173\u0174\u0005m\u0000\u0000\u0174\u0176\u0001\u0000\u0000\u0000"+
		"\u0175\u0172\u0001\u0000\u0000\u0000\u0176\u0179\u0001\u0000\u0000\u0000"+
		"\u0177\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017a\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000\u0000\u0000"+
		"\u017a\u017c\u0003>\u001f\u0000\u017b\u017d\u0005m\u0000\u0000\u017c\u017b"+
		"\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e"+
		"\u0001\u0000\u0000\u0000\u017e\u017f\u0005r\u0000\u0000\u017f=\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0005p\u0000\u0000\u0181\u0182\u0005l\u0000\u0000"+
		"\u0182\u0183\u0005n\u0000\u0000\u0183\u0184\u0005q\u0000\u0000\u0184\u0185"+
		"\u0005n\u0000\u0000\u0185?\u0001\u0000\u0000\u0000\u0186\u0187\u0005,"+
		"\u0000\u0000\u0187\u018d\u0005y\u0000\u0000\u0188\u0189\u0003B!\u0000"+
		"\u0189\u018a\u0005|\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b"+
		"\u0188\u0001\u0000\u0000\u0000\u018c\u018f\u0001\u0000\u0000\u0000\u018d"+
		"\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u0190\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190"+
		"\u0192\u0003B!\u0000\u0191\u0193\u0005|\u0000\u0000\u0192\u0191\u0001"+
		"\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0195\u0005\u0088\u0000\u0000\u0195A\u0001\u0000"+
		"\u0000\u0000\u0196\u01a0\u0003D\"\u0000\u0197\u01a0\u0003F#\u0000\u0198"+
		"\u01a0\u0003H$\u0000\u0199\u01a0\u0003J%\u0000\u019a\u01a0\u0003L&\u0000"+
		"\u019b\u01a0\u0003N\'\u0000\u019c\u01a0\u0003X,\u0000\u019d\u01a0\u0003"+
		"P(\u0000\u019e\u01a0\u0003T*\u0000\u019f\u0196\u0001\u0000\u0000\u0000"+
		"\u019f\u0197\u0001\u0000\u0000\u0000\u019f\u0198\u0001\u0000\u0000\u0000"+
		"\u019f\u0199\u0001\u0000\u0000\u0000\u019f\u019a\u0001\u0000\u0000\u0000"+
		"\u019f\u019b\u0001\u0000\u0000\u0000\u019f\u019c\u0001\u0000\u0000\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000"+
		"\u01a0C\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005~\u0000\u0000\u01a2\u01a3"+
		"\u0005z\u0000\u0000\u01a3\u01a4\u0005{\u0000\u0000\u01a4\u01a5\u0005\u0080"+
		"\u0000\u0000\u01a5\u01a6\u0005{\u0000\u0000\u01a6E\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0005\u007f\u0000\u0000\u01a8\u01a9\u0005z\u0000\u0000\u01a9"+
		"\u01aa\u0005{\u0000\u0000\u01aa\u01ab\u0005\u0080\u0000\u0000\u01ab\u01ac"+
		"\u0005{\u0000\u0000\u01acG\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u0081"+
		"\u0000\u0000\u01ae\u01af\u0005z\u0000\u0000\u01af\u01b0\u0005{\u0000\u0000"+
		"\u01b0\u01b1\u0005\u0082\u0000\u0000\u01b1\u01b2\u0005{\u0000\u0000\u01b2"+
		"I\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u0083\u0000\u0000\u01b4\u01b5"+
		"\u0005z\u0000\u0000\u01b5\u01b6\u0005{\u0000\u0000\u01b6\u01b7\u0005\u0082"+
		"\u0000\u0000\u01b7\u01b8\u0005{\u0000\u0000\u01b8K\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0005\u0085\u0000\u0000\u01ba\u01bb\u0005z\u0000\u0000\u01bb"+
		"\u01bc\u0005{\u0000\u0000\u01bc\u01bd\u0005\u0089\u0000\u0000\u01bd\u01be"+
		"\u0005{\u0000\u0000\u01beM\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005\u0084"+
		"\u0000\u0000\u01c0\u01c1\u0005z\u0000\u0000\u01c1\u01c2\u0005{\u0000\u0000"+
		"\u01c2\u01c3\u0005\u0089\u0000\u0000\u01c3\u01c4\u0005{\u0000\u0000\u01c4"+
		"O\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005\u0087\u0000\u0000\u01c6\u01cc"+
		"\u0005\u008e\u0000\u0000\u01c7\u01c8\u0003R)\u0000\u01c8\u01c9\u0005\u0091"+
		"\u0000\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c7\u0001\u0000"+
		"\u0000\u0000\u01cb\u01ce\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01cf\u01d1\u0003R)\u0000"+
		"\u01d0\u01d2\u0005\u0091\u0000\u0000\u01d1\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005\u0095\u0000\u0000\u01d4Q\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d6\u0003V+\u0000\u01d6S\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005"+
		"w\u0000\u0000\u01d8\u01d9\u0005z\u0000\u0000\u01d9\u01da\u0005x\u0000"+
		"\u0000\u01daU\u0001\u0000\u0000\u0000\u01db\u01dc\u0005\u0093\u0000\u0000"+
		"\u01dc\u01dd\u0005\u008f\u0000\u0000\u01dd\u01de\u0005\u0090\u0000\u0000"+
		"\u01de\u01df\u0005\u0094\u0000\u0000\u01df\u01e0\u0005\u0090\u0000\u0000"+
		"\u01e0W\u0001\u0000\u0000\u0000\u01e1\u01e2\u0005\u0086\u0000\u0000\u01e2"+
		"\u01e8\u0005k\u0000\u0000\u01e3\u01e4\u0003Z-\u0000\u01e4\u01e5\u0005"+
		"m\u0000\u0000\u01e5\u01e7\u0001\u0000\u0000\u0000\u01e6\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e7\u01ea\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01eb\u0001\u0000"+
		"\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ed\u0003Z-\u0000"+
		"\u01ec\u01ee\u0005m\u0000\u0000\u01ed\u01ec\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f0\u0005r\u0000\u0000\u01f0Y\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005"+
		"p\u0000\u0000\u01f2\u01f3\u0005l\u0000\u0000\u01f3\u01f4\u0005n\u0000"+
		"\u0000\u01f4\u01f5\u0005q\u0000\u0000\u01f5\u01f6\u0005n\u0000\u0000\u01f6"+
		"[\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005-\u0000\u0000\u01f8\u01fe\u0005"+
		"\u009c\u0000\u0000\u01f9\u01fa\u0003^/\u0000\u01fa\u01fb\u0005\u009f\u0000"+
		"\u0000\u01fb\u01fd\u0001\u0000\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fd\u0200\u0001\u0000\u0000\u0000\u01fe\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff\u0201\u0001\u0000\u0000"+
		"\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0201\u0203\u0003^/\u0000\u0202"+
		"\u0204\u0005\u009f\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203"+
		"\u0204\u0001\u0000\u0000\u0000\u0204\u0205\u0001\u0000\u0000\u0000\u0205"+
		"\u0206\u0005\u00ad\u0000\u0000\u0206]\u0001\u0000\u0000\u0000\u0207\u0211"+
		"\u0003`0\u0000\u0208\u0211\u0003h4\u0000\u0209\u0211\u0003b1\u0000\u020a"+
		"\u0211\u0003d2\u0000\u020b\u0211\u0003f3\u0000\u020c\u0211\u0003j5\u0000"+
		"\u020d\u0211\u0003l6\u0000\u020e\u0211\u0003p8\u0000\u020f\u0211\u0003"+
		"r9\u0000\u0210\u0207\u0001\u0000\u0000\u0000\u0210\u0208\u0001\u0000\u0000"+
		"\u0000\u0210\u0209\u0001\u0000\u0000\u0000\u0210\u020a\u0001\u0000\u0000"+
		"\u0000\u0210\u020b\u0001\u0000\u0000\u0000\u0210\u020c\u0001\u0000\u0000"+
		"\u0000\u0210\u020d\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000"+
		"\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0211_\u0001\u0000\u0000\u0000"+
		"\u0212\u0213\u0005\u00a1\u0000\u0000\u0213\u0214\u0005\u009d\u0000\u0000"+
		"\u0214\u0215\u0005\u009e\u0000\u0000\u0215\u0216\u0005\u00a3\u0000\u0000"+
		"\u0216\u0217\u0005\u009e\u0000\u0000\u0217a\u0001\u0000\u0000\u0000\u0218"+
		"\u0219\u0005\u00a2\u0000\u0000\u0219\u021a\u0005\u009d\u0000\u0000\u021a"+
		"\u021b\u0005\u009e\u0000\u0000\u021b\u021c\u0005\u00a3\u0000\u0000\u021c"+
		"\u021d\u0005\u009e\u0000\u0000\u021dc\u0001\u0000\u0000\u0000\u021e\u021f"+
		"\u0005\u00a4\u0000\u0000\u021f\u0220\u0005\u009d\u0000\u0000\u0220\u0221"+
		"\u0005\u009e\u0000\u0000\u0221\u0222\u0005\u00a5\u0000\u0000\u0222\u0223"+
		"\u0005\u009e\u0000\u0000\u0223e\u0001\u0000\u0000\u0000\u0224\u0225\u0005"+
		"\u00a6\u0000\u0000\u0225\u0226\u0005\u009d\u0000\u0000\u0226\u0227\u0005"+
		"\u009e\u0000\u0000\u0227\u0228\u0005\u00a5\u0000\u0000\u0228\u0229\u0005"+
		"\u009e\u0000\u0000\u0229g\u0001\u0000\u0000\u0000\u022a\u022b\u0005\u009a"+
		"\u0000\u0000\u022b\u022c\u0005\u009d\u0000\u0000\u022c\u022d\u0005\u009b"+
		"\u0000\u0000\u022di\u0001\u0000\u0000\u0000\u022e\u022f\u0005\u00a7\u0000"+
		"\u0000\u022f\u0230\u0005\u009d\u0000\u0000\u0230\u0231\u0005\u009e\u0000"+
		"\u0000\u0231\u0232\u0005\u00ac\u0000\u0000\u0232\u0233\u0005\u009e\u0000"+
		"\u0000\u0233k\u0001\u0000\u0000\u0000\u0234\u0235\u0005\u00a8\u0000\u0000"+
		"\u0235\u023b\u0005k\u0000\u0000\u0236\u0237\u0003n7\u0000\u0237\u0238"+
		"\u0005m\u0000\u0000\u0238\u023a\u0001\u0000\u0000\u0000\u0239\u0236\u0001"+
		"\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239\u0001"+
		"\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0001"+
		"\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0240\u0003"+
		"n7\u0000\u023f\u0241\u0005m\u0000\u0000\u0240\u023f\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0005r\u0000\u0000\u0243m\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0005p\u0000\u0000\u0245\u0246\u0005l\u0000\u0000\u0246\u0247\u0005"+
		"n\u0000\u0000\u0247\u0248\u0005q\u0000\u0000\u0248\u0249\u0005n\u0000"+
		"\u0000\u0249o\u0001\u0000\u0000\u0000\u024a\u024b\u0005\u00aa\u0000\u0000"+
		"\u024b\u024c\u0005\u009d\u0000\u0000\u024c\u024d\u0005\u00ab\u0000\u0000"+
		"\u024dq\u0001\u0000\u0000\u0000\u024e\u024f\u0005\u00a9\u0000\u0000\u024f"+
		"\u0250\u0005\u009d\u0000\u0000\u0250\u0251\u0005\u009e\u0000\u0000\u0251"+
		"\u0252\u0005\u00ac\u0000\u0000\u0252\u0253\u0005\u009e\u0000\u0000\u0253"+
		"s\u0001\u0000\u0000\u0000\u001ew\u0083\u0088\u0093\u00be\u00c3\u00cc\u00d3"+
		"\u00db\u00e5\u00f0\u0100\u0106\u0143\u0148\u0152\u0177\u017c\u018d\u0192"+
		"\u019f\u01cc\u01d1\u01e8\u01ed\u01fe\u0203\u0210\u023b\u0240";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}