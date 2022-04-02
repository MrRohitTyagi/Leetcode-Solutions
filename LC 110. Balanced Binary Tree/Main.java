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
    
    
    public int height(TreeNode node){
        if(node == null){
            return - 1 ;
            
        }
        
        int LA = height(node.left);
        int RA = height(node.right);
        
        int myans = Math.max(LA,RA) + 1;
        
        return myans;
    }
    public boolean isBalanced(TreeNode node) {
        
        if(node == null){
            return true;
        }
        
        int LA=height(node.left);
        int RA=height(node.right);
        int ch = Math.abs(LA - RA);
        if(Math.abs(LA - RA) > 1) return false;
        
        boolean leftB = isBalanced(node.left);
        boolean rightB = isBalanced(node.right);
        
        return leftB && rightB;
        
    }
}