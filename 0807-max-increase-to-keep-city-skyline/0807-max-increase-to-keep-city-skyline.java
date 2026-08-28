class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;

        int rmax[] = new int[n];
        int cmax[] = new int[n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rmax[i] = Math.max(rmax[i],grid[i][j]);
                cmax[j] = Math.max(cmax[j],grid[i][j]);
            }
        }

        int total = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int allow = Math.min(rmax[i],cmax[j]);

                total += allow - grid[i][j];
            }
        }
        return total;
    }

}