class Solution {
    public boolean isPrefixString(String s, String[] w) {
        String k="";
        for(var i=0;i<w.length;i++){
            k+=w[i];
            if(k.equals(s))return true;
            if(i==w.length-1 && !k.equals(s))return false;
        }
        return true;
    }
}