class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int mid = n / 2;

        int diff = 0;
        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);

            if (i < mid) {
                if (c == '?') {
                    leftQ++;
                } else {
                    diff += c - '0';
                }
            } else {
                if (c == '?') {
                    rightQ++;
                } else {
                    diff -= c - '0';
                }
            }
        }

        int qDiff = rightQ - leftQ;

        // If the number of '?' difference is odd,
        // Alice can always force a win.
        if (qDiff % 2 != 0) {
            return true;
        }

        // Bob can win only if the fixed-digit difference
        // exactly compensates for the '?' difference.
        return diff != 9 * qDiff / 2;
    }
}