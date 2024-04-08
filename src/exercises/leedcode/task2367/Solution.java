package exercises.leedcode.task2367;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int i = 0, k = 1, result = 0;

        for (int num : nums)
            set.add(num);

        while (k < nums.length) {
            if (nums[k] - nums[i] == 2 * diff && set.contains(diff + nums[i]))
                ++result;

            if (nums[k] - nums[i] < 2 * diff)
                ++k;
            else
                ++i;
        }

        return result;
    }
}
