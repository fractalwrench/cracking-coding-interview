package co.uk.fractalwrench.cci.ch2;

import java.util.List;

public class Chapter2Question2 {

    /**
     * Finds and returns the kth to last element of a singly linked list.
     *
     * @param head - the head of the linked list.
     * @param k    - the kth element from the last.
     * @return - the kth element from the last, or null if no such element exists.
     */
    public static Node findFromLast(Node head, int k) {
        // 1. validate basic input
        if (head == null || k < 0) {
            throw new IllegalArgumentException("Head cannot be null and k must be >= 0");
        }

        // 2. first find the last element in the linkedlist
        int size = head.size();

        // 3. now calculate the index and get the element
        int index = (size - k) - 1;

        if (index < 0) {
            return null;
        } else if (index == size) {
            return head;
        } else {
            Node element = head;
            for (int n = 1; n <= index && element != null; n++) {
                element = element.next;
            }
            return element;
        }
    }

    public static class Node {
        final int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        public static Node fromIntList(List<Integer> list) {
            Node current = null;
            for (int k = list.size() - 1; k >= 0; k--) {
                Node prev = new Node(list.get(k));
                prev.next = current;
                current = prev;
            }
            return current;
        }

        int size() {
            int size = 1;
            Node node = this;

            while (node.next != null) {
                node = node.next;
                size++;
            }
            return size;
        }
    }
}
