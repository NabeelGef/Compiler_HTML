package com.company.ast.visitor;

import com.company.ast.Nodes.*;
import generated.PARSER;
import generated.PARSERBaseVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class BaseVisitor extends PARSERBaseVisitor {
    private static final String ID = "GETDATA";
    @Override
    public OnClick visitOnclick(PARSER.OnclickContext ctx) {
    OnClick onclick = new OnClick();
    if(ctx.equalization()!=null){
        ArrayList<Equalizaition>equalizaitions = new ArrayList<>();
        for(int i = 0;i<ctx.equalization().size();i++){
            equalizaitions.add(visitEqualization(ctx.equalization(i)));
        }
        onclick.setEqualizaitions(equalizaitions);
    }
        if(ctx.getData()!=null){
            ArrayList<getData> getData = new ArrayList<>();
            for(int i = 0 ;i < ctx.getData().size();i++){
                getData.add(visitGetData(ctx.getData(i)));
            }
            onclick.setGetData(getData);
        }
    if(ctx.dot_onClick()!=null){
        ArrayList<Dot_OnClick>dot_onClicks = new ArrayList<>();
        for(int i = 0;i<ctx.dot_onClick().size();i++){
            dot_onClicks.add(visitDot_onClick(ctx.dot_onClick(i)));
        }
        onclick.setDot_onClicks(dot_onClicks);
    }
    return  onclick;
    }

    @Override
    public getData visitGetData(PARSER.GetDataContext ctx) {
        getData getsData = new getData();
        getsData.setName_variables(ctx.CHARS_ONCLICK(0).getText());
        getsData.setValue_variables(ctx.CHARS_ONCLICK(1).getText());
        symbol_table.put(ctx.CHARS_ONCLICK(0).getText(),ID);
        if(ctx.SINGLE_QUOTE_ONCLICK().size()==0){
          if(cheak_multiple_defined_names(ctx.CHARS_ONCLICK(1).getText())){
              errors.push("The " + ctx.CHARS_ONCLICK(1).getText() + " is not defined");
          }
        }
        return getsData;
    }

    @Override
    public Equalizaition visitEqualization(PARSER.EqualizationContext ctx) {
        Equalizaition equalizaition = new Equalizaition();
        equalizaition.setName_variables(ctx.CHARS_ONCLICK(0).getText());
        equalizaition.setValue_variables(ctx.CHARS_ONCLICK(1).getText());
        if(!cheak_multiple_defined_names(ctx.CHARS_ONCLICK(0).getText())){
            errors.push("The " + ctx.CHARS_ONCLICK(0).getText() + " is Defined already!!");
        }else
        {
            if(ctx.SINGLE_QUOTE_ONCLICK()!=null){
                symbol_table.put(ctx.CHARS_ONCLICK(0).getText(),ctx.CHARS_ONCLICK(1).getText());
            }else{
                if(cheak_multiple_defined_names(ctx.CHARS_ONCLICK(1).getText())){
                    errors.push("The " + ctx.CHARS_ONCLICK(1).getText() + "is not defined!!");
                }
                else{
                    symbol_table.put(ctx.CHARS_ONCLICK(0).getText(),ctx.CHARS_ONCLICK(1).getText());
                }
            }
        }
        return equalizaition;
    }

    @Override
    public Dot_OnClick visitDot_onClick(PARSER.Dot_onClickContext ctx) {
       Dot_OnClick dot_onClick = new Dot_OnClick();
       if(!cheak_multiple_defined_names(ctx.CHARS_ONCLICK().getText())){
           if(getValueSymbolTable(ctx.CHARS_ONCLICK().getText()).equals(ID)){
               dot_onClick.setName_variables(ctx.CHARS_ONCLICK().getText());
           }else{
               errors.push("The " + ctx.CHARS_ONCLICK().getText() + "is not initialize to getData!!");
           }
       }else {
           errors.push("The " + ctx.CHARS_ONCLICK().getText() + "is not defined!!");
       }
       if(ctx.attrbuite_onclick()!=null){
       dot_onClick.setAttribuite_onClick(visitAttrbuite_onclick(ctx.attrbuite_onclick()));
       }
       return dot_onClick;
    }

    @Override
    public Size_OnClick visitSize_onClick(PARSER.Size_onClickContext ctx) {
        Size_OnClick size_onClick = new Size_OnClick();
        if(!cheak_multiple_defined_names(ctx.CHARS_INNERONCLICK().getText())){
            if(getValueSymbolTable(ctx.CHARS_INNERONCLICK().getText()).equals(ID)){
                size_onClick.setName_variable(ctx.CHARS_INNERONCLICK().getText());
            }else{
                errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not initialize to getData!!");
            }
        }else {
            errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not defined!!");
        }
        size_onClick.setValue_variable(ctx.SIZES_INNERONCLICK().getText());
        return size_onClick;
    }

    @Override
    public Height_OnClick visitHeight_onClick(PARSER.Height_onClickContext ctx) {
        Height_OnClick height_onClick = new Height_OnClick();
        if(!cheak_multiple_defined_names(ctx.CHARS_INNERONCLICK().getText())){
            if(getValueSymbolTable(ctx.CHARS_INNERONCLICK().getText()).equals(ID)){
                height_onClick.setName_variable(ctx.CHARS_INNERONCLICK().getText());
            }else{
                errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not initialize to getData!!");
            }
        }else {
            errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not defined!!");
        }
        height_onClick.setValue_variable(ctx.SIZES_INNERONCLICK().getText());
        return height_onClick;
    }

    @Override
    public background_OnClick visitBackground_onClick(PARSER.Background_onClickContext ctx) {
     background_OnClick background_onClick = new background_OnClick();
        if(!cheak_multiple_defined_names(ctx.CHARS_INNERONCLICK().getText())){
            if(getValueSymbolTable(ctx.CHARS_INNERONCLICK().getText()).equals(ID)){
                background_onClick.setName_variable(ctx.CHARS_INNERONCLICK().getText());
            }else{
                errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not initialize to getData!!");
            }
        }else {
            errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not defined!!");
        }
     background_onClick.setValue_variable(ctx.COLORS_INNERONCLICK().getText());
     return background_onClick;
    }

    @Override
    public Color_onClick visitColor_onClick(PARSER.Color_onClickContext ctx) {
        Color_onClick color_onClick = new Color_onClick();
        if(!cheak_multiple_defined_names(ctx.CHARS_INNERONCLICK().getText())){
            if(getValueSymbolTable(ctx.CHARS_INNERONCLICK().getText()).equals(ID)){
                color_onClick.setName_variable(ctx.CHARS_INNERONCLICK().getText());
            }else{
                errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not initialize to getData!!");
            }
        }else {
            errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not defined!!");
        }
        color_onClick.setValue_variable(ctx.COLORS_INNERONCLICK().getText());
        return color_onClick;
    }

    @Override
    public Content_onClick visitContent_onClick(PARSER.Content_onClickContext ctx) {
        Content_onClick content_onClick = new Content_onClick();
        if(!cheak_multiple_defined_names(ctx.CHARS_INNERONCLICK(0).getText())){
            if(getValueSymbolTable(ctx.CHARS_INNERONCLICK(0).getText()).equals(ID)){
                content_onClick.setName_variable(ctx.CHARS_INNERONCLICK(0).getText());
            }else{
                errors.push("The " + ctx.CHARS_INNERONCLICK(0).getText() + "is not initialize to getData!!");
            }
        }else {
            errors.push("The " + ctx.CHARS_INNERONCLICK(0).getText() + "is not defined!!");
        }
        content_onClick.setValue_variable(ctx.CHARS_INNERONCLICK(1).getText());
        return content_onClick;
    }

    @Override
    public Width_OnClick visitWidth_onClick(PARSER.Width_onClickContext ctx) {
        Width_OnClick widthOnClick = new Width_OnClick();
        if(!cheak_multiple_defined_names(ctx.CHARS_INNERONCLICK().getText())){
            if(getValueSymbolTable(ctx.CHARS_INNERONCLICK().getText()).equals(ID)){
                widthOnClick.setName_variable(ctx.CHARS_INNERONCLICK().getText());
            }else{
                errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not initialize to getData!!");
            }
        }else {
            errors.push("The " + ctx.CHARS_INNERONCLICK().getText() + "is not defined!!");
        }
        widthOnClick.setValue_variable(ctx.SIZES_INNERONCLICK().getText());
        return widthOnClick;
    }
    @Override
    public Attribuite_OnClick visitAttrbuite_onclick(PARSER.Attrbuite_onclickContext ctx) {
    Attribuite_OnClick attribuite_onClick = new Attribuite_OnClick();
    if(ctx.content_onClick()!=null){
     ArrayList<Content_onClick>content_onClicks = new ArrayList<>();
     for(int i = 0 ;i < ctx.content_onClick().size();i++){
       content_onClicks.add(visitContent_onClick(ctx.content_onClick(i)));
     }
     attribuite_onClick.setContent_onClicks(content_onClicks);
    }
    if(ctx.color_onClick()!=null){
        ArrayList<Color_onClick>color_onClicks = new ArrayList<>();
        for(int i = 0 ;i < ctx.color_onClick().size();i++){
            color_onClicks.add(visitColor_onClick(ctx.color_onClick(i)));
        }
        attribuite_onClick.setColor_onClicks(color_onClicks);
    }
    if(ctx.background_onClick()!=null){
        ArrayList<background_OnClick>background_onClicks = new ArrayList<>();
        for(int i = 0 ;i < ctx.background_onClick().size();i++){
            background_onClicks.add(visitBackground_onClick(ctx.background_onClick(i)));
        }
        attribuite_onClick.setBackground_onClicks(background_onClicks);
    }
    if(ctx.size_onClick()!=null){
        ArrayList<Size_OnClick>size_onClicks = new ArrayList<>();
        for(int i = 0 ;i < ctx.size_onClick().size();i++){
            size_onClicks.add(visitSize_onClick(ctx.size_onClick(i)));
        }
        attribuite_onClick.setSize_onClicks(size_onClicks);
    }
    if(ctx.width_onClick()!=null){
        ArrayList<Width_OnClick>width_onClicks = new ArrayList<>();
        for(int i = 0 ;i < ctx.width_onClick().size();i++){
            width_onClicks.add(visitWidth_onClick(ctx.width_onClick(i)));
        }
        attribuite_onClick.setWidth_onClicks(width_onClicks);
    }
    if(ctx.height_onClick()!=null){
        ArrayList<Height_OnClick>height_onClicks = new ArrayList<>();
        for(int i = 0 ;i < ctx.height_onClick().size();i++){
            height_onClicks.add(visitHeight_onClick(ctx.height_onClick(i)));
        }
        attribuite_onClick.setHeight_onClicks(height_onClicks);
    }
    return attribuite_onClick;
    }


    static HashMap<String ,String> symbol_table = new HashMap<>();
    static Stack<String> errors = new Stack<>();

    public static HashMap<String, String> getSymbol_table() {
        return symbol_table;
    }

    public static Stack<String> getErrors() {
        return errors;
    }

    @Override
    public Program visitProgram(PARSER.ProgramContext ctx) {
        Program program = new Program();
        program.setHeader(visitHeader(ctx.header()));
        program.setBody(visitBody(ctx.body()));
        return program;
    }
    @Override
    public Header visitHeader(PARSER.HeaderContext ctx) {
        Header header = new Header();
        List<Attribuite_header> headers = new ArrayList<>();
        for(int i=0;i<ctx.attribute_header().size();i++){
            headers.add(visitAttribute_header(ctx.attribute_header(i)));
        }
        header.setAttribuite_headerList(headers);
        return header;
        }

    @Override
    public Attribuite_header visitAttribute_header(PARSER.Attribute_headerContext ctx) {
        Attribuite_header attribuite_header = new Attribuite_header();
        String Title = visitHeadertitle(ctx.headertitle());
        String Color = visitHeadercolor(ctx.headercolor());
        String Pos = visitHeaderpos(ctx.headerpos());
        String Size = visitHeadersize(ctx.headersize());
        String Url = visitHeaderurl(ctx.headerurl());
        String Url_control = visitHeader_url_control(ctx.header_url_control());
        if(!Title.isEmpty()){
            if(!cheak_multiple_defined_names("Title"))
            {
                errors.push("The Title Header is Defined already!!");
            }else{
                symbol_table.put("Title",Title);
                attribuite_header.setTitle(Title);
            }
        }else if(!Color.isEmpty()){
            if(!cheak_multiple_defined_names("Color")){
                errors.push("The Color Header is Defined already!!");
           }else{
               symbol_table.put("Color",Color);
               attribuite_header.setColor(Color);
           }
        }else if (!Size.isEmpty()){
            if(!cheak_multiple_defined_names("Size")){
                errors.push("The Size Header is Defined already!!");
            }else{
               symbol_table.put("Size",Size);
               attribuite_header.setSize(Size);
            }
        }else if (!Pos.isEmpty()){
            if(!cheak_multiple_defined_names("Pos")){
                errors.push("The Pos Header is Defined already!!");
            }else{
             symbol_table.put("Pos",Pos);
             attribuite_header.setPos(Pos);
            }
        }else if (!Url.isEmpty()){
            if(!cheak_multiple_defined_names("Url")){
                    errors.push("The Url Header is Defined already!!");
            }else{
                symbol_table.put("Url",Url);
                attribuite_header.setUrl(Url);
            }
        }else if(!Url_control.isEmpty()){
            if(!cheak_multiple_defined_names("Url_control")){
                errors.push("The Url_control Header is Defined already!!");
            }else{
                symbol_table.put("Url_control",Url_control);
                attribuite_header.setUrl_control(Url_control);
            }
        }
        return attribuite_header;
    }
    public boolean cheak_multiple_defined_names(String data){
        if(symbol_table.containsKey(data))
        {
            return false;
        }
        return true;
    }
    public String getValueSymbolTable(String key){
        return symbol_table.get(key);
    }
    @Override
    public String visitHeaderurl(PARSER.HeaderurlContext ctx)
    {
        if(ctx!=null)
        {
                return ctx.H_CHARS().toString();
        }
        return "";
    }
    @Override
    public String visitHeader_url_control(PARSER.Header_url_controlContext ctx) {
        if(ctx!=null)
            return ctx.H_CHARS().getText();
        return "";
    }
    @Override
    public String visitHeadertitle(PARSER.HeadertitleContext ctx) {
        if(ctx!=null)
        {
                return ctx.H_CHARS().toString();
        }
        return "";
    }

    @Override
    public String visitHeaderpos(PARSER.HeaderposContext ctx) {
        if(ctx!=null)
        {
                return ctx.H_POSITION().toString();
        }
        return "";
    }

    @Override
    public String visitHeadersize(PARSER.HeadersizeContext ctx)
    {
        if(ctx!=null)
        {
            return ctx.H_SIZES().toString();
        }
        return "";
    }
    @Override
    public String visitHeadercolor(PARSER.HeadercolorContext ctx)
    {
        if(ctx!=null)
        {
                return ctx.H_COLORS().toString();
        }
        return "";
    }
    int id_text = -1 , id_button = -1 , id_text_input = -1;
    @Override
    public Body visitBody(PARSER.BodyContext ctx) {
        Body body = new Body();
        List<Attribuite_body> attribuite_bodies = new ArrayList<>();
        for(int i =0 ;i<ctx.attribute_body().size();i++){
            attribuite_bodies.add(visitAttribute_body(ctx.attribute_body(i)));
        }
        body.setAttribuite_bodies(attribuite_bodies);
        return body;
    }
    @Override
    public Attribuite_body visitAttribute_body(PARSER.Attribute_bodyContext ctx) {
        Attribuite_body attribuite_body = new Attribuite_body();
        if(ctx.button()!=null) {
            id_button++;
            attribuite_body.setButton(visitButton(ctx.button()));
        }
        else if (ctx.text()!=null){
            id_text++;
            attribuite_body.setText(visitText(ctx.text()));
        }else if (ctx.textinput()!=null) {
            id_text_input++;
            attribuite_body.setTextInput(visitTextinput(ctx.textinput()));
        }else if (ctx.onclick()!=null){
           attribuite_body.setOnClick(visitOnclick(ctx.onclick()));
        }
        return attribuite_body;
    }

    @Override
    public Text visitText(PARSER.TextContext ctx) {
        Text text = new Text();
        List<Attribuite_text> attribuite_texts = new ArrayList<>();
        for(int i=0;i<ctx.textattribute().size();i++){
            attribuite_texts.add(visitTextattribute(ctx.textattribute(i)));
        }
        text.setAttribuite_text(attribuite_texts);
        return text;
    }

    @Override
    public Attribuite_text visitTextattribute(PARSER.TextattributeContext ctx) {
        Attribuite_text attribuite_text = new Attribuite_text();
        String Color = visitTextcolor(ctx.textcolor());
        String Content = visitTextcontent(ctx.textcontent());
        String Size = visitTextsize(ctx.textsize());
        String Id = visitTextid(ctx.textid());
        String Pos = visitTextpos(ctx.textpos());
        if(ctx.textmargin()!=null){
            if(!cheak_multiple_defined_names("Text Margin"+id_text)) {
                errors.push("Text Margin is defined already");
            }else{
                symbol_table.put("Text Margin"+id_text,ctx.textmargin().getText());
                attribuite_text.setMargin(visitTextmargin(ctx.textmargin()));
            }
        }
        if(!Color.isEmpty()) {
            if(!cheak_multiple_defined_names("Text Color"+id_text)) {
                errors.push("Text Color is defined already");
            }else {
                symbol_table.put("Text Color"+id_text, Color);
                attribuite_text.setColor(Color);
            }
        }else if (!Content.isEmpty()){
            if(!cheak_multiple_defined_names("Text Content"+id_text)) {
                errors.push("Text Content is defined already");
            }else {
                symbol_table.put("Text Content"+id_text, Content);
                attribuite_text.setContent(Content);
            }
        }else if (!Size.isEmpty()){
            if(!cheak_multiple_defined_names("Text Size"+id_text)) {
                errors.push("Text Size is defined already");
            }else{
                symbol_table.put("Text Size"+id_text, Size);
                attribuite_text.setSize(Size);
            }
        }else if (!Id.isEmpty()){
            if(!cheak_multiple_defined_names("TextID"+id_text)) {
                errors.push("Text ID is defined already");
            }else{
                symbol_table.put("TextID"+id_text, Id);
                attribuite_text.setId(Id);
            }
        }else if (!Pos.isEmpty()){
            if(!cheak_multiple_defined_names("Text Pos"+id_text)) {
                errors.push("Text Pos is defined already");
            }else {
                symbol_table.put("Text Pos"+id_text, Pos);
                attribuite_text.setPos(Pos);
            }
        }
        symbol_table.put("num_text_id",String.valueOf(id_text));
        return attribuite_text;
    }
    @Override
    public String visitTextcolor(PARSER.TextcolorContext ctx) {
         if(ctx!=null){
             return ctx.TEXT_COLORS().getText();
         }
         return "";
    }

    @Override
    public String  visitTextsize(PARSER.TextsizeContext ctx) {
        if(ctx!=null){
            return ctx.TEXT_SIZES().getText();
        }
        return "";
    }

    @Override
    public String visitTextpos(PARSER.TextposContext ctx) {
        if(ctx!=null){
            return ctx.TEXT_POSITION().getText();
        }
        return "";
    }

    @Override
    public String visitTextcontent(PARSER.TextcontentContext ctx) {
        if(ctx!=null){
            return ctx.TEXT_CHARS().getText();
        }
        return "";
    }

    @Override
    public String  visitTextid(PARSER.TextidContext ctx) {
        if(ctx!=null){
            return ctx.TEXT_CHARS().getText();
        }
        return "";
    }

    @Override
    public Margin visitTextmargin(PARSER.TextmarginContext ctx) {

        Margin margin = new Margin();
        List<Attribuite_margin> attribuite_margins= new ArrayList<>();
        for(int i=0 ;i<ctx.marginattribute().size();i++){
            attribuite_margins.add(visitMarginattribute(ctx.marginattribute(i)));
        }
        margin.setAttribuite_margins(attribuite_margins);
        return margin;
    }
    @Override
    public Attribuite_margin visitMarginattribute(PARSER.MarginattributeContext ctx) {
        Attribuite_margin attribuite_margin = new Attribuite_margin();
        if(ctx.MARGIN_LOCATION()!=null){
            if(!cheak_multiple_defined_names("Text Margin "+ctx.MARGIN_LOCATION().getText()+id_text)) {
                errors.push("Text Margin "+ctx.MARGIN_LOCATION().getText()+" is defined already");
            }else{
                attribuite_margin.setLocation(ctx.MARGIN_LOCATION().getText());
                attribuite_margin.setSizes(ctx.MARGIN_SIZES().getText());
                symbol_table.put("Text Margin "+ctx.MARGIN_LOCATION().getText()+id_text,ctx.MARGIN_LOCATION().getText());
            }
        }
        return attribuite_margin;
    }
    @Override
    public Button visitButton(PARSER.ButtonContext ctx) {
        Button button = new Button();
        List<Attribuite_button>attribuite_buttons = new ArrayList<>();
        for(int i =0 ;i<ctx.buttonattribute().size();i++){
            attribuite_buttons.add(visitButtonattribute(ctx.buttonattribute(i)));
        }
        button.setAttribuite_button(attribuite_buttons);

        return button;
    }

    @Override
    public Attribuite_button visitButtonattribute(PARSER.ButtonattributeContext ctx) {
        Attribuite_button attribuite_button = new Attribuite_button();
        String Color = visitButtoncolor(ctx.buttoncolor());
        String Text_button = visitTextbutton(ctx.textbutton());
        String Width = visitWidth(ctx.width());
        String Height = visitHeight(ctx.height());
        String Id = visitButtonid(ctx.buttonid());
        String Background = visitButtonbackground(ctx.buttonbackground());
        String Pos = visitButtonpos(ctx.buttonpos());
        if(ctx.buttonmargin()!=null)
        {
            if(!cheak_multiple_defined_names("Button Margin"+id_button)) {
                errors.push("Button Margin is defined already!!");
                }else{
                symbol_table.put("Button Margin"+id_button,"Margin");
                attribuite_button.setMargin(visitButtonmargin(ctx.buttonmargin()));
            }
        }else if(ctx.event()!=null) {
            if(!cheak_multiple_defined_names("Button Event"+id_button)) {
                errors.push("Button Event is defined already!!");
            }else{
                symbol_table.put("Button Event"+id_button,"Event");
                attribuite_button.setEvent(visitEvent(ctx.event()));
            }
        }
        else if(!Pos.isEmpty()){
            if(!cheak_multiple_defined_names("Button Pos"+id_button)){
                errors.push("Button Pos is defined already!!");
            }else{
                symbol_table.put("Button Pos"+id_button,Color);
                attribuite_button.setPos(Pos);
            }
        }
        if(!Color.isEmpty()){
            if(!cheak_multiple_defined_names("Button Color"+id_button)){
                errors.push("Button Color is defined already!!");
            }else{
                symbol_table.put("Button Color"+id_button,Color);
                attribuite_button.setColor(Color);
            }
        }
        else if (!Text_button.isEmpty()){
            if(!cheak_multiple_defined_names("Button Text"+id_button)){
                errors.push("Text_button is defined already!!");
            }else{
                symbol_table.put("Button Text"+id_button,Text_button);
                attribuite_button.setTextButton(Text_button);
            }
        }else if (!Width.isEmpty()){
            if(!cheak_multiple_defined_names("Button Width"+id_button)){
                errors.push("Button Width is defined already!!");
            }else{
                symbol_table.put("Button Width"+id_button,Width);
                attribuite_button.setWidth(Width);
            }
        }else if(!Height.isEmpty()){
            if(!cheak_multiple_defined_names("Button Height"+id_button)){
                errors.push("Button Height is defined already!!");
            }else{
                symbol_table.put("Button Height"+id_button,Height);
                attribuite_button.setHeight(Height);
            }
        }else if (!Id.isEmpty()){
            if(!cheak_multiple_defined_names("ButtonID"+id_button)) {
                errors.push("Button ID is defined already");
            }else{
                symbol_table.put("ButtonID"+id_button, Id);
                attribuite_button.setId(Id);
            }
        }else if(!Background.isEmpty()){
            if(!cheak_multiple_defined_names("Button Background"+id_button)){
                errors.push("Button Background is defined already");
            }else{
                symbol_table.put("Button Background"+id_button,Background);
                attribuite_button.setBackground(Background);
            }
        }
        symbol_table.put("num_button_id",String.valueOf(id_button));
        return attribuite_button;
    }
    @Override
    public String visitWidth(PARSER.WidthContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_SIZES().getText();
        }
        return "";
    }

    @Override
    public String visitHeight(PARSER.HeightContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_SIZES().getText();
        }
        return "";
    }

    @Override
    public String visitButtoncolor(PARSER.ButtoncolorContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_COLORS().getText();
        }
        return "";
    }
    @Override
    public String visitButtonpos(PARSER.ButtonposContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_POSITION().getText();
        }
        return "";
    }
    @Override
    public String visitButtonbackground(PARSER.ButtonbackgroundContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_COLORS().getText();
        }
        return "";
    }

    @Override
    public String visitTextbutton(PARSER.TextbuttonContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_CHARS().getText();
        }
        return "";
    }

    @Override
    public String visitButtonid(PARSER.ButtonidContext ctx) {
        if(ctx!=null){
            return ctx.BUTTON_CHARS().getText();
        }
        return "";
    }

    @Override
    public Event visitEvent(PARSER.EventContext ctx)
    {
        Event event = new Event();
        List<Attribuite_event>attribuite_events = new ArrayList<>();
        for ( int i=0;i<ctx.eventattribute().size();i++){
            attribuite_events.add(visitEventattribute(ctx.eventattribute(i)));
        }
        event.setAttribuite_event(attribuite_events);
        return event;
    }

    @Override
    public Attribuite_event visitEventattribute(PARSER.EventattributeContext ctx) {
        Attribuite_event attribuite_event = new Attribuite_event();
        String go_to = visitGo_to(ctx.go_to());
        if(!go_to.isEmpty()){
            if(!cheak_multiple_defined_names("Button go_to"+id_button)) {
                errors.push("Button go_to is defined already!!");
            }else{
                symbol_table.put("Button go_to"+id_button,go_to);
                attribuite_event.setGo_to(go_to);
            }
        }//perhaps many of data for Events I don't know
        return attribuite_event;
    }

    @Override
    public String visitGo_to(PARSER.Go_toContext ctx) {
        if(ctx!=null){
            return ctx.EVENT_CHARS().getText();
        }
        return "";
    }

    @Override
    public Margin visitButtonmargin(PARSER.ButtonmarginContext ctx)
    {
        Margin margin = new Margin();
        List<Attribuite_margin> attribuite_margins = new ArrayList<>();
        for (int i=0;i<ctx.buttonmarginattribute().size();i++){
            attribuite_margins.add(visitButtonmarginattribute(ctx.buttonmarginattribute(i)));
        }
        margin.setAttribuite_margins(attribuite_margins);
        return margin;
    }
    @Override
    public Attribuite_margin visitButtonmarginattribute(PARSER.ButtonmarginattributeContext ctx) {
        Attribuite_margin attribuite_margin = new Attribuite_margin();
        if(ctx.MARGIN_LOCATION()!=null) {
            if (!cheak_multiple_defined_names("Button Margin "+ctx.MARGIN_LOCATION().getText()+id_button)){
                errors.push("Button Margin"+ctx.MARGIN_LOCATION().getText()+" is defined already!!");
            }
            else{
                symbol_table.put("Button Margin "+ctx.MARGIN_LOCATION().getText()+id_button,ctx.MARGIN_LOCATION().getText());
                attribuite_margin.setLocation(ctx.MARGIN_LOCATION().getText());
                attribuite_margin.setSizes(ctx.MARGIN_SIZES().getText());
            }
        }
        return attribuite_margin;
    }
    @Override
    public TextInput visitTextinput(PARSER.TextinputContext ctx) {
        TextInput textInput = new TextInput();
        List<Attribuite_textInput>attribuite_textInputs = new ArrayList<>();
        for (int i=0;i<ctx.textinputattribute().size();i++){
            attribuite_textInputs.add(visitTextinputattribute(ctx.textinputattribute(i)));
        }
        textInput.setAttribuite_textInput(attribuite_textInputs);
        return textInput;
    }
    @Override
    public Attribuite_textInput visitTextinputattribute(PARSER.TextinputattributeContext ctx) {
        Attribuite_textInput attribuite_textInput = new Attribuite_textInput();
        String Color = visitTextinputcolor(ctx.textinputcolor());
        String Text_Hint = visitText_hint(ctx.text_hint());
        String Width = visitTextinputwidth(ctx.textinputwidth());
        String Height = visitTextinputheight(ctx.textinputheight());
        String Id = visitTextinputid(ctx.textinputid());
        String Background = visitTextinputbackground(ctx.textinputbackground());
        String Type = visitType(ctx.type());
        String Pos = visitTextinputpos(ctx.textinputpos());
        if(ctx.textinputmargin()!=null) {
            if(!cheak_multiple_defined_names("TextInput Margin"+id_text_input)) {
                errors.push("TextInput Margin is defined already");
            }else{
                symbol_table.put("TextInput Margin"+id_text_input,"Margin");
                attribuite_textInput.setMargin(visitTextinputmargin(ctx.textinputmargin()));
            }
        }
        if(!Color.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput Color"+id_text_input)){
                errors.push("TextInput Color is defined already!!");
            }else{
                symbol_table.put("TextInput Color"+id_text_input,Color);
                attribuite_textInput.setColor(Color);
            }

        }else if (!Pos.isEmpty()){
          if(!cheak_multiple_defined_names("TextInput pos"+id_text_input)){
              errors.push("TextInput Pos is defined already!!");
          }else{
              symbol_table.put("TextInput pos"+id_text_input,Pos);
              attribuite_textInput.setPos(Pos);
          }
        }
        else if (!Text_Hint.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput Text_hint"+id_text_input)){
                errors.push("TextInput Text_hint is defined already!!");
            }else{
                symbol_table.put("TextInput Text_hint"+id_text_input,Text_Hint);
                attribuite_textInput.setTextHint(Text_Hint);
            }
        }else if (!Width.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput Width"+id_text_input)){
                errors.push("TextInput Width is defined already!!");
            }else{
                symbol_table.put("TextInput Width"+id_text_input,Width);
                attribuite_textInput.setWidth(Width);
            }
        }else if (!Height.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput Height"+id_text_input)){
                errors.push("TextInput Height is defined already!!");
               }
            else{
                symbol_table.put("TextInput Height"+id_text_input,Height);
                attribuite_textInput.setHeight(Height);
            }
        }else if (!Id.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput ID"+id_text_input)) {
                errors.push("TextInput Id is defined already!!");
            }else{
                symbol_table.put("TextInputID"+id_text_input, Id);
                attribuite_textInput.setId(Id);
            }
        }else if (!Background.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput Background"+id_text_input)){
                errors.push("TextInput Background is defined already!!");
            }else{
                symbol_table.put("TextInput Background"+id_text_input,Background);
                attribuite_textInput.setBackground(Background);
            }
        }else if (!Type.isEmpty()){
            if(!cheak_multiple_defined_names("TextInput Type"+id_text_input)) {
              errors.push("TextInput Type is defined already!!");
            }else{
                symbol_table.put("TextInput Type"+id_text_input,Type);
                attribuite_textInput.setType(Type);
            }
        }
        symbol_table.put("num_textInput_id",String.valueOf(id_text_input));
        return attribuite_textInput;
    }
    @Override
    public String visitTextinputwidth(PARSER.TextinputwidthContext ctx) {
        if(ctx!=null){
            return ctx.TI_SIZES().getText();
        }
        return "";
    }

    @Override
    public String visitTextinputheight(PARSER.TextinputheightContext ctx) {
        if(ctx!=null){
            return ctx.TI_SIZES().getText();
        }
        return "";
    }
    @Override
    public String visitTextinputcolor(PARSER.TextinputcolorContext ctx) {
        if(ctx!=null){
            return ctx.TI_COLORS().getText();
        }
        return "";
    }
    @Override
    public String visitTextinputpos(PARSER.TextinputposContext ctx) {
     if(ctx!=null){
         return ctx.TI_POSITION().getText();
     }
     return "";
    }

    @Override
    public String visitTextinputbackground(PARSER.TextinputbackgroundContext ctx) {
        if(ctx!=null){
            return ctx.TI_COLORS().getText();
        }
        return "";
    }

    @Override
    public String visitTextinputid(PARSER.TextinputidContext ctx) {
        if(ctx!=null){
            return ctx.TI_CHARS().getText();
        }
        return "";
    }

    @Override
    public Margin visitTextinputmargin(PARSER.TextinputmarginContext ctx) {

        Margin margin = new Margin();
        List<Attribuite_margin> attribuite_margins = new ArrayList<>();
        for (int i=0;i<ctx.textinputmarginattribute().size();i++){
            attribuite_margins.add(visitTextinputmarginattribute(ctx.textinputmarginattribute(i)));
        }
        margin.setAttribuite_margins(attribuite_margins);
        return margin;
    }
    @Override
    public Attribuite_margin visitTextinputmarginattribute(PARSER.TextinputmarginattributeContext ctx) {
        Attribuite_margin attribuite_margin = new Attribuite_margin();
        if(ctx.MARGIN_LOCATION()!=null){
            if(!cheak_multiple_defined_names("TextInput Margin "+ctx.MARGIN_LOCATION().getText()+id_text_input)) {
                errors.push("TextInput Margin "+ctx.MARGIN_LOCATION().getText()+" is defined already!!");
            }else{
                symbol_table.put("TextInput Margin "+ctx.MARGIN_LOCATION().getText()+id_text_input,ctx.MARGIN_LOCATION().getText());
                attribuite_margin.setLocation(ctx.MARGIN_LOCATION().getText());
                attribuite_margin.setSizes(ctx.MARGIN_SIZES().getText());
            }
        }
        return attribuite_margin;

    }

    @Override
    public String visitType(PARSER.TypeContext ctx) {
        if(ctx!=null){
            return ctx.INPUT_TYPE().getText();
        }
        return "";
    }
    @Override
    public String visitText_hint(PARSER.Text_hintContext ctx) {
        if(ctx!=null){
            return ctx.TI_CHARS().getText();
        }
        return "";
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