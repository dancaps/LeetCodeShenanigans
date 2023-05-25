package FortyOneToSixty;

/**
 * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals targetSum.
 * A leaf is a node with no children.
 *
 * Example 1:
 *
 * Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
 * Output: true
 * Explanation: The root-to-leaf path with the target sum is shown.
 */

public class PathSum {
    int target;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        return dfs(root, 0);
    }

    public boolean dfs(TreeNode node, int current) {
        if(node == null) {
            return false;
        }

        if(node.left == null && node.right == null) {
            return (current + node.val) == this.target;
        }

        current = current + node.val;
        boolean left = dfs(node.left, current);
        boolean right = dfs(node.right, current);
        return left || right;
    }
}

// Tree node implementation
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
