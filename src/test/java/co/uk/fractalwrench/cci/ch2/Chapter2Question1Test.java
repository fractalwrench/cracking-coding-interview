package co.uk.fractalwrench.cci.ch2;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class Chapter2Question1Test {

    @Test(expected = IllegalArgumentException.class)
    public void nullList() {
        Chapter2Question1.removeDuplicateElements(null);
    }

    @Test
    public void emptyList() {
        LinkedList<String> list = new LinkedList<>();
        Chapter2Question1.removeDuplicateElements(list);
        assertTrue(list.isEmpty());
    }

    @Test
    public void duplicateElementsRemoved() {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("apple");
        list.add("banana");
        list.add("coffee");
        list.add("banana");
        list.add("donut");
        list.add("coffee");
        Chapter2Question1.removeDuplicateElements(list);
        assertEquals(Arrays.asList("apple", "banana", "coffee", "donut"), list);
    }
}
