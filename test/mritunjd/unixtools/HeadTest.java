package mritunjd.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HeadTest {
    @Test
    public void testGivesTheFirstTwoLinesOfTheFile() throws Exception {
        String input = "I am here.\n My name is Mritunjay\n How are You";
        Head head = new Head(2, input);
        String[] expected = {"I am here.", " My name is Mritunjay"};

        String[] actual = head.getLines();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGivesTheFirstTenLinesOfTheFile() throws Exception {
        String input = "I\nam\nhere.\nMy\nname\nis\nMritunjay\nHow\nare\nYou\nExtra";
        Head head = new Head(10, input);
        String[] expected = {"I", "am", "here.", "My", "name", "is", "Mritunjay","How","are","You"};

        String[] actual = head.getLines();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testGivesWholeFileWhenAskedLinesAreGreaterThanNoOfLinesInFile() throws Exception {
        String input = "I am here.\n My name is Mritunjay.\n How are You";
        Head head = new Head(10, input);
        String[] expected = {"I am here.", " My name is Mritunjay."," How are You"};

        String[] actual = head.getLines();
        assertArrayEquals(expected, actual);
    }
}
