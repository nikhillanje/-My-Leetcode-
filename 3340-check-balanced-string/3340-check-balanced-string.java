class Solution {
    public boolean isBalanced(String num) {

    //    StringBuilder sb1 = new StringBuilder();
    //    StringBuilder sb2 = new StringBuilder();


    //     for(int i = 0 ; i < num.length() ; i++){
    //         if(i % 2 == 0){
    //             sb1.append(num.charAt(i));
    //         }
    //         else{
    //             sb2.append(num.charAt(i));
    //         }
    //     }

    //     String str1 = sb1.toString();
    //     String str2 = sb2.toString();

    //     long evenSum = 0;
    //     long oddSum = 0;

    //     long n1 = Long.parseLong(str1);
    //     long n2 = Long.parseLong(str2);

    //     while(n1 != 0){
    //         long d = n1 % 10;
    //         evenSum+=d;
    //         n1/=10;
    //     }

    //     while(n2 != 0){
    //         long d = n2 % 10;
    //         oddSum+=d;
    //         n2/=10;
    //     }

    //     return evenSum==oddSum;


    int evenSum = 0;
    int oddSum = 0;

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            if (i % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
        }

        return evenSum == oddSum;
        
    }
}