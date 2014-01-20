package mritunjd.unixtools;

import java.util.Arrays;
import java.util.Collections;

public class TextSorter {
    String text;

    public TextSorter(String text) {
        this.text = text;
    }

    public String[] getSortedLines() {
        String[] lines = text.split("\n");
        Collections.sort(Arrays.asList(lines));
        return lines;
    }

    public String[] getReverseSortedLines() {
        String[] sortedLines = getSortedLines();
        Collections.reverse(Arrays.asList(sortedLines));
        return sortedLines;
    }

    public String[] performSort(String[] args) {
        if (args.length > 1 && "-r".equals(args[1]))
            return getReverseSortedLines();
        else
            return getSortedLines();
    }
}
