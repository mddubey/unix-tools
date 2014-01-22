package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;

import java.io.File;

public class InputOptions {
    private int noOfLines;
    private String fileName;

    public InputOptions(String[] args) {
        this.noOfLines = 10;
        if (args.length > 1) {
            this.noOfLines = Integer.parseInt(args[0].substring(1));
            this.fileName = args[1];
        } else{
            this.fileName = args[0];
            String user_config = System.getenv("UNIX_TOOLS") +  "/user.config";
            File config_file = new File(user_config);
            if(config_file.exists()){
                String config_text = new MyFileReader().readFile(config_file);
                this.noOfLines = Integer.parseInt(config_text.split(":")[1]);
            }
        }
    }

    public int getNoOfLines() {
        return noOfLines;
    }

    public String getFileName() {
        return fileName;
    }
}
