package mritunjd.unixtools.cli;

import mritunjd.fs.MyFileReader;
import mritunjd.unixtools.TextSorter;
import mritunjd.unixtools.helper.MyArray;

//class
public class TextSorterClient {
    TextSorter sorter;

    public TextSorterClient(String text) {
        this.sorter = new TextSorter(text);
    }

    public TextSorter getSorter() {
        return sorter;
    }

    public static void main(String[] args) {
        String text = new MyFileReader().readFile(args[0]);
        TextSorter sorter = new TextSorterClient(text).getSorter();
        String[] sortedLines;
        if (args.length > 1 && "-r".equals(args[1]))
            sortedLines = sorter.getReverseSortedLines();
        else
            sortedLines = sorter.getSortedLines();
        String sortedText = new MyArray(sortedLines).join("\n");
        System.out.println(sortedText);
    }
}


