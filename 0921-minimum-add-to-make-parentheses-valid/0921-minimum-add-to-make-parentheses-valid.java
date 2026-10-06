class Solution {
    public int minAddToMakeValid(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);

            if(c == '(') st.push(c) ;

            else {
                if(st.isEmpty() || st.peek() == ')'){
                    st.push(')');
                }
                else{
                    st.pop();
                }
            }
        }

        return st.isEmpty() ? 0 : st.size() ;
        // int start = 0;
        // int end = 0;

        // for(int i=0; i<s.length(); i++){

        //     char c = s.charAt(i);

        //     if(c == '(') start++;
        //     else {
        //         if(start != 0){
        //             start--;
        //         }else{
        //             end++;
        //         } 
        //     }
        // }

        // return start+end ;
    }
}