class Solution {
    public boolean isToeplitzMatrix(int[][] m) {
       Set<Integer> inner=new HashSet<>();
        int r=m.length,c=m[0].length;

        // int j=0;
    
        for(int si=0,sj=0;si<r;si++){
            int i=si,j=sj;
            while(i>=0 && j>=0 && i<r && j<c){
                inner.add(m[i][j]);
                i++;j++;
            }
            if(inner.size()>=2)return false;
            inner=new HashSet<>();
        }
        for(int sj=1,si=0;sj<c;sj++){
            int i=si,j=sj;
             while(i>=0 && j>=0 && i<r && j<c){
                inner.add(m[i][j]);
                i++;j++;
            }
           if(inner.size()>=2)return false;
            inner=new HashSet<>();

        }
        
        return true;

    }
    
}