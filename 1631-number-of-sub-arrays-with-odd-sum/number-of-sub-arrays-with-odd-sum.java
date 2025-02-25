class Solution {
    public int numOfSubarrays(int[] a) {
        int n = a.length;
        int oddCount = 0, evenCount = 1; // evenCount starts at 1 (empty subarray)
        int sum = 0, result = 0;
        int mod = (int) 1e9 + 7;
        
        for (int num : a) {
            sum += num;
            
            if (sum % 2 == 1) { 
                // If current prefix sum is odd, it means:
                // - oddCount subarrays become even
                // - evenCount subarrays become odd
                result = (result + evenCount) % mod;
                oddCount++;
            } else {
                // If current prefix sum is even:
                // - oddCount subarrays remain odd
                result = (result + oddCount) % mod;
                evenCount++;
            }
        }
        
        return result;
    }
}
