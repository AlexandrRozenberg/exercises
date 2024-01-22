package exercises.leedcode.task118;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generatePascalTriangle(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0){
            return triangle;
        }

        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++){
                if (j == 0 || j == 1){
                    row.add(1);
                } else {
                    List<Integer> prevRow = triangle.get(i - 1);
                    int num = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(num);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}