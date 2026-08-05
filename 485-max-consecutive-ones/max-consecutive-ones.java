class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int temp=0;
        int ans=0;
        for(int r=0;r<nums.length;r++){
            temp+=nums[r];
            if(nums[r]==0){
                l=r+1;
                temp=0;
            }
            ans=Math.max(ans,temp); 
        }
        return ans;
    }
}