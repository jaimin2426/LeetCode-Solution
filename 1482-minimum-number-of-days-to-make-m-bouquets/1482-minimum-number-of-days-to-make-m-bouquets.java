class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;

        int lo = 1, hi = 0;
        for (int d : bloomDay) hi = Math.max(hi, d); 

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (canMake(bloomDay, m, k, mid)) {
                hi = mid;     
            } else {
                lo = mid + 1;   
            }
        }

        return lo;
    }

    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int consecutive = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                consecutive++;
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0; 
                }
            } else {
                consecutive = 0;
            }
        }

        return bouquets >= m;
    }
}