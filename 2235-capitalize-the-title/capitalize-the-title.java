class Solution {
    public String capitalizeTitle(String s) {
        String a[]=s.split(" ");
        for(var i=0;i<a.length;i++)if(a[i].length()>=3)a[i]=change(a[i]);else a[i]=change_lower(a[i]);
        String k="";
        for(var i:a)k+=i+" ";
        return k.trim();
    }
    String change(String s){
        String k="";
        for(var i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i==0 && Character.isLowerCase(c))k+=Character.toUpperCase(c);
            else if(i==0 && Character.isUpperCase(c) ) k+=c;
           else  if(Character.isUpperCase(c) )k+=Character.toLowerCase(c);
           else k+=c;
            
        }
        return k;
    }
    String change_lower(String s){
        String k="";
        for(var i:s.toCharArray()){
            if(Character.isUpperCase(i))k+=Character.toLowerCase(i);
            else k+=i;
        }
        return k;
    }
}