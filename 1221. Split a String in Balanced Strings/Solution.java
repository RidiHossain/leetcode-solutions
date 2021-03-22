class Solution {
    public int balancedStringSplit(String s) {

        int count = 0, sum = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                sum++;
            } else {
                sum--;
            }

            if (sum == 0) {
                count++;
            }

        }

        return count;

    }
}