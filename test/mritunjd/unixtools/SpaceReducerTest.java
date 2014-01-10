package mritunjd.unixtools;

import org.junit.Assert;
import org.junit.Test;

public class SpaceReducerTest {
    @Test
    public void test_reduces_multiple_spaces_into_one() throws Exception {
        String input = "My     Name     is      Mritunjay     Dubey.";
        String expected = "My Name is Mritunjay Dubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_trims_unnecessary_spaces_at_the_end_and_starting_of_text() throws Exception {
        String input = "     My     Name     is      Mritunjay     Dubey.     ";
        String expected = "My Name is Mritunjay Dubey.";
        SpaceReducer reducer = new SpaceReducer(input);

        String actual = reducer.reduceSpaces();

        Assert.assertEquals(expected, actual);
    }
}
