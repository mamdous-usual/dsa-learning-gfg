public class CountDigits {
    public static void main(String[] args) {

        System.out.println(countDigits(5555));
    }

    static int countDigits(int n) { // Time Complexity: O(logn)
        if (n == 0) return 1; 
        int digit = 0;
        while (n>0) {
            n = n/10;
            digit++;
        }
        return digit;
    }
}
