package exercises.leedcode.task9;

public class Reverse {
    public static void main(String[] args) {
        int a = 1221;
        int b = 176;
        boolean isPalindrome1 = isPalindrome(a);
        boolean isPalindrome2 = isPalindrome(b);
        System.out.println(isPalindrome1);
        System.out.println(isPalindrome2);

    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original == reversed;
    }


}
