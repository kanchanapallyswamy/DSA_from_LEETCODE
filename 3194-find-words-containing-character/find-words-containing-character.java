class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].contains(x+""))l.add(i);
        }
        return l;
        

    }
}