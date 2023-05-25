package FortyOneToSixty;

import com.sun.source.tree.Tree;

public class CountGoodNodesInBinaryTree {

    public static void main(String[] args) {
        Solution s = new Solution();
        /** build the tree
         *          3
         *        /  \
         *       1    4
         *      /    / \
         *     3    1   5
         */
        TreeNode e1 = new TreeNode(3);
        TreeNode e2 = new TreeNode(1);
        TreeNode e3 = new TreeNode(4);
        TreeNode e4 = new TreeNode(3);
        TreeNode e5 = new TreeNode(1);
        TreeNode e6 = new TreeNode(5);
        e1.left = e3;
        e1.right = e4;
        e2.left = e4;
        e3.left = e5;
        e3.right = e6;

        System.out.println("Expected: 4, Actual: " + s.goodNodes(e1));

    }
}

class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    public int dfs(TreeNode node, int highestNumber) {
        if(node == null) {
            return 0; // base case
        }

        int left = dfs(node.left, Math.max(highestNumber, node.val)); // search the left
        int right = dfs(node.right, Math.max(highestNumber, node.val)); // search the right
        int answer = left + right; // add the count from left and right

        if(node.val >= highestNumber) {
            answer += 1; // if the node val is >= this is a good node
        }

        return answer;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode() {
//    }
//
//    TreeNode(int val) {
//        this.val = val;
//    }
//
//    TreeNode(int val, TreeNode left, TreeNode right) {
//        this.val = val;
//        this.left = left;
//        this.right = right;
//    }
//}