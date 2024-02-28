/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int getHeight(TreeNode root) {
        if(root==null){
            return 0;
        }
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }

    Integer getBottomLeft(TreeNode root, int level, int height) {
        
        if(root==null){
            return null;
        }

        if(level == height) {
            return root.val;
        }
        Integer left = getBottomLeft(root.left, level+1, height);
        if(left==null){
            return getBottomLeft(root.right, level+1, height);
        }
        return left;
    }

    public int findBottomLeftValue(TreeNode root) {
        int height = getHeight(root);
        return getBottomLeft(root, 1, height);
    }
}
