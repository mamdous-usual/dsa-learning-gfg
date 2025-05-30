public class SumOfnNaturalNumbers {
    public static void main (String[] args) {
        System.out.println(sum1(10));
        System.out.println(sum2(10));
        System.out.println(sum3(10));
        System.out.println(sumRecursive(10));
    }

    // Time Complexity ->  O(1) -> Constant
    // Space Complexity -> O(1) -> Constant
    static int sum1(int n) {
        return n*(n + 1) / 2;
    }

    // Time Complexity -> O(n) -> Linear
    // Space Complexity -> O(1) -> Constant
    static int sum2(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Time Complexity -> O(n^2) -> Quadratic
    // Space Complexity -> O(1) -> Constant
    static int sum3(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }
    
    // Time Complexity -> O(n) -> Linear
    // Space Complexity -> O(n) -> Linear
    static  int sumRecursive(int n) {
        if (n <= 0) {
            return 0;
        }

        return  n + sumRecursive(n -1);
    }
}
