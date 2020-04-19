import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
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
    public TextGraphics graphics = screen.newTextGraphics();
    private Arena arena = new Arena(10, 10);



    public Game() throws IOException {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        this.screen = new TerminalScreen(terminal);
        screen.setCursorPosition(null);   // we don't need a cursor
        screen.startScreen();             // screens must be started
        screen.doResizeIfNecessary();     // resize screen if necessary
    }


    public void run() throws IOException {
        while (true) {
            arena.draw(graphics);
            KeyStroke key = screen.readInput();
            if (arena.processKey(key)) {
                screen.close();
                break;
            }
        }
    }
}


