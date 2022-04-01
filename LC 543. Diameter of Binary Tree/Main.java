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
    public int sum;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return sum;
    }
     public  int diameter(TreeNode node){
        if(node==null){
            return 0;
        }
        int Lmax=diameter(node.left);
        int Rmax=diameter(node.right);
        sum=Math.max(Lmax+Rmax,sum);
        return Math.max(Lmax,Rmax)+1;
    }
}
