class Solution {
    public int minimumDeletions(int[] nums) {

        int n = nums.length;


        int idxMin = -1;
        int idxMax = -1;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < nums.length; i++){

            if(nums[i] > max){
                max = nums[i];
                idxMax = i;
            }

            if(nums[i] < min){
                min = nums[i];
                idxMin = i;
            }
        }

        int left = Math.min(idxMin, idxMax);
        int right = Math.max(idxMin, idxMax);


        int front = right + 1;


        int back = n - left;

        int both = (left + 1) + (n - right);

        return Math.min(front, Math.min(back, both));
    }
}