class Solution {
    public String reversePrefix(String word, char ch) {
      StringBuilder sc = new StringBuilder();
      for(int i=0;i<=word.indexOf(ch);i++){
        sc.append(word.charAt(i));
      }  
      sc.reverse();
      for(int i=word.indexOf(ch)+1;i<word.length();i++){
       sc.append(word.charAt(i));
      }
      return sc.toString();
    }
}