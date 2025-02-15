class Solution {
    public boolean canFinish(int n, int[][] pre) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> st=new HashSet<>();
        int ind[]=new int[n+1];
        for(int i=0;i<n;i++){
            mp.put(i,new ArrayList<>());
        }
        for(int i=0;i<pre.length;i++){
            int u=pre[i][1],v=pre[i][0];
            mp.get(u).add(v);
            mp.get(v).add(u);
            ind[v]++;
        }
        for(int i=0;i<n;i++){
            if(ind[i]==0){
                q.add(i);
                st.add(i);
            }
        }
        int c=0;
       while(q.size()>0){
        int u=q.remove();
        c++;
        for(var v:mp.get(u)){
            if(!st.contains(v)){
                ind[v]--;
                if(ind[v]==0){
                    st.add(v);
                    q.add(v);
                }
            }
        }
       }
       if(c==n)return true;
       return false;
    }
}