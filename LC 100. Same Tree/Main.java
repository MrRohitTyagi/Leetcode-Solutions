class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
        if (p == null || q == null){
            return p == q? true: false;
        }
        
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}