package co.uk.fractalwrench.cci.ch3;

public class Chapter3Question1 {

    /*
     * Question: describe how you could use one array to implement three stacks.
     *
     * Firstly we should consider how one stack would be implemented using one array. An array is a contiguous
     * element of memory and in Java has a fixed size - so we can assume that the Stack cannot grow beyond
     * a certain size (unless we implement an approach similar to ArrayList which copies the array into a larger array
     * when it needs to grow).
     *
     * Adding the first element into the array should be tracked by setting a variable that tracks the index to zero.
     * If it is -1, then we should throw an EmptyStackException if a user attempts retrieval. Adding the second element
     * into the array should set the index to 1. Adding the nth element should set the index to n, unless the array
     * length is exceeded, in which case the array should throw a StackOverflowError, or attempt to grow by a factor
     * of 2 in a similar way to ArrayList. Removing the nth element from the array will decrement the index accordingly.
     *
     * The simplest approach of implementing three stacks in one array would be to partition the array into three
     * segments. This would require tracking the current index of each stack separately, and also tracking the start and
     * end bounds of each partition in separate variables, to determine when EmptyStack/StackOverflow exceptions should
     * be thrown. Partitioning the array correctly will be vital to avoid data leakage between the three stacks - there
     * should therefore be special consideration to test the boundary conditions when exceeding the stack size.
     *
     * If the array is very large and one stack is used much more than the other, then it may be worth partitioning the
     * stack unequally to give the larger stack a greater portion of memory. If this is known ahead of time, then a
     * simple solution would be to allow 3 integer constructor parameters that weight how much memory should be
     * allocated to each stack.
     *
     * If this is not known ahead of time, then the array could attempt to repartition itself whenever one stack
     * becomes full. One approach would be to attempt to increase the stack by a factor of 1.5, after copying the other
     * two stacks to appropriate positions. An advantage behind this is that it may leave space for the other stacks to
     * grow and reduces the frequency of expensive array copies. It's important to note that this would require
     * calculating the free elements in the array, which is the difference between the partition allocated for each
     * stack and its number of elements.
     *
     * If enough free space is not available, then a reasonable response would be to either reduce the growth factor
     * recursively until it approaches 1, or throw a StackOverflowError.
     *
     * This implementation could result in a stack wrapping around the array in memory, so that its first elements are
     * held at the end of the array and its last elements are held at the start. Special care would be needed to test
     * this condition.
     */

}
