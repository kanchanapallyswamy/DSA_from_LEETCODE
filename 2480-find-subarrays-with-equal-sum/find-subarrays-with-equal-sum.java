class Solution {
    public boolean findSubarrays(int[] a) {
            return check(a,2) ;
    }
    boolean check(int a[],int k){
        Set<Integer> st=new HashSet<>();
        int s=0;
        for(int i=0;i<k;i++)s+=a[i];
        st.add(s);
        for(int i=1;i<a.length-k+1;i++){
            s-=a[i-1];
            s+=a[i+k-1];
            if(st.contains(s))return true;
            else st.add(s);
        }
        return false;
    }
}