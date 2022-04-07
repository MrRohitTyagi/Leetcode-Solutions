class Solution {

    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        if (n == 1 || n == 3) return true;
        long temp = 3;
        while (temp < n) {
            temp *= 3;
            if (temp == n) {
                return true;
            }
        }
        return false;
    }
}
