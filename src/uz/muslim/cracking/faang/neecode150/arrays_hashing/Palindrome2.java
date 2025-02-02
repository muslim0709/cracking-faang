package uz.muslim.cracking.faang.neecode150.arrays_hashing;


public class Palindrome2 {

    public boolean validPalindrome(String s) {
        if(s.length() <= 1) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                boolean firstOption = validPalindrome(left + 1, right, s);
                boolean secondOption = validPalindrome(left, right - 1, s);
                return firstOption || secondOption;
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean validPalindrome(int left, int right, String s){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
