class Solution {
    public boolean stoneGameIX(int[] stones) {

        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;

        for (int stone : stones) {
            if (stone % 3 == 0) {
                cnt0++;
            } else if (stone % 3 == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }

        // If the number of 0-modulo stones is even,
        // Alice can win when both groups exist.
        if (cnt0 % 2 == 0) {
            return cnt1 > 0 && cnt2 > 0;
        }

        // If cnt0 is odd, one group must have at least
        // 3 more stones than the other.
        return Math.abs(cnt1 - cnt2) > 2;
        
    }
}