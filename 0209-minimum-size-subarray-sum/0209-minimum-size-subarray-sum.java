class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minl = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            while (sum >= target) {
                minl = Math.min(minl,i - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minl == Integer.MAX_VALUE ? 0 : minl;
    }
}