class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxarea=0;
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            int h=(i==n) ? 0 :heights[i];
            while(!st.isEmpty() && h<heights[st.peek()]){
                int height=heights[st.pop()];
                int width= st.isEmpty() ? i : i-st.peek()-1;

                int area=height*width;
                maxarea=Math.max(maxarea,area);
            }
            st.push(i);
        }
        return maxarea;
    }
}