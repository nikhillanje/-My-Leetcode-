class Solution {
    public int sumOfSquares(int[] nums) {

        int sum = 0;

        int n = nums.length;

        for(int i = 0 ; i < n ; i++){

            if(n % (i+1) == 0){
                int squre = nums[i] * nums[i];
                sum = sum + squre;           
            }
        }

        return sum;
        
    }
}