public class Factorial {
    public static void main(String[] args) {
        System.out.println(factIterative(5));
        System.out.println(factRecursive(5));

    }

    // Iterative Solution
    static int factIterative(int n) { 
        int factorial = 1; // Covers both (n == 0 and n == 1) -> 1
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Recursive Solution
    static int factRecursive(int n) {         if (n == 0) return 1;
        return n * factRecursive(n - 1);
    }

// Iterative Factorial 
// . Time Complexity: O(n)
// . Auxiliary Space: O(1)
// . Space Complexity:O(1)

// Recursive Factorial 
// . Time Complexity: O(n)
// . Auxiliary Space: O(n) (recursion stack)
// . Space Complexity:O(n)
}
