public List<String> st = new ArrayList<String>();

    public void fill(TreeNode root , String s){
        if(root == null) return;
        if(root.left == null && root.right == null) {

            st.add(s+root.val);
            return;
        }
        String path = s+root.val+"->";

        fill(root.left, path);
        fill(root.right, path);
        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {

        fill(root,"");
        return st;

    }