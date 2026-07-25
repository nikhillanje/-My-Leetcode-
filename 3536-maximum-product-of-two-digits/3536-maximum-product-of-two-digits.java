class Solution {
    public int maxProduct(int n) {

        ArrayList<Integer> arr = new ArrayList<>();

        while( n != 0){
            int d = n % 10;
            arr.add(d);
            n = n / 10;
        }

        Collections.sort(arr); 

        int prod = arr.get(arr.size()-1) * arr.get(arr.size()-2);

        return prod;
        
    }
}