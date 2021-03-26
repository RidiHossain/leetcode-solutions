class Solution {
    public String removeOuterParentheses(String S) {
        int count = 0;
        int begin=0,end=0;
        StringBuilder newStr = new StringBuilder();

        begin =0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                count++;
            }
            if (S.charAt(i) == ')') {
                count--;
            }
            if (count == 0) {
                end = i;
                newStr.append(S.substring(begin+1,end));
                begin=i+1;

            }
        }
        return newStr.toString();

    }
}