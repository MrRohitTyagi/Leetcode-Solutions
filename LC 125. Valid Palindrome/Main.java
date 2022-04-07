class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().trim();
        StringBuilder sb = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        
        int len = sb.length();
        int st = 0, en = len-1;
        while (st < en) {
            if (sb.charAt(st) == sb.charAt(en)) {
                st++;
                en--;
            } else return false;
        }
        return true;
    }
}