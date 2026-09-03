class Solution {
    public boolean uniformArray(int[] nums1) {

        int minEle = Integer.MAX_VALUE;

        for(int ele : nums1){
            if(ele < minEle){
                minEle = ele;
            }
        }

        if(minEle % 2 == 1){
            return true;
        }

        for(int e : nums1){
            if(e % 2 == 1){
                return false;
            }
        }

        return true;
        
    }
}