package mritunjd.unixtools;

import org.junit.Test;

import org.junit.Assert;

public class TailTest {
    @Test
    public void testGivesLastTwoLinesOfFile() throws Exception {
        String input = "I am here.\n My name is Mritunjay\n How are You";
        Tail tail = new Tail(2, input);
        String[] expected = {" My name is Mritunjay", " How are You"};

        String[] actual = tail.getLines();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGivesLastTenLinesOfFile() throws Exception {
        String input = "Extra\nI\nam\nhere.\nMy\nname\nis\nMritunjay\nHow\nare\nYou";
        Tail tail = new Tail(10, input);
        String[] expected = {"I", "am", "here.", "My", "name", "is", "Mritunjay","How","are","You"};

        String[] actual = tail.getLines();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGivesWholeFileWhenAskedNoOfLinesAreGreaterThanLinesInFile() throws Exception {
        String input = "Extra\nI\nam\nhere.\nMy\nname\nis\nMritunjay\nHow\nare\nYou";
        Tail tail = new Tail(20, input);
        String[] expected = {"Extra","I", "am", "here.", "My", "name", "is", "Mritunjay","How","are","You"};

        String[] actual = tail.getLines();
        Assert.assertArrayEquals(expected, actual);
    }
}
