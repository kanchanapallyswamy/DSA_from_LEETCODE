class Solution {
  public int minDistance(String a, String b) {
    return helper(a, b, a.length(), b.length());
    // for(int i=0;i<ans.length;i++){
    // for(int j=0;j<ans[0].length;j++){
    // System.out.print(ans[i][j]+" ");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // System.out.println();
    // return 0;
  }
  public int helper(String a, String b, int n1, int n2) {
    int dp[][] = new int[n1 + 1][n2 + 1];
    dp[n1][n2] = 0;
    int k = n2;
    for (int i = 0; i < n2; i++) dp[n1][i] = k--;
    k = n1;
    for (int i = 0; i < n1; i++) dp[i][n2] = k--;
    for (int i = n1 - 1; i >= 0; i--) {
      for (int j = n2 - 1; j >= 0; j--) {
        if (a.charAt(i) == b.charAt(j)) dp[i][j] = dp[i + 1][j + 1];
        else dp[i][j] = 1 + Math.min(dp[i + 1][j + 1], Math.min(dp[i][j + 1], dp[i + 1][j]));
      }
    }
    return dp[0][0];
  }

}