
package Tank_Game;

import ComponentSource.panel_game;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.border.Border;


public class Main extends JFrame{
    
public  Main(){
    init();
}    

private void init(){
    setTitle("Tank World");
    setSize(new Dimension(1200, 600));
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    panel_game game = new panel_game();
    add(game);
    addWindowListener(new WindowAdapter() {
        @Override
        public void windowOpened(WindowEvent e) {
            game.start();
        }
    
    });
  
    
}

    public static void main(String[] args) {
        Main main = new Main();
        main.setVisible(true);
    }
    
}
