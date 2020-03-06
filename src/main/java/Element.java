import com.googlecode.lanterna.graphics.TextGraphics;

abstract class Element {
    private Position position;

    Element(int x, int y){
        this.position=new Position(x,y);
    }

    Element(Position position){
        this.position=position;
    }

    abstract void draw(TextGraphics screen);

    public int getX() {
        return position.getX();
    }

    public void setX(int x) {
        this.position=new Position(x,this.position.getY());
    }

    public int getY() {
        return position.getY();
    }

    public void setY(int y) {
        this.position=new Position(this.position.getX(),y);
    }
}

