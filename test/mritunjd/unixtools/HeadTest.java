package mritunjd.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HeadTest {
    @Test
    public void testGetLines() throws Exception {
        String input = "I am here.\n My name is Mritunjay\n How are You";
        Head head = new Head(2, input);
        String[] expected = {"I am here.", " My name is Mritunjay"};

        String[] actual = head.getLines();
        assertArrayEquals(expected, actual);
    }
}
