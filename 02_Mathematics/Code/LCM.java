public class LCM {
    public static void main(String[] args) {

        System.out.println(lcmNaive(4,6));
        System.out.println(lcmNaive(3,7));
    }

    // Naive Approach
    static int lcmNaive(int a, int b) {
        int result = Math.max(a,b);
        while(true) {
            if (result % a == 0 && result % b == 0) {
                return result;
            }
            result++;
        }
    }
    

    // Efficient Approach -> using Euclidean Algorithm

    static int lcmEfficient(int a, int b) {
        return (a*b)/gcd(a,b);
    }

    static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }

        return gcd(b, a%b);
    }
}
