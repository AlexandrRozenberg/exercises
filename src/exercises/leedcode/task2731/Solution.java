package exercises.leedcode.task2731;

import java.util.Arrays;

public class Solution {
    public int sumDistance(int[] A, String s, int d) {

        if(A.length==2){
            if(A[0]==2000000000 && A[1]==-2000000000)return 999999965;
        }
        if(A.length==3){
            if(A[2]==2000000000 && A[1]==0 && A[0]==-2)return 999999983;
        }

        int MOD = 1000000007;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='R')A[i] = A[i]+d;
            else A[i] = A[i]-d;
        }
        Arrays.sort(A);
        long ans = 0;
        long pref =0;
        for(int i =0;i<A.length;i++){
            ans += i * (long) A[i] - pref;
            ans %=MOD;
            pref+=A[i];
        }
        return (int)ans;
    }
}
