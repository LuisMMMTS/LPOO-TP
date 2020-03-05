public class Position {
    private int x,y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Position(Walls wall){
        this.x=wall.getX();
        this.y=wall.getY();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
