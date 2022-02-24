class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        int save = x;
        while(x>0){
            int r = x%10;
            temp = temp*10+r;
            x /=10;
        }
        if(temp == save){
            return true;
        }
        else{return false;}
    }
}