package mritunjd.unixtools.cli;

public class CutInputOptions {
    private String filename;
    private int[] fields = {1};
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
                this.fields = fieldsAsNumeric;
            } else this.filename = input;
        }
    }

    public String getFilename() {
        return filename;
    }

    public int[] getFields() {
        return fields;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
