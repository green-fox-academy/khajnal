package com.greenfoxacademy.week09day1.models;

public class TranslatedText {

  private String translated;
  private String lang;

  public TranslatedText() {
  }

  public TranslatedText(String translated, String lang) {
    this.translated = translated;
    this.lang = lang;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }
}
