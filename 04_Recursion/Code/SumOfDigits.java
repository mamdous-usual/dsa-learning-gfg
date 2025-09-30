public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(getSum(253));
    }

    static int getSum(int n) { // Time Complexity: O(d) d -> no. of digits
                               // Auxiliary Space: O(d)
        if (n == 0) return 0;
        return getSum(n/10) + n%10;
    }
}
