class Solution {
    public int[] intersection(int[] a, int[] b) {

        Arrays.sort(a);
        Arrays.sort(b);
        
        ArrayList<Integer> arr = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;
        
        while(p1 < a.length && p2 < b.length){
            
            if(a[p1] == b[p2]){
                arr.add(a[p1]);
                p1++;
                p2++;
            }
            else if(a[p1] < b[p2]){
                p1++;
            }
            else{
                p2++;
            }
            
        }
        
        HashSet<Integer> set = new HashSet<>(arr);

        int ar[] = new int[set.size()];

        int i = 0;
        for (int num : set) {
            ar[i] = num;
            i++;
        }

        return ar;
        
    }
}