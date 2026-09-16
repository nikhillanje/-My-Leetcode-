class Solution {
    public int reverseBits(int n) {

        int ans = 0;

        for (int i = 0; i < 32; i++) {

            // Shift ans left to make space
            ans = ans << 1;

            // Get the last bit of n
            ans = ans | (n & 1);

            // Remove the last bit of n
            n = n >>> 1;
        }

        return ans;
        
    }
}



