class Solution {
    public int maximumCount(int[] nums) {
        int p=0,n=0;
        for(var i:nums)if(i<0)n++;else if(i>0)p++;
        return Math.max(n,p);
    }
}