public class IterativePower {
    public static void main(String[] args) {
       System.out.println(power(2,3));
    }
    // Iterative solution of pow(x,n)
    static int power(int x, int n) { // Time Complexity:O(logn)
        int res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = res*x;
            }
            x = x*x;
            n = n/2;
        }
        return res;
    }

    // For the same problem in Leetcode -> have some edge cases
    static int powerImproved(double x, int n) { // Time complexity: O(n)

    }
}
