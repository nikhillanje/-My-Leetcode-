class Solution {
    public int coinChange(int[] coins, int amount) {

        if(amount < 1){
            return 0;
        }

        int dp[] = new int [amount+1];

        for(int i = 1 ; i < dp.length ; i++){

            dp[i] = Integer.MAX_VALUE;

            for(int ele : coins){

                if(ele <= i && dp[i-ele] != Integer.MAX_VALUE){

                    dp[i] = Math.min(dp[i] , 1+dp[i-ele]);
                }


            }
        }

        if(dp[amount] == Integer.MAX_VALUE){
            return -1;
        }

        return dp[amount];
        
    }
}