public class Print1toN {
    public static void main(String[] args) {
        print1toN(5);
    }

    static void print1toN(int n) { // Time Complexity: O(n)
                                   // Auxiliary Space: O(n)
        if (n == 0) return;
        print1toN(n -1);
        System.out.print(n + " ");
    }
}
