package mritunjd.unixtools;

public class Tail {
    private String text;
    private int limit;
    public Tail(int noOfLines, String text){
        this.text = text;
        this.limit = noOfLines;
    }

    public String[] getLines(){
        String[] lines = text.split("\n");
        String[] result = new String[limit];
        if(lines.length < limit)
            return lines;
        int index = 0;
        for (int i = (lines.length - limit); i < lines.length; i++) {
            result[index] = lines[i];
            index++;
        }
        return result;
    }


}
