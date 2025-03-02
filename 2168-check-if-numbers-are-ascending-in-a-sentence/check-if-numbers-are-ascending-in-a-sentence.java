class Solution {
    public boolean areNumbersAscending(String s) {
        String a[]=s.split("\\s+");
        int k=-1;
        for(var i:a){
            if(check_digit(i.charAt(0))) {
                if(k>=Integer.parseInt(i)) return false;
                    else k=Integer.parseInt(i);
            }
        }
        return true;
    }
    boolean check_digit(char c){
        return (c>='0' && c<='9');
    }
}