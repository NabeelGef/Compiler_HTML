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
CHARS : ([A-Za-z1-9]|'.')+ ;

mode HEADER;
/*
HEADER_SPACE : ' '-> skip;
UNH:'\n'->skip;
UTH:'\t'->skip;
URH:'\r'->skip;
*/
HIDDEN_CHARS :  ( '\t' | ' ' | '\r' | '\n' )+ ->skip ;
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
H_COLOR :'Color ';
H_COLORS : 'Blue'| 'Red' | 'Purple' | 'Yellow' | 'Green'| 'White'| 'Black'| 'Brown';
H_CHARS : ([أ-يA-Za-z1-9]|'.'|'\\'|'/'|'_'|':')+;
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
B_CURLYCLOSE : '}' ->popMode;

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
TEXT_CHARS : ([أ-يA-Za-z1-9]|'.'|'_')+ ;
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
BUTTON_CHARS : ([أ-يA-Za-z1-9]|'.'|'_')+ ;

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
EVENT_SLASH:'/';
EVENT_CHARS : ([A-Za-z1-9]|'.'|'_')+ ;
EVENT_CURLYCLOSE : '}' ->popMode;

mode TI ;
TI_SPACE : ' ' -> skip;
UNTI:'\n'->skip;
UTTI:'\t'->skip;
URTI:'\r'->skip;

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
TI_CHARS : ([أ-يA-Za-z1-9]|'.'|'_')+ ;
TI_CURLYCLOSE : '}' ->popMode;





