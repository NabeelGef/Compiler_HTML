package generated;// Generated from C:/Users/maher/Desktop/algorithm\PARSER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PARSER}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PARSERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PARSER#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PARSER.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(PARSER.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#attribute_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_header(PARSER.Attribute_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#header_url_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_url_control(PARSER.Header_url_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#headerurl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderurl(PARSER.HeaderurlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#headertitle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadertitle(PARSER.HeadertitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#headerpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeaderpos(PARSER.HeaderposContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#headersize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadersize(PARSER.HeadersizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#headercolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeadercolor(PARSER.HeadercolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PARSER.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#attribute_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_body(PARSER.Attribute_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(PARSER.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextattribute(PARSER.TextattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextcolor(PARSER.TextcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textsize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextsize(PARSER.TextsizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextpos(PARSER.TextposContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextcontent(PARSER.TextcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextid(PARSER.TextidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textmargin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextmargin(PARSER.TextmarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#marginattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMarginattribute(PARSER.MarginattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(PARSER.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttonattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonattribute(PARSER.ButtonattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(PARSER.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(PARSER.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttoncolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtoncolor(PARSER.ButtoncolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttonbackground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonbackground(PARSER.ButtonbackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textbutton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextbutton(PARSER.TextbuttonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttonid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonid(PARSER.ButtonidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(PARSER.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#eventattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventattribute(PARSER.EventattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttonpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonpos(PARSER.ButtonposContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#go_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_to(PARSER.Go_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttonmargin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonmargin(PARSER.ButtonmarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#buttonmarginattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButtonmarginattribute(PARSER.ButtonmarginattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinput(PARSER.TextinputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputattribute(PARSER.TextinputattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputwidth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputwidth(PARSER.TextinputwidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputheight}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputheight(PARSER.TextinputheightContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputcolor(PARSER.TextinputcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputbackground}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputbackground(PARSER.TextinputbackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputpos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputpos(PARSER.TextinputposContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputid(PARSER.TextinputidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputmargin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputmargin(PARSER.TextinputmarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#textinputmarginattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinputmarginattribute(PARSER.TextinputmarginattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PARSER.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSER#text_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_hint(PARSER.Text_hintContext ctx);
}