package mritunjd.unixtools.cli;

public class CutInputOptions {
    private String filename;
    private int[] fieldNo = {1};
    private String delimiter = " ";

    CutInputOptions(String[] inputs) {
        for (String input : inputs) {
            if (input.startsWith("-d"))
                this.delimiter = input.substring(2);
            else if (input.startsWith("-f")) {
                String[] fieldsAsStrings = input.substring(2).split(",");
                int[] fieldsAsNumeric = new int[fieldsAsStrings.length];
                for (int i = 0; i < fieldsAsStrings.length; i++) {
                    fieldsAsNumeric[i] = Integer.parseInt(fieldsAsStrings[i]);
                }
                this.fieldNo = fieldsAsNumeric;
            } else this.filename = input;
        }
    }

    public String getFilename() {
        return filename;
    }

    public int[] getFieldNo() {
        return fieldNo;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
