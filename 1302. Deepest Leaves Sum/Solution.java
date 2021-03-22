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
    public int deepestLeavesSum(TreeNode root) {

        Queue<Pair<TreeNode,Integer>> myQueue = new LinkedList<>();

        myQueue.add(new Pair<>(root,0));
        Map<Integer,Integer> myMap = new HashMap<>();
        while (!myQueue.isEmpty()){
            Pair<TreeNode,Integer> temp = myQueue.poll();
            if(myMap.containsKey(temp.getValue())){
                myMap.put(temp.getValue(),myMap.get(temp.getValue())+temp.getKey().val);
            }else{
                myMap.put(temp.getValue(),temp.getKey().val);
            }
            //myMap.put(temp.getValue(),temp.getKey().val);
            if(temp.getKey().left!=null){
                myQueue.add(new Pair<>(temp.getKey().left,temp.getValue()+1));
            }
            if(temp.getKey().right!=null){
                myQueue.add(new Pair<>(temp.getKey().right,temp.getValue()+1));
            }

        }

        int deepest=Integer.MIN_VALUE;

        for(Integer num:myMap.keySet()){
            if(num>=deepest){
                deepest = num;
            }
        }

        int sum=0;

        for (Integer num:myMap.keySet()){
            if(num==deepest){
                sum+=myMap.get(num);
            }
        }

        return sum;

    }
}