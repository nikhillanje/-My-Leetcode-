/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public static void func1(TreeNode root){

        if(root == null) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        func1(root.left);
        func1(root.right);


    }

    public static boolean func2(TreeNode r1 , TreeNode r2){

        if(r1 == null && r2 == null) return true;
        if(r1==null || r2==null) return false;
        
        if(r1.val != r2.val) return false;  // data checking
        
        if(!func2(r1.left , r2.left)) return false;
        if(!func2(r1.right , r2.right)) return false;
        
        return true;

    }


    public boolean isSymmetric(TreeNode root) {
        func1(root.left);
        return func2(root.left , root.right);
        
    }
}