class Solution {
    public static boolean ispossible(int[] position,int m,int dist){
        int prev=position[0];
        m-=1;
        for(int i=0;i<position.length;i++){
            if(position[i]-prev>=dist){
                m--;
                prev=position[i];
            }
            if(m==0){
                return true;
            }   
        }
        return false;
    } 
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=2;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(position,m,mid)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
}