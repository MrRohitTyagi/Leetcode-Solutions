class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1 || n == 2) return true;
        long temp = 2;
        while (temp < n) {
            temp *= 2;
            if (temp == n) {
                return true;
            }
        }
        return false;
    }
}
