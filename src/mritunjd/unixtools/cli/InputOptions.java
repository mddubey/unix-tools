package mritunjd.unixtools.cli;

public class InputOptions {
    private int noOfLines;
    private String fileName;

    public InputOptions(String[] args) {
        this.noOfLines = 10;
        if (args.length > 1) {
            this.noOfLines = Integer.parseInt(args[0].substring(1));
            this.fileName = args[1];
        } else
            this.fileName = args[0];
    }

    public int getNoOfLines() {
        return noOfLines;
    }

    public String getFileName() {
        return fileName;
    }
}
