class Solution {
    public int countWords(String[] w1, String[] w2) {
        int c=0;
        Map<String,Integer> mp=new HashMap<>();
        Map<String,Integer> mp1=new HashMap<>();
        for(var i:w1)mp.put(i,1+mp.getOrDefault(i,0));
        for(var i:w2){
           mp1.put(i,1+mp1.getOrDefault(i,0));
        }
        for(var i:mp.entrySet()){
            if(i.getValue()==1 && mp1.containsKey(i.getKey()) && mp1.get(i.getKey())==1)c++;
        }
        return c;
    }
}