public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "ababa";
        int n = str.length();
        System.out.println(isPalindrome(str,0,n-1));
    }

    static boolean isPalindrome(String str, int start, int end) { // Time Complexity: O(n)
                                                                  // Auxiliary Space: O(n)
       if (start >= end) return true;
       return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start+1, end-1);
    }

    // For GFG Submission -> there is only one paratmeter in the function
    boolean isPalindrome(String s) {
        return isPalindromeHelper(s,0,s.length()-1);
    }
    static boolean isPalindromeHelper(String str, int start, int end) {
       if (start >= end) return true;
       return (str.charAt(start) == str.charAt(end)) && isPalindromeHelper(str, start+1, end-1);
    }
}
