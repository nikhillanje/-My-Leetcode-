class Solution {
    public int[] resultArray(int[] nums) {

        ArrayList<Integer> ar1 = new ArrayList<>();
        ArrayList<Integer> ar2 = new ArrayList<>();

        ar1.add(nums[0]);
        ar2.add(nums[1]);

        for(int i = 2 ; i < nums.length ; i++){

            if(ar1.get(ar1.size()-1) > ar2.get(ar2.size()-1)){
                ar1.add(nums[i]);
            }
            else{
                ar2.add(nums[i]);
            }
        }

        for(int i = 0 ; i < ar2.size(); i++){
            ar1.add(ar2.get(i));
        }

        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = ar1.get(i);
        }

        return nums;
        
    }
}