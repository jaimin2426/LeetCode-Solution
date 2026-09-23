class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        ArrayList<Integer>[] buck = new ArrayList[nums.length + 1];

        for(int num : map.keySet()){
            int fr = map.get(num);

            if(buck[fr] == null){
                buck[fr] = new ArrayList<>();
            }

            buck[fr].add(num);
        }

        int result[] = new int[k];
        int index = 0;

        for(int i=buck.length-1;i>=0 && index < k ;i--){
            if(buck[i] != null){
                for(int num : buck[i]){
                    result[index] = num;
                    index++;
                }
                if(index == k){
                    break;
                }
            }
        }
        return result;
    }
}