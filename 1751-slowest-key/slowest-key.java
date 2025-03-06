class Solution {
    public char slowestKey(int[] a, String s) {
        char c='a';int max=0;
        Map<Character,Integer> mp=new HashMap<>(); 
       for (int i = 0; i < a.length; i++) {
            int x = (i == 0) ? a[i] : a[i] - a[i - 1];
            char p = s.charAt(i);
            mp.put(p, Math.max(mp.getOrDefault(p, 0), x));
        }
        System.out.println(mp);
        for(var i:mp.entrySet())max=Math.max(max,i.getValue());
        for(var i:mp.entrySet())if(max==i.getValue() && i.getKey()>c)c=i.getKey();
        return c;
    }
}