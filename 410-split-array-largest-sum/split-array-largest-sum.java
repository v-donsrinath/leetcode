class Solution {
    public static boolean ispossible(int[] nums,int k,int max){
        int temp=0;
        k-=1;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val+temp>max){
                k-=1;
                temp=0;
            }
            temp+=val;
            if(val>max){
                return false;
            }
            if(k<0){
                return false;
            }
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int m=l+(r-l)/2;
            if(ispossible(nums,k,m)){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return l;
    }
}