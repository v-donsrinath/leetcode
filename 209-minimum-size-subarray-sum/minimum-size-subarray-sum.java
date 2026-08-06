class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int ans=0;
        int temp=0;
        int sol=Integer.MAX_VALUE;
        int n=nums.length;
        for(int r=0;r<n;r++){
            temp+=nums[r];

            while(temp>=target){
                sol=Math.min(sol,r-l+1);
                temp-=nums[l];
                l++;
            }
            
        }
        if(sol==Integer.MAX_VALUE){
            return 0;
        }
        return sol;
           
    }
}