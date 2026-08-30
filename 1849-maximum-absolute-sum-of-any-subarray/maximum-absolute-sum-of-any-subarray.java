class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int ans=0;
        int maxsum=0;
        int minsum=0;
        int curmin=0;
        int curmax=0;
        for(int num:nums){

            curmin=Math.min(0,curmin+num);
            curmax=Math.max(0,curmax+num);
 
            maxsum=Math.max(maxsum,curmax);
            minsum=Math.min(minsum,curmin);
            
        }
        ans=Math.max(maxsum,-minsum);
        return ans;
    }
}