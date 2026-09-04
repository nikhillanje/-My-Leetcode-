class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int len = nums.length;

        for(int i = 0 ; i < len; i++){

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for(int j = 0 ; j <= i ; j++){
                if(nums[j] > max){
                    max = nums[j];
                }
            }

            for(int p = len-1 ; p >=i ; p--){
                if(nums[p] < min){
                    min = nums[p];
                }
            }

            if(max-min <= k){
                return i;
            }
        }


        return -1;
        
    }
}