class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String k="";
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0')k+="1";
            else k+="0";
        }
        return k;

    }
}