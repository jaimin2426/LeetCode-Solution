class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums,used, new ArrayList<>(), r);
        return r;
    }

    private void backtrack(int[] nums ,boolean[] used, List<Integer> c, List<List<Integer>> r){
        if(c.size() == nums.length){
            r.add(new ArrayList<>(c));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (used[i]) {
                continue;
            }

            used[i] = true;
            c.add(nums[i]);

            backtrack(nums, used, c, r);

            c.remove(c.size() - 1);
            used[i] = false;
        }
    }
}