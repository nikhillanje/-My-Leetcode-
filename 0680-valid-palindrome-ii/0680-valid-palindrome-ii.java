class Solution {

    // public boolean thisValid(String s){

    //     s = s.replaceAll("[^a-zA-Z0-9]" , "");
    //     s = s.toLowerCase();

    //     int i = 0 ; 
    //     int j = s.length()-1;

    //     while(i <= j){


    //         if(s.charAt(i) != s.charAt(j)){
    //             return false;

                
    //         }
            
    //         i++;
    //         j--;
    //     }


    //     return true;

    // }


    // public boolean validPalindrome(String s) {

    //     if(thisValid(s)){
    //         return true;
    //     }
    //     else{

    //         StringBuilder sb = new StringBuilder(s);

    //         for(int i = 0 ; i < sb.length() ; i++){

    //             char removed = sb.charAt(i);

    //             sb.deleteCharAt(i);

    //             String str = sb.toString();

    //             sb.insert(i, removed);

    //             if(thisValid(str)){
    //                 return true;
    //             }
    //         }

    //     }

    //     return false;


    public boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return fun(s, left + 1, right) ||
                       fun(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    boolean fun(String s, int l, int r) {

        while (l < r) {

            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }

}