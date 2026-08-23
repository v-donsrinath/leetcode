class Solution {
    public boolean sumGame(String num) {

        int n = num.length();
        int half = n / 2;

        int leftSum = 0;
        int rightSum = 0;

        int leftQ = 0;
        int rightQ = 0;

        // First half
        for (int i = 0; i < half; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                leftQ++;
            } else {
                leftSum += ch - '0';
            }
        }

        // Second half
        for (int i = half; i < n; i++) {
            char ch = num.charAt(i);

            if (ch == '?') {
                rightQ++;
            } else {
                rightSum += ch - '0';
            }
        }

        // Odd number of '?' -> Alice can always win
        if ((leftQ + rightQ) % 2 == 1) {
            return true;
        }

        int diff = leftSum - rightSum;

        int target = 9 * (rightQ - leftQ) / 2;

        return diff != target;
    }
}