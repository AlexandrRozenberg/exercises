package exercises.leedcode.task2574;

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            sum+= nums[i];
        }

        int rigthSum = sum;
        int leftSum = 0;
        for(int i = 0; i < n; i++){
            rigthSum -= nums[i];
            arr[i] = Math.abs(leftSum - rigthSum);
            leftSum += nums[i];
        }
        return arr;
    }
}
