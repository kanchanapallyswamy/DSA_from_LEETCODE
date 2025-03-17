class Solution {
    public boolean isValid(String s) {
        if(s.length()<3)return false;
        boolean l_d=false,v=false,c=false;
        if(!check(s))return false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isVowel(ch)){
                v=true;
            }
            if(isConsonant(ch)){
                c=true;
            }
        }
        if(v&&c)return true;
        else return false;
    }
    boolean check(String s){

        int c=0;
        for(var i:s.toCharArray()){
            if((i>='a' && i<='z')  || ( i>='A' && i<='Z') || (i>='0' && i<='9')) c++;
        }
        if(c==s.length())return true;
        else return false;
    }

    boolean isVowel(char ch){
        char c=Character.toLowerCase(ch);
        if( c=='a' ||c=='e' || c=='i' || c=='o' || c=='u')return true;
        else return false;
    }
    boolean isConsonant(char ch){
        char c=Character.toLowerCase(ch);
        if(!isVowel(c) && ! ( c>='0' && c<='9'))return true;
        else return false;
    }
}