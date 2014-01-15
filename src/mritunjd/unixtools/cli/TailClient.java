package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Tail;
import mritunjd.unixtools.helper.MyArray;

import java.io.File;

public class TailClient {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Arguments not found....");
            System.err.println("Usage:  TailClient  [Option]    [File Name]");
            System.exit(1);
        }
        InputOptions userInput;
        userInput = new InputOptions(args);
        String text = new MyFileReader().readFile(new File(userInput.getFileName()));
        Tail tail = new Tail(userInput.getNoOfLines(), text);
        String[] lines = tail.getLines();
        String result = new MyArray(lines).join("\n");
        System.out.println(result);
    }
}
