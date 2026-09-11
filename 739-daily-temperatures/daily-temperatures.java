class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] ans=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            int nextelement=0;
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(!st.isEmpty()){
               nextelement=st.peek()-i;
            } 
            st.push(i); 
            ans[i]=nextelement;
        }
        return ans;
    }
}