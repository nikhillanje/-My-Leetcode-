class Solution {
    public int minimumPushes(String word) {

        int count = 0;

        for (int l = 0; l < word.length(); l++) {

            if (l <= 7) {
                count += 1;
            } else if (l <= 15) {
                count += 2;
            } else if (l <= 23) {
                count += 3;
            } else {
                count += 4;
            }
        }

        return count;
    }
}