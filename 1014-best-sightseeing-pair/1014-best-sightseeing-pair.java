class Solution {
    public int maxScoreSightseeingPair(int[] v) {
        int maxl = v[0];

        int ans = 0;

        for(int j=1;j<v.length;j++){
            int score = maxl + v[j] - j;

            ans = Math.max(ans, score);

            maxl = Math.max(maxl, v[j] + j);
        }

        return ans;
    }
}