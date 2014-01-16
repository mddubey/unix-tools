package mritunjd.unixtools.cli;

import org.junit.Assert;
import org.junit.Test;

public class CutInputOptionsTest {
    @Test
    public void testGivesTheFileNameFromGivenArrayOfStrings() throws Exception {
        String[] parameters = {"a.txt"};
        CutInputOptions userInput = new CutInputOptions(parameters);
        String expectedFileName = "a.txt";

        String actualFileName = userInput.getFilename();

        Assert.assertEquals(expectedFileName, actualFileName);
    }

    @Test
    public void testGivesTheArrayOfFieldNumbersFromGivenInputs() throws Exception {
        String[] parameters = {"-f1,2,3"};
        CutInputOptions userInput = new CutInputOptions(parameters);
        int[] expectedFields = {1, 2, 3};

        int[] actualFields = userInput.getFieldNo();

        Assert.assertArrayEquals(expectedFields, actualFields);

    }

    @Test
    public void testGivesTheDelimiterFromGivenInputs() throws Exception {
        String[] parameters = {"-d-"};
        CutInputOptions userInput = new CutInputOptions(parameters);
        String expectedDelimiter = "-";

        String actualDelimiter = userInput.getDelimiter();

        Assert.assertEquals(expectedDelimiter, actualDelimiter);
    }

    @Test
    public void testProvidesDefaultDelimiterAndFields() throws Exception {
        String[] parameters = {"a.txt"};
        CutInputOptions userInput = new CutInputOptions(parameters);
        String expectedDelimiter = " ";
        String expectedFileName = "a.txt";
        int[] expectedFields = {1};

        String actualDelimiter = userInput.getDelimiter();
        String actualFileName = userInput.getFilename();
        int[] actualFields = userInput.getFieldNo();

        Assert.assertEquals(expectedDelimiter, actualDelimiter);
        Assert.assertEquals(expectedFileName, actualFileName);
        Assert.assertArrayEquals(expectedFields, actualFields);
    }

    @Test
    public void testIdentifiesDifferentOptionsFromArrayOfStrings() throws Exception {
        String[] parameters = {"-d-", "-f12,34,50", "a.txt"};
        CutInputOptions userInput = new CutInputOptions(parameters);
        String expectedDelimiter = "-";
        String expectedFileName = "a.txt";
        int[] expectedFields = {12, 34, 50};

        String actualDelimiter = userInput.getDelimiter();
        String actualFileName = userInput.getFilename();
        int[] actualFields = userInput.getFieldNo();

        Assert.assertEquals(expectedDelimiter, actualDelimiter);
        Assert.assertEquals(expectedFileName, actualFileName);
        Assert.assertArrayEquals(expectedFields, actualFields);
    }
}
