class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        HashSet<Integer> ar = new HashSet<>();

        for(int e : nums){
            ar.add(e);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        int n = nums.length;

        for(int i = 1 ; i <= n ; i++){
            if(!ar.contains(i)){
                ans.add(i);
            }
        }

        return ans;
        
    }
}