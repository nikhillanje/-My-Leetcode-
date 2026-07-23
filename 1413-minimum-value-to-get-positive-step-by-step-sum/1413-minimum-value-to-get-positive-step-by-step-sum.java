class Solution {
    public int minStartValue(int[] nums) {

        for (int i = 1; ; i++) {
            
            int sum = i;
            boolean flag = true;

            for (int num : nums) {
                sum += num;

                if (sum < 1) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                return i;
            }

        }
        
    }
}