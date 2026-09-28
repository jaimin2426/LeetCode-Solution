class Solution {
    int nums[];
    Random random;

    public Solution(int[] nums) {
        this.nums = nums;
        random = new Random();
    }

    public int pick(int target) {
        int c = 0;
        int re = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                c++;

                if (random.nextInt(c) == 0) {
                    re = i;
                }
            }
        }
        return re;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */