package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class TextSorterTest {
    @Test
    public void test_sorts_multiple_lines_with_single_field_in_accending_order(){
        String input = "Mritunjay\nDigvijay\nRajkumar\nAniket\nHarjas";
        String[] expected = {"Aniket","Digvijay","Harjas","Mritunjay","Rajkumar"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.getSortedLines();

        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void test_sorts_multiple_lines_with_single_field_in_descending_order(){
        String input = "Mritunjay\nDigvijay\nRajkumar\nAniket\nHarjas";
        String[] expected = {"Rajkumar","Mritunjay","Harjas","Digvijay","Aniket"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.getReverseSortedLines();

        Assert.assertArrayEquals(expected,actual);
    }
}
