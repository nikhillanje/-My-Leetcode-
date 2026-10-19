class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // int n = nums.length;
        // int size = n-k+1;
        // int ans[] = new int [size];

        // for(int i = 0 ; i <=n-k ; i++){

        //     int max = nums[i];

        //     for(int j = i ; j < i+k ; j++){
        //         max  = Math.max(max , nums[j]);
        //     }

        //     ans[i] = max;
        // }

        // return ans;


        int n = nums.length;
        int size = n-k+1;
        int ans[] = new int [size];

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = 0 ; i < n ; i++){

            // Remove indices outside the window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from the back
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Store maximum when the window is complete
            if (i >= k - 1) {
                ans[i - k + 1] = nums[dq.peekFirst()];
            }
            
        }

        return ans; 
        
    }
}