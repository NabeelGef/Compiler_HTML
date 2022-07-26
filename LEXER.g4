lexer grammar  LEXER;
SPACE : ' '->skip;
UN:'\n'->skip;
UT:'\t'->skip;
UR:'\r'->skip;
/*
SEA_WS
    :  (' '|'\t'|'\r'|'\n')+
    ;
*/
TAG_OPEN : '<';
TAG_CLOSE : '>';
START : 'start';
CURLYOPEN : '{';
CURLYCLOSE : '}';
COLON : ':';
SINGLE_QUOTE : '\'';
COMMA : ',';
SEMICOLON : ';';
HEADER_TAG : 'header'->pushMode(HEADER);
BODY_TAG : 'body' -> pushMode(BODY);
CHARS : ('_'|':'|'\\'|'/'|'.')*[a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')*(' '? [a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')?)*;
mode HEADER;

HEADER_SPACE : ' '-> skip;
UNH:'\n'->skip;
UTH:'\t'->skip;
URH:'\r'->skip;

HEADER_CURLYOPEN : '{';
TITLE : 'Title';
H_SINGLE_QUOTE : '\'';
H_SEMICOLON : ';';
H_COMMA : ',';
URLCONTROL:'url_control';
URL: 'url' ;
H_SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
H_SIZE :'Size';
H_POSITION : 'left'|'right'|'center';
H_POS : 'Pos';
H_POINTS : ':';
H_COLOR :'Color';
H_COLORS : 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
H_CHARS : ('_'|':'|'\\'|'/'|'.')*[a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')*(' '? [a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')?)*;
HEADER_CURLYCLOSE : '}' ->popMode;

mode BODY;
B_SPACE : ' ' -> skip;
UNB:'\n'->skip;
UTB:'\t'->skip;
URB:'\r'->skip;
B_CURLYOPEN : '{';
B_COMMA : ',';
TEXT_TAG:'Text' -> pushMode(TEXT);
BUTTON_TAG:'Button'-> pushMode(BUTTON);
TI_TAG : 'TextInput' -> pushMode(TI);
ON_CLICK : 'OnClick' -> pushMode(ONCLICK);
B_CURLYCLOSE : '}' ->popMode;


mode ONCLICK;
SPACE_ONCLICK : ' '-> skip;
UN_ONCLICK:'\n'->skip;
UT_ONCLICK:'\t'->skip;
UR_ONCLICK:'\r'->skip;
CURLYOPEN_ONCLICK: '{';
CURLYCLOSE_ONCLICK : '}' -> popMode;
DOT_ONCLICK : '.';
GET_DATA : 'getData';
OPEN_GETDATA : '(';
CLOSE_GETDATA : ')';
ONCLICK_FUNCTION : 'onClick()' -> pushMode(INNER_ONCLICK);
SINGLE_QUOTE_ONCLICK : '\'';
SEMICOLON_ONCLICK : ';';
EQUAL_ONCLICK : '=';
CHARS_ONCLICK :('_')*[a-zA-Z0-9]+('_')*(' '? [a-zA-Z0-9]+)*;


mode INNER_ONCLICK;
SPACEI : ' '->skip;
UNI:'\n'->skip;
UTI:'\t'->skip;
URI:'\r'->skip;
CURLYOPEN_INNERONCLICK: '{';
CURLYCLOSE_INNERONCLICK : '}';
SEMICOLON_INNERONCLICK : ';' -> popMode ;
COLORS_INNERONCLICK : 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
SIZES_INNERONCLICK : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
WIDTH_INNERONCLICK :'Width';
CONTENT_INNERONCLICK : 'Content';
COLOR_INNERONCLICK :'Color';
BACKGROUND_INNERONCLICK : 'Background';
HEIGHT_INNERONCLICK : 'Height';
SIZE_INNERONCLICK : 'Size';
DOT_INNERONCLICK : '.';
EQUAL_INNERONCLICK : '=';
SINGLE_QUOTE_INNERONCLICK : '\'';
COMMA_INNERONCLICK : ',';



CHARS_INNERONCLICK :('_')*[a-zA-Z0-9]+('_')*(' '? [a-zA-Z0-9]+)*;


