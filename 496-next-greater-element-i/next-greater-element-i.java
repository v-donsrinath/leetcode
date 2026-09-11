class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            hm.put(nums1[i],i);
        }
        Stack<Integer> st=new Stack<>();
        int n=nums2.length;
        for(int j=n-1;j>=0;j--){
            int nextgreater;
            while(!st.isEmpty() && st.peek()<=nums2[j]){
                st.pop();
            }if(st.isEmpty()){
                nextgreater=-1;
            }else{
                nextgreater=st.peek();
            }

            if(hm.containsKey(nums2[j])){
                ans[hm.get(nums2[j])]=nextgreater;
            }
            st.push(nums2[j]);
        }
        return ans;
    }
}