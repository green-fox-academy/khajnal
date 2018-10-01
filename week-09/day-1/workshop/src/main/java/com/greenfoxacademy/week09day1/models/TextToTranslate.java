package com.greenfoxacademy.week09day1.models;

public class TextToTranslate {

  private String text;
  private String lang;

  public TextToTranslate() {
  }

  public TextToTranslate(String text, String lang) {
    this.text = text;
    this.lang = lang;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }
}

