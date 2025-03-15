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
    public int rob(TreeNode root) {
        int option[]=travel(root);
        return Math.max(option[0],option[1]);
    }
    private int[] travel(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int left_node_choice[]=travel(root.left);
        int right_node_choice[]=travel(root.right);
        int option[]=new int[2];
        option[0]=root.val+left_node_choice[1]+right_node_choice[1];
        option[1]=Math.max(left_node_choice[0],left_node_choice[1])+Math.max(right_node_choice[0],right_node_choice[1]);
        return option;
    }
}