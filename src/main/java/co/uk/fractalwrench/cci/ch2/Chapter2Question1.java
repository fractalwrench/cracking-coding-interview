package co.uk.fractalwrench.cci.ch2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Chapter2Question1 {

    /**
     * Removes duplicate elements from an unsorted linked list.
     *
     * @param list an unsorted linked list.
     */
    public static void removeDuplicateElements(LinkedList<String> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null!");
        }

        // 1. use a HashSet to detect whether element existed before or not.
        Set<String> set = new HashSet<>();
        Iterator<String> iterator = list.iterator();

        // 2. iterate through list, removing any element which was contained before.
        while (iterator.hasNext()) {
            String str = iterator.next();

            if (set.contains(str)) {
                iterator.remove();
            }
            set.add(str);
        }
    }
}
