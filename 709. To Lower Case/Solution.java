class Solution {
    public String toLowerCase(String str) {

        StringBuilder myString = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                myString.append((char)('a' + ch - 'A'));
            } else {
                myString.append(ch);
            }

        }
        return myString.toString();
    }
}