class Solution {
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i < nums.length ; i++){

            int ele = nums[i];
            int sqEle = ele*ele;

            nums[i] = sqEle;
        }

        Arrays.sort(nums);

        return nums;
        
    }
}