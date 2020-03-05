import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;

import static com.googlecode.lanterna.input.KeyType.Character;

public class Arena {
    private int width;
    private int height;
    private Hero hero=new Hero(10,10);

    Arena(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void draw(Screen screen) throws IOException {
        hero.draw(screen);
    }

    private boolean processKey(KeyStroke key) throws IOException {
        System.out.println(key);
        switch (key.getKeyType()) {
            case ArrowUp:
                moveHero(hero.moveUp());
                break;

            case ArrowDown:
                moveHero(hero.moveDown());
                break;

            case ArrowLeft:
                moveHero(hero.moveLeft());
                break;

            case ArrowRight:
                moveHero(hero.moveRight());
                break;
        }

        if (key.getKeyType() == Character && key.getCharacter() == 'q') {
            System.out.println("QUERES SAIR DESTE PROGRAMINHA LINDO????");
            screen.close();
        }
        return key.getKeyType() == KeyType.EOF;
    }
}