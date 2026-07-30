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
    int max =0;
    public int dia(TreeNode root){
        if(root == null)return 0;
        int leftH = dia(root.left);
        int rightH = dia(root.right);
        max = Math.max(max,leftH+rightH);
        return 1+Math.max(leftH,rightH);
        
    }
    public int diameterOfBinaryTree(TreeNode root) { 
        dia(root);
        return max;
    }
}