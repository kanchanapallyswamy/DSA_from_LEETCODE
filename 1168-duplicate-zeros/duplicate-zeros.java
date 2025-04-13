class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> l = new ArrayList<>();
        for(var i : arr)if(i != 0)l.add(i);else {l.add(i);l.add(0);}
        for(int i = 0; i < arr.length; i++)arr[i] = l.get(i);
    }
}