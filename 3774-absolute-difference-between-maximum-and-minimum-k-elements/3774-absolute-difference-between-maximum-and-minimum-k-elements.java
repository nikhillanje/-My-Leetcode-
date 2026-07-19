class Solution {
    public int absDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int sumMax = 0;
        int sumMin = 0;

        int p = (nums.length-k);

        for(int i = 0 ; i < k ; i++){
            sumMin+=nums[i];
        }

        for(int j = p ; j < nums.length; j++){
            sumMax+=nums[j];
        }

        int diff = Math.abs(sumMax-sumMin);

        return diff;
        
    }
}