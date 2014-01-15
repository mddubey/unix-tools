package mritunjd.unixtools;

public class FieldCutter {
    private String text;

    public FieldCutter(String text) {
        this.text = text;
    }

    public String[] cutLines(int[] fieldNumbers, String delimiter) {
        String linesInText[] = text.split("\n");
        int index = 0;
        String[] resultLines = new String[linesInText.length];
        for (String line : linesInText) {
            StringBuilder lineToReturn = new StringBuilder("");
            String[] fieldsInLine = line.split(delimiter);
            for (int fieldNo : fieldNumbers) {
                if (fieldNo <= fieldsInLine.length){
                    lineToReturn.append(fieldsInLine[fieldNo - 1]);
                    lineToReturn.append(delimiter);
                }
            }
            String lineAsString = lineToReturn.toString();
            if(lineAsString.length()>0)
                lineAsString = lineAsString.substring(0,lineAsString.length()-1);
            resultLines[index++] = lineAsString;
        }
        return resultLines;
    }
}
