// Generated from C:/Users/maher/Desktop/algorithm\PARSER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PARSER}.
 */
public interface PARSERListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PARSER#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PARSER.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PARSER.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(PARSER.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(PARSER.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#attribute_header}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_header(PARSER.Attribute_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#attribute_header}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_header(PARSER.Attribute_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#header_url_control}.
	 * @param ctx the parse tree
	 */
	void enterHeader_url_control(PARSER.Header_url_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#header_url_control}.
	 * @param ctx the parse tree
	 */
	void exitHeader_url_control(PARSER.Header_url_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#headerurl}.
	 * @param ctx the parse tree
	 */
	void enterHeaderurl(PARSER.HeaderurlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#headerurl}.
	 * @param ctx the parse tree
	 */
	void exitHeaderurl(PARSER.HeaderurlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#headertitle}.
	 * @param ctx the parse tree
	 */
	void enterHeadertitle(PARSER.HeadertitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#headertitle}.
	 * @param ctx the parse tree
	 */
	void exitHeadertitle(PARSER.HeadertitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#headerpos}.
	 * @param ctx the parse tree
	 */
	void enterHeaderpos(PARSER.HeaderposContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#headerpos}.
	 * @param ctx the parse tree
	 */
	void exitHeaderpos(PARSER.HeaderposContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#headersize}.
	 * @param ctx the parse tree
	 */
	void enterHeadersize(PARSER.HeadersizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#headersize}.
	 * @param ctx the parse tree
	 */
	void exitHeadersize(PARSER.HeadersizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#headercolor}.
	 * @param ctx the parse tree
	 */
	void enterHeadercolor(PARSER.HeadercolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#headercolor}.
	 * @param ctx the parse tree
	 */
	void exitHeadercolor(PARSER.HeadercolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PARSER.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PARSER.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#attribute_body}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_body(PARSER.Attribute_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#attribute_body}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_body(PARSER.Attribute_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#text}.
	 * @param ctx the parse tree
	 */
	void enterText(PARSER.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#text}.
	 * @param ctx the parse tree
	 */
	void exitText(PARSER.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textattribute}.
	 * @param ctx the parse tree
	 */
	void enterTextattribute(PARSER.TextattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textattribute}.
	 * @param ctx the parse tree
	 */
	void exitTextattribute(PARSER.TextattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textcolor}.
	 * @param ctx the parse tree
	 */
	void enterTextcolor(PARSER.TextcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textcolor}.
	 * @param ctx the parse tree
	 */
	void exitTextcolor(PARSER.TextcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textsize}.
	 * @param ctx the parse tree
	 */
	void enterTextsize(PARSER.TextsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textsize}.
	 * @param ctx the parse tree
	 */
	void exitTextsize(PARSER.TextsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textpos}.
	 * @param ctx the parse tree
	 */
	void enterTextpos(PARSER.TextposContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textpos}.
	 * @param ctx the parse tree
	 */
	void exitTextpos(PARSER.TextposContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textcontent}.
	 * @param ctx the parse tree
	 */
	void enterTextcontent(PARSER.TextcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textcontent}.
	 * @param ctx the parse tree
	 */
	void exitTextcontent(PARSER.TextcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textid}.
	 * @param ctx the parse tree
	 */
	void enterTextid(PARSER.TextidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textid}.
	 * @param ctx the parse tree
	 */
	void exitTextid(PARSER.TextidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textmargin}.
	 * @param ctx the parse tree
	 */
	void enterTextmargin(PARSER.TextmarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textmargin}.
	 * @param ctx the parse tree
	 */
	void exitTextmargin(PARSER.TextmarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#marginattribute}.
	 * @param ctx the parse tree
	 */
	void enterMarginattribute(PARSER.MarginattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#marginattribute}.
	 * @param ctx the parse tree
	 */
	void exitMarginattribute(PARSER.MarginattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(PARSER.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(PARSER.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttonattribute}.
	 * @param ctx the parse tree
	 */
	void enterButtonattribute(PARSER.ButtonattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttonattribute}.
	 * @param ctx the parse tree
	 */
	void exitButtonattribute(PARSER.ButtonattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(PARSER.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(PARSER.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(PARSER.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(PARSER.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttoncolor}.
	 * @param ctx the parse tree
	 */
	void enterButtoncolor(PARSER.ButtoncolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttoncolor}.
	 * @param ctx the parse tree
	 */
	void exitButtoncolor(PARSER.ButtoncolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttonbackground}.
	 * @param ctx the parse tree
	 */
	void enterButtonbackground(PARSER.ButtonbackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttonbackground}.
	 * @param ctx the parse tree
	 */
	void exitButtonbackground(PARSER.ButtonbackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textbutton}.
	 * @param ctx the parse tree
	 */
	void enterTextbutton(PARSER.TextbuttonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textbutton}.
	 * @param ctx the parse tree
	 */
	void exitTextbutton(PARSER.TextbuttonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttonid}.
	 * @param ctx the parse tree
	 */
	void enterButtonid(PARSER.ButtonidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttonid}.
	 * @param ctx the parse tree
	 */
	void exitButtonid(PARSER.ButtonidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(PARSER.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(PARSER.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#eventattribute}.
	 * @param ctx the parse tree
	 */
	void enterEventattribute(PARSER.EventattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#eventattribute}.
	 * @param ctx the parse tree
	 */
	void exitEventattribute(PARSER.EventattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttonpos}.
	 * @param ctx the parse tree
	 */
	void enterButtonpos(PARSER.ButtonposContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttonpos}.
	 * @param ctx the parse tree
	 */
	void exitButtonpos(PARSER.ButtonposContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#go_to}.
	 * @param ctx the parse tree
	 */
	void enterGo_to(PARSER.Go_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#go_to}.
	 * @param ctx the parse tree
	 */
	void exitGo_to(PARSER.Go_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttonmargin}.
	 * @param ctx the parse tree
	 */
	void enterButtonmargin(PARSER.ButtonmarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttonmargin}.
	 * @param ctx the parse tree
	 */
	void exitButtonmargin(PARSER.ButtonmarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#buttonmarginattribute}.
	 * @param ctx the parse tree
	 */
	void enterButtonmarginattribute(PARSER.ButtonmarginattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#buttonmarginattribute}.
	 * @param ctx the parse tree
	 */
	void exitButtonmarginattribute(PARSER.ButtonmarginattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinput}.
	 * @param ctx the parse tree
	 */
	void enterTextinput(PARSER.TextinputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinput}.
	 * @param ctx the parse tree
	 */
	void exitTextinput(PARSER.TextinputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputattribute}.
	 * @param ctx the parse tree
	 */
	void enterTextinputattribute(PARSER.TextinputattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputattribute}.
	 * @param ctx the parse tree
	 */
	void exitTextinputattribute(PARSER.TextinputattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputwidth}.
	 * @param ctx the parse tree
	 */
	void enterTextinputwidth(PARSER.TextinputwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputwidth}.
	 * @param ctx the parse tree
	 */
	void exitTextinputwidth(PARSER.TextinputwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputheight}.
	 * @param ctx the parse tree
	 */
	void enterTextinputheight(PARSER.TextinputheightContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputheight}.
	 * @param ctx the parse tree
	 */
	void exitTextinputheight(PARSER.TextinputheightContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputcolor}.
	 * @param ctx the parse tree
	 */
	void enterTextinputcolor(PARSER.TextinputcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputcolor}.
	 * @param ctx the parse tree
	 */
	void exitTextinputcolor(PARSER.TextinputcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputbackground}.
	 * @param ctx the parse tree
	 */
	void enterTextinputbackground(PARSER.TextinputbackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputbackground}.
	 * @param ctx the parse tree
	 */
	void exitTextinputbackground(PARSER.TextinputbackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputpos}.
	 * @param ctx the parse tree
	 */
	void enterTextinputpos(PARSER.TextinputposContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputpos}.
	 * @param ctx the parse tree
	 */
	void exitTextinputpos(PARSER.TextinputposContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputid}.
	 * @param ctx the parse tree
	 */
	void enterTextinputid(PARSER.TextinputidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputid}.
	 * @param ctx the parse tree
	 */
	void exitTextinputid(PARSER.TextinputidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputmargin}.
	 * @param ctx the parse tree
	 */
	void enterTextinputmargin(PARSER.TextinputmarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputmargin}.
	 * @param ctx the parse tree
	 */
	void exitTextinputmargin(PARSER.TextinputmarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#textinputmarginattribute}.
	 * @param ctx the parse tree
	 */
	void enterTextinputmarginattribute(PARSER.TextinputmarginattributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#textinputmarginattribute}.
	 * @param ctx the parse tree
	 */
	void exitTextinputmarginattribute(PARSER.TextinputmarginattributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PARSER.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PARSER.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PARSER#text_hint}.
	 * @param ctx the parse tree
	 */
	void enterText_hint(PARSER.Text_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PARSER#text_hint}.
	 * @param ctx the parse tree
	 */
	void exitText_hint(PARSER.Text_hintContext ctx);
}