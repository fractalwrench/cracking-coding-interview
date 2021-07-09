package co.uk.fractalwrench.cci.ch1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Chapter1Question1Test {

    @Test(expected = IllegalArgumentException.class)
    public void testNullInput() {
        Chapter1Question1.hasAllUniqueCharacters(null);
    }

    @Test
    public void testEmptyInput() {
        assertTrue(Chapter1Question1.hasAllUniqueCharacters(""));
    }

    @Test
    public void testUniqueChars() {
        assertTrue(Chapter1Question1.hasAllUniqueCharacters("dog"));
    }

    @Test
    public void testDupeChars() {
        assertFalse(Chapter1Question1.hasAllUniqueCharacters("apple"));
        assertFalse(Chapter1Question1.hasAllUniqueCharacters("boba"));
    }
}