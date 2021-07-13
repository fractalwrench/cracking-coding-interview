package co.uk.fractalwrench.cci.ch10;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class Chapter10Question1Test {

    @Test
    public void arrayInserted() {
        int[] a = {-10934, -3, 5, 10, 2093, 4809, 50923, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] b = {-234098, -209, -3, -1, 209, 409, 11000, 9000000};
        Chapter10Question1.mergeArrays(a, b);
        int[] expected = {-234098, -10934, -209, -3, -3, -1, 5, 10, 209, 409, 2093, 4809, 11000, 50923, 9000000};
        assertArrayEquals(expected, a);
    }
}
