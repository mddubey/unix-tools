package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class SpaceReducerTest {
    @Test
    public void testReducesMultipleSpacesIntoOne() throws Exception {
        String input = "My     Name     is      Mritunjay     Dubey.";
        String expected = "My Name is Mritunjay Dubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTrimsUnnecessarySpacesAtTheEndAndStartingOfText() throws Exception {
        String input = "     My     Name     is      Mritunjay     Dubey.     ";
        String expected = "My Name is Mritunjay Dubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemovesUnnecessarySpacesStartingOfTheLine() throws Exception {
        String input = "  I\n  am\n  Mritunjay\n  Dubey.";
        String expected = "I\nam\nMritunjay\nDubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemovesUnnecessarySpacesEndOfTheLine() throws Exception {
        String input = "I   \nam   \nMritunjay   \nDubey.   ";
        String expected = "I\nam\nMritunjay\nDubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemovesUnnecessarySpacesAccordingToItsPlace() throws Exception {
        String input = "  I     am   \n  Mritunjay   \n  Dubey.   ";
        String expected = "I am\nMritunjay\nDubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }
}
