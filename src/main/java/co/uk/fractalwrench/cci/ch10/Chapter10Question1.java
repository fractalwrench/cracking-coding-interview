package co.uk.fractalwrench.cci.ch10;

public class Chapter10Question1 {

    /**
     * Merges two arrays in sorted order. Note that A must have a large enough buffer at the end
     * to hold B. B will be copied into A.
     *
     * @param a - sorted array, with a buffer that fits b.
     * @param b - sorted array
     */
    public static void mergeArrays(int[] a, int[] b) {
        int indexB = b.length - 1;
        int indexA = a.length - b.length - 1;
        int indexMerge = a.length - 1;

        // 1. start from the last element and merge
        while (indexB >= 0) {
            if (indexA >= 0 && a[indexA] > b[indexB]) {
                a[indexMerge] = a[indexA];
                indexA--;
            } else {
                a[indexMerge] = b[indexB];
                indexB--;
            }
            indexMerge--;
        }

    }

}
