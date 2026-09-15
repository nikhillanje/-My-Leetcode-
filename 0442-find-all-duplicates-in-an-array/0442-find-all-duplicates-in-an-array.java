class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        // List<Integer> ar = new ArrayList<>();

        // HashMap<Integer , Integer > map = new HashMap<>();

        // for(int i = 0 ; i < nums.length ; i++){

        //     int ele = nums[i];

        //     if(!map.containsKey(ele)){

        //         map.put(ele , 1);

        //     }
        //     else{
        //         map.put(ele , map.get(ele)+1);
        //     }
        // }

        // for(int e : map.keySet()){

        //     if(map.get(e) == 2){
        //         ar.add(e);
        //     }



        // }

        // return ar;



        List<Integer> ar = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){

            int idx = Math.abs(nums[i]) - 1;

            if(nums[idx] < 0){
                ar.add(idx+1);
            }


            nums[idx] = nums[idx] * -1;
        }


        return ar;



        
    }
}


