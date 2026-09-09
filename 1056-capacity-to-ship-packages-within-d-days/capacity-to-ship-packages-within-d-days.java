class Solution {
    public static boolean ispossible(int [] weights,int days,int cap){
        int took=0;
        for(int val:weights){
            if(val>cap){
                return false;
            }
            if(val+took>cap){
                days-=1;
                took=0;
            }
            took+=val;
            if(days==0){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=Integer.MAX_VALUE;
        while(l<=r){
            int m=l+(r-l)/2;
            if(ispossible(weights,days,m)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}