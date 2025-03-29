class Solution {
    public int countSubstrings(String s) {
        if(s.length()==0)return 0;
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=find(s,i,i);
            c+=find(s,i,i+1);
        }
        return c;
    }
    int find(String s,int i,int j){
        int c=0;
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            c++;
            i--;
            j++;
        }
        return c;
    }
}