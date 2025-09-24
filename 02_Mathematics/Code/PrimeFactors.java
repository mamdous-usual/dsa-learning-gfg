import java.util.ArrayList;

public class PrimeFactors {
    public static void main(String[] args) {

        primeFactorsNaive(12);
        primeFactorsEfficient(12);
        primeFactorsMoreEfficient(450);
        System.out.println(primeFactors(100));
        System.out.println(primeFac(100));
    }

    // Naive Solution
    static void primeFactorsNaive(int n) { // Time Complexity: O(n * sqrt(n))
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                int x = i;
                while (n % x == 0) {
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }
    // Check Prime function for naive solution
    static boolean isPrime(int n) {
    if (n == 1) return false;
    if (n == 2 || n == 3) return true;
    if (n % 2 == 0 || n % 3 == 0) return false;
    for (int i = 5; i*i <= n; i = i+6) {
        if (n % i == 0 || n % (i+2) == 0) {
            return false;
        }
    }
    return true;
}


// Efficient Solution
static void primeFactorsEfficient(int n) { //Time Complexity: O(sqrt(n))
    if (n <= 1) return;

    for (int i = 2; i*i <= n; i++) {
        while (n % i == 0) {
            System.out.println(i);
            n = n/i;
        }
    }
    if (n > 1) {
        System.out.println(n);
    }
}


// More Efficient Solution
static void primeFactorsMoreEfficient(int n) { //Time Complexity: O(sqrt(n))
    if (n <= 1) return;
    while (n % 2 == 0) {
        System.out.println(2);
        n = n/2;
    }
    while (n % 3 == 0) {
        System.out.println(3);
        n = n/3;
    }

    for (int i = 5; i*i <= n; i = i+6) {
        while (n % i == 0) {
            System.out.println(i);
            n = n/i;
        }
        while (n % (i+2) == 0) {
            System.out.println(i+2);
            n = n/(i+2);
        }
    }
    if (n > 3) {
        System.out.println(n);
    }
}


// For Submission
static ArrayList<Integer> primeFactors(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    if (n <= 1) return list;
    while (n % 2 == 0) {
       list.add(2);
       n = n/2;
    }
    while (n % 3 == 0) {
       list.add(3);
       n = n/3;
    }
    for (int i = 5; i*i <= n; i = i+6) {
        while (n % i == 0) {
            list.add(i);
            n = n/i;
        }
        while (n % (i+2) == 0) {
            list.add(i+2);
            n = n/(i+2);
        }
    }
    if (n > 3) {
        list.add(n);
    }
    return list;
}

// Accepted code on GFG for unique prime factors (The problem is for unique Prime Factors) -> old code with some modificatons
 public static ArrayList<Integer> primeFac(int n) {
    ArrayList<Integer> list = new ArrayList<>();
    if (n <= 1) return list; // empty list for <=1

    // For factor 2
    if (n % 2 == 0) {
        list.add(2);
        while (n % 2 == 0) {
            n /= 2;
        }
    }
    // For factor 3
    if (n % 3 == 0) {
        list.add(3);
        while (n % 3 == 0) {
            n /= 3;
        }
    }
    // For other primes of form 6k ± 1
    for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0) {
            list.add(i);
            while(n % i == 0) {
                n /= i;
            }
        }
        if (n % (i + 2) == 0) {
            list.add(i + 2);
            while(n % (i + 2) == 0) {
                n /= (i + 2);
            }
        }
    }
    if (n > 1) {
        // whatever is left is a prime factor larger than sqrt(original n)
        list.add(n);
    }

    return list;
}
}
