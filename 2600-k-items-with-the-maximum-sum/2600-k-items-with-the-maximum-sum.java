class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 0 ; i < numOnes ; i++){
            ar.add(1);
        }

        for(int i = 0 ; i < numZeros ; i++){
            ar.add(0);
        }

        for(int i = 0 ; i < numNegOnes ; i++){
            ar.add(-1);
        }

        Collections.sort(ar);

        int sum = 0;

        for(int i = ar.size()-1 ; i >= ar.size()-k ; i--){
            sum = sum + ar.get(i);
        }

        return sum;
        
    }
}