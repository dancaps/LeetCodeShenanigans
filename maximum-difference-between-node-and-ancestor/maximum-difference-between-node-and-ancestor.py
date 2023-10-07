# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxAncestorDiff(self, root: Optional[TreeNode]) -> int:
        '''
        Do I go from the top or bottom? Start at the top and move down
        What is the input? The next node, the max seen so far, the min seen so far
        What happens in the logic?
            update the max and min
            do an abs of the difference and store that in the max global variable
            call the left and right
        What do I return? don't return anything
        '''

        self.max_diff = 0

        def helper(node, maxv, minv):
            if node == None:
                return

            maxv = max(maxv, node.val)
            minv = min(minv, node.val)

            self.max_diff = max(self.max_diff, abs(maxv - minv))

            helper(node.left, maxv, minv)
            helper(node.right, maxv, minv)
            
        helper(root, root.val, root.val)
        
        return self.max_diff