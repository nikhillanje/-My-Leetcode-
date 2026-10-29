class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> ans = new ArrayList<>();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int ele : nums1){
		    map.put(ele , map.getOrDefault(ele , 0) + 1);
		}
		
		for(int i = 0 ; i < nums2.length ; i++){
		    
		    int elem = nums2[i];
		    
		    if(map.containsKey(elem)){
		        
		        if(map.get(elem) > 0){
		            ans.add(elem);
		            map.put(elem , map.get(elem) - 1);
		        }
		        
		    }
		    
		}

        int arr[] = new int [ans.size()];

        for(int i = 0 ; i < ans.size() ; i++){
            arr[i] = ans.get(i);
        }

        return arr;
        
    }
}