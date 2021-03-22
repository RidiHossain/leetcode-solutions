class Solution {
    public String defangIPaddr(String address) {
        System.out.println(address);
        char[] result = new char[address.length()+6];
        int j =0;
        for (int i=0;i<address.length();i++) {
            if (address.charAt(i) == '.') {
                result[j++]= '[';
                result[j++] = '.';
                result[j++] = ']';
            } else {
                result[j++] = address.charAt(i);
            }
        }

        String res = new String(result);
        return res;
    }
}