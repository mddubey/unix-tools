package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class UniqTest {
    @Test
    public void testGetUniqueLines() throws Exception {
        String input = "Ram\nSam\nSam\nTum\nTum\nlove";
        String expected = "Ram\nSam\nTum\nlove";

        Uniq uniq = new Uniq(input);
        Assert.assertEquals(expected,uniq.getUniqLines());
    }

    @Test
    public void test_gives_unique_lines_from_given_string() throws Exception {
        String input = "I am Here.\n" +
                "I am Here.\n" +
                "today is Monday\n" +
                " I am Here";
        Uniq uniq = new Uniq(input);
        String expected = "I am Here.\n" +
                "today is Monday\n" +
                " I am Here";

        String actual = uniq.getUniqLines();

        Assert.assertEquals("Failed",expected,actual);
    }
}