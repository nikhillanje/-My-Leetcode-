class Solution {
    public int[] replaceElements(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();
        
        int max = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                
                ans.add(max);
                max = arr[i];
            }
            else{
                ans.add(max);
            }
        }

        Collections.reverse(ans);

        int ar [] = new int [arr.length];


        for(int i = 0 ; i < ans.size() ; i++){
            ar[i] = ans.get(i);
        }

        ar[arr.length - 1] = -1;

        return ar;
        
    }
}
