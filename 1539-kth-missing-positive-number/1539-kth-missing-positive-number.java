class Solution {
    public int findKthPositive(int[] arr, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        int count = 0;
        int num = 1;

        while (true) {

            if (!list.contains(num)) {
                count++;

                if (count == k) {
                    return num;
                }
            }

            num++;
        }
        
    }
}