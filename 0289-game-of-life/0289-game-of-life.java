class Solution {
    public void gameOfLife(int[][] board) {
        int r = board.length;
        int c = board[0].length;

        int[][] direction = {
                { -1, -1 }, { -1, 0 }, { -1, 1 },
                { 0, -1 }, { 0, 1 },
                { 1, -1 }, { 1, 0 }, { 1, 1 }
        };

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int liven = 0;

                for (int[] dir : direction) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];

                    if (ni >= 0 && ni < r && nj >= 0 && nj < c) {
                        if (board[ni][nj] == 1 || board[ni][nj] == 2) {
                            liven++;
                        }
                    }
                }

                if (board[i][j] == 1) {
                    if (liven < 2 || liven > 3) {
                        board[i][j] = 2;
                    }
                } else if (board[i][j] == 0) {
                    if (liven == 3) {
                        board[i][j] = 3;
                    }
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0;
                }
                if (board[i][j] == 3) {
                    board[i][j] = 1;
                }
            }
        }
    }
}