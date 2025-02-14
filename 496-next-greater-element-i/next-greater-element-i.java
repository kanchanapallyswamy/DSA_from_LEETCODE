class Solution {
    public int[] nextGreaterElement(int[] n1, int[] a) {
         int ans[]=new int[a.length];
        Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(st.size()>0 && a[i]> a[st.peek()]){
                ans[st.pop()]=a[i];
            }
            st.push(i);
        }
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<a.length;i++){
            mp.put(a[i],ans[i]);
        }

        int res[]=new int[n1.length];
        for(int i=0;i<n1.length;i++){
            res[i]=mp.get(n1[i]);
        }
        return res;
    }
}