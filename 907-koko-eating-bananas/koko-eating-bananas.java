class Solution {
    public boolean ispossible(int[] piles,int h,int k){
        long hours=0;
        for(int pile:piles){
            hours+=(pile+k-1)/k;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(ispossible(piles,h,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }  
        }
        return ans;
    }
}