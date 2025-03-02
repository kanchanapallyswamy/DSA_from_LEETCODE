class Solution {
    public boolean checkString(String s) {
        int a2=0,b2=0;
       char a[]=s.toCharArray();
       for(var i:a)if(i=='a')a2++;else b2++;
       if(a2==a.length || b2==a.length)return true;
        int a1=s.lastIndexOf('a');
        if(check__b(a,a1-1))return false;
       return true;

    }
      boolean check__b(char a[],int i){
        for(;i>=0;i--){
            if(a[i]=='b')return true;
        }
        return false;
    }
}