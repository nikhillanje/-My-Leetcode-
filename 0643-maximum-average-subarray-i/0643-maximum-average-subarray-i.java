class Solution {
    public double findMaxAverage(int[] nums, int k) {

        // double ans = Integer.MIN_VALUE;

        // if(nums.length < k){

        //     return 0;
        // }

        // int p = 0;
        // int q = k-1;

        // while(q <= nums.length-1){

        //     double sum = 0;

        //     for(int i = p ; i <= q ; i++){
        //         sum = sum+nums[i];
        //     }

        //     double avg = sum / k ;

        //     if(avg > ans){
        //         ans = avg;
        //     }

            

        //     p++;
        //     q++;

        // }

        // return ans;

        int sum = 0;

        // First window
        for(int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

         // Slide the window
        for(int i = k; i < nums.length; i++) {

            sum = sum - nums[i - k] + nums[i];

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
        
    }
}

