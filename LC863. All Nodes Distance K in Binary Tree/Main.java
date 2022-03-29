/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution{
        
    public ArrayList<Integer>  arr = new ArrayList<>();
    
    
 public  void PrintKdown(TreeNode node, int k,TreeNode blocker){
    if(node == null || k < 0 || node == blocker){
        return;
    }
    if(k == 0){
        arr.add(node.val);
    }
    PrintKdown(node.left, k-1,blocker);
    PrintKdown(node.right, k-1,blocker);
} 
    
public ArrayList<TreeNode> N2P(TreeNode node,int data){
    
    if(node == null){
        return new ArrayList<>();
    }
    
    if( node.val == data ){
        ArrayList <TreeNode> base = new ArrayList<>();
        base.add(node);
        return base;
    }
    
    ArrayList<TreeNode> LeftA = N2P(node.left,data);
    
    if(LeftA.size() > 0 ){
        LeftA.add(node);
        return LeftA;
    }
    ArrayList<TreeNode> RightA = N2P(node.right,data);
    
    if(RightA.size() > 0 ){
        RightA.add(node);
        return RightA;
    }
    
    return new ArrayList<>();
}

public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
    
    ArrayList<TreeNode> ans =N2P(root,target.val) ;
    TreeNode blocker = null;
    
    for( int i = 0;i < ans.size(); i++){
        TreeNode n = ans.get(i);
        PrintKdown(n,k - i,blocker);
        blocker = n;
    }
   
    
    return arr;
}
}