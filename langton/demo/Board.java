public class Board {
    private Tile[][] board;

    public Board(int x, int y) {
        board = new Tile[x][y];

        // initialize each Tile object in the Board
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = new Tile();
            }
        }
    }

    public int getHeight() { return board.length; }

    public int getWidth() { return board[0].length; }

    public Tile accessTile(int r, int c) {
        return board[r][c];
    }

    /* -- MOVED TO SIMULATION
    public void displayBoard() {
        for (Tile[] row : board) {
            for (Tile cell : row) {
                if (cell.getState()) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
    */
}
