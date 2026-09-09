class Solution {
    public static boolean ispossible(int[] dist,double hour,int speed){
        int n=dist.length;
        double travel=0.0;
        for(int i=0;i<dist.length;i++){
            int val=dist[i];
            if(i==dist.length-1){
                travel+=(double)val/speed;
            }
            else{
                travel+=(val+speed-1)/speed;
            }
        }
        
        if(travel>hour){
            return false;
        }
        return true;
    }
    
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1;
        int r=10000000;
        if(hour<=dist.length-1){
            return -1;
        }
        while(l<=r){
            int m=l+(r-l)/2;
            if(ispossible(dist,hour,m)){
                  r=m-1;
            }
            else{
                l=m+1;
            }
            
        }
        return l;
    }
}