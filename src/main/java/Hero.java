import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

public class Hero {
    private Position position;
    public Hero(int x, int y){
        this.position = new Position(x,y);
    }

    public int getX() {
        return position.getX();
    }

    public void setX(int x) {
        position.setX(x);
    }

    public int getY() {
        return position.getY();
    }

    public void setY(int y) {
        position.setY(y);
    }

    public void moveUp() {
        position.setY(position.getY()-1);
    }

    public void moveDown() {
        position.setY(position.getY()+1);
    }

    public void moveLeft() {
        position.setX(getX()-1);
    }

    public void moveRight() {
        position.setX((getX()+1));
    }

    public void draw(Screen screen) throws IOException {
        screen.setCharacter(this.position.getX(), this.position.getY(), new TextCharacter('X'));
    }
}
