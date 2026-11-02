class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int lsum = 0;
        for(int i=0;i<nums.length;i++){
            int rsum = sum - lsum - nums[i];

            if(rsum == lsum) return i;

            lsum += nums[i];
        }
        return -1;
    }
}