package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.Head;

class Option {
    int noOfLines;
    String fileName;

    Option(int noOfLines, String fileName) {
        this.noOfLines = noOfLines;
        this.fileName = fileName;
    }
}

public class HeadClient {
    public Option getUserInput(String[] args) {
        int noOfLines;
        String fileNm;
        if (args.length > 1) {
            noOfLines = Integer.parseInt(args[0].substring(1));
            fileNm = args[1];
            return new Option(noOfLines, fileNm);
        }
        noOfLines = 10;
        fileNm = args[0];
        return new Option(noOfLines, fileNm);
    }

    public static void main(String[] args) {
        Option userInput = new HeadClient().getUserInput(args);
        System.out.println(userInput.fileName);
        String text = new MyFileReader().readFile(userInput.fileName);
        Head head = new Head(userInput.noOfLines, text);
        String[] lines = head.getLines();
        StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append(line);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
