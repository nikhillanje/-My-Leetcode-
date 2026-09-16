class Solution {
    public boolean containsDuplicate(int[] nums) {


        // Arrays.sort(nums);

        // for(int i = 0; i < nums.length - 1; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true;
        //     }
        // }

        // return false;
        


        // for(int i = 0 ; i < nums.length - 1 ; i++){
            // for(int j = i+1 ; j < nums.length ; j++){

            //     if(nums[i] == nums[j]){
            //         flag = true;
            //     }

            // }

        // }


        // Hash Map

        HashMap<Integer , Integer > map = new HashMap<>();

        for(int ele : nums){

            if(map.containsKey(ele)){
                map.put(ele , map.get(ele)+1);
            }
            else{
                map.put(ele , 1);
            }

        }

        for(int val : map.values()){

            if(val > 1){
                return true;
            }
        }

        return false;


    }
}