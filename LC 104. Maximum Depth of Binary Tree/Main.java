class Solution {
    public int maxDepth(TreeNode root) {
        
        if( root == null) return 0;
        
        int LA = maxDepth(root.left);
        int RA = maxDepth(root.right);
        
        
        int myans = Math.max(LA,RA) + 1 ;
        return myans;
        
    }
}