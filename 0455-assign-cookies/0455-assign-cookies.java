class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int count = 0;
        int k = 0;

        for(int i = 0 ; i < g.length && k < s.length; i++){

            while(k < s.length){

                if(g[i] <= s[k]){
                    count++;
                    k++;
                    break;
                }
                else{
                    k++;
                }
                
            }
        }

        return count;
        
    }
}