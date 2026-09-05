class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> r = new ArrayList<>();
        r.add(new ArrayList<>());

        for(int i=0;i<nums.length;i++){

            int oldsize = r.size();
            int j = 0;
            while(j < oldsize){
                List<Integer> copy = new ArrayList<>(r.get(j));
                copy.add(nums[i]);

                r.add(copy);
                j++;
            }
        }
        return r;
    }
}