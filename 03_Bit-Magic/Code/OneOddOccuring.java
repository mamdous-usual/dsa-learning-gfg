public class OneOddOccuring {
    public static void main(String[] args) {
        
        int[] arr = {4,4,7,4,8,7,7,7,8};
        System.out.println(oddOccuringNaive(arr));
        System.out.println(oddOccuringEfficient(arr));
    }

    // Naive Solution
    static int oddOccuringNaive(int[] arr) { // Time Complexity: O(n^2)
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count != 0 ) {
                return arr[i];
            }
        }
        return 0;
    }

    // Efficient Solution
    static int oddOccuringEfficient(int[] arr) { // Time Complexity: Theta(n)
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = res ^ arr[i];
        }
        return res;
    }

}
