package exercises.leedcode.task58;

public class Solution {
        public static int lengthOfLastWord(String s) {
            s = s.trim();

            int lastSpaceIndex = s.lastIndexOf(' ');

            if (lastSpaceIndex == -1) {
                return s.length();
            }

            return s.length() - lastSpaceIndex - 1;
        }

        public static void main(String[] args) {
            String s = "   fly me   to   the moon  ";
            int length = lengthOfLastWord(s);
            System.out.println("Length of last word: " + length);
        }
    }

