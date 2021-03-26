/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode maxBinary(int[] array, int start, int end, int maxInd, TreeNode root){



        if(start<=maxInd-1){
            root.left = maxBinary(array, start, maxInd-1, findMaxInd(array, start,maxInd-1),new TreeNode(array[findMaxInd(array, start,maxInd-1)]));
        }
        if(maxInd+1<=end){
            root.right = maxBinary(array, maxInd+1,end, findMaxInd(array, maxInd+1,end), new TreeNode(array[findMaxInd(array, maxInd+1,end)]));
        }
        return root;

    }

    private int findMaxInd(int[] array, int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(array[i]>=array[max]){
                max = i;
            }
        }
        return max;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if(nums.length==0){
            return null;
        }

        int maxInd = findMaxInd(nums, 0,nums.length-1);

        return maxBinary(nums, 0, nums.length-1, maxInd, new TreeNode(nums[maxInd]));


    }
}