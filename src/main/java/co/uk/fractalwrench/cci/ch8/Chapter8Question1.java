package co.uk.fractalwrench.cci.ch8;

import java.util.Arrays;

public class Chapter8Question1 {

    /**
     * Question: A child is running up a staircase with n steps and can hop either 1 steps, 2 steps, or 3 steps
     * at a time. Implement a function that counts how many possible ways the child can run up the stairs.
     * <p>
     * This calculates the number of steps by recursively checking the number of possible paths. The function has been
     * memoized to reduce its runtime to O(n).
     */
    public static int countSteps(int level) {
        int[] memo = new int[level + 1];
        Arrays.fill(memo, -1);
        return countSteps(memo, level);
    }

    private static int countSteps(int[] memo, int level) {
        if (level < 0) {
            return 0;
        } else if (level == 0) {
            return 1;
        } else {
            if (memo[level] == -1) {
                memo[level] = countSteps(memo, level - 1) +
                        countSteps(memo, level - 2) +
                        countSteps(memo, level - 3);
            }
            return memo[level];
        }
    }
}
