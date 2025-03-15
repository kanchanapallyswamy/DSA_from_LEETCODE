class Solution {
    public int prefixCount(String[] a, String s) {
        int c=0;
        for(var i:a){
            if(i.startsWith(s))c++;
        }
        return c;
    }
}