package com.company.ast.Nodes;

public class Attribuite_header {
    String Title , Color , Size,url,pos , url_control;

    public String getUrl_control() {
        return url_control;
    }

    public void setUrl_control(String url_control) {
        this.url_control = url_control;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }
}
