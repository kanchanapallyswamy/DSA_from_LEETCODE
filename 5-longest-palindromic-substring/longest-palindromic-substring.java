class Solution {
    public String longestPalindrome(String s) {
        int n=s.length(),si=0,ei=0;
        for(int i=0;i<s.length();i++){
            int op1=find(s,i,i);
            int op2=find(s,i,i+1);
            int max=Math.max(op1,op2);
            if(max > ei-si){
                si=i-(max-1)/2;
                ei=i+max/2;
            }
        }
        return s.substring(si,ei+1);
       
    }
    int find(String s,int i,int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
}