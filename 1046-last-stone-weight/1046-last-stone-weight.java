class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int ele : stones){

            pq.add(ele);

        }

        while(!pq.isEmpty()){

            if(pq.size() == 1){
                return pq.poll();
            }

            int max1 = pq.poll();
            int max2 = pq.poll();

            int diff = Math.abs(max1 - max2);

            if(diff != 0){
                pq.add(diff);
            }

        }

        return 0;


        
    }
}