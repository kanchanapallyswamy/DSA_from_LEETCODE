class Solution {
    public int[] dailyTemperatures(int[] a) {
        int ans[]=new int[a.length];
        // Arrays.fill(ans,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(st.size()>0 && a[i]>a[st.peek()]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
      
        return ans;
    }
}