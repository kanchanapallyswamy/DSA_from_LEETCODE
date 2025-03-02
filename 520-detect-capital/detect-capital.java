class Solution {
    public boolean detectCapitalUse(String w) {
        int cc=0,sc=0;
        for(var i:w.toCharArray()){
            if(Character.isUpperCase(i))cc++;
            else sc++;
        }
        return ( (sc==w.length()) || (cc==w.length()) || ((Character.isUpperCase(w.charAt(0)))&& cc==1) )  ;
    }
}