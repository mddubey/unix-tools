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
