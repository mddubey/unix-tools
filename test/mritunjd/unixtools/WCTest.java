package mritunjd.unixtools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCTest {
    @Test
    public void testCountWords() throws Exception {
        String input = "I am Mritunjay from Gorakhpur";
        WC wc = new WC(input);
        int expected = 5;

        int actual = wc.countWords();

        assertEquals(expected, actual);
    }

    @Test
    public void testCountLines() throws Exception {
        String input = "I am Mritunjay.\n Prateek is Here.\nhow r You?";
        WC wc = new WC(input);
        int expected = 2;

        int actual = wc.countLines();

        assertEquals(expected, actual);
    }

    @Test
    public void testCountChars() throws Exception {
        String input = "I am Mritunjay.";
        WC wc = new WC(input);
        int expected = 15;

        int actual = wc.countChars();

        assertEquals(expected, actual);
    }

    @Test
    public void testGivesTheProperFormatedOutput() throws Exception {
        String input = "I am Mritunjay.\nPrateek is Here.\nhow r You?";
        WC wc = new WC(input);
        String expected = "\t2\t10\t43\tsomeGarbage";

        String actual = wc.formatOutput("someGarbage");

        assertEquals(expected, actual);
    }
}
