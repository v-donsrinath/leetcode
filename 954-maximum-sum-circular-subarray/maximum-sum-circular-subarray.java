class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans=0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        if(max<0){
            return max;
        }
        int totalsum=0;
        int min = Integer.MAX_VALUE;
        int circularmaxi=0;

        for (int i = 0; i < nums.length; i++) {
            totalsum+=nums[i];
            sum += nums[i];
            min = Math.min(min, sum);

            if (sum >0) {
                sum = 0;
            }
        }
        circularmaxi = totalsum - min;
        ans=Math.max(circularmaxi,max);
        return ans;
    }
}