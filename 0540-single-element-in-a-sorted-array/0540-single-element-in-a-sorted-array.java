class Solution {
    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length-1;

        while(low <= high){

            if(low == high){
                return nums[low];
            }

            int mid = low + (high - low) / 2;

            if(mid % 2 == 1){
                mid--;
            }

            if(nums[mid] == nums[mid+1]){
                low = low + 2;
            }
            else{
                high = mid;
            }
        }

        return -1;
        
    }
}