class Solution {
    public int maxScore(String s) {

        int ans = 0;

        int n = s.length();

        int i = 0;
        int j = 1;

        while(i < n-1){

            int lCount = 0;
            int rCount = 0;

            for(int k = 0 ; k <= i ; k++){

                if(s.charAt(k) == '0'){
                    lCount++;
                }
            }

            for(int l = j ; l <= n-1 ; l++){

                if(s.charAt(l) == '1'){
                    rCount++;
                }
            }

            int sum = lCount + rCount;

            if(sum > ans){
                ans = sum;
            }

            i++;
            j++;


        }

        return ans;
        
    }
}