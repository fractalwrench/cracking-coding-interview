package co.uk.fractalwrench.cci.ch1;

import java.util.Arrays;

public class Chapter1Question2 {

    /**
     * Determines whether two strings are permutations of each other.
     *
     * @return true if each character is unique, otherwise false.
     */
    public static boolean isPermutation(String str, String another) {
        // 1. early optimization, if length is different or strings are equal, they cannot be permutations
        if (str.equals(another) || str.length() != another.length()) {
            return false;
        }

        // 2. check if a string is a permutation. sort the chars then check they are equal.
        char[] first = str.toCharArray();
        char[] second = another.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for (int k = 0; k < first.length; k++) {
            if (first[k] != second[k]) {
                return false;
            }
        }
        return true;
    }
}
