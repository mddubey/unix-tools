package mritunjd.unixtools.helper;

import org.junit.Assert;
import org.junit.Test;

public class MyArrayTest {
    @Test
    public void testConcatsTheGivenStringArrayWithGivenDelimiter() throws Exception {
        String[] internNames = {"Prateek", "Raaz", "Digvijay"};
        MyArray interns = new MyArray(internNames);
        String expected = "Prateek,Raaz,Digvijay";

        String actual = interns.join(",");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConcatsTheGivenStringArrayWithGivenDelimiterAndTrimsLastDelimiter() throws Exception {
        String[] internNames = {"Mummy", "Shweta", "shital"};
        MyArray interns = new MyArray(internNames);
        String expected = "Mummy:Shweta:shital";

        String actual = interns.join(":");

        Assert.assertEquals(expected, actual);
    }
}
