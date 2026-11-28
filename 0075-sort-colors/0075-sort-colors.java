class Solution {

    // Doutch National Flag Algo

    public void sortColors(int[] nums) {


    //     int c0 = 0 ;
    //     int c1 = 0 ;
    //     int c2 = 0 ;

    //     for(int i = 0 ; i < nums.length; i++){
    //         if(nums[i] == 0){
    //             c0++;
    //         }
    //         else if(nums[i] == 1){
    //             c1++;
    //         }
    //         else
    //         {
    //             c2++;

    //         }
    //     }

    //     for(int i = 0 ; i < c0 ; i++){
    //     nums[i] = 0;
    //     }

    //    for(int i = c0 ; i < c0 + c1 ; i++){
    //       nums[i] = 1;
    //     }

    //     for(int i = c0 + c1 ; i < nums.length ; i++){
    //     nums[i] = 2;
    //    }





        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<= high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid] ==1){
                mid++;
            }
            else
            {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

        // Another Approch Swaping

        //  while (mid < high) {
        //     if (arr[mid] == 0) {
        //         arr[mid] = (arr[low] + arr[mid]) - (arr[low] = arr[mid]);
        //         low++;
        //         mid++;
        //     } else if (arr[mid] == 1) {
        //         mid++;
        //     } else if (arr[mid] == 2) {
        //         arr[high] = (arr[mid] + arr[high]) - (arr[mid] = arr[high]);
        //         high--;
        //     }
        // }




    }
}