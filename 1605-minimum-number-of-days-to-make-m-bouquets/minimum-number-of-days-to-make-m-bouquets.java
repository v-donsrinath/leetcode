class Solution {
    public static boolean ispossible(int[] bloomDay,int m,int k,int day){
        int took=0;
        for(int i=0;i<bloomDay.length;i++){
            int val=bloomDay[i];
            if(val<=day){
                took+=1;
            }
            else{
                took=0;
            }
            if(took==k){
                m-=1;
                took=0;
            }
            if(m==0){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(ispossible(bloomDay,m,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        int exeed=(int)Math.pow(10,9);
        if(l>exeed){
            return -1;
        }
        return l;
    }
    
}