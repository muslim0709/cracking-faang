package uz.muslim.cracking.faang.neecode150.arrays_hashing;

public class Palindrome {
    /*
    Time complexity O(n), Space complexity O(1)
     */
    public boolean isPalindrome(String s) {
        // Convert the string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
