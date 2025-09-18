public class TrailingZerosFactorial {
    public static void main(String[] args) {
        System.out.println(countZerosNaive(10));
        System.out.println(countZerosEfficient(10));
    }

    // Naive Approach
    static int countZerosNaive(int n) { // Time Complexity: O(n);
        int fact = 1;
        for (int i=2; i<=n; i++) {
            fact *= i;
        }
        int result = 0;
        while (fact % 10 == 0) {
            result++;
            fact /= 10;
        }
        return result;
    }

    // Efficient Approach
    static int countZerosEfficient(int n) { // Time Complexity: O(logn)
        int result = 0;
        for (int i=5; i<=n; i=i*5) {
            result = result + n/i;
        }
        return result;
    }
}
