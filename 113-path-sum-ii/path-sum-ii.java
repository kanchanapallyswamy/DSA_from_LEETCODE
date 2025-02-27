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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> outer=helper(root);
        List<List<Integer>> ans=new ArrayList<>();
        for(var i:outer){
            if(check(i,targetSum))ans.add(i);
        }
        return ans;
    }
    List<List<Integer>> helper(TreeNode root){
        List<List<Integer>> outer=new ArrayList<>();
        if(root==null)return outer;
        List<Integer> inner=new ArrayList<>();
        inner.add(root.val);
        help(root,outer,inner);
        return outer;
    }
    void help(TreeNode root,List<List<Integer>> outer, List<Integer> inner){
        if(root.left==null && root.right==null){
            outer.add(new ArrayList<>(inner));
        }
        if(root.left!=null){
            inner.add(root.left.val);
            help(root.left,outer,inner);
            inner.remove(inner.size()-1);
        }
        if(root.right!=null){
            inner.add(root.right.val);
            help(root.right,outer,inner);
            inner.remove(inner.size()-1);
        }
        return ;
    }
    boolean check(List<Integer> l,int x){
        int s=0;
        for(var i:l)s+=i;
        return s==x;
    }
}