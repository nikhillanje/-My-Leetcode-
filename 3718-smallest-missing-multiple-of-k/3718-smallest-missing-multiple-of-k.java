class Solution {
    public int missingMultiple(int[] nums, int k) {

        ArrayList<Integer>ar = new ArrayList<>();

        for(int ele : nums){
            ar.add(ele);
        }

        int i = 1;

        while(true){
            int mul = k*i;

            if(!ar.contains(mul)){
                return mul;
            }
            else{

                i++;

            }
        }
        
    }
}