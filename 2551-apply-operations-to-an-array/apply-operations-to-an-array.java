class Solution {
    public int[] applyOperations(int[] a) {
        for(int i=0;i<a.length-1;i++){
            if(a[i]!=a[i+1])continue;
            else if(a[i]==a[i+1]){
                a[i]=2*a[i];
                a[i+1]=0;
            }
        }
        int k=0;
        int b[]=new int[a.length];
        for(int i=0;i<b.length;i++){
            if(a[i]!=0)a[k++]=a[i];
        }
        while(k<a.length)a[k++]=0;
        return a;
    }
}