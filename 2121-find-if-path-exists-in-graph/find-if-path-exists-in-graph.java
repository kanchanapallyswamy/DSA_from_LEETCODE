class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        List<Integer> l=new ArrayList<>();
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++)mp.put(i,new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0],v=edges[i][1];
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        int p[]=new int[n];
        Arrays.fill(p,-1);
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> st=new HashSet<>();
        q.add(s);
        st.add(s);
        while(q.size()>0){
            int u=q.remove();
            for(var v:mp.get(u)){
                if(!st.contains(v)){
                    st.add(v);
                    q.add(v);
                    p[v]=u;
                }
            }

        }
        while(d!=-1){
            l.add(d);
            d=p[d];
        }
        if(!l.contains(s))return false;
        // for(var i:p)
        // System.out.print(i+" ");
        return true;
    }
}