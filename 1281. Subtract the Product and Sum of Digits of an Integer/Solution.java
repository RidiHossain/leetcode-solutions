class Solution {
    public int subtractProductAndSum(int n) {
        int product=1,sum=0;
        int temp=n;
        while (true){
            if(temp==0)
                break;
            else{
                product *= temp%10;
                sum += temp%10;
                temp = temp/10;
            }

        }
        return product-sum;
    }
}