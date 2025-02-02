package uz.muslim.cracking.faang.neecode150.arrays_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    /*
     * Solution1 time complexity O(nlog(n)), Space complexity O(1)
     */
    public int longestConsecutive1(int[] nums) {
        if(nums.length <= 1) return nums.length;
        Arrays.sort(nums);

        int counter = 1;
        int longest = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }

            if(nums[i] - nums[i-1] == 1){
                counter++;
            } else {
                longest = Math.max(counter, longest);
                counter = 1;
            }
        }

        longest = Math.max(counter, longest);

        return longest;
    }

    /*
     * Solution2 time complexity O(n), Space complexity O(n)
     */
    public int longestConsecutive2(int[] nums) {
        if(nums.length <= 1) return nums.length;

        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        int longestSequence = 0;

        for(int i: set){
            if(!set.contains(i-1)){
                int length = getLengthOfSequence(i, set);
                longestSequence = Math.max(longestSequence, length);
            }
        }


        return longestSequence;
    }

    private int getLengthOfSequence(int target, Set<Integer> set){
        int count = 1;

        while(set.contains(++target)){
            count++;
        }

        return count;
    }
}
