class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(

            (a,b) -> {

                int d1 = Math.abs(a-x);
                int d2 = Math.abs(b-x);

                if(d1 != d2){
                    return d1 - d2;     // Choose -> Elemtn , Whos Distance is Smallest
                }

                return a - b; // Choose -> Element , Who is Largest One (When Dist are Same)
            }

        );


        for(int ele : arr){

            // if(ele != x){   // Include that Element Also
                pq.add(ele);
            //}
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < k ; i++){
            ans.add(pq.poll());
        }

        Collections.sort(ans);   // Sort ArrayList 

        return ans;
        
    }
}