class Solution {
    public int numberOfSteps (int num) {

        int n = num;

        int numOfOne = getNumofOne(n);
        int numOfBit = getNumOfBit(n);

        return numOfBit-1+numOfOne;

    }

    public int getNumofOne(int n){
        int count =0 ;
        while ( n != 0 ) {
            n = n & ( n - 1 ) ;
            count++;
        }
        return count;
    }

    public int getNumOfBit(int n){

        return (int)Math.floor((Math.log(n)/Math.log(2))+1);
    }
}