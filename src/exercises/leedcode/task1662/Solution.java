package exercises.leedcode.task1662;

public class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();

        for (String str : word1)
            stringBuilder.append(str);

        for (String str : word2)
            stringBuilder1.append(str);

        return stringBuilder.toString().contentEquals(stringBuilder1);

    }
}
