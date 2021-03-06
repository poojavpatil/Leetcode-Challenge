/* Return the root node of a binary search tree that matches the given preorder traversal.

(Recall that a binary search tree is a binary tree where for every node, any descendant of node.left has a value < node.val, and any descendant of node.right has a value > node.val.  Also recall that a preorder traversal displays the value of the node first, then traverses node.left, then traverses node.right.)

It's guaranteed that for the given test cases there is always possible to find a binary search tree with the given requirements. */

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
class Solution
{
    public TreeNode bstFromPreorder(int[] A)
	{
        return bstFromPreorderHelper(A, 0, A.length);
    }

    private TreeNode bstFromPreorderHelper(int[] A, int start, int end)
	{
        if(start >= end)
		{
			return null;
		}
		else
		{
			int transitionPoint = start + 1;
			
			while(transitionPoint < end && Integer.compare(A[transitionPoint], A[start]) < 0)
				transitionPoint++;
			
			TreeNode root = new TreeNode(A[start]);
			root.left = bstFromPreorderHelper(A, start + 1, transitionPoint);
			root.right = bstFromPreorderHelper(A, transitionPoint, end);
			return root;
		}
    }
}
