package mritunjd.unixtools;

public class WC {
    String text;

    public WC(String text) {
        this.text = text;
    }

    public int countWords() {
        return text.split("\\w+").length;
    }

    public int countLines() {
        return text.split("(\\n+)").length - 1;
    }

    public int countChars() {
        return text.length();
    }
}