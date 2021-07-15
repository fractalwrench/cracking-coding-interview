package co.uk.fractalwrench.cci.ch3;

import co.uk.fractalwrench.cci.ch3.Chapter3Question2.MinStack;
import org.junit.Test;

import static org.junit.Assert.*;

public class Chapter3Question2Test {

    @Test
    public void testSimpleMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(5);
        assertEquals(5, minStack.getMinValue());
        assertEquals(5, minStack.pop());
    }

    @Test
    public void testLargeMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(509);
        assertEquals(509, minStack.getMinValue());

        minStack.push(20934);
        minStack.push(12309);
        minStack.push(20);
        assertEquals(20, minStack.getMinValue());

        minStack.push(0);
        assertEquals(0, minStack.getMinValue());

        minStack.push(-234);
        assertEquals(-234, minStack.getMinValue());

        assertEquals(-234, minStack.pop());
        assertEquals(0, minStack.getMinValue());

        assertEquals(0, minStack.pop());
        assertEquals(20, minStack.getMinValue());

        assertEquals(20, minStack.pop());
        assertEquals(509, minStack.getMinValue());

        assertEquals(12309, minStack.pop());
        assertEquals(20934, minStack.pop());
        assertEquals(509, minStack.getMinValue());
    }
}
