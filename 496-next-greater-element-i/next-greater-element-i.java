class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int val=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    val=j;
                    break;
                }
            }
            ans[i]=-1;
            for(int k=val;k<nums2.length;k++){
                if(nums2[val]<nums2[k]){
                    ans[i]=nums2[k];
                    break;
                }
            }
        }
        return ans;
    }
}