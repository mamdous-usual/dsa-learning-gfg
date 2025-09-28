public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        printPowerSet(s);
    }

    static void printPowerSet(String s) { // Time Complexity: O(2^n X n)
        int n = s.length();
        int pSize = (1 << n);
        for (int i = 0; i < pSize; i++) {
            for (int j = 0; j < n; j++) {
                if ((i &(1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
