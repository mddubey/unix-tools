package mritunjd.unixtools;

import org.junit.Test;

import org.junit.Assert;

public class TailTest {
    @Test
    public void testGetLines() throws Exception {
        String input = "I am here.\n My name is Mritunjay\n How are You";
        Tail tail = new Tail(2, input);
        String[] expected = {" My name is Mritunjay", " How are You"};

        String[] actual = tail.getLines();
        Assert.assertArrayEquals(expected, actual);
    }
}
