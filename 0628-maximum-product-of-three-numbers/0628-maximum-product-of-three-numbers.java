class Solution {
    public int maximumProduct(int[] nums) {

        // Arrays.sort(nums);

        // int prod = 0;
        // int maxProd = Integer.MIN_VALUE;

        // for(int i = 0 ; i < nums.length-2 ; i++){
        //     for(int j = i+1 ; j < nums.length-1 ; j++){
        //         for(int k = j+1 ; k  < nums.length ; k++){

        //             prod = nums[i]*nums[j]*nums[k];

        //             if(maxProd < prod){
        //                 maxProd = prod;
        //             }

        //         }
        //     }
        // }

        // return maxProd;




        Arrays.sort(nums);

        int n = nums.length;

        int p1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int p2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(p1, p2);
        
    }
}