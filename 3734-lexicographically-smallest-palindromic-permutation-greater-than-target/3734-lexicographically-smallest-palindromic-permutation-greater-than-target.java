class Solution {
    
    public String lexPalindromicPermutation(String s, String target) {
        
        int[] freq = new int[26];
        
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        // Find middle character
        int oddCount = 0;
        char middle = 0;
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddCount++;
                middle = (char) ('a' + i);
            }
        }
        
        // Cannot form a palindrome
        if (oddCount > 1) {
            return "";
        }
        
        int n = s.length();
        int halfLength = n / 2;
        
        // Count characters needed in first half
        int[] halfFreq = new int[26];
        
        for (int i = 0; i < 26; i++) {
            halfFreq[i] = freq[i] / 2;
        }
        
        char[] half = new char[halfLength];
        
        /*
         * Try to match target's first half.
         */
        for (int i = 0; i < halfLength; i++) {
            
            char c = target.charAt(i);
            
            if (halfFreq[c - 'a'] > 0) {
                half[i] = c;
                halfFreq[c - 'a']--;
            } 
            else {
                /*
                 * Cannot match target at this position.
                 * Find the smallest available character
                 * greater than target[i].
                 */
                
                for (int j = c - 'a' + 1; j < 26; j++) {
                    if (halfFreq[j] > 0) {
                        
                        half[i] = (char) ('a' + j);
                        halfFreq[j]--;
                        
                        // Fill remaining positions with smallest characters
                        fillSmallest(half, i + 1, halfFreq);
                        
                        return buildPalindrome(half, middle);
                    }
                }
                
                /*
                 * No greater character available here.
                 * We need to backtrack.
                 */
                
                for (int k = i - 1; k >= 0; k--) {
                    
                    halfFreq[half[k] - 'a']++;
                    
                    char current = half[k];
                    
                    for (int j = current - 'a' + 1; j < 26; j++) {
                        
                        if (halfFreq[j] > 0) {
                            
                            half[k] = (char) ('a' + j);
                            halfFreq[j]--;
                            
                            fillSmallest(half, k + 1, halfFreq);
                            
                            return buildPalindrome(half, middle);
                        }
                    }
                }
                
                return "";
            }
        }
        
        /*
         * The first half exactly matches target's first half.
         * Now build palindrome and check.
         */
        
        String candidate = buildPalindrome(half, middle);
        
        if (candidate.compareTo(target) > 0) {
            return candidate;
        }
        
        /*
         * Candidate <= target.
         * Find next lexicographical permutation of the half.
         */
        
        if (!nextPermutation(half)) {
            return "";
        }
        
        return buildPalindrome(half, middle);
    }
    
    
    private void fillSmallest(char[] half, int start, int[] freq) {
        
        int index = start;
        
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                half[index++] = (char) ('a' + i);
                freq[i]--;
            }
        }
    }
    
    
    private String buildPalindrome(char[] half, char middle) {
        
        StringBuilder sb = new StringBuilder();
        
        for (char c : half) {
            sb.append(c);
        }
        
        if (middle != 0) {
            sb.append(middle);
        }
        
        for (int i = half.length - 1; i >= 0; i--) {
            sb.append(half[i]);
        }
        
        return sb.toString();
    }
    
    
    private boolean nextPermutation(char[] arr) {
        
        int i = arr.length - 2;
        
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i < 0) {
            return false;
        }
        
        int j = arr.length - 1;
        
        while (arr[j] <= arr[i]) {
            j--;
        }
        
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
        int left = i + 1;
        int right = arr.length - 1;
        
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }
        
        return true;
    }
}