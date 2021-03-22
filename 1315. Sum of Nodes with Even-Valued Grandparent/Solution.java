/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Ancestors {
    TreeNode par;
    TreeNode grandPar;

    public Ancestors(TreeNode par, TreeNode grandPar) {
        this.par = par;
        this.grandPar = grandPar;
    }
}
class Solution {
    public int sumEvenGrandparent(TreeNode root) {

        Queue<Pair<TreeNode, Ancestors>> myQueue = new LinkedList<>();

        myQueue.add(new Pair<>(root, new Ancestors(null, null)));
        int sum = 0;
        while (!myQueue.isEmpty()) {
            Pair<TreeNode, Ancestors> temp = myQueue.poll();

            if (temp.getValue().grandPar!=null && temp.getValue().grandPar.val % 2 == 0) {
                sum+=temp.getKey().val;
            }
            if (temp.getKey().left != null) {
                myQueue.add(new Pair<>(temp.getKey().left, new Ancestors(temp.getKey(),temp.getValue().par)));
            }
            if(temp.getKey().right != null){
                myQueue.add(new Pair<>(temp.getKey().right, new Ancestors(temp.getKey(),temp.getValue().par)));

            }


        }

        return sum;

    }
}