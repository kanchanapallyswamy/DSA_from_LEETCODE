class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len=0,p=0;
        if(s.length()%k==0)len=s.length()/k;
        else len=(s.length()/k)+1;
        String a[]=new String[len];
        int i=0;
        for( i=0;i<s.length();i+=k){
            String k1="";
             if(i+k <=s.length())k1=s.substring(i,i+k);
                else {a[p++]="";break;}
                a[p++]=k1+"";
        }
        if(a[a.length-1].length()==k)return a;
        else{
           String ans=s.substring(i);
           String u=fill+"";
            a[a.length-1]=ans+u.repeat(k-ans.length());
        }
        // for(var i:a)System.out.print(i+" ");
        return a;

    }
}