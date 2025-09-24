public class CheckPrime {
    public static void main(String[] args) {

        System.out.println(isPrimeNaive(11));
        System.out.println(isPrimeEfficient(123));
        System.out.println(isPrimeMoreEfficient(2));
    }

    // Naive Method
    static boolean isPrimeNaive(int n) { // Time Complexity: O(n)
        if (n == 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { 
                return false;
            }
        }
        return true;
}

// Efficient Approach
static boolean isPrimeEfficient(int n) { // Time Complexity: O(sqrt(n))
    if (n == 1) return false;
    for (int i = 2; i*i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

// More Efficient Approach
static boolean isPrimeMoreEfficient(int n) { // Time Complexity: O(sqrt(n))
    if (n == 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i*i <= n; i = i+6) {
        if (n % i == 0 || n % (i+2) == 0) {
            return false;
        }
    }
    return true;
}


}
