public class ComputingPower {
    public static void main(String[] args) {
        System.out.println(powerNaive(2,3));
        System.out.println(powerEfficient(2,3));
    }

    // Naive Solution
    static int powerNaive(int x, int n) { // Time Complexity: O(n)                                         
                                          // Auxiliary Space:O(1)
        int res = 1;
        for (int i = 0; i<n; i++) {
             res = res*x;
        }
        return res;
    }


    //  Efficient Solution -> using recursion
    static int powerEfficient(int x, int n) { // Time Complexity: O(logn)
                                              // Auxiliary Space: O(logn)
        if (n == 0) return 1;
        int temp = powerEfficient(x,n/2);
        temp = temp*temp;
        if (n%2 == 0) return temp;
        else return temp*x;
 }
    
}
