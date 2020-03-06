import com.googlecode.lanterna.graphics.TextGraphics;

public class Monster extends Element {
    private Position position;

    Monster(Position position){
        super(position);
    }

    private Position move(){
        return new Position(position.getX(),position.getY());
    }


    @Override
    void draw(TextGraphics screen) {

    }
}
