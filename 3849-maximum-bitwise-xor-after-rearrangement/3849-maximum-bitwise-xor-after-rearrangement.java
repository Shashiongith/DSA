class Solution {
    public String maximumXor(String s, String t) {
        int zeros = 0, ones = 0;

        for(char x : t.toCharArray()){
            if( x == '1') ones++;
            else zeros++;
        }

        StringBuilder sb = new StringBuilder();

        for(char x : s.toCharArray()){
            if (x == '1'){
                if(zeros > 0){
                    sb.append("1");
                    zeros--;
                }else {
                    sb.append("0");
                    ones--;
                } 
            }

            if (x == '0'){
                if(ones > 0){
                    sb.append("1");
                    ones--;
                }else {
                    sb.append("0");
                    zeros--;
                } 
            }
        }

        return sb.toString();

    }
}