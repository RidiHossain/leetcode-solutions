class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        Map<Integer, List<Integer>> myMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(myMap.containsKey(nums[i])){
                myMap.get(nums[i]).add(i);
            }else {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                myMap.put(nums[i],temp);
            }
        }

        Arrays.sort(nums);
        int[] count = new int[nums.length];
        count[0]=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count[i]=count[i-1];
            }else {
                count[i] = i;
            }
        }

        int[] res = new int[nums.length];



        int i=0;
        while (i<nums.length){
            int t = i;
            for(int j=0;j<myMap.get(nums[t]).size();j++){
                res[myMap.get(nums[t]).get(j)] = count[i++];
            }
        }


        return res;
    }
}