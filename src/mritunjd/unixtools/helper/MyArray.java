package mritunjd.unixtools.helper;

public class MyArray {
    String[] lines;

    public MyArray(String[] lines) {
        this.lines = lines;
    }

    public String join(String delimeter) {
        StringBuilder sb = new StringBuilder("");
        for (String line : lines) {
            sb.append(line).append(delimeter);
        }
        String text = sb.toString();
        return text.substring(0, text.length() - 1);
    }
}
