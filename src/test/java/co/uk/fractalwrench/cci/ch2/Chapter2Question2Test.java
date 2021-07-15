package co.uk.fractalwrench.cci.ch2;

import co.uk.fractalwrench.cci.ch2.Chapter2Question2.Node;
import org.junit.Test;

import java.util.Arrays;

import static co.uk.fractalwrench.cci.ch2.Chapter2Question2.Node.fromIntList;
import static co.uk.fractalwrench.cci.ch2.Chapter2Question2.findFromLast;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Chapter2Question2Test {

    @Test(expected = IllegalArgumentException.class)
    public void validateNullNode() {
        findFromLast(null, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateNegativeIndex() {
        findFromLast(new Node(5), -1);
    }

    @Test
    public void testFindFromLast() {
        Node head = fromIntList(Arrays.asList(5, 2, 109, 34, 409, 20, 1000, -509));
        assertEquals(5, findFromLast(head, 7).value);
        assertEquals(-509, findFromLast(head, 0).value);
        assertEquals(1000, findFromLast(head, 1).value);
        assertEquals(34, findFromLast(head, 4).value);
        assertNull(findFromLast(head, 8));
        assertNull(findFromLast(head, 9));
        assertNull(findFromLast(head, 99));
    }
}
