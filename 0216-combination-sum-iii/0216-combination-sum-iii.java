class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> l = new ArrayList<>();

        backtrack(1,k, n ,new ArrayList<>(), l);

        return l;
    }

    private void backtrack(int s, int k, int n, List<Integer> r, List<List<Integer>> l){
        if(r.size() == k){
            if(n == 0){
                l.add(new ArrayList<>(r));
            }
            return;
        }

        for(int i=s;i<=9;i++){
            if(i > n){
                break;
            }

            r.add(i);
            backtrack(i+1,k,n-i,r,l);
            r.remove(r.size()-1);
        }
    }
}