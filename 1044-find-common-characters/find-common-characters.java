class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> mp = new HashMap<>();
        List<String> l = new ArrayList<>();
        for(var p : words[0].toCharArray())mp.put(p,1+mp.getOrDefault(p,0));
        Set<Character> st = new HashSet<>();
        for(var i : words[0].toCharArray())st.add(i);
        for(var i : st){
                    int cnt =check(i , mp.get(i) , words);
                    while(cnt-->0)l.add(i+"");
                }
                return l;
    }
    int check(char c , int min , String [] words){
        for(int i = 1; i < words.length; i++){
            int cnt = 0;
            for(var j : words[i].toCharArray()){
                if(j == c)cnt++;
            }
            min = Math.min(min ,cnt);
        }
        return min;
    }
}