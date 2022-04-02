class Solution {
    public long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        boolean LA = isValidBST(root.left);
        if(LA == false){
            return false;
        }
        
        if(prev >= root.val){
            return false;
        }
        prev = root.val;
        boolean RA = isValidBST(root.right);
        if(RA == false){
            return false;
        }
        
        
        return true;
        
    }
}