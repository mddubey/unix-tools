package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class FieldCutterTest {
    @Test
    public void test_cuts_and_gives_the_asked_fields_of_each_line() throws Exception {
        String input = "Mritunjay,123,UP,India\nPrateek,490,Delhi,India\nManish,123,UP,India";
        String[] expected = {"Mritunjay", "Prateek", "Manish"};
        String delimiter = ",";
        FieldCutter cutter = new FieldCutter(input);

        String[] actual = cutter.getFields(1, delimiter);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_gives_blank_when_asked_fields_not_present() throws Exception {
        String input = "Mritunjay,123,UP,Swiss\nPrateek,490,Delhi,India\nManish,123,UP";
        String[] expected = {"Swiss", "India", ""};
        String delimiter = ",";
        FieldCutter cutter = new FieldCutter(input);

        String[] actual = cutter.getFields(4, delimiter);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_takes_space_as_default_delimiter() throws Exception {
        String input = "Mritunjay 123 UP India\nPrateek 490 Delhi India\nManish 230 UP India";
        String[] expected = {"123", "490", "230"};
        FieldCutter cutter = new FieldCutter(input);

        String[] actual = cutter.getFields(2);

        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test_gives_first_field_when_no_field_no_are_specified() throws Exception {
        String input = "Mritunjay:123:UP:India\nPrateek:490:Delhi:India\nManish:230:UP:India";
        String[] expected = {"Mritunjay", "Prateek", "Manish"};
        FieldCutter cutter = new FieldCutter(input);
        String delimiter = ":";
        String[] actual = cutter.getFields(delimiter);

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test_when_no_delimiter_and_no_fieldNo() throws Exception {
        String input = "Mritunjay 123 UP India\nPrateek 490 Delhi India\nManish 230 UP India";
        String[] expected = {"Mritunjay", "Prateek", "Manish"};
        FieldCutter cutter = new FieldCutter(input);

        String[] actual = cutter.getFields();

        Assert.assertArrayEquals(expected, actual);
    }
}
