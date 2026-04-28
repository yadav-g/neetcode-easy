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
    private List<Integer> valList;
    public List<Integer> postorderTraversal(TreeNode root) {
        valList=new ArrayList<>();
        postorder(root);
        return valList;
    }
    private void postorder(TreeNode node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        valList.add(node.val);
    }
}