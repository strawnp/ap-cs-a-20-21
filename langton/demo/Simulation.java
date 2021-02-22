public class Simulation {
    private Ant melo;
    private Board court;

    public Simulation() {
        court = new Board(25, 100);

        int antRow = court.getHeight() / 2;
        int antCol = court.getWidth() / 2;

        melo = new Ant(antRow, antCol);
    }

    public void runSim() {
        Tile t = court.accessTile(melo.getCurrentRow(), melo.getCurrentColumn());

        // At a white square, turn 90° clockwise, flip the color of the square, move forward one unit
        // At a black square, turn 90° counter-clockwise, flip the color of the square, move forward one unit
        if (t.getState()) {
            melo.turnClockwise();
        } else {
            melo.turnCounterClockwise();
        }
        t.toggleState();
        melo.moveForward();

    }

    // replacement for printing in Board class
    public void displaySim() {
        // print top border
        for (int i = 0; i < court.getWidth() + 2; i++) {
            System.out.print("-");
        }
        System.out.println();

        // print grid
        for (int i = 0; i < court.getHeight(); i++) {
            System.out.print("|");
            for (int j = 0; j < court.getWidth(); j++) {
                // check if ant is on tile
                if (melo.getCurrentRow() == i && melo.getCurrentColumn() == j) {
                    System.out.print("@");
                } else {
                    if (court.accessTile(i, j).getState()) {
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }
                }
            }
            System.out.println("|");
        }

        // print bottom border
        for (int i = 0; i < court.getWidth() + 2; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        Simulation s = new Simulation();
        int x = 0;
        while (x < 100000) {
            s.displaySim();
            s.runSim();
            // TimeUnit.SECONDS.sleep(1);
            x++;
        }
    }
}
