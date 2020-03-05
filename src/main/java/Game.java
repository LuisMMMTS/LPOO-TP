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


    public Game() throws IOException {
        Terminal terminal= new DefaultTerminalFactory().createTerminal();
        this.screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);   // we don't need a cursor
        screen.startScreen();             // screens must be started
        screen.doResizeIfNecessary();     // resize screen if necessary
    }



    public void run() throws IOException {
        while (true) {
            this.draw();
            KeyStroke key = screen.readInput();
            if (processKey(key)){
                screen.close();
                break;
            }
        }
    };

    private boolean processKey(KeyStroke key){
        arena.processKey(KeyStroke);
    }


    private void moveHero(Position position) {
        hero.setPosition(position);
    }
}
