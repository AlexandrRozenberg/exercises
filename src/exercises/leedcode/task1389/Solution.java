package exercises.leedcode.task1389;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans.add(index[i], nums[i]);
        }
        int h = 0;
        for(int a : ans){
            res[h++] = a;
        }

        return res;
    }
}
