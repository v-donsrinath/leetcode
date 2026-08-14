class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            boolean alive=true;
            int current=asteroids[i];
            if(current>0){
                st.push(current);
            }
            else{
                while (!st.isEmpty() && st.peek() > 0 
                        && st.peek() < Math.abs(current)) {
                    st.pop();
                }
                if(st.isEmpty() || st.peek()<0){
                    st.push(current);
                }
                else if (st.peek() == Math.abs(current)) {
                    st.pop();
                }

                // Top is bigger -> current asteroid explodes
                else {
                    alive = false;
                }
            }
         }
         // Convert stack to array
        int[] ans = new int[st.size()];

        for (int i = 0; i < st.size(); i++) {
            ans[i] = st.get(i);
        }

        return ans;

        
    }
}