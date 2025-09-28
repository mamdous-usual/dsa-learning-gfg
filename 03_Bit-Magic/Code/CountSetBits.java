public class CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBitsNaive(13));
        System.out.println(countSetBitsBrian(13));

        initialize();
        System.out.println(CountSetBitsLookup(13));
    }

    // Naive Solution
    static int countSetBitsNaive(int n) { // Time Complexity: Theta(d) d = no. of bits from last to MSB
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            // this if statement can be written as "count = count + (n&1);"
            n = n/2;
        }
        return count;
    }

    // Brian Kerningan's Algorithms
    static int countSetBitsBrian(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n-1);
            count++;
        }
        return count;
    }


    // Lookup Table Solution // Time Complexity: O(1)
    static int[] tbl = new int[256];

    static void initialize() {
        tbl[0] = 0;
        for (int i = 1; i < 256; i++) {
            tbl[i] = tbl[i&(i-1)] + 1;
        }
    }

    static int CountSetBitsLookup(int n) {
        return tbl[n&255] + tbl[(n>>8) & 255] + tbl[(n>>16) & 255] + tbl[(n>>24)];
    }
}
