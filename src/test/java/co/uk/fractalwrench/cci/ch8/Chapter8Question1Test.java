package co.uk.fractalwrench.cci.ch8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Chapter8Question1Test {

    @Test
    public void countStairMethods() {
        assertEquals(1, Chapter8Question1.countSteps(0));
        assertEquals(1, Chapter8Question1.countSteps(1));
        assertEquals(2, Chapter8Question1.countSteps(2));
        assertEquals(4, Chapter8Question1.countSteps(3));
        assertEquals(7, Chapter8Question1.countSteps(4));
        assertEquals(13, Chapter8Question1.countSteps(5));
        assertEquals(121415, Chapter8Question1.countSteps(20));
        assertEquals(53798080, Chapter8Question1.countSteps(30));
    }
}
