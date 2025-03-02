class Solution {
    public String capitalizeTitle(String s) {
        String a[]=s.split(" ");
        String k="";
        for(var i=0;i<a.length;i++){
            if(a[i].length()>=3)a[i]=change(a[i]);
            else a[i]=a[i].toLowerCase();
            k+=a[i]+" ";
        }
        return k.trim();
    }
    String change(String s){
        String k="";
        if(Character.isLowerCase(s.charAt(0)) || Character.isUpperCase(s.charAt(0)) )k+=Character.toUpperCase(s.charAt(0)); 
        k+=s.substring(1).toLowerCase();       
        return k;
    }
    
}