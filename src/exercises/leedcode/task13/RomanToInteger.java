package exercises.leedcode.task13;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "XXVII";
        int result = romanToInt(romanNumeral);
        System.out.println(result);

    }

    public static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++){
            int currentVal = map.get(s.charAt(i));
            if (i + 1 < s.length() && currentVal < map.get(s.charAt(i + 1))){
                num -= currentVal;
            }else {
                num += currentVal;
            }
        }
        return num;
    }
}
