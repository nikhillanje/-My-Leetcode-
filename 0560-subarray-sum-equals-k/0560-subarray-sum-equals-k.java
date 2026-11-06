class Solution {
    public int subarraySum(int[] nums, int k) {

        // ArrayList<Integer> arr = new ArrayList<>();

		// for(int ele : nums){
		//     arr.add(ele);
		// }
		
		// int n = nums.length;
		
		// for(int i = 0 ; i < n-1 ; i++){
		    
		//     int sum = nums[i];
		    
		//     for(int j = i+1 ; j < n ; j++){
		//         sum = sum + nums[j];
		//         arr.add(sum);
		//     }
		    
		// }
		
		// int count = 0 ;
		
		// for(int i = 0 ; i < arr.size() ; i++){
		//     if(arr.get(i) == k){
		//         count++;
		//     }
		// }


        // return count;



    // Instead of Storing the Sum we Directly Used it to increase Our Count
    // and using that sum we Go Ahed for Further Sum

        int n = nums.length;
        int count = 0;

        for(int i = 0; i < n; i++) {

            int sum = 0;

            for(int j = i; j < n; j++) {
                sum += nums[j];

                if(sum == k) {
                    count++;
                }
            }
        }

        return count;
        
    }
}