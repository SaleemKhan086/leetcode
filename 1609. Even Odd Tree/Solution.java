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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int currLevel = 0;
        int currLevelCount = 1;

        while(!q.isEmpty()) {
            TreeNode prevNode = null;
            int nextLevelCount = 0;
            while(currLevelCount-- > 0) {
                TreeNode currNode = q.remove();

                if(currLevel%2 == 0) {
                    if(currNode.val%2 != 1 ){
                        return false;
                    }
                    if(prevNode!=null && currNode.val<=prevNode.val){
                        return false;
                    }
                }
                else {
                    if(currNode.val%2 != 0 ){
                        return false;
                    }
                    if(prevNode!=null && currNode.val>=prevNode.val){
                        return false;
                    }
                }
                
                if(currNode.left!=null){
                    q.add(currNode.left);
                    nextLevelCount++;
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                    nextLevelCount++;
                }
                prevNode = currNode;
            }
            currLevel++;
            currLevelCount = nextLevelCount;
        }

        return true;
    }
}
