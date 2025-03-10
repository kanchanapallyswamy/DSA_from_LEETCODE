class Solution {
    public int[] numberOfPairs(int[] a) {
        Set<Integer> st=new HashSet<>();
        for(var i:a)st.add(i);
        int p=0,r=0;
        for(var i:st){
            int x=i,c=0;
            for(var j:a){
                if(j==x)c++;
            }
            p+=c/2;
            r+=c%2;
        }
        return new int[]{p,r};
    }
}