package exercises.leedcode.task2011;

public class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;

        for (String operation : operations){
            if (operation.equals("++X") || operation.equals("X++")){
                x++;
            }else {
                x--;
            }
        }
        return x;
    }
}
