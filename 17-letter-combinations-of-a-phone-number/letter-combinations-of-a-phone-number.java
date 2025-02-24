class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();
        if(digits.length()==0)return l;
        Map<Character,List<Character>> mp=new HashMap<>();
        for(char i='2';i<='9';i++){
            mp.put(i,new ArrayList<>());
        }
        for(char c='a';c<='c';c++){
            mp.get('2').add(c);
        }
        for(char c='d';c<='f';c++){
            mp.get('3').add(c);
        }
        for(char c='g';c<='i';c++){
            mp.get('4').add(c);
        }
        for(char c='j';c<='l';c++){
            mp.get('5').add(c);
        }
        for(char c='m';c<='o';c++){
            mp.get('6').add(c);
        }
        for(char c='p';c<='s';c++){
            mp.get('7').add(c);
        }
        for(char c='t';c<='v';c++){
            mp.get('8').add(c);
        }
        for(char c='w';c<='z';c++){
            mp.get('9').add(c);
        }
        int len=digits.length();
        Queue<String> q=new LinkedList<>();
        char k=digits.charAt(0);
        for(var i: mp.get(k)){
            q.add(i+"");
        }
        for(int i=1;i<digits.length();i++){
            char k1=digits.charAt(i);
            int n=q.size();
            while(n-->0){
                String h=q.remove();
                for(var p:mp.get(k1)){
                    q.add(h+""+p);
                }
            }
        }
        while(!q.isEmpty()){
            l.add(q.remove());
        }

        return l;


        

        

    }
}