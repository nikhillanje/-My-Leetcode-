class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        // int count = 0;
        // int p = 1;

        // for(int i = 0 ; i < nums.length ; i++){

        //     int prod = nums[i] * p;

        //     if(prod < k){
        //         count++;
        //     }

        //     for(int j = i+1 ; j < nums.length ; j++){

        //         prod = prod * nums[j];

        //         if(prod < k){
        //             count++;
        //         }

        //     }
            
        // }

        // return count;

       int count = 0;

        for (int i = 0; i < nums.length; i++) {

            long prod = 1;

            for (int j = i; j < nums.length; j++) {

                prod = prod * nums[j];

                if (prod < k) {
                    count++;
                } else {
                    break;
                }
            }
        }

        return count;
        
    }
}