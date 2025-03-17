class Solution {
    public boolean isPrefixString(String s, String[] w) {
        String x="";
        for(int i=0;i<w.length;i++){
          x+=w[i];
          if(x.length()>=s.length()) break;
        }
         return x.equals(s);
        
    }
}