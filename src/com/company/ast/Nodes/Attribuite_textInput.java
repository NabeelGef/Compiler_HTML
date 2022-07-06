package com.company.ast.Nodes;

public class Attribuite_textInput {
    String Width , Height , Color , Background , Id,TextHint, Type;
    Margin margin;

    public String getWidth() {
        return Width;
    }

    public void setWidth(String width) {
        Width = width;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getBackground() {
        return Background;
    }

    public void setBackground(String background) {
        Background = background;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTextHint() {
        return TextHint;
    }

    public void setTextHint(String textHint) {
        TextHint = textHint;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Margin getMargin() {
        return margin;
    }

    public void setMargin(Margin margin) {
        this.margin = margin;
    }
}
