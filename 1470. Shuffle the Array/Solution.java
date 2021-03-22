class Solution {
    public int[] shuffle(int[] nums, int n) {

        int ind1 = 0;
        int ind2 = n;
        int[] resultArray = new int[2*n];
        int i = 0;

        while (ind1 < n) {
            resultArray[i++] = nums[ind1++];
            resultArray[i++] = nums[ind2++];
        }
        return resultArray;
    }
}