
package ComponentSource;

import Object.packa.Game_Panel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author user
 */
public class panel_game extends JComponent{
    
    private Graphics2D g2;
     private BufferedImage image; 
   
    private final int FPS = 60;
    private final int START_GAME = 1000000000/FPS;
    private boolean started = true;
    private Thread thread; 
    private int width;
    private int height;
    
     public Game_Panel playet;
     
    public void start(){
        width = getWidth();
        height = getHeight();
         image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g2 = image.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
               while(started){
                   long starttime = System.nanoTime();
                   drawBackground();
                   drawGame();
                   renderer();
                   long time = System.nanoTime() - starttime;
                   
                   if (time < START_GAME) {
                       long sleep = (START_GAME -time)/1000000;
                        stop(sleep);
                      
                   }
                  
                   
               }
            }
        });
    thread.start();
    playerGame();
}
    private void playerGame(){
        playet = new Game_Panel();
    }
    private void drawBackground(){
        g2.setColor(new Color(30,30,30));
          g2.fillRect(0, 0, width, height);

    }
    
    private void drawGame(){
       playet.draw(g2);
        
    }
    
    private void renderer(){
        Graphics cd = getGraphics();
        cd.drawImage(image, 0, 0, null);
        cd.dispose();
        
    }
    private void stop (long speed){
        try {
            Thread.sleep(speed);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
