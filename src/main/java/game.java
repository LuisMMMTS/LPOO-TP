import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

import java.io.IOException;

public class Game {
    private Screen screen;

    public game() throws IOException {
        terminal= new DefaultTerminalFactory().createTerminal();
        this.screen = new TerminalScreen(terminal);
    }

    private void draw() throws IOException {
        screen.clear();
        screen.setCharacter(10, 10, new TextCharacter('X'));
        screen.refresh();
    };
    public void run(){
        this.draw();
    };
}
