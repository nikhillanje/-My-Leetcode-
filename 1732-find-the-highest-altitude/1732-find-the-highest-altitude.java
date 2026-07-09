class Solution {
    public int largestAltitude(int[] gain) {

        int g = gain[0];
        int mg = Integer.MIN_VALUE;

        if(mg < g){
            mg = g;
        }

        for(int i = 1 ; i < gain.length ; i++){

            g = g + gain[i];

            if(mg < g){
            mg = g;
            }
        }

        if(mg < 0){
            mg = 0;
        }
        
        return mg;
    }
}