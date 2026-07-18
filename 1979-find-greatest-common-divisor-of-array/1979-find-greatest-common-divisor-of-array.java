class Solution {

    public static int gcd(int a, int b) {
       if (b == 0) {
        return Math.abs(a);
       }
    return gcd(b, a % b);
   }


    public int findGCD(int[] nums) {

        Arrays.sort(nums);

        int a = nums[0];
        int b = nums[nums.length-1];

        int ans = gcd(a,b);

        return ans;
        
    }
}