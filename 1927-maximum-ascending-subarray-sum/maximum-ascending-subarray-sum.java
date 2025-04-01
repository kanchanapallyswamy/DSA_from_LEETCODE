class Solution {
    public int maxAscendingSum(int[] a) {
        int cs=a[0],ms=a[0],n=a.length,max=a[0];
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                cs+=a[i];
            }
            else {
                max=Math.max(max,cs);
                cs=a[i];
            }
        }
        return Math.max(max,cs);
                
    }
    
}