class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int start=1;
        int end=1;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(start==0){
                start=1;
            }
            if(end==0){
                end=1;
            }
            start*=nums[i];
            end*=nums[n-i-1];

            ans=Math.max(ans,Math.max(start,end));       
        }
        return ans;
    }
}