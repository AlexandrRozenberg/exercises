package exercises.leedcode.task169;

public class Solution {
    public int findMajorityElement(int[] nums){
        int count = 0;
        int candidate = 0;

        for (int num : nums){
            if (count == 0)
                candidate = num;

            if (num == candidate){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
