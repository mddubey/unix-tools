package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class FieldCutterTest {
    @Test
    public void TestCutsLineForSingleFieldFromGivenText() throws Exception {
        String input = "Mritunjay 123\nDigvijay 234\nRaaz 420";
        FieldCutter cutter = new FieldCutter(input);
        String[] expected = {"123", "234", "420"};
        int[] fields = {2};
        String[] actual = cutter.cutLines(fields, " ");

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCutsLineForTwoFieldsFromGivenText() throws Exception {
        String text = "Mummy\tShweta\nShital\tManali\nSameeksha\tKavita";
        FieldCutter cutter = new FieldCutter(text);
        String[] expected = {"Mummy\tShweta", "Shital\tManali", "Sameeksha\tKavita"};
        int[] fields = {1, 2};

        String[] actual = cutter.cutLines(fields, "\t");

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCutLinesForMultipleFieldsWhenFieldNotPresent() throws Exception {
        String text = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        String[] expected = {"", "", "sad dad", ""};
        int[] fields = {4, 5};

        String[] actual = new FieldCutter(text).cutLines(fields, " ");

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testCutLinesForMultipleFieldsWhenFieldNotPresentWithoutDelimiter() throws Exception {
        String text = "1 Ram pass \n" +
                "2 Sita fail \n" +
                "3 him her sad dad bad \n" +
                "4 That This \n";
        String[] expected = {"1 Ram pass ", "2 Sita fail ", "3 him her sad dad bad ", "4 That This "};
        int[] fields = {4, 5};

        String[] actual = new FieldCutter(text).cutLines(fields, "\t");

        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void testGivesMultipleFieldsInCut() throws Exception {
        String input = "Mritunjay 123 UP India\nPrateek 490 Delhi India\nManish 230 UP India";
        String[] expected = {"Mritunjay 123", "Prateek 490", "Manish 230"};
        FieldCutter cutter = new FieldCutter(input);
        int[] fieldNos = {1, 2};
        String[] actual = cutter.cutLines(fieldNos, " ");

        Assert.assertArrayEquals(expected, actual);
    }
}
