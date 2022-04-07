public class Solution {
    // you need to treat n as an unsigned value
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
}