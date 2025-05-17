public class Sum {
    public static void main(String[] args) {
       System.out.println(fun1(3));
       System.out.println(fun2(3));
       System.out.println(fun3(3));
    }

    static int fun1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int fun2(int n) {
        return n*(n + 1)/2;        
    }

    static int fun3 (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= i; j++) {
                sum++;
           }
        }
        return sum;
    }
}