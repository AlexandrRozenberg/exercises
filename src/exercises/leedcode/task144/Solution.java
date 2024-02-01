package exercises.leedcode.task144;

import java.util.ArrayList;
import java.util.List;

class  TreeNode{
    int var;
    TreeNode left;
    TreeNode right;

    public TreeNode(int var) {
        this.var = var;
    }
}

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        preorderTraversalHelper(root, result);
        return result;
    }

    private void preorderTraversalHelper(TreeNode node, List<Integer> result){
        if (node == null)
            return;

        result.add(node.var);
            preorderTraversalHelper(node.left, result);
            preorderTraversalHelper(node.right, result);
    }
}
