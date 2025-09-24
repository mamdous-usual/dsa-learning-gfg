public class CountDigits {
    public static void main(String[] args) {
        System.out.println(countDigits(512)); // 3
    }

    static int countDigits(int n) { // Time Complexity: O(logn)
        int digits = 0;
        if (n == 0) return 1;

        while (n > 0) {
            n = n/10;
            digits++;
        }

        return digits;
    }
}
