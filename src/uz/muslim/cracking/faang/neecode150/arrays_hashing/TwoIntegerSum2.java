package uz.muslim.cracking.faang.neecode150.arrays_hashing;

public class TwoIntegerSum2 {
    /*
    Time complexity O(n), Space complexity O(1)
     */
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while(left < right){
            if(target == numbers[left] + numbers[right]){
                return new int[]{left+1,right+1};
            } else if(target > numbers[left] + numbers[right]){
                left++;
            } else {
                right--;
            }
        }

        return new int[]{0,0};
    }
}
