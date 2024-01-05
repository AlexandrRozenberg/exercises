package exercises.leedcode.task67;

public class Solution {
    public static String addBinary(String a, String b){
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();

        while (i >= 0 || j >= 0){
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;

            int currSum = digitA + digitB + carry;

            result.insert(0, currSum % 2);

            carry = currSum / 2;

            i--;
            j--;
        }
        if (carry > 0){
            result.insert(0, carry);
        }
        return  result.toString();
    }

    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));

        String c = "1010";
        String d = "1011";
        System.out.println(addBinary(c, d));
    }

}
