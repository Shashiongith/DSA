class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i=1; i<n+1; i++){
            ans[i] = fn(i);
        } 

        return ans;
    }
    public int fn(int n){
        int count = 0;
        while(n != 0){
            count++;
            n &= n-1;
        }

        return count;
    }
}