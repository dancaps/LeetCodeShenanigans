package FortyOneToSixty;

/**
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or
 * may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 * Input: root = [1,2,3,4,5]
 * Output: 3
 * Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
 *
 * Example 2:
 * Input: root = [1,2]
 * Output: 1
 */

public class DiameterOfABinaryTree {
    int largestPath; // holds the largest path

    public int diameterOfBinaryTree(TreeNode root) {
        treeDiameter(root); // finds the largest path
        return largestPath; // returns the largest path
    }

    public int treeDiameter(TreeNode node) {
        if(node == null) {
            return 0; // base case
        }

        int left = treeDiameter(node.left); // traverses the left side
        int right = treeDiameter(node.right); // traverses the right side

        largestPath = Math.max(largestPath, left + right); // updates the largest path

        return Math.max(left, right) + 1; // returns the longest path between the left and the right and adds this node
    }
}
