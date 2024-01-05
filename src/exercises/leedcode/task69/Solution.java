package exercises.leedcode.task69;

public class Solution {
    public static int mySqrt(int x){
        if (x == 0)
            return 0;

        long left = 1;
        long right = x;

        while (left < right){
            long mid = left + (right - left) / 2;

            if (mid * mid == x){
                return (int) mid;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int) (left - 1);
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(16));
    }
}
