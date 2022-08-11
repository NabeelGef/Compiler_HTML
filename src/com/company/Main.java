package com.company;

import com.company.ast.Nodes.*;
import com.company.ast.visitor.BaseVisitor;
import generated.LEXER;
import generated.PARSER;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.HashMap;
import java.io.FileWriter;

import static org.antlr.v4.runtime.CharStreams.fromFileName;
import static org.antlr.v4.runtime.CharStreams.fromStream;

public class Main {
    static final String PATH_MATH = "C:\\xampp\\htdocs\\code_math/";
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
    private static boolean is_js(Program program, String input) {
        for(int i = 0; i < program.getBody().getAttribuite_bodies().size(); ++i) {
            OnClick onClick = ((Attribuite_body)program.getBody().getAttribuite_bodies().get(i)).getOnClick();
            if (onClick != null && onClick.getAttribuite_onClickParents()!= null) {
                for(int e = 0; e < onClick.getAttribuite_onClickParents().size(); ++e) {
                    if(onClick.getAttribuite_onClickParents().get(e).getGetData()!=null) {
                        String Value_Variables = onClick.getAttribuite_onClickParents().get(e).getGetData().getValue_variables();
                        if (Value_Variables.equals(input)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }


    private static void generateAst(Program program) throws IOException {
        System.out.println("\t\t\t*******Header*******");
        for (int i = 0; i < program.getHeader().getAttribuite_headerList().size(); i++) {
            String Title = program.getHeader().getAttribuite_headerList().get(i).getTitle();
            String Color = program.getHeader().getAttribuite_headerList().get(i).getColor();
            String Pos = program.getHeader().getAttribuite_headerList().get(i).getPos();
            String Size = program.getHeader().getAttribuite_headerList().get(i).getSize();
            String Url = PATH_MATH + program.getHeader().getAttribuite_headerList().get(i).getUrl();
            String Url_control = program.getHeader().getAttribuite_headerList().get(i).getUrl_control();
            if (Color != null) {
                System.out.println("Color : " + Color);
            } else if (Size != null) {
                System.out.println("Size : " + Size);
            } else if (Pos != null) {
                System.out.println("Pos : " + Pos);
            } else if (Url != null) {
                System.out.println("URL : " + Url);
                generateCode(program, Url);
            } else if (Title != null) {
                System.out.println("Title : " + Title);
            } else if (Url_control != null) {
                System.out.println("Url_controller : " + Url_control);
            }
        }
        System.out.println("\n\n\n\t\t\t********Body******");
        for (int i = 0; i < program.getBody().getAttribuite_bodies().size(); i++) {
            Text text = program.getBody().getAttribuite_bodies().get(i).getText();
            Button button = program.getBody().getAttribuite_bodies().get(i).getButton();
            TextInput textInput = program.getBody().getAttribuite_bodies().get(i).getTextInput();
            OnClick onClick = program.getBody().getAttribuite_bodies().get(i).getOnClick();
            if (text != null) {
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
            } else if (button != null) {
                System.out.println("\t\t***Button***");
                for (int j = 0; j < button.getAttribuite_button().size(); j++) {
                    String Width = button.getAttribuite_button().get(j).getWidth();
                    String Height = button.getAttribuite_button().get(j).getHeight();
                    String Color = button.getAttribuite_button().get(j).getColor();
                    String Background = button.getAttribuite_button().get(j).getBackground();
                    String ID = button.getAttribuite_button().get(j).getId();
                    String TextButton = button.getAttribuite_button().get(j).getTextButton();
                    Margin margin = button.getAttribuite_button().get(j).getMargin();
                    Event event = button.getAttribuite_button().get(j).getEvent();
                    String Pos = button.getAttribuite_button().get(j).getPos();
                    if (Width != null) {
                        System.out.println("Width : " + Width);
                    } else if (Height != null) {
                        System.out.println("Height : " + Height);
                    } else if (Color != null) {
                        System.out.println("Color : " + Color);
                    } else if (Background != null) {
                        System.out.println("Background : " + Background);
                    } else if (Pos != null) {
                        System.out.println("Pos : " + Pos);
                    } else if (ID != null) {
                        System.out.println("ID : " + ID);
                    } else if (TextButton != null) {
                        System.out.println("Text Button : " + TextButton);
                    } else if (margin != null) {
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
                    } else if (event != null) {
                        System.out.println("\t***Event***");
                        for (int l = 0; l < event.getAttribuite_event().size(); l++) {
                            String Go_to = event.getAttribuite_event().get(l).getGo_to();
                            if (Go_to != null) {
                                System.out.println("GO_To : " + Go_to);
                            }
                        }
                    }
                }
            } else if (textInput != null) {
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
                    String Pos = textInput.getAttribuite_textInput().get(j).getPos();
                    if (Width != null) {
                        System.out.println("Width : " + Width);
                    } else if (Height != null) {
                        System.out.println("Height : " + Height);
                    } else if (Color != null) {
                        System.out.println("Color : " + Color);
                    } else if (Background != null) {
                        System.out.println("Background : " + Background);
                    } else if (Pos != null) {
                        System.out.println("Pos : " + Pos);
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
            else if (onClick != null) {
                System.out.println("************ONCLICK************");
                System.out.println("OnClick { ");
                if (onClick.getAttribuite_onClickParents().size()>0) {
                    for(int e = 0 ; e < onClick.getAttribuite_onClickParents().size();e++){
                        Attribuite_OnClickParent attribuite_onClickParent = onClick.getAttribuite_onClickParents().get(e);
                        if(attribuite_onClickParent.getEqualizaition()!=null){
                            String Name_Variables = attribuite_onClickParent.getEqualizaition().getName_variables();
                            String Value_Variables = attribuite_onClickParent.getEqualizaition().getValue_variables();
                            System.out.println(Name_Variables + "=" + Value_Variables);
                        }
                        else if (attribuite_onClickParent.getGetData()!=null){
                            String Name_Variables = attribuite_onClickParent.getGetData().getName_variables();
                            String Value_Variables = attribuite_onClickParent.getGetData().getValue_variables();
                            System.out.println(Name_Variables + "=" + "getData(" + Value_Variables + ");");
                        }
                        else if (attribuite_onClickParent.getDot_onClick()!=null){
                            String Name_Variables = attribuite_onClickParent.getDot_onClick().getName_variables();
                            System.out.println(Name_Variables + ".onClick(){");
                            Attribuite_OnClick attribuite_onClick = attribuite_onClickParent.getDot_onClick().getAttribuite_onClick();
                            if(attribuite_onClick!=null){
                                System.out.println("**********Attribute_onClick*********");
                                ArrayList<Color_onClick>color_onClicks = attribuite_onClick.getColor_onClicks();
                                ArrayList<Content_onClick>content_onClicks = attribuite_onClick.getContent_onClicks();
                                ArrayList<Size_OnClick>size_onClicks = attribuite_onClick.getSize_onClicks();
                                ArrayList<background_OnClick>background_onClicks = attribuite_onClick.getBackground_onClicks();
                                ArrayList<Width_OnClick>width_onClicks = attribuite_onClick.getWidth_onClicks();
                                ArrayList<Height_OnClick>height_onClicks = attribuite_onClick.getHeight_onClicks();
                                if(color_onClicks!=null){
                                    for(int o = 0 ; o<color_onClicks.size();o++){
                                        String name_var = color_onClicks.get(o).getName_variable();
                                        String val_var = color_onClicks.get(o).getValue_variable();
                                        System.out.println(name_var + ".Color = " +val_var+";");
                                    }
                                }
                                if(content_onClicks!=null){
                                    for(int o = 0 ; o<content_onClicks.size();o++){
                                        String name_var = content_onClicks.get(o).getName_variable();
                                        String val_var = content_onClicks.get(o).getValue_variable();
                                        System.out.println(name_var + ".Content = " +val_var+";");
                                    }
                                }
                                if(background_onClicks!=null){
                                    for(int o = 0 ; o<background_onClicks.size();o++){
                                        String name_var = background_onClicks.get(o).getName_variable();
                                        String val_var = background_onClicks.get(o).getValue_variable();
                                        System.out.println(name_var + ".Background = " +val_var+";");
                                    }
                                }
                                if(size_onClicks!=null){
                                    for(int o = 0 ; o<size_onClicks.size();o++){
                                        String name_var = size_onClicks.get(o).getName_variable();
                                        String val_var = size_onClicks.get(o).getValue_variable();
                                        System.out.println(name_var + ".Size = " +val_var+";");
                                    }
                                }
                                if(width_onClicks!=null){
                                    for(int o = 0 ; o<width_onClicks.size();o++){
                                        String name_var = width_onClicks.get(o).getName_variable();
                                        String val_var = width_onClicks.get(o).getValue_variable();
                                        System.out.println(name_var + ".Width = " +val_var+";");
                                    }
                                }
                                if(height_onClicks!=null){
                                    for(int o = 0 ; o<height_onClicks.size();o++){
                                        String name_var = height_onClicks.get(o).getName_variable();
                                        String val_var = height_onClicks.get(o).getValue_variable();
                                        System.out.println(name_var + ".Height = " +val_var+";");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    private static void generateCode(Program program, String Url) throws IOException {
        FileWriter fileWriter = new FileWriter(Url);
        fileWriter.write("<!DOCTYPE html>");
        fileWriter.write("\n<html>");
        String UrlControl = null;
        String text_content;
        String text_size;
        String text_id;
        String text_pos;
        String text_margin_top;
        if (program.getHeader() != null) {
            fileWriter.write("\n<head>");
            Header header = program.getHeader();
            String Title = null;
            String Color = null;
            String Pos = null;
            String Size = null;

            for(int i = 0; i < header.getAttribuite_headerList().size(); ++i) {
                text_content = ((Attribuite_header)header.getAttribuite_headerList().get(i)).getTitle();
                text_size = ((Attribuite_header)header.getAttribuite_headerList().get(i)).getColor();
                text_id = ((Attribuite_header)header.getAttribuite_headerList().get(i)).getPos();
                text_pos = ((Attribuite_header)header.getAttribuite_headerList().get(i)).getSize();
                text_margin_top = ((Attribuite_header)header.getAttribuite_headerList().get(i)).getUrl_control();
                if (text_content != null) {
                    Title = text_content;
                }

                if (text_size != null) {
                    Color = text_size;
                }

                if (text_id != null) {
                    Pos = text_id;
                }

                if (text_pos != null) {
                    Size = text_pos;
                }

                if (text_margin_top != null) {
                    UrlControl = text_margin_top;
                }
            }

            fileWriter.write("\n</head>\n");
            fileWriter.write("<header style=\"");
            if (Color != null) {
                fileWriter.write("color:" + Color + ";");
            }

            if (Size != null) {
                fileWriter.write("font-size:" + Size + ";");
            }

            if (Pos != null) {
                fileWriter.write("text-align:" + Pos + ";");
            }

            fileWriter.write("\">");
            if (Title != null) {
                fileWriter.write(Title);
            }

            fileWriter.write("</header>");
        }

        if (program.getBody() != null) {
            fileWriter.write("\n<body>");
            if (UrlControl == null) {
                fileWriter.write("\n<form action=\"\" method=\"post\">");
            } else {
                fileWriter.write("\n<form action=\"" + UrlControl + "\" method=\"post\">");
            }

            for(int i = 0; i < program.getBody().getAttribuite_bodies().size(); ++i) {
                Text text = ((Attribuite_body)program.getBody().getAttribuite_bodies().get(i)).getText();
                Button button = ((Attribuite_body)program.getBody().getAttribuite_bodies().get(i)).getButton();
                TextInput textInput = ((Attribuite_body)program.getBody().getAttribuite_bodies().get(i)).getTextInput();
                OnClick onClick = ((Attribuite_body)program.getBody().getAttribuite_bodies().get(i)).getOnClick();
                String text_color = null;
                text_content = null;
                text_size = null;
                text_id = null;
                text_pos = null;
                text_margin_top = null;
                String text_margin_bottom = null;
                String text_margin_left = null;
                String text_margin_right = null;
                String button_width = null;
                String button_height = null;
                String button_event = null;
                String button_background = null;
                String input_type = null;
                String input_hint = null;
                int e;
                String Name_Variables;
                String Value_Variables;
                String name_var;
                String Right;
                String Color;
                String Background;
                String ID;
                String Pos;
                if (text != null) {
                    e = 0;

                    while(true) {
                        if (e >= text.getAttribuite_text().size()) {
                            fileWriter.write("\n<p style=\"");
                            if (text_color != null) {
                                fileWriter.write("color:" + text_color + ";");
                            }

                            if (text_pos != null) {
                                fileWriter.write("text-align:" + text_pos + ";");
                            }

                            if (text_size != null) {
                                fileWriter.write("font-size:" + text_size + ";");
                            }

                            if (text_margin_top != null) {
                                fileWriter.write("margin-top:" + text_margin_top + ";");
                            }

                            if (text_margin_bottom != null) {
                                fileWriter.write("margin-bottom:" + text_margin_bottom + ";");
                            }

                            if (text_margin_right != null) {
                                fileWriter.write("margin-right:" + text_margin_right + ";");
                            }

                            if (text_margin_left != null) {
                                fileWriter.write("margin-left:" + text_margin_left + ";");
                            }

                            fileWriter.write("\"");
                            if (text_id != null) {
                                if (is_js(program, text_id)) {
                                    fileWriter.write(" id=\"" + text_id + "\"");
                                } else if (!is_js(program, text_id)) {
                                    fileWriter.write(" name=\"" + text_id + "\"");
                                }
                            }

                            fileWriter.write(">");
                            if (text_content != null) {
                                fileWriter.write(text_content);
                            }

                            fileWriter.write("</p>");
                            break;
                        }

                        Name_Variables = ((Attribuite_text)text.getAttribuite_text().get(e)).getColor();
                        Value_Variables = ((Attribuite_text)text.getAttribuite_text().get(e)).getContent();
                        Color = ((Attribuite_text)text.getAttribuite_text().get(e)).getSize();
                        Background = ((Attribuite_text)text.getAttribuite_text().get(e)).getId();
                        ID = ((Attribuite_text)text.getAttribuite_text().get(e)).getPos();
                        Margin margin = ((Attribuite_text)text.getAttribuite_text().get(e)).getMargin();
                        if (Name_Variables != null) {
                            text_color = Name_Variables;
                        } else if (Value_Variables != null) {
                            text_content = Value_Variables;
                        } else if (Color != null) {
                            text_size = Color;
                        } else if (Background != null) {
                            text_id = Background;
                        } else if (ID != null) {
                            text_pos = ID;
                        } else if (margin != null) {
                            System.out.println("\t***MARGIN TexT***");

                            for(int k = 0; k < margin.getAttribuite_margins().size(); ++k) {
                                Pos = null;
                                String Left = null;
                                name_var = null;
                                Right = null;
                                if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Right")) {
                                    Pos = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Left")) {
                                    Left = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Top")) {
                                    name_var = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Bottom")) {
                                    Right = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                }

                                if (Pos != null) {
                                    text_margin_right = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                } else if (Left != null) {
                                    text_margin_left = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                } else if (name_var != null) {
                                    text_margin_top = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                } else if (Right != null) {
                                    text_margin_bottom = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                }
                            }
                        }

                        ++e;
                    }
                } else {
                    String Left;
                    String Top;
                    String Bottom;
                    String TextHint;
                    String Type;
                    int k;
                    if (button != null) {
                        e = 0;

                        while(true) {
                            if (e >= button.getAttribuite_button().size()) {
                                if (text_pos != null) {
                                    fileWriter.write("\n<div style=\"display:flex;justify-content:" + text_pos + ";\">");
                                }

                                fileWriter.write("\n<button style=\"");
                                if (text_color != null) {
                                    fileWriter.write("color:" + text_color + ";");
                                }

                                if (button_height != null) {
                                    fileWriter.write("height:" + button_height + ";");
                                }

                                if (button_width != null) {
                                    fileWriter.write("width:" + button_width + ";");
                                }

                                if (button_background != null) {
                                    fileWriter.write("background-color:" + button_background + ";");
                                }

                                if (text_margin_top != null) {
                                    fileWriter.write("margin-top:" + text_margin_top + ";");
                                }

                                if (text_margin_bottom != null) {
                                    fileWriter.write("margin-bottom:" + text_margin_bottom + ";");
                                }

                                if (text_margin_right != null) {
                                    fileWriter.write("margin-right:" + text_margin_right + ";");
                                }

                                if (text_margin_left != null) {
                                    fileWriter.write("margin-left:" + text_margin_left + ";");
                                }

                                fileWriter.write("cursor:pointer;");
                                fileWriter.write("display:block;");
                                fileWriter.write("\"");
                                if (text_id != null) {
                                    if (is_js(program, text_id)) {
                                        fileWriter.write(" id=\"" + text_id + "\"");
                                    } else if (!is_js(program, text_id)) {
                                        fileWriter.write(" name=\"" + text_id + "\"");
                                    }
                                }

                                if (button_event != null) {
                                    fileWriter.write(" action=\"" + button_event + "\"");
                                }

                                fileWriter.write(">");
                                if (text_content != null) {
                                    fileWriter.write(text_content);
                                }

                                fileWriter.write("</button>");
                                if (text_pos != null) {
                                    fileWriter.write("\n</div>");
                                }
                                break;
                            }

                            Name_Variables = ((Attribuite_button)button.getAttribuite_button().get(e)).getWidth();
                            Value_Variables = ((Attribuite_button)button.getAttribuite_button().get(e)).getHeight();
                            Color = ((Attribuite_button)button.getAttribuite_button().get(e)).getColor();
                            Background = ((Attribuite_button)button.getAttribuite_button().get(e)).getBackground();
                            ID = ((Attribuite_button)button.getAttribuite_button().get(e)).getId();
                            TextHint = ((Attribuite_button)button.getAttribuite_button().get(e)).getTextButton();
                            Type = ((Attribuite_button)button.getAttribuite_button().get(e)).getPos();
                            Margin margin = ((Attribuite_button)button.getAttribuite_button().get(e)).getMargin();
                            Event event = ((Attribuite_button)button.getAttribuite_button().get(e)).getEvent();
                            if (Name_Variables != null) {
                                button_width = Name_Variables;
                            } else if (Value_Variables != null) {
                                button_height = Value_Variables;
                            } else if (Color != null) {
                                text_color = Color;
                            } else if (Background != null) {
                                button_background = Background;
                            } else if (ID != null) {
                                text_id = ID;
                            } else if (TextHint != null) {
                                text_content = TextHint;
                            } else if (Type != null) {
                                text_pos = Type;
                            } else if (margin != null) {
                                for(k = 0; k < margin.getAttribuite_margins().size(); ++k) {
                                    Right = null;
                                    Left = null;
                                    Top = null;
                                    Bottom = null;
                                    if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Right")) {
                                        Right = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Left")) {
                                        Left = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Top")) {
                                        Top = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Bottom")) {
                                        Bottom = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    }

                                    if (Right != null) {
                                        text_margin_right = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    } else if (Left != null) {
                                        text_margin_left = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    } else if (Top != null) {
                                        text_margin_top = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    } else if (Bottom != null) {
                                        text_margin_bottom = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    }
                                }
                            } else if (event != null) {
                                for(k = 0; k < event.getAttribuite_event().size(); ++k) {
                                    Right = ((Attribuite_event)event.getAttribuite_event().get(k)).getGo_to();
                                    if (Right != null) {
                                        button_event = Right;
                                    }
                                }
                            }

                            ++e;
                        }
                    } else if (textInput != null) {
                        System.out.println("\t\t***TextInput***");
                        e = 0;

                        while(true) {
                            if (e >= textInput.getAttribuite_textInput().size()) {
                                if (text_pos != null) {
                                    fileWriter.write("\n<div style=\"display:flex;justify-content:" + text_pos + ";\">");
                                }

                                fileWriter.write("\n<input style=\"");
                                if (text_color != null) {
                                    fileWriter.write("color:" + text_color + ";");
                                }

                                if (button_height != null) {
                                    fileWriter.write("height:" + button_height + ";");
                                }

                                if (button_width != null) {
                                    fileWriter.write("width:" + button_width + ";");
                                }

                                if (button_background != null) {
                                    fileWriter.write("background-color:" + button_background + ";");
                                }

                                if (text_margin_top != null) {
                                    fileWriter.write("margin-top:" + text_margin_top + ";");
                                }

                                if (text_margin_bottom != null) {
                                    fileWriter.write("margin-bottom:" + text_margin_bottom + ";");
                                }

                                if (text_margin_right != null) {
                                    fileWriter.write("margin-right:" + text_margin_right + ";");
                                }

                                if (text_margin_left != null) {
                                    fileWriter.write("margin-left:" + text_margin_left + ";");
                                }

                                fileWriter.write("\"");
                                if (text_id != null) {
                                    if (is_js(program, text_id)) {
                                        fileWriter.write(" id=\"" + text_id + "\"");
                                    } else if (!is_js(program, text_id)) {
                                        fileWriter.write(" name=\"" + text_id + "\"");
                                    }
                                }

                                if (input_type != null && input_type.equals("numbers")) {
                                    fileWriter.write(" type=\"number\"");
                                } else if (input_type != null) {
                                    fileWriter.write(" type=\"" + input_type + "\"");
                                }

                                if (input_hint != null) {
                                    fileWriter.write(" placeholder=\"" + input_hint + "\"");
                                }

                                fileWriter.write(">");
                                fileWriter.write("</input>");
                                if (text_pos != null) {
                                    fileWriter.write("\n</div>");
                                }
                                break;
                            }

                            Name_Variables = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getWidth();
                            Value_Variables = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getHeight();
                            Color = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getColor();
                            Background = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getBackground();
                            ID = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getId();
                            TextHint = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getTextHint();
                            Type = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getType();
                            Pos = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getPos();
                            Margin margin = ((Attribuite_textInput)textInput.getAttribuite_textInput().get(e)).getMargin();
                            if (Name_Variables != null) {
                                button_width = Name_Variables;
                            } else if (Value_Variables != null) {
                                button_height = Value_Variables;
                            } else if (Color != null) {
                                text_color = Color;
                            } else if (Background != null) {
                                button_background = Background;
                            } else if (ID != null) {
                                text_id = ID;
                            } else if (TextHint != null) {
                                input_hint = TextHint;
                            } else if (Type != null) {
                                input_type = Type;
                            } else if (Pos != null) {
                                text_pos = Pos;
                            } else if (margin != null) {
                                System.out.println("\t***Margin Text Input***");

                                for(k = 0; k < margin.getAttribuite_margins().size(); ++k) {
                                    Right = null;
                                    Left = null;
                                    Top = null;
                                    Bottom = null;
                                    if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Right")) {
                                        Right = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Left")) {
                                        Left = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Top")) {
                                        Top = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    } else if (((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation().equals("Bottom")) {
                                        Bottom = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getLocation();
                                    }

                                    if (Right != null) {
                                        text_margin_right = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    } else if (Left != null) {
                                        text_margin_left = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    } else if (Top != null) {
                                        text_margin_top = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    } else if (Bottom != null) {
                                        text_margin_bottom = ((Attribuite_margin)margin.getAttribuite_margins().get(k)).getSizes();
                                    }
                                }
                            }

                            ++e;
                        }
                    } else if (onClick != null) {
                        fileWriter.write("\n</form>");
                        fileWriter.write("\n<script>\n");
                        if (onClick.getAttribuite_onClickParents().size()>0) {
                            for(int ee = 0 ; ee < onClick.getAttribuite_onClickParents().size();ee++){
                                Attribuite_OnClickParent attribuite_onClickParent = onClick.getAttribuite_onClickParents().get(ee);
                                if(attribuite_onClickParent.getEqualizaition()!=null){
                                     Name_Variables = attribuite_onClickParent.getEqualizaition().getName_variables();
                                     Value_Variables = attribuite_onClickParent.getEqualizaition().getValue_variables();
                                    fileWriter.write("const " + Name_Variables + " = \"" + Value_Variables + "\";\n");

                                }
                                else if (attribuite_onClickParent.getGetData()!=null){
                                     Name_Variables = attribuite_onClickParent.getGetData().getName_variables();
                                     Value_Variables = attribuite_onClickParent.getGetData().getValue_variables();
                                    fileWriter.write("const " + Name_Variables + " = document.getElementById(\"" + Value_Variables + "\");\n");
                                }
                                else if (attribuite_onClickParent.getDot_onClick()!=null){
                                    Name_Variables = attribuite_onClickParent.getDot_onClick().getName_variables();
                                    fileWriter.write(Name_Variables + ".addEventListener('click',function (){\n");
                                    Attribuite_OnClick attribuite_onClick = attribuite_onClickParent.getDot_onClick().getAttribuite_onClick();
                                    if (attribuite_onClick != null) {
                                        ArrayList<Color_onClick> color_onClicks = attribuite_onClick.getColor_onClicks();
                                        ArrayList<Content_onClick> content_onClicks = attribuite_onClick.getContent_onClicks();
                                        ArrayList<Size_OnClick> size_onClicks = attribuite_onClick.getSize_onClicks();
                                        ArrayList<background_OnClick> background_onClicks = attribuite_onClick.getBackground_onClicks();
                                        ArrayList<Width_OnClick> width_onClicks = attribuite_onClick.getWidth_onClicks();
                                        ArrayList<Height_OnClick> height_onClicks = attribuite_onClick.getHeight_onClicks();
                                        int o;
                                        if (color_onClicks != null) {
                                            for(o = 0; o < color_onClicks.size(); ++o) {
                                                name_var = ((Color_onClick)color_onClicks.get(o)).getName_variable();
                                                Right = ((Color_onClick)color_onClicks.get(o)).getValue_variable();
                                                fileWriter.write(name_var + ".style.color = \"" + Right + "\";\n");
                                            }
                                        }

                                        if (content_onClicks != null) {
                                            for(o = 0; o < content_onClicks.size(); ++o) {
                                                name_var = ((Content_onClick)content_onClicks.get(o)).getName_variable();
                                                Right = ((Content_onClick)content_onClicks.get(o)).getValue_variable();
                                                fileWriter.write(name_var + ".innerText = \"" + Right + "\";\n");
                                            }
                                        }

                                        if (background_onClicks != null) {
                                            for(o = 0; o < background_onClicks.size(); ++o) {
                                                name_var = ((background_OnClick)background_onClicks.get(o)).getName_variable();
                                                Right = ((background_OnClick)background_onClicks.get(o)).getValue_variable();
                                                fileWriter.write(name_var + ".style.background = \"" + Right + "\";\n");
                                            }
                                        }

                                        if (size_onClicks != null) {
                                            for(o = 0; o < size_onClicks.size(); ++o) {
                                                name_var = ((Size_OnClick)size_onClicks.get(o)).getName_variable();
                                                Right = ((Size_OnClick)size_onClicks.get(o)).getValue_variable();
                                                fileWriter.write(name_var + ".style.fontSize = \"" + Right + "\";\n");
                                            }
                                        }

                                        if (width_onClicks != null) {
                                            for(o = 0; o < width_onClicks.size(); ++o) {
                                                name_var = ((Width_OnClick)width_onClicks.get(o)).getName_variable();
                                                Right = ((Width_OnClick)width_onClicks.get(o)).getValue_variable();
                                                fileWriter.write(name_var + ".style.width = \"" + Right + "\";\n");
                                            }
                                        }

                                        if (height_onClicks != null) {
                                            for(o = 0; o < height_onClicks.size(); ++o) {
                                                name_var = ((Height_OnClick)height_onClicks.get(o)).getName_variable();
                                                Right = ((Height_OnClick)height_onClicks.get(o)).getValue_variable();
                                                fileWriter.write(name_var + ".style.height = \"" + Right + "\";\n");
                                            }
                                        }
                                    }
                                    fileWriter.write("})");

                                }
                            }
                        }
                    }
                }
                fileWriter.write("\n</script>");
            }
        }

        fileWriter.write("\n</body>");
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
                String url = PATH_MATH + symbol_table.get("Url");
                String url_control = PATH_MATH + symbol_table.get("Url_control");
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
                check_IDS();
                generateAst(program);
    }
    private static  void check_IDS() throws ParseException {
        int numTextID = 0 , numButtonID = 0 ,numTextInputID = 0;
        if(BaseVisitor.getSymbol_table().get("num_text_id")!=null){
            numTextID = Integer.parseInt(BaseVisitor.getSymbol_table().get("num_text_id"))+1;
        }
        if(BaseVisitor.getSymbol_table().get("num_button_id")!=null){
            numButtonID = Integer.parseInt(BaseVisitor.getSymbol_table().get("num_button_id"))+1;
        }
        if(BaseVisitor.getSymbol_table().get("num_textInput_id")!=null){
            numTextInputID = Integer.parseInt(BaseVisitor.getSymbol_table().get("num_textInput_id"))+1;
        }
        for(int nums = 0 ; nums<numTextID;nums++){
            String TextID1 = BaseVisitor.getSymbol_table().get("TextID"+nums);
            for(int k = nums+1;k<numTextID;k++){
              String TextID2 = BaseVisitor.getSymbol_table().get("TextID"+k);
              if(TextID1.equals(TextID2)){
                  throw new ParseException("This Id "+TextID2+ " is defined by Text Attribute",1);
              }
          }
        }for(int nums = 0 ; nums<numButtonID;nums++){
            String ButtonID1 = BaseVisitor.getSymbol_table().get("ButtonID"+nums);
            for(int k = nums+1;k<numButtonID;k++){
                String ButtonID2 = BaseVisitor.getSymbol_table().get("ButtonID"+k);
                if(ButtonID1.equals(ButtonID2)){
                    throw new ParseException("This Id "+ButtonID2+ " is defined by Button Attribute",1);
                }
            }
        }for(int nums = 0 ; nums<numTextInputID;nums++){
            String TextInputID1 = BaseVisitor.getSymbol_table().get("TextInputID"+nums);
            for(int k = nums+1;k<numTextInputID;k++){
                String TextInputID2 = BaseVisitor.getSymbol_table().get("TextInputID"+k);
                if(TextInputID1.equals(TextInputID2)){
                    throw new ParseException("This Id "+TextInputID2+ " is defined by Text Attribute",1);
                }
            }
        }
        for(int i = 0;i<numTextID;i++){
            String TextID1 = BaseVisitor.getSymbol_table().get("TextID"+i);
            for(int j = 0;j<numButtonID;j++){
                String ButtonID2 = BaseVisitor.getSymbol_table().get("ButtonID"+j);
                if(TextID1.equals(ButtonID2)){
                    throw new ParseException("This Id "+ButtonID2+ " is defined by Text Attribute",1);
                }

            }
        }
        for(int i = 0 ; i<numTextID;i++){
            String TextID1 = BaseVisitor.getSymbol_table().get("TextID"+i);
            for(int j = 0;j<numTextInputID;j++) {
                String TextInputID2 = BaseVisitor.getSymbol_table().get("TextInputID"+j);
                if(TextID1.equals(TextInputID2)){
                    throw new ParseException("This Id "+TextInputID2+ " is defined by Text Attribute",1);
                }
            }
        }
        for(int i = 0 ;i<numButtonID;i++){
            String ButtonID1 = BaseVisitor.getSymbol_table().get("ButtonID"+i);
            for(int j= 0 ; j < numTextInputID;j++){
                String TextInputID2 = BaseVisitor.getSymbol_table().get("TextInputID"+j);
                if(ButtonID1.equals(TextInputID2)){
                    throw new ParseException("This Id "+TextInputID2+ " is defined by Button Attribute",1);
                }
            }
        }
    }
}
