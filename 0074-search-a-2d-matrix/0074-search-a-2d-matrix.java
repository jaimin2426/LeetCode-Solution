class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int l = 0;
        int ri = m * n - 1;

        while (l <= ri) {
            int mid = l + (ri - l) / 2;

            int r = mid / n;
            int c = mid % n;

            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] < target)
                l = mid + 1;
            else
                ri = mid - 1;
        }
        return false;
    }
}
