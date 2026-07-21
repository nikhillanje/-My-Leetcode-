class Solution {
    public String reverseVowels(String s) {

        StringBuilder sb = new StringBuilder(s);

        int p1 = 0;
        int p2 = s.length() - 1;

        while (p1 < p2) {

            char ch1 = sb.charAt(p1);
            char ch2 = sb.charAt(p2);

            if ((ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' ||
                 ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U') &&

                (ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' ||
                 ch2 == 'A' || ch2 == 'E' || ch2 == 'I' || ch2 == 'O' || ch2 == 'U')) {

                char temp = ch2;
                sb.setCharAt(p2, ch1);
                sb.setCharAt(p1, temp);

                p1++;
                p2--;

            } else if (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u' &&
                       ch1 != 'A' && ch1 != 'E' && ch1 != 'I' && ch1 != 'O' && ch1 != 'U') {

                p1++;

            } else if (ch2 != 'a' && ch2 != 'e' && ch2 != 'i' && ch2 != 'o' && ch2 != 'u' &&
                       ch2 != 'A' && ch2 != 'E' && ch2 != 'I' && ch2 != 'O' && ch2 != 'U') {

                p2--;
            }
        }

        return sb.toString();
    }
}