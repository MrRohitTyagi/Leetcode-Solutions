class Solution {

    public boolean fill(TreeNode root, int TS, int sum) {
        
        if(root == null) return false;
        
        if(root.left == null && root.right == null) {
            if(sum + root.val == TS ){return true;}
        }
        boolean LA = fill(root.left, TS, sum + root.val);
        
        if(LA) return true;
        
        
        boolean RA = fill(root.right, TS, sum + root.val);
        
        if(RA) return true;
        
        return false;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fill(root, targetSum, 0);
    }
}