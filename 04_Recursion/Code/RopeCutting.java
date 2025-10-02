public class RopeCutting {
    public static void main(String[] args) {
        System.out.println(maxPieces(23,11,9,12));
    }
    // This will be improved with Dynamic programming
    static int maxPieces(int n, int a, int b, int c) {  // Time Complexity: O(3^n)
        if (n == 0) return 0;
        if (n < 0) return -1;
        int res = Math.max(Math.max(maxPieces(n-a, a, b, c),maxPieces(n-b, a, b, c)),
                maxPieces(n-c, a, b, c));
        if (res == -1) return -1;
        return res+1;
    }
}
