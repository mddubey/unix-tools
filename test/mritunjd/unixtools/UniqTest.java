package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class UniqTest {
    @Test
    public void testGivesUniqLinesFromString() throws Exception {
        String input = "Ram\nSam\nSam\nTam\nTam\nlove";
        String expected = "Ram\nSam\nTam\nlove";

        Uniq uniq = new Uniq(input);

        Assert.assertEquals(expected, uniq.getUniqLines());
    }

    @Test
    public void testFiltersOnlyAdjucentDuplicateLines() throws Exception {
        String input = "Ram\nSam\nSam\nTam\nTam\nlove\nSam\nRam";
        String expected = "Ram\nSam\nTam\nlove\nSam\nRam";

        Uniq uniq = new Uniq(input);

        Assert.assertEquals(expected, uniq.getUniqLines());
    }

    @Test
    public void testPerformsCaseSensitiveComparisionOfTwoLines() throws Exception {
        String input = "Ram\nSam\nSam\nTam\nTam\ntam\nlove";
        String expected = "Ram\nSam\nTam\ntam\nlove";

        Uniq uniq = new Uniq(input);

        Assert.assertEquals(expected, uniq.getUniqLines());
    }

    @Test
    public void testDoesnotGiveLastLineWhenItMatchesWithSecondLastLine() throws Exception {
        String input = "Ram\nSam\nSam\nTam\nTam\ntam\nlove\nlove";
        String expected = "Ram\nSam\nTam\ntam\nlove";

        Uniq uniq = new Uniq(input);

        Assert.assertEquals(expected, uniq.getUniqLines());
    }

    @Test
    public void testGivesUniqueLinesFromGivenString() throws Exception {
        String input = "I am Here.\n" +
                "I am Here.\n" +
                "today is Monday\n" +
                " I am Here";
        Uniq uniq = new Uniq(input);
        String expected = "I am Here.\n" +
                "today is Monday\n" +
                " I am Here";

        String actual = uniq.getUniqLines();

        Assert.assertEquals(expected, actual);
    }
}
