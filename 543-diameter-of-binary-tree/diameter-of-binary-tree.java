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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
   height(root);
return d-1;

}
public  int height(TreeNode root ){
    if(root==null)return 0;
    int l=height(root.left);
    int r=height(root.right);
    d=Math.max(1+l+r,d);
    return 1+Math.max(l,r);
}
}