// class Solution {
//     public int pivotIndex(int[] nums) {

//         int n = nums.length;

//         int ans = -1;

//         int sum1 = 0;
//         for(int i = 1 ; i < n ; i++){
//             sum1 = sum1+nums[i];
//         }


//         int sum2 = 0;
//         for(int i = 0 ; i < n-1 ; i++){
//             sum2 = sum2+nums[i];
//         }


//         if(n==1){
//             return 0;
//         }
//         else if(sum1 == 0){
//             return 0;
//         }
//         else if(sum2 == 0){
//             return n-1;
//         }

//         else{

//         for(int i = 1 ; i < n-1 ; i++){
//             int ps1 = 0;
//             int ps2 = 0;

//             for(int j = 0 ; j < i ; j++){
//                 ps1 = ps1+nums[j];
//             }

//             for(int k = i+1 ; k < n ; k++){
//                 ps2 = ps2+nums[k];
//             }

//             if(ps1 == ps2){
//                 ans = i;
//                 break;
//             }

//         }
//         }
//         return ans;
//     }
// }


class Solution {
    public int pivotIndex(int[] nums) {

        int n = nums.length;

        for(int i = 0; i < n; i++) {

            int ps1 = 0;
            int ps2 = 0;

            for(int j = 0; j < i; j++) {
                ps1 += nums[j];
            }

            for(int k = i + 1; k < n; k++) {
                ps2 += nums[k];
            }

            if(ps1 == ps2) {
                return i;
            }
        }

        return -1;
    }
}