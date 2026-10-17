class Solution {

    public static boolean isPalindrome(String str) {
        // Handle edge cases
        if (str == null) return false;
        
        // Convert to lowercase to make the check case-insensitive
        str = str.toLowerCase(); 
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found, not a palindrome
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }


    public int countSubstrings(String s) {

        int count = 0;

        for(int i = 0 ; i < s.length() ; i++){

            String st = "";

            for (int j = i; j < s.length(); j++) {

               st = st + s.charAt(j);

               if(isPalindrome(st)){
                  count++;
                }

            }
        }

        return count;
        
    }
}

