class Solution {
    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(true){

            int sum = 0;

            while(n != 0){
                int digit = n % 10;
                int dSq = digit * digit;
                sum = sum + dSq;
                n = n /10;
            }

            if(sum == 1){
                return true;
            }

            n = sum;

            if(set.contains(n)){
                return false;
            }

            set.add(n);
        }
    }


    //     if (n == 1 || n == 7) {
    //         return true;
    //     }

    //     while (n > 9) {

    //         int sum = 0;

    //         while (n > 0) {
    //             int digit = n % 10;
    //             sum = sum + (digit * digit);
    //             n = n / 10;
    //         }

    //         if (sum == 1 || sum == 7) {
    //             return true;
    //         }

    //         n = sum; 
    //     }

    //     return false;
    // }

}