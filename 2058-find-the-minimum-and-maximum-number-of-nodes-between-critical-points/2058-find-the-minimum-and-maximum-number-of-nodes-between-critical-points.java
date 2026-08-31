/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int count = 0;

        ListNode temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        if (count < 3) {
            return new int[]{-1, -1};
         }


        ListNode prevNode = head;
        ListNode currNode = head.next;
        ListNode nextNode = head.next.next;

        int idx = 1;

        ArrayList<Integer> ar = new ArrayList<>();

        while(nextNode != null){

            if( (prevNode.val > currNode.val && currNode.val < nextNode.val) || (prevNode.val < currNode.val && currNode.val > nextNode.val) ){

                ar.add(idx);
            }


            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;

            idx++;
        }
        

        int n = ar.size();

        if (ar.size() < 2) {
             return new int[]{-1, -1};
        }


        Collections.sort(ar);


        int maxDist = ar.get(n - 1) - ar.get(0);


        int minDist = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {

            int dist = ar.get(i) - ar.get(i - 1);

            if (dist < minDist) {
                minDist = dist;
            }
        }

        int []arr = {maxDist , minDist};

        Arrays.sort(arr);

        return arr;

    }
}