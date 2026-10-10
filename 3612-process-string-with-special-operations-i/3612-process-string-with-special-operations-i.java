class Solution {
    public String processStr(String s) {

        StringBuilder result = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i);

            if(ch == '*'){
                if(result.length() > 0){
                    result.deleteCharAt(result.length()-1);
                }
            }
            else if(ch == '#'){
                String str = result.toString();
                result.append(str);
            }
            else if(ch == '%'){
                result.reverse();
            }
            else{
                result.append(ch);
            }
        }

        return result.toString();
        
    }
}