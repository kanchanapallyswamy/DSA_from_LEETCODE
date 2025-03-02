class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] nums1, int[][] nums2) {
        List<List<Integer>> outer=new ArrayList<>();
        Set<Integer> seen = new HashSet<>(); 
        for(int i=0;i<nums1.length;i++){
           int x=nums1[i][0];
            List<Integer> inner=new ArrayList<>();
            int c=-1;
           for(int j=0;j<nums2.length;j++){
            if(x==nums2[j][0]){
                inner.add(nums2[j][0]);
                inner.add(nums1[i][1]+nums2[j][1]);
                c=9;
                seen.add(x); 
                break;
            }
           }
           if(c==-1){
            inner.add(nums1[i][0]);inner.add(nums1[i][1]);
           }
           
            outer.add(inner);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (!seen.contains(nums2[i][0])) {
                List<Integer> inner = new ArrayList<>();
                inner.add(nums2[i][0]);
                inner.add(nums2[i][1]);
                outer.add(inner);
            }
        }
        Collections.sort(outer , (x,y) ->{
            return x.get(0)-y.get(0);
        });

        return outer;
    }
}