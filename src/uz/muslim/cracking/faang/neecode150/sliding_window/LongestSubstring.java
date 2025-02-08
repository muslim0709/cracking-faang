package uz.muslim.cracking.faang.neecode150.sliding_window;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        int r = longestSubstring.lengthOfLongestSubstring("bvbd");
        System.out.println(r);
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int l = 0, r;
        for(r = 0; r < s.length(); r++){
            if (map.get(s.charAt(r)) != null && map.get(s.charAt(r)) >= l){
                max = Math.max(r - l, max);
                l = map.get(s.charAt(r)) + 1;
            }
            map.put(s.charAt(r), r);
        }
        max = Math.max(r - l, max);
        return max;
    }
}
