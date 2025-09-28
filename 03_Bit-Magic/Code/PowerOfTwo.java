public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPow2Naive(4));
        System.out.println(isPow2Efficeient(4));
    }

    // Naive Solution
    static boolean isPow2Naive(int n) { // Time Complexity: O(logn)
        if (n == 0) return false;
        while (n != 1) {
            if (n % 2 != 0) 
                return false;
            n  = n/2;
        }
        return true;
    }

    // Efficient Solution
    static boolean isPow2Efficeient(int n) { // Time Complexity: O(1)
        if (n == 0) return false;
        return ((n & (n-1)) == 0);
    }


}
