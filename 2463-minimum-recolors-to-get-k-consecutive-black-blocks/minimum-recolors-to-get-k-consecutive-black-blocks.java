class Solution {
    public int minimumRecolors(String s, int k) {
        int max=s.length()+1,c=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='W')c++;
        }
        max=Math.min(max,c);
        for(int i=1;i<s.length()-k+1;i++){
            if(s.charAt(i-1)=='W')c--;
            if(s.charAt(i+k-1)=='W')c++;
             max=Math.min(max,c);
        }
        return max;
    }
}