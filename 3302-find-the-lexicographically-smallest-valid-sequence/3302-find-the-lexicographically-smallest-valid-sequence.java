class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        // suf[i] = maximum number of characters from the END
        // of word2 that can be matched as a subsequence in word1[i...]
        int[] suf = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {

            suf[i] = suf[i + 1];

            if (j >= 0 && a[i] == b[j]) {
                suf[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int p = 0;       // pointer in word1
        int q = 0;       // pointer in word2
        boolean changed = false;

        while (p < n && q < m) {

            // Case 1: Characters are equal.
            if (a[p] == b[q]) {

                ans[q] = p;
                q++;
                p++;

            } else {

                /*
                 * Use this index as the ONE allowed mismatch.
                 *
                 * After using p, we need to match
                 * word2[q+1 ... m-1] exactly.
                 *
                 * suf[p+1] tells us how many characters from
                 * the END of word2 can be matched.
                 */
                int remaining = m - q - 1;

                if (!changed && suf[p + 1] >= remaining) {

                    ans[q] = p;
                    q++;
                    p++;
                    changed = true;

                    break;
                }

                p++;
            }
        }

        /*
         * After using the mismatch, match the rest exactly.
         */
        while (changed && p < n && q < m) {

            if (a[p] == b[q]) {
                ans[q] = p;
                q++;
            }

            p++;
        }

        /*
         * If mismatch was never used, that's also okay,
         * because the strings can be exactly equal.
         */
        if (!changed && q == m) {
            return ans;
        }

        if (q == m) {
            return ans;
        }

        return new int[0];
    }
}