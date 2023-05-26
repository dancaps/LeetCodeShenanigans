package FortyOneToSixty;

/**
 * Given a binary tree, find its minimum depth.
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 * Note: A leaf is a node with no children.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 2
 *
 * Example 2:
 * Input: root = [2,null,3,null,4,null,5,null,6]
 * Output: 5
 */

public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {

        return dfs(root);
    }

    public int dfs(TreeNode node) {
        if(node == null) {
            return 0; // base case
        }

        // running both sides of the tree
        int left = dfs(node.left);
        int right = dfs(node.right);

        // condition for left null
        if (node.left == null) {
            return right + 1;
        }

        // condition for right null
        if (node.right == null) {
            return left + 1;
        }

        // condition for neither node being null
        return Math.min(left, right) + 1;
    }
}