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
class Solution {

    private TreeNode addRow(TreeNode root, int val, int depth){
        if(root==null){
            return root;
        }
        
        if(depth==2){
            root.left = new TreeNode(val, root.left, null);
            root.right = new TreeNode(val, null, root.right);
            return root;
        }
        root.left = addRow(root.left, val, depth-1);
        root.right = addRow(root.right, val, depth-1);

        return root;
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            return new TreeNode(val, root, null);
        }
        return addRow(root, val, depth);
    }
}
