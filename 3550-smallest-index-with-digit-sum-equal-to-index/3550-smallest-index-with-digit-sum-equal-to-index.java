class Solution {
    public int smallestIndex(int[] nums) {

        for(int i = 0 ; i <nums.length; i++){
            
            int ele = nums[i];

            int sum = 0;

            while(ele > 0){

                int d = ele % 10;
                sum = sum+d;
                ele = ele / 10;

            }

            if(sum == i){
                return i;
            }
        }

        return -1;
        
    }
}