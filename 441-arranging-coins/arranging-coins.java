class Solution {
    public int arrangeCoins(int n) {
        long s=0;
        for(int i=1;i<=n;i++){
            s+=i;
            if(s==n)return i;
             if(s>n)return i-1;
        }
        return 0;
    }
}