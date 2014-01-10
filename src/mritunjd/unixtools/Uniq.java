package mritunjd.unixtools;

public class Uniq {
    String text;

    public Uniq(String text) {
        this.text = text;
    }

    public String getUniqLines() {
        StringBuilder sb = new StringBuilder();
        String lines[] = text.split("\n");
        sb.append(lines[0]).append("\n");
        for (int i = 0; i < lines.length-1; i++) {
            if (!lines[i].equalsIgnoreCase(lines[i + 1])) {
                sb.append(lines[i+1]).append("\n");
            }
        }
        return sb.toString().trim();
    }
}
