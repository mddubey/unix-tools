package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Tail;

public class TailClient {
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
        InputOptions userInput;
        userInput = new TailClient().getUserInput(args);
        String text = new MyFileReader().readFile(userInput.fileName);
        Tail tail = new Tail(userInput.noOfLines, text);
        String[] lines = tail.getLines();
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}