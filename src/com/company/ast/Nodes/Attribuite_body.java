package com.company.ast.Nodes;

public class Attribuite_body {
    Button button;
    Text text;
    TextInput textInput;
    OnClick onClick;

    public OnClick getOnClick() {
        return onClick;
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public TextInput getTextInput() {
        return textInput;
    }

    public void setTextInput(TextInput textInput) {
        this.textInput = textInput;
    }
}