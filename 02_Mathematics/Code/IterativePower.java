public class IterativePower {
    public static void main(String[] args) {
       System.out.println(power(2,3));
    }
    // Iterative solution of pow(x,n)
    static int power(int x, int n) {
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
}
