class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        
        int k = 0;
        for(int i : nums) if(i == 1) k++;

        int good = 0;
        for(int i = 0; i<k; i++) if(nums[i]==1) good++;

        int best = good ;

        for(int i = k; i<n+k-1; i++){
            if(nums[(i % n)] == 1) good++;
            if(nums[(i-k)%n] == 1) good--;

            best = Math.max(best , good);
        }

        return k - best;
    }
}