class Solution {
    public int searchInsert(int[] nums, int t) {
        int m=0,l=0,h=nums.length-1,k=-1;
        while(l<=h){
            m=l+(h-l)/2;
            if(nums[m]==t){
                return m;

            }
            else if(nums[m]<t){
                l=m+1;
            }
            else{
                h=m-1;
                k=m;
            }
        }
        if(k==-1)return nums.length;
        return k;

    }
}