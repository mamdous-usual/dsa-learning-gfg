import java.util.ArrayList;

public class TwoOddOccuring {
    public static void main(String[] args) {
        int[] arr = {3,4,3,4,5,4,4,6,7,7};
        twoOddOccuringNaive(arr);
        twoOddOccuringEfficient(arr);
    }

    // Naive Solution
    static void twoOddOccuringNaive(int[] arr) { // Time Complexity: O(n^2)
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }


    // Efficient Solution
    static void twoOddOccuringEfficient(int[] arr) { // Time Complexity(n)
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        int k = (x & (~(x-1)));
        int res1 = 0, res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & k) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        System.out.print(res1 + " " + res2);
    }


    // For GFG Submission
    ArrayList<Integer> twoOddNum(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            x = x ^ arr[i];
        }
        int k = (x & (~(x-1)));
        int res1 = 0, res2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & k) != 0) {
                res1 = res1 ^ arr[i];
            } else {
                res2 = res2 ^ arr[i];
            }
        }
        if (res1 > res2) {
            list.add(res1);
            list.add(res2);
        } else {
            list.add(res2);
            list.add(res1);
        }

        return list;
    }
}
