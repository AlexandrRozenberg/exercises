package exercises.leedcode.task1431;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList finall = new <Boolean>ArrayList();
        int max = candies[0];
        for (int a : candies)
            if (max < a)
                max = a;
        for (int i : candies)
            finall.add(i + extraCandies >= max);
        return finall;
    }
}
