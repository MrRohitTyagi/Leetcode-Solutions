class Solution {
    public int lengthOfLastWord(String s) {
        
        s = s.trim();
        String [] st = s.split(" ");
        // System.out.println(st);
        return st[st.length-1].length();
    }
}