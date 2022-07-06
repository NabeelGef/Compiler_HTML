// Generated from C:/Users/maher/Desktop/algorithm\PARSERCONTROLLER.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PARSERCONTROLLER}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PARSERCONTROLLERVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PARSERCONTROLLER.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#code_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(PARSERCONTROLLER.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#on_click}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_click(PARSERCONTROLLER.On_clickContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#click_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClick_attribute(PARSERCONTROLLER.Click_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(PARSERCONTROLLER.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#text_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_attribute(PARSERCONTROLLER.Text_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(PARSERCONTROLLER.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(PARSERCONTROLLER.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(PARSERCONTROLLER.ButtonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#button_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton_attribute(PARSERCONTROLLER.Button_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(PARSERCONTROLLER.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#background}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackground(PARSERCONTROLLER.BackgroundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PARSERCONTROLLER.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#printattribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#getdata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetdata(PARSERCONTROLLER.GetdataContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#print_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_text(PARSERCONTROLLER.Print_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(PARSERCONTROLLER.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variable_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#fast_math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFast_math(PARSERCONTROLLER.Fast_mathContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#adding_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#minus_one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#number_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variable_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_text(PARSERCONTROLLER.Variable_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#variable_get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx);
	/**
	 * Visit a parse tree produced by {@link PARSERCONTROLLER#textinput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextinput(PARSERCONTROLLER.TextinputContext ctx);
}