class Solution {
    public ArrayList<Integer> arr = new ArrayList<>();

    public void fill(TreeNode root, int TS, int sum) {
        if(root == null) return;
        
        if(root.left == null && root.right == null) {
            arr.add(sum + root.val);
            return;
        }
        fill(root.left, TS, sum + root.val);
        fill(root.right, TS, sum + root.val);
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        boolean flag = false;
        fill(root, targetSum, 0);
        System.out.println(arr);
        
        for(int ele : arr){
            
            if(ele == targetSum) flag = true;
        }
        return flag;
    }
}