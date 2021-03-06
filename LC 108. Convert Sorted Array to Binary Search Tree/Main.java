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
    
    public TreeNode SortedArrToBST(int[] arr,int i,int j){
        
        
        if(i > j){
            return null;
        }
        
        int mid  = (i + j)/2;
        TreeNode node = new TreeNode(arr[mid]);
        
        node.left=SortedArrToBST(arr,i,mid-1);
        node.right=SortedArrToBST(arr,mid + 1,j);
        
        return node;
    }
    
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode tree = SortedArrToBST(nums,0,nums.length-1) ;
            return tree;
    }
}