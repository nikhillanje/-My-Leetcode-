class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        int ans = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i = 0 ; i < jewels.length() ; i++){

            
            char ch = jewels.charAt(i);

            set.add(ch);
            
        }


        for(int i = 0 ; i < stones.length() ; i++){

            char ch = stones.charAt(i);

            if(set.contains(ch)){
                ans++;
            }

            
        }

        return ans;
        
    }
}