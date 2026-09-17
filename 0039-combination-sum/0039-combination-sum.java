class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();

        back(0,candidates,target,new ArrayList<>(), ans);
        return ans;
    }

    private void back(int s, int[] c,int t,List<Integer> l, List<List<Integer>> ans){
        if(t == 0){
            ans.add(new ArrayList<>(l));
            return;
        }

        if(t < 0){
            return;
        }

        for(int i=s;i<c.length;i++){
            l.add(c[i]);
            back(i,c,t-c[i],l,ans);
            l.remove(l.size()-1);
        }
    }
}