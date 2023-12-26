package exercises.leedcode.task27;

public class Solution {
    public static void main(String[] args) {
        int[] nusm = {1, 2, 3, 2, 3, 1, 2};
        System.out.println(removeElement(nusm, 2));
    }

    public static int removeElement(int[] nums, int val){
        int k = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
