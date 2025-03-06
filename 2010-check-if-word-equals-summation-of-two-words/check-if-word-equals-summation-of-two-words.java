class Solution {
    public boolean isSumEqual(String s1, String s2, String s3) {
        char c='a';
        Map<Character,Integer> mp=new HashMap<>();
        for(var i=0;i<26;i++){
            mp.put(c++,i);
        }
        String x="",y="",z="";
        int x1=0,y1=0,z1=0;
        for(var i:s1.toCharArray())x+=mp.get(i);
        for(var i:s2.toCharArray())y+=mp.get(i);
        for(var i:s3.toCharArray())z+=mp.get(i);
        x1=Integer.parseInt(x);
        y1=Integer.parseInt(y);
        z1=Integer.parseInt(z);
        System.out.println(x+" "+y+" "+z);
        return x1+y1==z1;
    }
}