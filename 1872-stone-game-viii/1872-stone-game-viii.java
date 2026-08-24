class Solution {
    public int stoneGameVIII(int[] stones) {

        int n = stones.length;

        // Convert stones into prefix sums
        for (int i = 1; i < n; i++) {
            stones[i] += stones[i - 1];
        }

        // Initially, taking all stones
        int best = stones[n - 1];

        // Try every possible prefix from right to left
        for (int i = n - 2; i >= 1; i--) {
            best = Math.max(best, stones[i] - best);
        }

        return best;
        
    }
}