class Solution {
    public String convert(String s, int n) {
        String a[]=new String[n];
        for(int i=0;i<a.length;i++){
            a[i]="";
        }
        int i=0;
        while(i<s.length()){
            for(int k=0;k<n && i<s.length();k++){
                a[k]+=s.charAt(i++);
            }
            for(int k=n-2;k>0 && i<s.length();k--){
                a[k]+=s.charAt(i++);
            }
        }
        String ans="";
        for(var p:a)ans+=p;
        return ans;
    }
}