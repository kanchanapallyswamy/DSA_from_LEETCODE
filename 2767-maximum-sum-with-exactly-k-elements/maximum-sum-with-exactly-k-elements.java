class Solution {
    public int maximizeSum(int[] a, int k) {
        Arrays.sort(a);
        int x=a[a.length-1];
        int s=0;
        while(k-->0){
            int y=x;
            s+=y;
            x++;
        }
        return s;
    }
}