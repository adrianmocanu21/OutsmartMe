package com.example.skorpyo1.outsmartme;

public class Word {

    private String englishWord;
    private String spanishWord;

    public Word(String englishWord, String spanishWord){
        this.englishWord = englishWord;
        this.spanishWord = spanishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }

    public void setSpanishWord(String spanishWord) {
        this.spanishWord = spanishWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public String getSpanishWord() {
        return spanishWord;
    }
}
