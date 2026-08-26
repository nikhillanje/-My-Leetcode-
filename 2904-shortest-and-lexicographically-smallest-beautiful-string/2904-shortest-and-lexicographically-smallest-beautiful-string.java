class Solution {
    public String shortestBeautifulSubstring(String s, int k) {

        StringBuilder sb = new StringBuilder();

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            int count = 0;

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (ch == '1') {
                    count++;
                }

                sb.append(ch);

                if (count == k) {
                    break;
                }
            }


        
        // Only consider substrings containing exactly k ones
            if (count == k) {

                if (ans.length() == 0 ||
                    sb.length() < ans.length() ||
                    (sb.length() == ans.length() &&
                     sb.toString().compareTo(ans.toString()) < 0)) {

                    ans.setLength(0);
                    ans.append(sb);
                }
            }

            sb.setLength(0);
        }

        return ans.toString();
        
    }
}