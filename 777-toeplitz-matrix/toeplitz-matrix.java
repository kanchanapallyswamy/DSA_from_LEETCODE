class Solution {
    public boolean isToeplitzMatrix(int[][] m) {
        int r=m.length,c=m[0].length;
        for(int a=0,b=0;a<r;a++){
            int i=a,j=b;
            Set<Integer> st=new HashSet<>();
            while(i<r && j<c && i>=0 && j>=0){
                st.add(m[i++][j++]);
            }
            System.out.println(st);
            if(st.size()>1 )return false;
        }
        for(int b=1,a=0;b<c;b++){
            int i=a,j=b;
            Set<Integer> st=new HashSet<>();
            while(i<r && j<c && i>=0 && j>=0){
                st.add(m[i++][j++]);
            }
            System.out.println(st);
            if(st.size()>1)return false;
        }
    return true;
    }
}