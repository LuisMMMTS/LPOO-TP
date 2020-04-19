import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.googlecode.lanterna.input.KeyType.Character;

public class Arena {
    private int width;
    private int height;
    private Hero hero=new Hero(10,10);
    private List<Walls> walls;
    private List<Coin> coins;


    Arena(int width, int height) {
        this.width = width;
        this.height = height;
        this.walls = createWalls();
        this.coins = creatCoins();

    }

    private List<Walls> createWalls() {

        List<Walls> walls = new ArrayList<>();

        for (int c = 0; c < width; c++) {
            walls.add(new Walls(c, 0));
            walls.add(new Walls(c, height - 1));
        }

        for (int r = 1; r < height - 1; r++) {
            walls.add(new Walls(0, r));
            walls.add(new Walls(width - 1, r));
        }

        return walls;
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

    public void draw(TextGraphics screen) throws IOException {
        hero.draw(screen);
        for (Walls wall : walls)
            wall.draw(screen);
    }

    private void moveHero(Position position) {
        if (canHeroMove(position))
            hero.setPosition(position);
            retrieveCoins(position);
    }


    private boolean canHeroMove(Position position) {
        if ((width >= position.getX()) && (height >= position.getY()) && (position.getX() >= 0) && (position.getY() >= 0)){
            for (Walls wall : walls)
                if (wall.getPosition().equals(position)){
                    return false;
                }
            return true;
        }
        return false;
    }

    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            coins.add(new Coin(random.nextInt(width - 2) + 1, random.nextInt(height - 2) + 1));
        //TODO:make sure coins are not on top of hero and are not stacked one over another
        return coins;
    }

    private void retrieveCoins(Position position) {
        for (Coin coin : coins)
            if (coin.getPosition().equals(position)){
                coins.remove(coin);
                hero.setCoins(hero.getCoins()+1);
                break; //I can do this because there is only one coin in each position since i implemented that restriction
            }
    }

    boolean processKey(KeyStroke key) throws IOException {
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