class Solution {
    public static boolean isHappy(int n) {

        // Direct check
        if (n == 1 || n == 7) {
            return true;
        }

        // Loop until number becomes single digit
        while (n > 9) {
            int sum = 0;

            // Find sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
            }

            // Check condition
            if (sum == 1 || sum == 7) {
                return true;
            }

            n = sum; // Continue with new number
        }

        return false;
    }

}