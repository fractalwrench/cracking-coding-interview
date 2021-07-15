package co.uk.fractalwrench.cci.ch1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Chapter1Question2Test {

    @Test
    public void isPermutation() {
        assertFalse(Chapter1Question2.isPermutation("", ""));

        // the strings are equal, not a permutation
        assertFalse(Chapter1Question2.isPermutation("apple", "apple"));

        // test some unequal strings
        assertFalse(Chapter1Question2.isPermutation("bathe", "bath"));
        assertFalse(Chapter1Question2.isPermutation("asdfpiwer", "fjsdfoie"));
        assertFalse(Chapter1Question2.isPermutation("asdfpiwer", "asdFpiwer"));

        // test some permutations
        assertTrue(Chapter1Question2.isPermutation("dog", "god"));
        assertTrue(Chapter1Question2.isPermutation("poiawer", "roaiwep"));
        assertTrue(Chapter1Question2.isPermutation("terrible", "elberrti"));
    }
}
