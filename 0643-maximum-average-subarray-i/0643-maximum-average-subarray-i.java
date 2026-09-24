class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int ans = Integer.MIN_VALUE ;
        int sum = 0 ;
        int i = 0 , j =0;
        while(i<nums.length) {
            sum += nums[i] ;

            if(i-j+1 == k){
                ans = Math.max(ans,sum);
                sum -= nums[j];
                j++;
            }
            i++;
        }

        return (double)ans/k;

    }
}