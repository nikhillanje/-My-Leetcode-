class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0;
        int count = 0;

        int p = 0;

        while(p < nums.length){

            if(nums[p] == 1){
                count++;

                if(max < count){
                    max = count;
                }
            }
            else{
                count = 0;
            }

            p++;
            
        }

        return max;
        
    }
}