class Solution {

    private String found(String num , int idx){

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i <= idx ; i++){
            sb.append(num.charAt(i));
        }

        return sb.toString();

    }


    public String largestOddNumber(String num) {

        int n = num.length();

        for(int i = n-1 ; i >= 0 ; i--){

            char ch  = num.charAt(i);

            int no = ch - '0';

            if(no%2 != 0){

                return found( num , i);

            }

        }

        return "";
        
    }
}