public class PrintDivisors {
    public  static void main(String[] args) {
       printDivisorsNaive(15);
       printDivisorsNotOrder(15);
       printDivisorsEfficient(15);
    }

    // Naive Solution
    static void printDivisorsNaive(int n) { // Time Complexity: O(n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Efficient Solution -> not in order
    static void printDivisorsNotOrder(int n) { // Time Complexity: O(sqrt(n))
        for (int i = 1; i*i <= n; i++) { 
            if (n % i == 0) {
                System.out.println(i);
                if (i != n/i) {
                    System.out.println(n/i);
                }
            }
        }
    }
    
    // Efficient Solution -> in order
    static void printDivisorsEfficient(int n) { // Time Complexity: O(sqrt(n))
        int i;
        for (i = 1; i*i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        for ( ; i>=1; i--) {
            if (n % i == 0) {
                System.out.println(n/i);
            }
        }
    }
}
