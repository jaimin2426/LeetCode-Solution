class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), r);
        return r;
    }

    private void backtrack(int[] nums , List<Integer> c, List<List<Integer>> r){
        if(c.size() == nums.length){
            r.add(new ArrayList<>(c));
            return;
        }

        for(int num : nums){
            if(c.contains(num)){
                continue;
            }

            c.add(num);
            backtrack(nums,c,r);

            c.remove(c.size()-1);
        }
    }
}