class Solution {
    public void reverseString(char[] s) {

       char [] ar = new char[s.length];
       int k = 0;
       for(int i = s.length -1; i >=0 ; i--){
           ar[k] = s[i];
           k++;            
       }
       for(int i = s.length -1; i >=0 ; i--){
           s[i] = ar[i];
       }
       

       


       
   }
}