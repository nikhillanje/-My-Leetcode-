class Solution {
    public int myAtoi(String s) {

    int i = 0;
    int n = s.length();

    while (i < n && s.charAt(i) == ' ') {
        i++;
    }

    int sign = 1;

    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        if (s.charAt(i) == '-') {
            sign = -1;
        }
        i++;
    }

    int number = 0;

    while (i < n && Character.isDigit(s.charAt(i))) {

        int digit = s.charAt(i) - '0';

        if (number > (Integer.MAX_VALUE - digit) / 10) {
            if (sign == 1)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }

        number = number * 10 + digit;

        i++;
    }

    return number * sign;





    //     StringBuilder sb = new StringBuilder();

    //     String res = s.replace(" ", "");

    //     for (int i = 0; i < res.length(); i++) {

    //         char ch = res.charAt(i);

    //         if (ch == '0' || ch == '1' || ch == '2' || ch == '3' ||
    //             ch == '4' || ch == '5' || ch == '6' || ch == '7' ||
    //             ch == '8' || ch == '9' || ch == '-') {

    //             if (ch == '-' && i == 0) {
    //                 sb.append(ch);
    //             } else if (ch != '-') {
    //                 sb.append(ch);
    //             } else {
    //                 break;
    //             }

    //         } else {
    //             if (i == 0) {
    //                 sb.append(0);
    //             }
    //             break;
    //         }
    //     }

    //     String str = sb.toString();

    //     int ans = 0;
    //     int sign = 1;
    //     int i = 0;

    //    if (str.charAt(0) == '-') {
    //        sign = -1;
    //        i = 1;
    //    }

    //     while (i < str.length()) {
    //         ans = ans * 10 + (str.charAt(i) - '0');
    //         i++;
    //     }

    //    return ans * sign;
    }
}