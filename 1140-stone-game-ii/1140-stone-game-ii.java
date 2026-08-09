class Solution {
    public int stoneGameII(int[] piles) {

        int n = piles.length;

        // suffix[i] = total stones from i to n-1
        int[] suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        // dp[i][M] = maximum stones current player can get
        // starting from index i with M
        int[][] dp = new int[n + 1][n + 1];

        // Fill from right to left
        for (int i = n - 1; i >= 0; i--) {

            for (int M = 1; M <= n; M++) {

                // If we can take all remaining piles
                if (2 * M >= n - i) {
                    dp[i][M] = suffix[i];
                    continue;
                }

                // Try taking X piles
                for (int X = 1; X <= 2 * M; X++) {

                    int newM = Math.max(M, X);

                    // Stones we can eventually get
                    int current = suffix[i] - dp[i + X][newM];

                    dp[i][M] = Math.max(dp[i][M], current);
                }
            }
        }

        // Alice starts from index 0 with M = 1
        return dp[0][1];
        
    }
}