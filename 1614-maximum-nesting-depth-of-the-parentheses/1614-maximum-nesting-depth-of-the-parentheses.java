class Solution {
    public int maxDepth(String s) {

        int count = 0;
        int max = 0;

        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i);

            if(ch == '('){

                count++;

                st.push(ch);

            }
            else if(ch == ')'){
                
                if(count > max){
                    max = count;
                }

                while(st.peek() != '('){
                    st.pop();
                }
                st.pop();

                count--;
            }
            else{
                st.push(ch);
            }


        }
        
        return max;
    }
}