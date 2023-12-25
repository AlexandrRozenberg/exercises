package exercises.leedcode.task26;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3,4, 5, 5};

        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums){
        if (nums.length == 0)
            return 0;

        int j = 0;

        for (int i = 1; i < nums.length; i ++){
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return  j + 1;
    }
}
