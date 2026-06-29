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

    public static TreeNode delete(TreeNode root, int val) {
        
        if (root == null) {
          return null;
        }

		if(root.val < val) {
			root.right = delete(root.right, val);
		}
		else if(root.val > val) {
			root.left = delete(root.left, val);
		}
		else {

			//Case 1 : 0 child Node
			if(root.left == null && root.right == null) {
				return null;
			}

			//case 2 : 1 Child Node
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}

			// Case 3 : 2 Child Node
			TreeNode successor = findMin(root.right);
			root.val = successor.val;
			root.right = delete(root.right, successor.val);
		}

		return root;
	}

	static TreeNode findMin(TreeNode root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}
	


    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root , key);
    }
}