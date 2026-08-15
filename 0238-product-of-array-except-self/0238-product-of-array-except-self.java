class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int prod1 = 1;
        // int prod2 = 1;

        // int n = nums.length;

        // int ans[] = new int[n];

        // for(int i = 1 ; i < n ; i++){
        //     prod1 *= nums[i];
        // }

        // ans[0] = prod1;

        // for(int i = 0 ; i < n-1 ; i++){
        //     prod2 *= nums[i];
        // }
        // ans[n-1] = prod2;

        // for(int i = 1 ; i < n-1 ; i++){

        //     int lProd = 1;
        //     int rProd = 1;

        //     int idx1 = 0;

        //     while(idx1 < i){
        //         lProd*=nums[idx1];
        //         idx1++;
        //     }

        //     int idx2 = i+1;

        //     while(idx2 < n){
        //         rProd*=nums[idx2];
        //         idx2++;
        //     }

        //     ans[i] = lProd*rProd;
        // }

        // return ans;

        int n = nums.length;
        int[] ans = new int[n];

        int prod1 = 1;

        for(int i = 0 ; i < n; i++){
            ans[i] = prod1;
            prod1*=nums[i];
        }

        int prod2 = 1;

        for(int i = n-1 ; i >=0 ; i--){
            ans[i] *=prod2;
            prod2*=nums[i];
        }

        return ans;

        
    }
}