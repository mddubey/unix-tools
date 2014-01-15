package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Head;
import mritunjd.unixtools.helper.MyArray;

import java.io.File;

public class HeadClient {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Arguments not found....");
            System.err.println("Usage:  HeadClient  [Option]    [File Name]");
            System.exit(1);
        }
        InputOptions userInput = new InputOptions(args);
        File file = new File(userInput.getFileName());
        String text = new MyFileReader().readFile(file);
        Head head = new Head(userInput.getNoOfLines(), text);
        String[] lines = head.getLines();
        String result = new MyArray(lines).join("\n");
        System.out.println(result);
    }
}
