class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int cnt  = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                int a1 = Math.abs(arr[i] - arr[j]);
                if(a1>a)continue;
                for(int k = j+1; k < arr.length; k++){
                    int b1 = Math.abs(arr[j] - arr[k]);
                    int c1 = Math.abs(arr[i] - arr[k]);
                    System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    if( b1 <= b && c1  <= c)cnt++;
                }
            }
        }
        return cnt;
    }
}