package mritunjd.unixtools;

public class Head {
    private String text;
    private int limit;
    public Head(int noOfLines,String text){
        this.text = text;
        this.limit = noOfLines;
    }

    public String[] getLines(){
        String[] lines = text.split("\n");
        if(lines.length < limit)
            limit = lines.length;
        String[] result = new String[limit];
        System.arraycopy(lines, 0, result, 0, limit);
        return result;
    }


}
