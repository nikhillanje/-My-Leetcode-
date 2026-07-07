class Solution {
    public long sumAndMultiply(int n) {

        if(n < 1){
            return 0;
        }

        StringBuilder sb = new StringBuilder();

        while( n != 0 ){
            int digit = n % 10;

            if(digit != 0){
                sb.append(digit);
            }

            n = n /10;
        }

        sb.reverse();

        long x = Long.parseLong(sb.toString());
        long orgX = x;
        long sum = 0 ;

        while(x != 0){
            long dig = x%10;

            sum = sum + dig;

            x = x / 10;
        }

        long ans = sum * orgX;

        return ans;
    }
}