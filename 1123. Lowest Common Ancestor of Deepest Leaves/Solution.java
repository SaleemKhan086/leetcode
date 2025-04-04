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
    private int getDepth(TreeNode root){
        if(root==null){
            return -1;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        return 1+Math.max(getDepth(root.left), getDepth(root.right));
    }
    private void dfs(TreeNode root, int depth, int maxDepth, Map<Integer,Integer> map){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            map.put(root.val, depth==maxDepth?1:0);
            return;
        }

        dfs(root.left, depth+1, maxDepth, map);
        dfs(root.right, depth+1, maxDepth, map);
        int count = 0;
        if(root.left!=null){
            count+= map.get(root.left.val);
        }
        if(root.right!=null){
            count+= map.get(root.right.val);
        }
        map.put(root.val, count);
    }
    private TreeNode lca(TreeNode root, Map<Integer, Integer>map, int count){
        if(root == null){
            return null;
        }
        
        if(map.get(root.val)==count){
            TreeNode left = lca(root.left, map, count);
            if(left!=null){
                return left;
            }
            TreeNode right = lca(root.right, map, count);
            if(right!=null){
                return right;
            }
            return root;
        }
        return null;
    }
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int depth = getDepth(root);
        Map<Integer, Integer> deepestCountMap = new HashMap<>();
        dfs(root, 0, depth, deepestCountMap);
        int deepestCount = deepestCountMap.get(root.val);

        return lca(root, deepestCountMap, deepestCount);
    }
}
