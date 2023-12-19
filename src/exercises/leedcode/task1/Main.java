package exercises.leedcode.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        Solution solution = new Solution();
        int[] x = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(x));

    }
}
