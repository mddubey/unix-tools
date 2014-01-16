package mritunjd.unixtools;

public class FieldCutter {
    private String text;

    public FieldCutter(String text) {
        this.text = text;
    }

    public String[] cutLines(int[] fieldNumbers, String delimiter) {
        String linesInText[] = text.split("\n");
        if(!text.contains(delimiter))
            return linesInText;
        int index = 0;
        String[] resultLines = new String[linesInText.length];
        for (String line : linesInText) {
            String[] fieldsInLine = line.split(delimiter);
            StringBuilder fieldsAsLine = getAllRequireFields(fieldNumbers, delimiter, fieldsInLine);
            if(fieldsAsLine.length()>0)
                fieldsAsLine.setLength(fieldsAsLine.length() - 1);
            resultLines[index++] = fieldsAsLine.toString();
        }
        return resultLines;
    }

    private StringBuilder getAllRequireFields(int[] fieldNumbers, String delimiter, String[] fieldsInLine) {
        StringBuilder fieldsAsLine = new StringBuilder("");
        for (int fieldNo : fieldNumbers) {
            if (fieldNo <= fieldsInLine.length){
                fieldsAsLine.append(fieldsInLine[fieldNo - 1]);
                fieldsAsLine.append(delimiter);
            }
        }
        return fieldsAsLine;
    }
}
