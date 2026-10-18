class Solution {

    // public static boolean isAnagram(String subStr , String p){

    //     char[] a = subStr.toCharArray();
    //     char[] b = p.toCharArray();

    //     Arrays.sort(a);
    //     Arrays.sort(b);

    //     if(Arrays.equals(a, b)){
    //         return true;
    //     }

    //     return false;

    // } 

    public List<Integer> findAnagrams(String s, String p) {

        // ArrayList<Integer> ar = new ArrayList<>();

        // for (int i = 0; i <= s.length() - p.length(); i++) {

        //     String subStr = s.substring(i, i + p.length());

        //     if (isAnagram(subStr, p)) {
        //         ar.add(i);
        //     }
        // }

        // return ar;


       ArrayList<Integer> ar = new ArrayList<>();

       if (s.length() < p.length()) {
            return ar;
        }

        int[] a = new int[26];
        int[] b = new int[26];

        for (int i = 0; i < p.length(); i++) {
            a[s.charAt(i) - 'a']++;
            b[p.charAt(i) - 'a']++;
        }

        if (Arrays.equals(a, b)) {
            ar.add(0);
        }

        for (int i = p.length(); i < s.length(); i++) {

            a[s.charAt(i) - 'a']++;
            a[s.charAt(i - p.length()) - 'a']--;

            if (Arrays.equals(a, b)) {
                ar.add(i - p.length() + 1);
            }
        }

        return ar;



    }
}