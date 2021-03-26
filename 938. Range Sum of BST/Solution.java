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
    public int rangeSumBST(TreeNode root, int L, int R) {
        Queue<TreeNode> myQueue = new LinkedList<>();

        myQueue.add(root);
        int sum=0;
        while (!myQueue.isEmpty()) {
            TreeNode temp = myQueue.poll();
            if (temp != null) {
                if (temp.val >= L && temp.val <= R) {
                    sum += temp.val;
                }

                if (temp.left != null) {
                    myQueue.add(temp.left);
                }
                if (temp.right != null) {
                    myQueue.add(temp.right);
                }
            } else {
                return sum;
            }
        }

        return sum;

    }
}