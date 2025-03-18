class Solution {
    int [][]dp=new int[501][501];
    public int minDistance(String s1, String s2) {
        for(int i=0;i<501;i++)Arrays.fill(dp[i],-1);
        return find(s1.length()-1,s2.length()-1,s1,s2);
    }
    int find(int i,int j,String s1,String s2){
        if(i < 0)return j+1;
        if(j < 0)return i+1;
        if(dp[i][j]!=-1)return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))return dp[i][j]=find(i-1,j-1,s1,s2);
        int insert=find(i,j-1,s1,s2);
        int delete=find(i-1,j,s1,s2);
        int replace=find(i-1,j-1,s1,s2);
        return dp[i][j]=1+Math.min(  insert , Math.min( delete , replace ));
            }
}