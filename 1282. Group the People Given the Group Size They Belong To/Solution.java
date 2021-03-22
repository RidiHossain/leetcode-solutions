class Solution {
    List<List<Integer>> myList = new ArrayList<>();
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>> myMap = new HashMap<>();

        for(int i=0;i<groupSizes.length;i++){

            if(myMap.containsKey(groupSizes[i])){
                myMap.get(groupSizes[i]).add(i);
            }else {
                List<Integer> tempList=new ArrayList<>();
                tempList.add(i);
                myMap.put(groupSizes[i],tempList);
            }
        }
        int i=0;
        for(Integer key:myMap.keySet()){

            int num = myMap.get(key).size()/key;

            for(int j=0;j<num;j++){
                int ind =j*key;
                myList.add(i,new ArrayList<>());

                for(int k=ind;k<ind+key;k++){
                    myList.get(i).add(myMap.get(key).get(k));
                }
                i++;
            }
        }

        return myList;

    }
}