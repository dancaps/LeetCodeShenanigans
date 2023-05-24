package TwentyOneToForty;

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 *
 * Example 1:
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 */

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {

        /**
         * Tree structure
         *          3
         *        /  \
         *      9     20
         *           /  \
         *         15    7
         */

        // building the tree
        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        three.left = nine;
        three.right = twenty;
        twenty.left = fifteen;
        twenty.right = seven;

        // testing max depth
        System.out.println("Expected: 3, Actual: " + maxDepth(three));
    }
    public static int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
}

// Definition for a binary tree node.
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
/** Pseudocode and logic
 *  Assume the functionality when writing recursive functions.
 *  This moves down the left side until it is null.
 *  When left is null right is also null so it returns 0 + 1
 *  9 returns left = 1 to root
 *
 *  going right we hit 20 which has a left.
 *  left goes to 15 which is null and return a 1 to 20
 *  20 left = 1
 *
 *  goes right from 20 to 7, 7 returns 1 to 20
 *  20 right = 1
 *
 *  20 returns 2 to root
 *  root returns 2 + 1
 */