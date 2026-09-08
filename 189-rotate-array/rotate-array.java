class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] temp=new int[n];

        for(int i=0;i<n;i++){
           int newIndex=(i+k)%n;
           temp[newIndex] = nums[i]; 
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }

    }
}