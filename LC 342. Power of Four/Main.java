class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        if (n == 1 || n == 4) return true;
        long temp = 4;
        while (temp < n) {
            temp *= 4;
            if (temp == n) {
                return true;
            }
        }
        return false;
    }
}