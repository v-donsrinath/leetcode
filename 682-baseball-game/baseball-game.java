class Solution {
    public int calPoints(String[] operations) {
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
               int mul=st.peek();
               int val=2*mul;
               st.push(val);
            }
            else if(operations[i].equals("+")){
                int top=st.pop();
                int sec=st.peek();
                int plus=top+sec;
                st.push(top);
                st.push(plus);
            }
            else{
              st.push(Integer.parseInt(operations[i]));
            }
        }
        while(!st.isEmpty()){
            ans +=st.pop();
        }
        return ans;
        
    }
}