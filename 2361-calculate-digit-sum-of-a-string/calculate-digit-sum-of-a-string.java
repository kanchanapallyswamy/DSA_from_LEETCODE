class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            s = change(s, k);
        }
        return s;
    }

    String change(String s, int k) {
        StringBuilder sum = new StringBuilder();
        for (int i = 0; i < s.length(); i += k) {
            int groupSum = 0;
            for (int j = i; j < i + k && j < s.length(); j++) {
                groupSum += s.charAt(j) - '0';
            }
            sum.append(groupSum);
        }
        return sum.toString();
    }
}
