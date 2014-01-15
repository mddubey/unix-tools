package mritunjd.unixtools.cli;

import org.junit.Assert;
import org.junit.Test;

public class InputOptionsTest {
    @Test
    public void testIdentifiesFilenameAndNoOfLinesFromACollectionOfStrings() throws Exception {
        String[] input = {"-5", "a.txt"};

        InputOptions userInputs = new InputOptions(input);

        Assert.assertEquals("a.txt", userInputs.getFileName());
        Assert.assertEquals(5, userInputs.getNoOfLines());
    }

    @Test
    public void testGivesTenAsDefaultNoOfLinesWhenNoOptionAreGivenForNoOfLines() throws Exception {
        String[] input = {"a.txt"};

        InputOptions userInputs = new InputOptions(input);

        Assert.assertEquals("a.txt", userInputs.getFileName());
        Assert.assertEquals(10, userInputs.getNoOfLines());
    }
}
