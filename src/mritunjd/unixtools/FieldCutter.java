package mritunjd.unixtools;

public class FieldCutter {
    private String text;

    public FieldCutter(String text) {
        this.text = text;
    }

    public String[] getFields(int fieldNo, String delimiter) {
        String linesInText[] = text.split("\n");
        String fields[] = new String[linesInText.length];
        int index = 0;
        fieldNo = fieldNo - 1;
        for (String line : linesInText) {
            String words[] = line.split(delimiter);
            fields[index] = "";
            if (fieldNo < words.length)
                fields[index] = words[fieldNo];
            index++;
        }
        return fields;
    }

    public String[] getFieldsInLine(int[] fieldNumbers, String delimiter){
        String linesInText[] = text.split("\n");
        int index = 0;
        String[] resultLines = new String[linesInText.length];
        for (String line : linesInText) {
            StringBuilder lineToReturn = new StringBuilder("");
            String[] fieldsInLine = line.split(delimiter);
            for (int fieldNo : fieldNumbers) {
                if(fieldNo < fieldsInLine.length)
                    lineToReturn.append(fieldsInLine[fieldNo-1]);
                else
                    lineToReturn.append("");
                lineToReturn.append(delimiter);
            }
            resultLines[index++] = lineToReturn.toString().trim();
        }
        return resultLines;
    }

    public String[] getFields(int fieldNo) {
        return getFields(fieldNo, " ");
    }

    public String[] getFields(String delimiter) {
        return getFields(1, delimiter);
    }

    public String[] getFields() {
        return getFields(1, " ");
    }
}
