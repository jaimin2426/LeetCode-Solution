class Solution {
    public int[] findBall(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int r[] = new int[m];

        for (int j = 0; j < m; j++) {
            int cc = j;

            for (int i = 0; i < n; i++) {
                if (grid[i][cc] == 1) {
                    if (cc + 1 >= m || grid[i][cc + 1] == -1) {
                        cc = -1;
                        break;
                    }
                    cc++;
                } else {
                    if (cc - 1 < 0 || grid[i][cc - 1] == 1) {
                        cc = -1;
                        break;
                    }
                    cc--;
                }
            }
            r[j] = cc;
        }
        return r;

    }
}