package com.company.chatterbook.models;

public class ChatterPost {
    String text;

    public ChatterPost(String txt){
        this.text = txt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
