public class Tile {
    private boolean state;

    public Tile(boolean state) {
        this.state = state;
    }

    public boolean getState() { return this.state; }

    public void toggleState() { this.state = !this.state; }
}
