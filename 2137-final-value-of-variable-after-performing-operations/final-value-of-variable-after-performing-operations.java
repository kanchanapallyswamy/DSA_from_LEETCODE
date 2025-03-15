class Solution {
    public int finalValueAfterOperations(String[] oper) {
        int x=0;
       for(int i=0;i<oper.length;i++){
        if(oper[i].equals("--X"))x=x-1;
        else if(oper[i].equals("X++"))x=x+1;
        else if(oper[i].equals("X--"))x=x-1;
        else x=x+1;
       } 
       return x;
    }
}