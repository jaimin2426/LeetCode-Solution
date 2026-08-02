class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1){
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
                int sum = 0;
                while(n>0){
                    int dig = n % 10;
                    sum += dig*dig;
                    n = n/10;
                }
                n = sum;
            }
        }
        return true;
    }
}