public class Board {
    private Tile[][] board;

    public Board(int x, int y) {
        board = new Tile[x][y];
    }

    public int getHeight() { return board.length; }

    public int getWidth() { return board[0].length; }

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
}
