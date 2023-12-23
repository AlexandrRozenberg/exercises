package exercises.leedcode.task20;

import java.util.Stack;

import java.util.Stack;

public class Solution {
        public static void main(String[] args) {
            Solution solution = new Solution();

            String s1 = "({[]})";
            System.out.println(solution.isValid(s1));

            String s2 = "(){}[]";
            System.out.println(solution.isValid(s2));

            String s3 = "({[}])";
            System.out.println(solution.isValid(s3));
        }


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}


