package recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StripeLeadingZerosTest {

    private StripLeadingZeros sl0;

    @Before
    public void SetUp() {
        sl0 = new StripLeadingZeros();
    }


    /*
    Channel formatter

    Write a recursive algorithm that strips the leading zeros off Strings of text.

    Simply strip off one zero at a time, and then recursively call yourself
    until no leading zeros from the original string are left.
     */
    @Test
    public void StripLeadingZeros() {
        Assert.assertEquals("1", sl0.stripZeros("0001"));
        Assert.assertEquals("11", sl0.stripZeros("00011"));
        Assert.assertEquals("1989", sl0.stripZeros("00001989"));
        Assert.assertEquals("VOD", sl0.stripZeros("VOD"));
    }

}
