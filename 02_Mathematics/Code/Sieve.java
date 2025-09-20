import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        sieveSimple(10);
        sieveOptimized(10);
        sieveEfficient(10);
    }

    //  Simple Implementation of Sieve Algorithm
    static void sieveSimple(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i*i <= n; i++) {
            if(isPrime[i]) {
                for (int j = i*2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i<=n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

     
    //  Optimized Implementation of Sieve Algorithm
    static void sieveOptimized(int n) {
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        for (int i = 2; i*i <= n; i++) {
            if(isPrime[i]) {
                for (int j = i*i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i<=n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    // Shorter Implementation of Optimized Sieve Algorithm
    static void sieveEfficient(int n) { // Time Complexity: O(nloglogn)
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for (int i = 2; i<=n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i*i; j <= n; j+=i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    
    // For GFG problem submission -> it wants integer array return type
    static int[] sieve(int n) {
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);

    ArrayList<Integer> primes = new ArrayList<>();

    for (int i = 2; i <= n; i++) {
        if (isPrime[i]) {
            primes.add(i);
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
    }

    // Convert ArrayList<Integer> to int[]
    int[] result = new int[primes.size()];
    for (int i = 0; i < primes.size(); i++) {
        result[i] = primes.get(i);
    }
    return result;
}

 }
