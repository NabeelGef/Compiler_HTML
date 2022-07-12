parser grammar PARSER;
options {tokenVocab = LEXER;}


program: (TAG_OPEN START TAG_CLOSE)? header body;


//////////
header : HEADER_TAG  HEADER_CURLYOPEN  ( attribute_header H_COMMA)* attribute_header H_COMMA? HEADER_CURLYCLOSE SEMICOLON ;
attribute_header : headertitle | headercolor | headersize | headerpos | headerurl | header_url_control
;
header_url_control : URLCONTROL H_POINTS H_SINGLE_QUOTE H_CHARS H_SINGLE_QUOTE;
headerurl : URL H_POINTS H_SINGLE_QUOTE H_CHARS H_SINGLE_QUOTE;
headertitle : TITLE  H_POINTS H_SINGLE_QUOTE H_CHARS H_SINGLE_QUOTE;
headerpos : H_POS H_POINTS H_POSITION ;
headersize : H_SIZE H_POINTS H_SINGLE_QUOTE H_SIZES H_SINGLE_QUOTE ;
headercolor : H_COLOR H_POINTS H_SINGLE_QUOTE H_COLORS H_SINGLE_QUOTE ;

///////////

body : BODY_TAG B_CURLYOPEN (attribute_body B_COMMA)*attribute_body B_COMMA? B_CURLYCLOSE SEMICOLON;
attribute_body: text | textinput | button ;

////////


text : TEXT_TAG TEXT_CURLYOPEN (textattribute TEXT_COMMA)* textattribute TEXT_COMMA? TEXT_CURLYCLOSE ;
textattribute : textcolor | textsize | textpos | textcontent | textmargin | textid  ;
textcolor :  TEXT_COLOR TEXT_COLON TEXT_SINGLE_QUOTE TEXT_COLORS TEXT_SINGLE_QUOTE ;
textsize : TEXT_SIZE TEXT_COLON TEXT_SINGLE_QUOTE TEXT_SIZES TEXT_SINGLE_QUOTE ;
textpos : TEXT_POS TEXT_COLON TEXT_POSITION ;
textcontent: TEXT_CONTENT TEXT_COLON TEXT_SINGLE_QUOTE TEXT_CHARS TEXT_SINGLE_QUOTE;
textid: TEXT_ID TEXT_COLON TEXT_SINGLE_QUOTE TEXT_CHARS TEXT_SINGLE_QUOTE;
textmargin : MARGIN_TAG MARGIN_CURLYOPEN (marginattribute MARGIN_COMMA)* marginattribute MARGIN_COMMA? MARGIN_CURLYCLOSE;
marginattribute : MARGIN_LOCATION MARGIN_COLON MARGIN_SINGLE_QUOTE MARGIN_SIZES MARGIN_SINGLE_QUOTE ;
/*
right :
left :
top :
bottom:
*/
////////

button : BUTTON_TAG BUTTON_CURLYOPEN (buttonattribute BUTTON_COMMA)* buttonattribute BUTTON_COMMA? BUTTON_CURLYCLOSE;
buttonattribute : width | height | buttoncolor | buttonbackground | textbutton | buttonid | buttonmargin |event|buttonpos ;
width : BUTTON_WIDTH BUTTON_COLON BUTTON_SINGLE_QUOTE BUTTON_SIZES BUTTON_SINGLE_QUOTE  ;
height : BUTTON_HEIGHT BUTTON_COLON BUTTON_SINGLE_QUOTE BUTTON_SIZES BUTTON_SINGLE_QUOTE  ;
buttoncolor :  BUTTON_COLOR BUTTON_COLON BUTTON_SINGLE_QUOTE BUTTON_COLORS BUTTON_SINGLE_QUOTE ;
buttonbackground : BUTTON_BACKGROUND BUTTON_COLON BUTTON_SINGLE_QUOTE BUTTON_COLORS BUTTON_SINGLE_QUOTE  ;
textbutton :BUTTON_TEXT BUTTON_COLON BUTTON_SINGLE_QUOTE BUTTON_CHARS BUTTON_SINGLE_QUOTE;
buttonid: BUTTON_ID BUTTON_COLON BUTTON_SINGLE_QUOTE BUTTON_CHARS BUTTON_SINGLE_QUOTE;
event : BUTTON_EVENT EVENT_CURLYOPEN (eventattribute EVENT_COMMA )* eventattribute EVENT_COMMA? EVENT_CURLYCLOSE;
eventattribute : go_to;
buttonpos : BUTTON_POS  BUTTON_COLON BUTTON_POSITION;
go_to: GOTO EVENT_COLON EVENT_SINGLE_QUOTE  EVENT_CHARS EVENT_SINGLE_QUOTE;
buttonmargin : BUTTON_MARGIN MARGIN_CURLYOPEN (buttonmarginattribute MARGIN_COMMA)* buttonmarginattribute MARGIN_COMMA? MARGIN_CURLYCLOSE;
buttonmarginattribute : MARGIN_LOCATION MARGIN_COLON MARGIN_SINGLE_QUOTE MARGIN_SIZES MARGIN_SINGLE_QUOTE ;

/////////

textinput : TI_TAG TI_CURLYOPEN (textinputattribute TI_COMMA)* textinputattribute TI_COMMA? TI_CURLYCLOSE;
textinputattribute : textinputwidth |textinputpos |textinputheight | textinputcolor | textinputbackground | textinputid | textinputmargin | type  | text_hint;
textinputwidth : TI_WIDTH TI_COLON TI_SINGLE_QUOTE TI_SIZES TI_SINGLE_QUOTE  ;
textinputheight : TI_HEIGHT TI_COLON TI_SINGLE_QUOTE TI_SIZES TI_SINGLE_QUOTE  ;
textinputcolor :  TI_COLOR TI_COLON TI_SINGLE_QUOTE TI_COLORS TI_SINGLE_QUOTE ;
textinputbackground : TI_BACKGROUND TI_COLON TI_SINGLE_QUOTE TI_COLORS TI_SINGLE_QUOTE  ;
textinputpos : TI_POS TI_COLON TI_POSITION;
textinputid: TI_ID TI_COLON TI_SINGLE_QUOTE TI_CHARS TI_SINGLE_QUOTE;
textinputmargin : TI_MARGIN MARGIN_CURLYOPEN (textinputmarginattribute MARGIN_COMMA)* textinputmarginattribute MARGIN_COMMA? MARGIN_CURLYCLOSE;
textinputmarginattribute : MARGIN_LOCATION MARGIN_COLON MARGIN_SINGLE_QUOTE MARGIN_SIZES MARGIN_SINGLE_QUOTE ;
type : TYPE TI_COLON INPUT_TYPE;
text_hint : TEXTHINT TI_COLON TI_SINGLE_QUOTE TI_CHARS TI_SINGLE_QUOTE ;

