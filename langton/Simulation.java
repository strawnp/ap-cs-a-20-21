public class Simulation {
    private Ant melo;
    private Board court;

    public Simulation() {
        court = new Board(100, 100);

        int antRow = court.getHeight() / 2;
        int antCol = court.getWidth() / 2;

        melo = new Ant(antRow, antCol);
    }

    public void runSim() {
        // At a white square, turn 90° clockwise, flip the color of the square, move forward one unit
        // At a black square, turn 90° counter-clockwise, flip the color of the square, move forward one unit
    }

    public static void main(String[] args) {
        Simulation s = new Simulation();
        s.runSim();
    }
}
