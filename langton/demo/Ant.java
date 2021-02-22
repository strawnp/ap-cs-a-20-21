public class Ant {
    private int currentRow;
    private int currentColumn;
    private int orientationIndex;   // N, S, E, W
    // private char[] orientations = {'N', 'E', 'S', 'W'};

    public Ant(int x, int y) {
        orientationIndex = 0;
        currentRow = x;
        currentColumn = y;
    }

    public void turnClockwise() {
        if (orientationIndex == 3) {
            orientationIndex = 0;
        } else {
            orientationIndex++;
        }
    }

    public void turnCounterClockwise() {
        if (orientationIndex == 0) {
            orientationIndex = 3;
        } else {
            orientationIndex--;
        }
    }

    // TODO: make sure Ant doesn't fall off the board
    public void moveForward() {
        if (orientationIndex == 0) {
            currentRow--;
        } else if (orientationIndex == 1) {
            currentColumn++;
        } else if (orientationIndex == 2) {
            currentRow++;
        } else {
            currentColumn--;
        }
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }
}
