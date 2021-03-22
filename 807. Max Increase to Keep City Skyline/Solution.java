class Solution {
    public int min(int a,int b){
        if(a<=b){
            return a;
        }else {
            return b;
        }
    }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] topDown = new int[grid[0].length];
        int[] leftRight = new int[grid.length];


        for(int i=0;i<grid[0].length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]>=max){
                    max=grid[j][i];
                }
            }
            topDown[i] = max;
        }

        for(int i=0;i<grid.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]>=max){
                    max=grid[i][j];
                }
            }
            leftRight[i] = max;
        }

        int sum=0;
        for(int row=0;row<grid.length;row++){
            for(int column=0;column<grid[row].length;column++){
                int temp=min(topDown[column],leftRight[row])-grid[row][column];
                if(temp<0){
                    temp *= -1;
                }
                sum+=temp;
            }

        }

        return sum;
    }
}