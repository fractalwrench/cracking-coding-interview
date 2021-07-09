package co.uk.fractalwrench.cci.ch1;

import java.util.Arrays;

public class Chapter1Question1 {

    /**
     * Determines whether a string consists entirely of unique characters.
     *
     * This assumes that the string is unicode. If the input were only ASCII (which seems unlikely)
     * then it would be possible to create a boolean[] array that was checked every time a character was observed
     * in a string.
     *
     * @return true if each character is unique, otherwise false.
     */
    public static boolean hasAllUniqueCharacters(String str) {
        if (str == null) {
            throw new IllegalArgumentException("String cannot be null");
        }

        // 1. represent the string as a sorted char array
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        // 2. iterate over the array and count any duplicate chars
        for (int k = 1; k < chars.length; k++) {
            if (chars[k] == chars[k - 1]) {
                return false;
            }
        }
        return true;
    }
}
