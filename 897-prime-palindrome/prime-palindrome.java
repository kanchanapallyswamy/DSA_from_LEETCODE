class Solution {
    public int primePalindrome(int n) {
        while (true) {
            if (palindrome(n)&& prime(n))
                return n;
            n++;
            if (10_000_000 < n && n < 100_000_000)
                n= 100_000_000;
        }
    }
    public boolean prime(int num) {
       if (num <= 1) return false;  
        if (num == 2) return true; 
        if (num % 2 == 0) return false; 
        for (int i = 3; i * i <= num; i += 2) {  
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean palindrome(int N) {
         int rev = 0;
        int Number = N;
        while (N > 0) {
            int lastD = N % 10;
            rev = rev * 10 + lastD;
            N = N / 10;
        }
        return rev == Number;
    }
}