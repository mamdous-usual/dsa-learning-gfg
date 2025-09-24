public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(212)); // true
        System.out.println(isPalindrome(2102)); // false
    }
   
    static boolean isPalindrome(int n) { // Time Complexity: O(logn)
        int reverse = 0;
        int temp = n;
        
        while (temp!=0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp = temp/10;
        }
        return (reverse == n);
        
    }
}
