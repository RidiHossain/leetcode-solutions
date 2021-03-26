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
    public TreeNode bstToGst(TreeNode root) {

        Queue<TreeNode> myQueue = new LinkedList<>();

        myQueue.add(root);

        List<Integer> myList = new ArrayList<>();
        while (!myQueue.isEmpty()) {
            TreeNode temp  = myQueue.poll();
            if(temp!=null){
                myList.add(temp.val);
            }


            if(temp.left!=null){
                myQueue.add(temp.left);
            }
            if(temp.right!=null){
                myQueue.add(temp.right);
            }
        }

        int[] arr = new int[myList.size()];
        int i=0;
        for(int num:myList){
            arr[i++]=num;
        }

        Arrays.sort(arr);


        Map<Integer,Integer> myMap = new HashMap<>();

        int sum=0;
        for(i=arr.length-1;i>=0;i--){
            sum+=arr[i];
            myMap.put(arr[i], sum);
        }

        myQueue.add(root);
        while (!myQueue.isEmpty()) {
            TreeNode temp  = myQueue.poll();
            if(temp!=null){
                temp.val = myMap.get(temp.val);
            }

            if(temp.left!=null){
                myQueue.add(temp.left);
            }
            if(temp.right!=null){
                myQueue.add(temp.right);
            }
        }


        return root;
    }
}