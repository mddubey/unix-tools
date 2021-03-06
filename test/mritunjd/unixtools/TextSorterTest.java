package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class TextSorterTest {
    @Test
    public void test_sorts_multiple_lines_with_single_field_in_accending_order() {
        String input = "Mritunjay\nDigvijay\nRajkumar\nAniket\nHarjas";
        String[] expected = {"Aniket", "Digvijay", "Harjas", "Mritunjay", "Rajkumar"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.getSortedLines();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sorts_multiple_lines_with_single_field_in_descending_order() {
        String input = "Mritunjay\nDigvijay\nRajkumar\nAniket\nHarjas";
        String[] expected = {"Rajkumar", "Mritunjay", "Harjas", "Digvijay", "Aniket"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.getReverseSortedLines();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sorts_multiple_lines_numeric_values_as_string() {
        String input = "11\n2\n21\n3";
        String[] expected = {"11", "2", "21", "3"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.getSortedLines();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sorts_the_strings_in_ascending_order_when_no_option_is_given() {
        String input = "11\n2\n21\n3";
        String[] expected = {"11", "2", "21", "3"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.performSort(new String[]{"kuch v"});

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_sorts_the_strings_in_descending_order_when_minus_r_option_is_given() {
        String input = "11\n2\n21\n3";
        String[] expected = {"3", "21", "2", "11"};
        TextSorter sorter = new TextSorter(input);

        String[] actual = sorter.performSort(new String[]{"kuch v", "-r"});

        Assert.assertArrayEquals(expected, actual);
    }


}
