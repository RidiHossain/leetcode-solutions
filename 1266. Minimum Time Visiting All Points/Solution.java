class Solution {

    public int min(int a, int b) {
        if (a <= b) {
            return a;
        } else {
            return b;
        }
    }
    public int distance(int a,int b){

        int dis = a -b;
        if(dis<0){
            return dis*(-1);
        }
        return dis;

    }
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for(int i=0;i<points.length-1;i++){
            if(distance(points[i][0],points[i+1][0])==distance(points[i][1],points[i+1][1])){
                sum+=distance(points[i][0],points[i+1][0]);
            }else{
                sum+= distance(distance(points[i][0],points[i+1][0]),distance(points[i][1],points[i+1][1]))+ min(distance(points[i][0],points[i+1][0]),distance(points[i][1],points[i+1][1]));

            }
        }
        return sum;
    }
}