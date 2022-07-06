package com.company;

import com.company.ast.Nodes.*;
import com.company.ast.visitor.BaseVisitor;
import generated.LEXER;
import generated.PARSER;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.nio.file.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.nio.file.Files;
import java.io.FileWriter;
import java.util.Locale;

import com.company.ast.Nodes.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        String source = "C:\\Users\\maher\\Desktop\\algorithm\\Samples//sample.txt";
        CharStream charStream = fromFileName(source);
        LEXER lexer = new LEXER(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        PARSER parser = new PARSER(tokenStream);
        ParseTree tree = parser.program();
        Program program = (Program) new BaseVisitor().visit(tree);
        ErrorHandling(program);

    }

    private static void generateAst(Program program) throws IOException {
        System.out.println("\t\t\t*******Header*******");
        for(int i=0;i<program.getHeader().getAttribuite_headerList().size();i++) {
            String Title = program.getHeader().getAttribuite_headerList().get(i).getTitle();
            String Color = program.getHeader().getAttribuite_headerList().get(i).getColor();
            String Pos = program.getHeader().getAttribuite_headerList().get(i).getPos();
            String Size = program.getHeader().getAttribuite_headerList().get(i).getSize();
            String Url = program.getHeader().getAttribuite_headerList().get(i).getUrl();
            String Url_control = program.getHeader().getAttribuite_headerList().get(i).getUrl_control();
            if(Color!=null)
            {
                System.out.println("Color : " + Color);
            }
            else if (Size!=null){
                System.out.println("Size : " + Size);
            }
            else if (Pos!=null){
                System.out.println("Pos : " + Pos);
            }else if (Url!=null) {
                System.out.println("URL : " + Url);
                generateCode(program,Url);
            }
            else if (Title!=null){
                System.out.println("Title : " + Title);
            }
            else if (Url_control!=null){
                System.out.println("Url_contolr : " + Url_control);
            }
        }
        System.out.println("\n\n\n\t\t\t********Body******");
        for(int i =0;i<program.getBody().getAttribuite_bodies().size();i++){
            Text text = program.getBody().getAttribuite_bodies().get(i).getText();
            Button button = program.getBody().getAttribuite_bodies().get(i).getButton();
            TextInput textInput = program.getBody().getAttribuite_bodies().get(i).getTextInput();
            if(text!=null) {
                System.out.println("\t\t***TexT***");
                for (int j = 0; j < text.getAttribuite_text().size(); j++) {
                    String Color = text.getAttribuite_text().get(j).getColor();
                    String Content = text.getAttribuite_text().get(j).getContent();
                    String Size = text.getAttribuite_text().get(j).getSize();
                    String ID = text.getAttribuite_text().get(j).getId();
                    String Pos = text.getAttribuite_text().get(j).getPos();
                    Margin margin = text.getAttribuite_text().get(j).getMargin();
                    if (Color != null) {
                        System.out.println("Color : " + Color);
                    } else if (Content != null) {
                        System.out.println("Content : " + Content);
                    } else if (Size != null) {
                        System.out.println("Size : " + Size);
                    } else if (ID != null) {
                        System.out.println("ID  : " + ID);
                    } else if (Pos != null) {
                        System.out.println("Pos : " + Pos);
                    } else if (margin != null) {
                        System.out.println("\t***MARGIN TexT***");
                        for (int k = 0; k < margin.getAttribuite_margins().size(); k++) {
                            String Right = null, Left = null, Top = null, Bottom = null;
                            if (margin.getAttribuite_margins().get(k).getLocation().equals("Right")) {
                                Right = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Left")) {
                                Left = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Top")) {
                                Top = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Bottom")) {
                                Bottom = margin.getAttribuite_margins().get(k).getLocation();
                            }
                            if (Right != null) {
                                System.out.println("Right : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Left != null) {
                                System.out.println("Left : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Top != null) {
                                System.out.println("Top : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Bottom != null)
                                System.out.println("Bottom : " + margin.getAttribuite_margins().get(k).getSizes());
                        }
                    }
                }
            }
            else if(button!=null){
                System.out.println("\t\t***Button***");
                for ( int j = 0 ;j<button.getAttribuite_button().size();j++){
                    String Width = button.getAttribuite_button().get(j).getWidth();
                    String Height = button.getAttribuite_button().get(j).getHeight();
                    String Color = button.getAttribuite_button().get(j).getColor();
                    String Background = button.getAttribuite_button().get(j).getBackground();
                    String ID = button.getAttribuite_button().get(j).getId();
                    String TextButton = button.getAttribuite_button().get(j).getTextButton();
                    Margin margin = button.getAttribuite_button().get(j).getMargin();
                    Event event = button.getAttribuite_button().get(j).getEvent();
                    if(Width!=null){
                        System.out.println("Width : " + Width);
                    }else if(Height!=null){
                        System.out.println("Height : " + Height);
                    }else if(Color!=null){
                        System.out.println("Color : " + Color);
                    }else if(Background!=null){
                        System.out.println("Background : " + Background);
                    }else if(ID!=null){
                        System.out.println("ID : " + ID);
                    }else if(TextButton!=null){
                        System.out.println("Text Button : " + TextButton);
                    }else if(margin!=null){
                        System.out.println("\t***Margin Button***");
                        for (int k = 0; k < margin.getAttribuite_margins().size(); k++) {
                            String Right = null, Left = null, Top = null, Bottom = null;
                            if (margin.getAttribuite_margins().get(k).getLocation().equals("Right")) {
                                Right = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Left")) {
                                Left = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Top")) {
                                Top = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Bottom")) {
                                Bottom = margin.getAttribuite_margins().get(k).getLocation();
                            }
                            if (Right != null) {
                                System.out.println("Right : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Left != null) {
                                System.out.println("Left : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Top != null) {
                                System.out.println("Top : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Bottom != null)
                                System.out.println("Bottom : " + margin.getAttribuite_margins().get(k).getSizes());
                        }
                    }else if (event!=null){
                        System.out.println("\t***Event***");
                        for(int l = 0 ;l<event.getAttribuite_event().size();l++){
                            String Go_to = event.getAttribuite_event().get(l).getGo_to();
                            if(Go_to!=null){
                                System.out.println("GO_To : " + Go_to);
                            }
                        }
                    }
                }
            }
            else if(textInput!=null) {
                System.out.println("\t\t***TextInput***");
                for (int j = 0; j < textInput.getAttribuite_textInput().size(); j++) {
                    String Width = textInput.getAttribuite_textInput().get(j).getWidth();
                    String Height = textInput.getAttribuite_textInput().get(j).getHeight();
                    String Color = textInput.getAttribuite_textInput().get(j).getColor();
                    String Background = textInput.getAttribuite_textInput().get(j).getBackground();
                    String ID = textInput.getAttribuite_textInput().get(j).getId();
                    String TextHint = textInput.getAttribuite_textInput().get(j).getTextHint();
                    String Type = textInput.getAttribuite_textInput().get(j).getType();
                    Margin margin = textInput.getAttribuite_textInput().get(j).getMargin();
                    if (Width != null) {
                        System.out.println("Width : " + Width);
                    } else if (Height != null) {
                        System.out.println("Height : " + Height);
                    } else if (Color != null) {
                        System.out.println("Color : " + Color);
                    } else if (Background != null) {
                        System.out.println("Background : " + Background);
                    } else if (ID != null) {
                        System.out.println("ID : " + ID);
                    } else if (TextHint != null) {
                        System.out.println("Text Hint : " + TextHint);
                    } else if (Type != null) {
                        System.out.println("Type : " + Type);
                    } else if (margin != null) {
                        System.out.println("\t***Margin Text Input***");
                        for (int k = 0; k < margin.getAttribuite_margins().size(); k++) {
                            String Right = null, Left = null, Top = null, Bottom = null;
                            if (margin.getAttribuite_margins().get(k).getLocation().equals("Right")) {
                                Right = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Left")) {
                                Left = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Top")) {
                                Top = margin.getAttribuite_margins().get(k).getLocation();
                            } else if (margin.getAttribuite_margins().get(k).getLocation().equals("Bottom")) {
                                Bottom = margin.getAttribuite_margins().get(k).getLocation();
                            }
                            if (Right != null) {
                                System.out.println("Right : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Left != null) {
                                System.out.println("Left : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Top != null) {
                                System.out.println("Top : " + margin.getAttribuite_margins().get(k).getSizes());
                            } else if (Bottom != null)
                                System.out.println("Bottom : " + margin.getAttribuite_margins().get(k).getSizes());
                        }
                    }
                }
            }
        }
    }

    private static void generateCode(Program program , String Url) throws IOException {
        FileWriter fileWriter = new FileWriter(Url);
        fileWriter.write("<!DOCTYPE html>");
        fileWriter.write("\n<html>");
        if(program.getHeader()!=null){
            fileWriter.write("\n<head>");
            Header header = program.getHeader();
            for(int i = 0 ;i < header.getAttribuite_headerList().size();i++){
                String Title = header.getAttribuite_headerList().get(i).getTitle();
                String Color = header.getAttribuite_headerList().get(i).getColor();
                String Pos = header.getAttribuite_headerList().get(i).getPos();
                String Size = header.getAttribuite_headerList().get(i).getSize();
                if(Title!=null){
                    fileWriter.write("\n<title>"+Title+"</title>");
                }
                if(Color!=null){
                    fileWriter.write("\n<style>\nh1 {color : "+Color.toLowerCase(Locale.ROOT)+";}\n</style>");
                }
            }
            fileWriter.write("\n</head>");
        }
        fileWriter.write("\n</html>");
        fileWriter.close();
    }
    private static void ErrorHandling(Program program) throws ParseException, IOException {
        if (!BaseVisitor.getErrors().empty()){
            while (!BaseVisitor.getErrors().empty()) {
                System.err.println(BaseVisitor.getErrors().pop());
            }
            return;
    }
        HashMap<String,String> symbol_table = BaseVisitor.getSymbol_table();
                String url = symbol_table.get("Url");
                String url_control = symbol_table.get("Url_control");
                if(url!=null){
                    File Furl = new File(url).getAbsoluteFile();
                    if(!Furl.exists()){
                        throw new FileNotFoundException(Furl+" is not found!!");
                    }
                }
                if(url_control!=null){
                    File Furl_control = new File(url_control).getAbsoluteFile();
                    if(!Furl_control.exists()){
                        throw new FileNotFoundException(Furl_control+" is not found!!");
                    }
            }
                String TextID = BaseVisitor.getSymbol_table().get("TextID");
                String ButtonID = BaseVisitor.getSymbol_table().get("ButtonID");
                String TextInputID = BaseVisitor.getSymbol_table().get("TextInputID");
                if(ButtonID.equals(TextID)){
                    throw new ParseException("This Id "+ButtonID+ " is defined by Text Attribute",1);
                }
                if(TextInputID.equals(ButtonID)){
                    throw new ParseException("This Id "+TextInputID+ " is defined by Button Attribute",1);
                }
                if(TextInputID.equals(TextID)){
                    throw new ParseException("This Id "+TextInputID+ " is defined by Text Attribute",1);
                }
                generateAst(program);
    }
}
