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

    public String formatOutput(String fileName) {
        StringBuilder resultLine = new StringBuilder("");
        resultLine.append("\t").append(countLines());
        resultLine.append("\t").append(countWords());
        resultLine.append("\t").append(countChars());
        resultLine.append("\t").append(fileName);
        return resultLine.toString();
    }
}