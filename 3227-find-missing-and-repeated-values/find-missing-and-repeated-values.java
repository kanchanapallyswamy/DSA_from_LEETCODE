class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int a[]=new int[2];
        int s=0;
        int r=grid.length;
        int c=grid[0].length;
        for(int i=1;i<=r*c;i++)s=s^i;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int k=grid[i][j];
                if(st.add(k)){
                    s=s^k;
                }
                else{
                    a[0]=k;
                }
            }
        }
        a[1]=s;
        return a;
        
    }
}