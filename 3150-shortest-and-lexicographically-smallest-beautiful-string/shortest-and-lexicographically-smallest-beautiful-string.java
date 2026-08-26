class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();

        int[] ones = new int[n];
        int count = 0;

        // Store positions of all 1s
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                ones[count++] = i;
            }
        }

        // Not enough 1s
        if (count < k) {
            return "";
        }

        int minLen = Integer.MAX_VALUE;
        String ans = "";

        // Consider every group of k consecutive 1s
        for (int i = 0; i + k - 1 < count; i++) {
            int start = ones[i];
            int end = ones[i + k - 1];

            int len = end - start + 1;

            String sub = s.substring(start, end + 1);

            if (len < minLen) {
                minLen = len;
                ans = sub;
            } else if (len == minLen && sub.compareTo(ans) < 0) {
                ans = sub;
            }
        }

        return ans;
    }
}