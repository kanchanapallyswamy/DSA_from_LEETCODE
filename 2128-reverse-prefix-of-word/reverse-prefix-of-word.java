class Solution {
    public String reversePrefix(String word, char ch) {
       int idx=word.indexOf(ch); 
       String k="";
       if(idx==-1)return word;
       for(int i=0;i<=idx;i++){
        k=word.charAt(i)+k;
       }
       for(int i=idx+1;i<word.length();i++){
        k+=word.charAt(i);
       }
       return k;
    }
}