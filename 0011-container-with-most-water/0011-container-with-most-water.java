class Solution {
    public int maxArea(int[] height) {
        int mw = 0;
        int lp = 0;
        int rp = height.length-1;

        while(lp<rp){
            int ht = Math.min(height[lp],height[rp]);
            int we = rp-lp;
            int cuwater = ht*we;
            mw = Math.max(mw,cuwater);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return mw;
    }
}