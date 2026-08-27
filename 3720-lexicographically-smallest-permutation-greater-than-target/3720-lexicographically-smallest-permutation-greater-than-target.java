class Solution {
    public String lexGreaterPermutation(String s, String target) {

        int n = s.length();

        // Frequency of characters in s
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder prefix = new StringBuilder();

        // Store frequency state before each position
        int[][] savedFreq = new int[n][26];

        // Step 1: Try to match target exactly
        int i = 0;

        for (; i < n; i++) {

            // Save current frequency
            savedFreq[i] = freq.clone();

            int index = target.charAt(i) - 'a';

            if (freq[index] > 0) {
                prefix.append(target.charAt(i));
                freq[index]--;
            } else {
                break;
            }
        }

        // Step 2: Go backwards and try to make
        // one character strictly greater
        for (int pos = Math.min(i, n - 1); pos >= 0; pos--) {

            // Restore frequency before this position
            freq = savedFreq[pos].clone();

            char targetChar = target.charAt(pos);

            // Find smallest available character > target[pos]
            for (char ch = (char) (targetChar + 1); ch <= 'z'; ch++) {

                if (freq[ch - 'a'] > 0) {

                    StringBuilder ans =
                            new StringBuilder(prefix.substring(0, pos));

                    ans.append(ch);
                    freq[ch - 'a']--;

                    // Add remaining characters in sorted order
                    for (char c = 'a'; c <= 'z'; c++) {
                        while (freq[c - 'a'] > 0) {
                            ans.append(c);
                            freq[c - 'a']--;
                        }
                    }

                    return ans.toString();
                }
            }
        }

        return "";
        
    }
}