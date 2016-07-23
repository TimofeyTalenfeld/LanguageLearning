package ru.yandex.yamblz.languagelearning.lang;

/**
 * Created by root on 7/23/16.
 */
public class WordResponse {
    private int code;
    private String lang;
    private String[] text;

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String[] getText() {
        return text;
    }

    public void setText(String[] text) {
        this.text = text;
    }
}
