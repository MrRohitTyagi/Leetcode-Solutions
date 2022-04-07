public int minDepth(TreeNode root) {
    
    if(root==null) return 0;
    
    int L=minDepth(root.left);
    
    int R= minDepth(root.right);
    
    return (L==0 || R ==0 ) ? L+R+1: Math.min(L,R)+1; 
}