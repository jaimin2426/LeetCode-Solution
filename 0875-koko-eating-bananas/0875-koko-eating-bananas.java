class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int p : piles){
            r = Math.max(r,p);
        }

        while(l < r){
            int mid = l + (r - l) /2;
            int hours = 0;

            for(int pi : piles){
                hours += (pi + mid -1) /mid;
            }

            if(hours > h){
                l = mid +1;
            }else{
                r = mid;
            }

        }
        return l;
    }
}