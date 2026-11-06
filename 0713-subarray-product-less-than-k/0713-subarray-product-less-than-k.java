class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {



        // Approch 1 (Some Test Cases Failed)

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




    // Approch : 2


    //    int count = 0;

    //     for (int i = 0; i < nums.length; i++) {

    //         long prod = 1;

    //         for (int j = i; j < nums.length; j++) {

    //             prod = prod * nums[j];

    //             if (prod < k) {
    //                 count++;
    //             } else {
    //                 break;
    //             }
    //         }
    //     }

    //     return count;


    // Approch 3 : (Optimal Approch)

    if (k <= 1) {
            return 0;
        }

        int count = 0;
        int product = 1;
        int left = 0;

        for (int i = 0; i < nums.length; i++) {

            product *= nums[i];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += i - left + 1;
        }

        return count;
        
    }
}