class Solution {
    public List<Integer> getRow(int n) {
        
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= n + 1 ; i++) {
            
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                }
                else {
                    row.add(ans.get(i - 2).get(j) + ans.get(i - 2).get(j - 1));
                }
            }
            ans.add(row);
        }
        System.out.println(ans);
        return ans.get(ans.size()-1);
        
    }
}