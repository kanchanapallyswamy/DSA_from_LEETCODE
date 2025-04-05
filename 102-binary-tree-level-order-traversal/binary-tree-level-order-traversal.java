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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        if(root==null)return outer;
        Map<Integer,List<Integer>> mp = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,root));
        mp.put(0,new ArrayList<>());
        mp.get(0).add(root.val);
        while(!q.isEmpty()){
            int n = q.size();
            Pair p = q.poll();
            int rem_level = p.level;
            TreeNode rem_node = p.node;
            if(rem_node.left!=null){
                q.add(new Pair(rem_level+1 , rem_node.left));
                mp.putIfAbsent(rem_level+1,new ArrayList<>());
                mp.get(rem_level+1).add(rem_node.left.val);
            }
               if(rem_node.right!=null){
                q.add(new Pair(rem_level+1 , rem_node.right));
                mp.putIfAbsent(rem_level+1,new ArrayList<>());
                mp.get(rem_level+1).add(rem_node.right.val);
            }
        }
        for(int i=0;i<mp.size();i++){
            if(i%2 == 0)inner.addAll(mp.get(i));
            else inner.addAll(mp.get(i));
            outer.add(inner);
            inner = new ArrayList<>();
        }
    return outer;
    }
}
class Pair{
    int level;
    TreeNode node;
    public Pair(int level , TreeNode node){
        this.node = node;
        this.level = level;
    }

}