/*Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]*/

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<TreeNode> q = new ArrayList<TreeNode>();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        if (root == null){
            return result;
        }
        q.add(root);
        ls.add(0);
        while (q.size() > 0){
            TreeNode node = q.remove(0);
            int level = ls.remove(0);
            if (result.size() <= level){
                result.add(0, new ArrayList<Integer>());
            }
            result.get(result.size() - level - 1).add(node.val);
            if (node.left != null){
                q.add(node.left);
                ls.add(level + 1);
            }
            if (node.right != null){
                q.add(node.right);
                ls.add(level + 1);
            }
        }//while q.size
        return result;
    }
}
