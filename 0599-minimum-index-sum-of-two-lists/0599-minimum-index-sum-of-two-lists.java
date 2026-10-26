class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String , Integer > map = new HashMap<>();

        for(int i = 0 ; i < list1.length ; i++){

            String str1 = list1[i];

            if(!map.containsKey(str1)){
                map.put(str1 , i);
            }
        }

        int min = Integer.MAX_VALUE;

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0 ; i < list2.length ; i++){

            String str2 = list2[i];

            if(map.containsKey(str2)){

                int prevIdx = map.get(str2);
                int sum = i + prevIdx;

                if(sum < min){
                    list.clear();
                    list.add(str2);
                    min = sum;
                }
                else if(sum == min){
                    list.add(str2);
                }

                
                
            }
        }

        int size = list.size();

        String [] ans = new String [size];

        for(int i = 0 ; i < size ; i++){
            ans[i] = list.get(i);
        }

        return ans;

    }
}