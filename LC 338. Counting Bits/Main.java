class Solution {
    
    public int hammingWeight(int n) {
        int count = 0;
        String s = Integer.toBinaryString(n);
        
        for( int i = 0 ;i<s.length(); i++ ){
            char c = s.charAt(i);
            if(c == '1'){
                count++;
            }
        }
        
        System.out.println(s);
        return count;
        
    }
    public int[] countBits(int n) {
        int [] arr = new int[n+1]; 
        
        for(int i = 0 ; i <= n ; i ++){
            
            int ans = hammingWeight(i);
            arr[i] = ans;
        }
        return arr;
        
    }
}