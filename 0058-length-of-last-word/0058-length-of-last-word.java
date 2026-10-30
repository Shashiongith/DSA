class Solution {
    public int lengthOfLastWord(String s) {
        // int len = s.length() ;
        // StringBuilder sb = 
        // for(int i = len-1; i>=0; i--){
        String d = s.trim();
        String[] text = d.split(" ");

        return text[text.length-1].length();
    }
}