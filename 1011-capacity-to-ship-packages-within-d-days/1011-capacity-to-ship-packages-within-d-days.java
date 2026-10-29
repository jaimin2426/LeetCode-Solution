class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int l = 0;
        int r = 0;

        for (int we : weights) {
            l = Math.max(l, we);
            r += we;
        }

        while (l < r) {
            int mid = l + (r - l) / 2;
            int d = 1;
            int load = 0;

            for (int wer : weights) {
                if(load + wer > mid){
                    d++;
                    load = 0;
                }
                load += wer;
            }

            if (d > days) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return l;


    }
}