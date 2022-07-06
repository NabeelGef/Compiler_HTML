package com.company.ast.visitor;

import generated.PARSERCONTROLLER;
import generated.PARSERCONTROLLERBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class BaseVisitorController extends PARSERCONTROLLERBaseVisitor {
    @Override
    public Object visitProgram(PARSERCONTROLLER.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitCode_attribute(PARSERCONTROLLER.Code_attributeContext ctx) {
        return super.visitCode_attribute(ctx);
    }

    @Override
    public Object visitComment(PARSERCONTROLLER.CommentContext ctx) {
        return super.visitComment(ctx);
    }

    @Override
    public Object visitOn_click(PARSERCONTROLLER.On_clickContext ctx) {
        return super.visitOn_click(ctx);
    }

    @Override
    public Object visitClick_attribute(PARSERCONTROLLER.Click_attributeContext ctx) {
        return super.visitClick_attribute(ctx);
    }

    @Override
    public Object visitText(PARSERCONTROLLER.TextContext ctx) {
        return super.visitText(ctx);
    }

    @Override
    public Object visitText_attribute(PARSERCONTROLLER.Text_attributeContext ctx) {
        return super.visitText_attribute(ctx);
    }

    @Override
    public Object visitContent(PARSERCONTROLLER.ContentContext ctx) {
        return super.visitContent(ctx);
    }

    @Override
    public Object visitColor(PARSERCONTROLLER.ColorContext ctx) {
        return super.visitColor(ctx);
    }

    @Override
    public Object visitButton(PARSERCONTROLLER.ButtonContext ctx) {
        return super.visitButton(ctx);
    }

    @Override
    public Object visitButton_attribute(PARSERCONTROLLER.Button_attributeContext ctx) {
        return super.visitButton_attribute(ctx);
    }

    @Override
    public Object visitWidth(PARSERCONTROLLER.WidthContext ctx) {
        return super.visitWidth(ctx);
    }

    @Override
    public Object visitBackground(PARSERCONTROLLER.BackgroundContext ctx) {
        return super.visitBackground(ctx);
    }

    @Override
    public Object visitPrint(PARSERCONTROLLER.PrintContext ctx) {
        return super.visitPrint(ctx);
    }

    @Override
    public Object visitPrintattribute(PARSERCONTROLLER.PrintattributeContext ctx) {
        return super.visitPrintattribute(ctx);
    }

    @Override
    public Object visitGetdata(PARSERCONTROLLER.GetdataContext ctx) {
        return super.visitGetdata(ctx);
    }

    @Override
    public Object visitPrint_text(PARSERCONTROLLER.Print_textContext ctx) {
        return super.visitPrint_text(ctx);
    }

    @Override
    public Object visitVariables(PARSERCONTROLLER.VariablesContext ctx) {
        return super.visitVariables(ctx);
    }

    @Override
    public Object visitVariable_number(PARSERCONTROLLER.Variable_numberContext ctx) {
        return super.visitVariable_number(ctx);
    }

    @Override
    public Object visitFast_math(PARSERCONTROLLER.Fast_mathContext ctx) {
        return super.visitFast_math(ctx);
    }

    @Override
    public Object visitAdding_one(PARSERCONTROLLER.Adding_oneContext ctx) {
        return super.visitAdding_one(ctx);
    }

    @Override
    public Object visitMinus_one(PARSERCONTROLLER.Minus_oneContext ctx) {
        return super.visitMinus_one(ctx);
    }

    @Override
    public Object visitNumber_attribute(PARSERCONTROLLER.Number_attributeContext ctx) {
        return super.visitNumber_attribute(ctx);
    }

    @Override
    public Object visitVariable_text(PARSERCONTROLLER.Variable_textContext ctx) {
        return super.visitVariable_text(ctx);
    }

    @Override
    public Object visitVariable_get(PARSERCONTROLLER.Variable_getContext ctx) {
        return super.visitVariable_get(ctx);
    }

    @Override
    public Object visitTextinput(PARSERCONTROLLER.TextinputContext ctx) {
        return super.visitTextinput(ctx);
    }

    @Override
    public Object visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public Object visitChildren(RuleNode node) {
        return super.visitChildren(node);
    }

    @Override
    public Object visitTerminal(TerminalNode node) {
        return super.visitTerminal(node);
    }

    @Override
    public Object visitErrorNode(ErrorNode node) {
        return super.visitErrorNode(node);
    }

    @Override
    protected Object defaultResult() {
        return super.defaultResult();
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    protected boolean shouldVisitNextChild(RuleNode node, Object currentResult) {
        return super.shouldVisitNextChild(node, currentResult);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
