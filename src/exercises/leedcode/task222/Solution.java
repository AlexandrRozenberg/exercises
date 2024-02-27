package exercises.leedcode.task222;

public class Solution {
    public int contNodes(TreeNode root){
        if (root == null)
            return 0;

        int leftNodes= contNodes(root.left);
        int rightNodes = contNodes(root.right);

        return rightNodes + leftNodes + 1;
    }
}
