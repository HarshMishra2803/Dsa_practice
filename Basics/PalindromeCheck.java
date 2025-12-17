package Basics;
public class PalindromeCheck {
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: single character or empty substring
        if (start >= end) {
            return true;
        }

        // Mismatch found
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String str = "radar";
        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
