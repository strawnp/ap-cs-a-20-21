public class Tile {
    private boolean state;

    public Tile() {
        this.state = true;
    }

    public boolean getState() { return this.state; }

    public void toggleState() { this.state = !this.state; }
}
