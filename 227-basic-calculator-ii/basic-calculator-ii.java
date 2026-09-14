class Solution {
    public int calculate(String s) {
        int num=0;
        char op='+';
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=s.length();i++){
           char ch=(i==n) ? '+' : s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch!=' '){
                if(op=='+'){
                    st.push(num);
                }
                else if(op=='-'){
                    st.push(-num);
                }
                else if(op=='*'){
                    st.push(st.pop()*num);
                }
                else if(op=='/'){
                    st.push(st.pop()/num);
                }
                op=ch;
                num=0;
            }

        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
        
    }
}