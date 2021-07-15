package co.uk.fractalwrench.cci.ch3;

public class Chapter3Question2 {

    /**
     * A stack which records the min value in O(1) time.
     */
    public static class MinStack {

        private Node root = null;

        /**
         * Pushes a value onto the top of the stack.
         *
         * @param value the value to add to the stack
         */
        public void push(int value) {
            int min = calculateMinValue(value);
            root = new Node(root, value, min);
        }

        private int calculateMinValue(int value) {
            if (root == null) {
                return value;
            } else {
                return Math.min(root.min, value);
            }
        }

        /**
         * Pops the element from the top of the stack
         *
         * @return the popped element
         */
        public int pop() {
            if (root == null) {
                throw new IllegalStateException("Stack cannot be empty!");
            }
            int result = root.value;
            root = root.prev;
            return result;
        }

        /**
         * Retrieves the minimum value currently set in the stack.
         *
         * @return the minimum value.
         */
        public int getMinValue() {
            if (root == null) {
                throw new IllegalStateException("Stack cannot be empty!");
            }
            return root.min;
        }

        private static class Node {
            final Node prev;
            final int value;
            final int min;

            Node(Node prev, int value, int min) {
                this.prev = prev;
                this.value = value;
                this.min = min;
            }
        }
    }

}
