class Solution {
    public String tictactoe(int[][] moves) {
        int rows[] = new int[3];
        int cols[] = new int[3];

        int d = 0;
        int ad = 0;

        for(int i=0;i<moves.length;i++){
            int row = moves[i][0];
            int col = moves[i][1];

            int pl = (i % 2 == 0) ? 1 : -1;

            rows[row] += pl;
            cols[col] += pl;

            if(row == col){
                d += pl;
            }
            if(row + col ==2){
                ad += pl;
            }

            if(Math.abs(rows[row]) == 3 ||
               Math.abs(cols[col]) == 3 ||
               Math.abs(d) == 3 ||
               Math.abs(ad) == 3){
                return pl == 1 ? "A" :"B";
            }
        }
        return moves.length == 9 ? "Draw" : "Pending";
    }
}