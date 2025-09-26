public class CheckKthBitSet {
    public static void main(String[] args) {
        isSetNaive(5,3);
        isSetAltNaive(5,3);
    }

    // Naive Solution
    static void isSetNaive(int n, int k) { // Time Complexity: O(k)
        int x = 1;
        for (int i = 0; i < (k-1); i++) {
            x *= 2;
        }
        if ((n&x) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Alternate Naive Solution
    static void  isSetAltNaive(int n, int k) { // Time Complexity: O(k)
        for (int i = 0; i < (k-1); i++) {
            n = n/2;
        }
        if ((n&1) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Efficient Solution I
    static void isKthSet1(int n, int k) { // Time Complexity: O(1)
        int x = (n << (k-1));
        if ((n&x) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    // Efficient Solution II
    static void isKthSet2(int n, int k) { // Time Complexity: O(1)
        int x = (n >> (k-1));
        if ((x&1) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    // For GFG Solution
    static boolean checkKthBit(int n, int k) {
        return ((n >> k) & 1) == 1;
    }
}
