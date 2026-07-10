class Solution {
    public boolean checkDivisibility(int n) {

        int orgN = n ;

        int sum = 0 ;
        int prod = 1;

        while(n>0){
            int digit = n % 10;

            sum = sum + digit;
            prod = prod * digit;

            n = n / 10;
        }

        int total = sum + prod;

        if(orgN % total == 0){
            return true;
        }
        else{
            return false;
        }
        
    }
}