import com.googlecode.lanterna.graphics.TextGraphics;

abstract class Element {
    private int x,y;

    Element(int x, int y){
        this.x=x;
        this.y=y;
    }

    abstract void draw(TextGraphics screen);

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

