class Solution {
    public int maxScore(int[] cardPoints, int k) {

        // int n = cardPoints.length;

        // int sum = 0;

        // if(k == n){

        //     for(int ele : cardPoints){
        //         sum += ele;
        //     }

        //     return sum;
            
        // }

        // int l = 0;
        // int r = cardPoints.length-1;

        // while( k > 0){

        //     if(cardPoints[l] >= cardPoints[r]){
        //         sum = sum + cardPoints[l];
                
        //         if(cardPoints[l] == cardPoints[r]){
        //             l++;
        //             r--;
        //         }
        //         else{
        //             l++;
        //         }
        //     }
        //     else if(cardPoints[r] > cardPoints[l]){
        //         sum = sum + cardPoints[r];
        //         r--;
        //     }

        //     k--;

        // }

        // return sum;

        int lSum = 0;
        int rSum = 0;
        int maxSum = 0;

        int n = cardPoints.length;

        for(int i = 0 ; i < k ; i++){
            lSum = lSum + cardPoints[i];
            maxSum = lSum;
        }

        int rightIdx = n-1;

        for(int i = k -1 ; i >= 0 ; i--){

            lSum = lSum-cardPoints[i];
            rSum = rSum + cardPoints[rightIdx];
            rightIdx--;

            maxSum = Math.max(maxSum , lSum + rSum);
        }

        return maxSum;
        
    }
}