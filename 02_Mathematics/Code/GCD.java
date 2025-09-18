public class GCD {
    public static void main(String[] args) {
       System.out.println(gcdNaive(15,10));
       System.out.println(gcdEuclidean(15,10));
       System.out.println(gcdOptimized(15,10));
    }

    // Naive Approach
    static int gcdNaive(int a, int b) {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    // Euclidean Approach Implementation
    static int gcdEuclidean(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    
    // Optimized Euclidean Approach Implementation 
    static int gcdOptimized(int a, int b) {
        if (b==0) {
            return a;
        } else {
            return gcdOptimized(b, a%b);
        }
    }
}
