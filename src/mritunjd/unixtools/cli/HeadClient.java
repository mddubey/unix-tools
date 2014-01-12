package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Head;
import mritunjd.unixtools.helper.MyArray;

public class HeadClient {
    public InputOptions getUserInput(String[] args) {
        int noOfLines;
        String fileNm;
        if (args.length > 1) {
            noOfLines = Integer.parseInt(args[0].substring(1));
            fileNm = args[1];
            return new InputOptions(noOfLines, fileNm);
        }
        noOfLines = 10;
        fileNm = args[0];
        return new InputOptions(noOfLines, fileNm);
    }

    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Arguments not found....");
            System.err.println("Usage:  HeadClient  [Option]    [File Name]");
            System.exit(1);
        }
        InputOptions userInput = new mritunjd.unixtools.cli.HeadClient().getUserInput(args);
        String text = new MyFileReader().readFile(userInput.fileName);
        Head head = new Head(userInput.noOfLines, text);
        String[] lines = head.getLines();
        String result = new MyArray(lines).join("\r\n");
        System.out.println(result);
    }
}
