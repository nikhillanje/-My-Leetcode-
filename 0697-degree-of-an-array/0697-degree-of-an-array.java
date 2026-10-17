class Solution {
    public int findShortestSubArray(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
		
		for(int ele : nums){

            if(map.containsKey(ele)){
                map.put(ele , map.get(ele)+1);
            }
            else{
                map.put(ele , 1);
            }
        }
        

        
        int max = -1;

        for(Integer e : map.values()){

            if(e > max ){
                max = e;
            }

        }
        
        ArrayList<Integer> ar = new ArrayList<>();
        
        for(Integer e : map.keySet()){
            if(map.get(e) == max){
                ar.add(e);
            }
        }
        
        
        int min = Integer.MAX_VALUE;
        
        
        
        for(int i = 0 ; i < ar.size() ; i++){
            
            int ele = ar.get(i);

            int p = 0;
            int q = nums.length-1;
            
            
            while(p < nums.length){
                if(nums[p] == ele){
                    break;
                }
                p++;
            }
            
            while(q >= 0){
                if(nums[q] == ele){
                    break;
                }
                q--;
            }
            
            min = Math.min( (q-p)+1 , min );
            
        }
        
        
        return min;

    }
}