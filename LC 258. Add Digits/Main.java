class Solution {

    public int addDigits(int a) {
        int sum = 0;
        while (a > 9) {
            while (a > 0) {
                int rem = a % 10;
                sum += rem;
                a /= 10;
            }
            a = sum;
            sum = 0;
        }
        return a;
    }
}
