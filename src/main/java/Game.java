import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.KeyStroke;

import javax.swing.*;
import java.io.IOException;

import static com.googlecode.lanterna.input.KeyType.*;
import static com.googlecode.lanterna.input.KeyType.ArrowRight;

public class Game {
    private Screen screen;
    private int x = 10;
    private int y = 10;

    public Game() throws IOException {
        Terminal terminal= new DefaultTerminalFactory().createTerminal();
        this.screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);   // we don't need a cursor
        screen.startScreen();             // screens must be started
        screen.doResizeIfNecessary();     // resize screen if necessary
    }

    private void draw() throws IOException {
        screen.clear();
        screen.setCharacter(x, y, new TextCharacter('X'));
        screen.refresh();
    };
    public void run() throws IOException {
        while (true) {
            this.draw();
            KeyStroke key = screen.readInput();
            if (processKey(key)){
                break;
            }
        }
    };

    private boolean processKey(KeyStroke key){
        System.out.println(key);
        switch (key.getKeyType()) {
            case ArrowUp:
                    this.y -= 1;
                    break;

            case ArrowDown:
                    this.y += 1;
                    break;

            case ArrowLeft:
                    this.x -= 1;
                    break;

            case ArrowRight:
                    this.x += 1;
                    break;
        }

        if (key.getKeyType() == Character && key.getCharacter() == 'q'){
            System.out.println("QUERES SAIR DESTE PROGRAMINHA LINDO????");
            return true;
        }
        return false;
    }
}
