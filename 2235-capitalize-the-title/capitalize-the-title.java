class Solution {
    public String capitalizeTitle(String s) {
        String a[]=s.split(" ");
        for(var i=0;i<a.length;i++)if(a[i].length()>=3)a[i]=change(a[i]);else a[i]=a[i].toLowerCase();
        String k="";
        for(var i:a)k+=i+" ";
        return k.trim();
    }
    String change(String s){
        String k="",p="";
        if(Character.isLowerCase(s.charAt(0)) || Character.isUpperCase(s.charAt(0)) )k+=Character.toUpperCase(s.charAt(0)); 
        for(int i=1;i<s.length();i++){
            p+=s.charAt(i);
        }
        k+=p.toLowerCase();
                
        return k;
    }
    
}