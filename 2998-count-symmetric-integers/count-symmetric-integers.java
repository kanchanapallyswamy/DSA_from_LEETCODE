class Solution {
    public int countSymmetricIntegers(int l, int h) {
int c=0;
      for(int i=l;i<=h;i++){
            if(find(i)){
                c++;
            }
          
        }
        return c;
        
    }
static boolean find(int n){
    int x=(int)Math.log10(n)+1;
    return (x%2==1)?false:found(n,x/2);
}
static boolean found(int n,int x){
    String k=n+"";
    int s1=0,s2=0;
    for(int i=0;i<x;i++){
        s1+=(int)k.charAt(i);
    }
    for(int i=x;i<k.length();i++)s2+=(int)k.charAt(i);
    return s1==s2;
}
}