mode TEXT;
TEXT_SPACE : ' ' -> skip;
UNT:'\n'->skip;
UTT:'\t'->skip;
URT:'\r'->skip;
TEXT_CURLYOPEN : '{';
TEXT_COLON : ':';
TEXT_SINGLE_QUOTE : '\'';
TEXT_COMMA : ',';
TEXT_SEMICOLON : ';';
TEXT_COLOR:'Color';
TEXT_COLORS: 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
TEXT_CONTENT:'Content';
TEXT_SIZE :'Size';
TEXT_SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
TEXT_ID: 'Id' ;
TEXT_POSITION : 'left'|'right'|'center';
TEXT_POS : 'Pos';
MARGIN_TAG:'Margin'->pushMode(MARGIN);
TEXT_CHARS :('_'|':'|'\\'|'/'|'.')*[a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')*(' '? [a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')?)*;
TEXT_CURLYCLOSE : '}' ->popMode;

mode MARGIN;
MARGIN_SPACE : ' ' -> skip;
UNM:'\n'->skip;
UTM:'\t'->skip;
URM:'\r'->skip;
MARGIN_CURLYOPEN : '{';
MARGIN_COLON : ':';
MARGIN_COMMA : ',';
MARGIN_SINGLE_QUOTE : '\'';
MARGIN_SEMICOLON : ';';
MARGIN_LOCATION : 'Right'|'Left'|'Top'|'Bottom';
MARGIN_SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
MARGIN_CURLYCLOSE : '}' ->popMode;

mode BUTTON;
BUTTON_SPACE : ' ' -> skip;
UNBS:'\n'->skip;
UTBS:'\t'->skip;
URBS:'\r'->skip;

BUTTON_POS : 'Pos';
BUTTON_POSITION : 'center'|'right'|'left';
BUTTON_CURLYOPEN : '{';
BUTTON_COLON : ':';
BUTTON_SINGLE_QUOTE : '\'';
BUTTON_COMMA : ',';
BUTTON_SEMICOLON : ';';
BUTTON_WIDTH :'Width';
BUTTON_HEIGHT : 'Height';
BUTTON_SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
BUTTON_COLOR:'Color';
BUTTON_COLORS: 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
BUTTON_BACKGROUND:'Background';
BUTTON_ID:'Id';
BUTTON_TEXT:'TextButton';
BUTTON_MARGIN:'Margin'->pushMode(MARGIN);
BUTTON_EVENT:'Event'->pushMode(EVENT);
BUTTON_CURLYCLOSE : '}' ->popMode;
BUTTON_CHARS : ('_'|':'|'\\'|'/'|'.')*[a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')*(' '? [a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')?)*;


mode EVENT;
EVENT_SPACE : ' ' -> skip;
UNE:'\n'->skip;
UTE:'\t'->skip;
URE:'\r'->skip;

EVENT_CURLYOPEN : '{';
EVENT_COLON : ':';
EVENT_SINGLE_QUOTE : '\'';
EVENT_COMMA : ',';
EVENT_SEMICOLON : ';';
GOTO : 'go_to';
EVENT_CHARS : ('_'|':'|'\\'|'/'|'.')*[a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')*(' '? [a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')?)*;

EVENT_CURLYCLOSE : '}' ->popMode;

mode TI ;
TI_SPACE : ' ' -> skip;
UNTI:'\n'->skip;
UTTI:'\t'->skip;
URTI:'\r'->skip;

TI_POS : 'Pos';
TI_POSITION : 'center'|'right'|'left';
TI_CURLYOPEN : '{';
TI_COLON : ':';
TI_SINGLE_QUOTE : '\'';
TI_COMMA : ',';
TI_SEMICOLON : ';';
TI_WIDTH :'Width';
TI_HEIGHT : 'Height';
TI_SIZES : [0-9]+'px' | [0-9]+'rem' | [0-9]+'dp';
TI_COLOR:'Color';
TI_COLORS: 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
TI_BACKGROUND:'Background';
TI_ID:'Id';
TI_MARGIN:'Margin'->pushMode(MARGIN);
TEXTHINT : 'TextHint';
TYPE : 'Type ';
INPUT_TYPE: 'text' | 'password' | 'numbers';
TI_CHARS : ('_'|':'|'\\'|'/'|'.')*[a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')*(' '? [a-zA-Z0-9ا-ي]+('_'|':'|'\\'|'/'|'.')?)*;
TI_CURLYCLOSE : '}' ->popMode;





