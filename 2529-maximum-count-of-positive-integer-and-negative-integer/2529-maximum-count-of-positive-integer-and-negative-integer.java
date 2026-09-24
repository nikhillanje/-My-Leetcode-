class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int pos = binarySearch(nums, 0);


        int neg = binarySearch(nums, -1);

        int positiveCount = n - pos;
        int negativeCount = neg;

        return Math.max(positiveCount, negativeCount);
    }

    private int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}