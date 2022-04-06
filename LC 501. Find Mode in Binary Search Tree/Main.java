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
    int pre=0;
    int curMax=0;
    int max=0;
    ArrayList<Integer> res=new ArrayList<Integer>();
    public int[] findMode(TreeNode root)
    {
        inorder(root);
        int ans[]=new int[res.size()];
        int k=0;
        for(int i: res)
            ans[k++]=i;
        return ans;
    }
    void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(pre==root.val)
            curMax++;
        else{
            pre=root.val;
            curMax=1;
        }
        if(curMax>max){
            max=curMax;
            res.clear();
            res.add(root.val);
        }
        else if(curMax==max)
            res.add(root.val);
        inorder(root.right);
    }
}