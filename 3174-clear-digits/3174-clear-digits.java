class Solution {
    public String clearDigits(String s) {

        Stack <Character> st = new Stack();

        for(int i = 0 ; i < s.length(); i++){

            char ch = s.charAt(i);

            if(ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9'){
                st.pop();
            }
            else{
                st.push(ch);
            }

        }

        StringBuilder sb = new StringBuilder();

        while(!st.isEmpty()){
            sb.append(st.pop());
        }

        sb.reverse();

        return sb.toString();
        
    }
}