class Solution {
    public int trap(int[] height) {
     int i=0,j=height.length-1,ans=0;

     int lmax=height[0],rmax=height[height.length-1];

     while(i<=j){
            if(lmax<rmax){
                lmax=Math.max(height[i],lmax);
                 ans+=lmax-height[i];
                i++;
            }
            else{
                rmax=Math.max(rmax,height[j]);
                 ans+=rmax-height[j];
                j--;
            }
     }   
     return ans;
    }
}