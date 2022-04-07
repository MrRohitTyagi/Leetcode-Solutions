class Solution {
    public boolean isAnagram(String s, String t) {

        StringBuilder sb = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);
        

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            for (int j = 0; j <tb.length(); j++) {
                char c = tb.charAt(j);
                if(ch == c){
                    tb.deleteCharAt(j);
                }
            }
            sb.deleteCharAt(i);


            
        }
        System.out.println(sb);
        System.out.println(tb);

        if(sb.length() == 0 && tb.length() == 0) return true;

        return false;

    }
}