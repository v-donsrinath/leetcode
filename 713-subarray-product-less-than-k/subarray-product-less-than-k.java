class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0;
        int l=0;
        int temp=1;
        if(k<=1){
                return 0;
        }
        for(int r=0;r<nums.length;r++){
             temp*=nums[r];
            while(temp>=k){
               temp/=nums[l];
               l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
}