class Solution {
    public int[] arrayRankTransform(int[] arr) {

        TreeSet<Integer> set = new TreeSet<>();
        HashMap<Integer,Integer> map = new HashMap();

        int ansArr[] = new int[arr.length];

        for(int ele : arr){
            set.add(ele);
        }

        int rank = 1;
        
        for (int num : set) {
            map.put(num, rank);
            rank++;
        }

        for (int i = 0; i < arr.length; i++) {
             ansArr[i] = map.get(arr[i]);
        }

        return ansArr;
        
    }
}