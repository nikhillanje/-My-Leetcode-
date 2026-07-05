class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {


        int count = 0 ;

        for(int i = 0 ; i < arr1.length ; i++){

            int ele1 = arr1[i];

            for(int j = 0 ; j < arr2.length; j++){

                int ele2 = arr2[j];

                int diff = Math.abs(ele1 - ele2);

                if(diff > d){
                    if(j == arr2.length-1){
                        count++;
                    }
                }
                else{
                    break;
                }

            }
        }

        return count;
        
    }
}