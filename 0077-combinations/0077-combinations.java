class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> r = new ArrayList<>();
        back(1,n,k,new ArrayList<>(), r);
        return r;

    }

    private void back(int s, int n,int k ,List<Integer> c,List<List<Integer>> r){

        if(c.size() == k){
            r.add(new ArrayList<>(c));
            return;
        }

        for(int i=s;i<=n;i++){
            c.add(i);
            back(i+1,n,k,c,r);
            c.remove(c.size()-1);
        }
    }
}