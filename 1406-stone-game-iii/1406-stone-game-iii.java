class Solution {
    public String stoneGameIII(int[] stoneValue) {

        int n = stoneValue.length;
        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {

            dp[i] = Integer.MIN_VALUE;

            // Take 1 stone
            int take1 = stoneValue[i] - dp[i + 1];
            dp[i] = Math.max(dp[i], take1);

            // Take 2 stone
            if (i + 1 < n) {
                int take2 = stoneValue[i] + stoneValue[i + 1] - dp[i + 2];
                dp[i] = Math.max(dp[i], take2);
            }

            // Take 3 stone
            if (i + 2 < n) {
                int take3 = stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[i + 3];
                dp[i] = Math.max(dp[i], take3);
            }
        }

        if (dp[0] > 0)
            return "Alice";
        else if (dp[0] < 0)
            return "Bob";
        else
            return "Tie";

    }
}