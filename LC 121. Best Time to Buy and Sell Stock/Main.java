class Solution {
    public int maxProfit(int[] prices) {
        
        int min = prices[0];
        int pro = 0;
        
        for(int n : prices){
            
            min = Math.min(min,n);
            pro = Math.max(pro,n - min );
            
        }
        return pro;
    }
}