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
    
    public int diameterOfBinaryTree(TreeNode root) {
         if(root==null){
             return 0;
         }
        int lDia=diameterOfBinaryTree(root.left);
        int rDia=diameterOfBinaryTree(root.right);
        
        int lh=height(root.left);
        int rh=height(root.right);
        
        int selfDai=lh+rh;
        
        return Math.max(selfDai,Math.max(lDia,rDia));
    }
    
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lH=height(root.left);
        int rH=height(root.right);
        
        return Math.max(lH,rH)+1;
    }
}