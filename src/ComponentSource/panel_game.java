
package ComponentSource;

import javax.swing.JComponent;

/**
 *
 * @author user
 */
public class panel_game extends JComponent{
    
    private final int FPS = 60;
    private final int START_GAME = 1000000000/FPS;
    private boolean started = true;
    private Thread thread; 
    private int width;
    private int height;
    
    
    public void start(){
        width = getWidth();
        height = getHeight();
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
                        System.out.println(sleep); // for Testing 
                   }
                  
                   
               }
            }
        });
    thread.start();
}
    
    private void drawBackground(){
        
    }
    
    private void drawGame(){
        
    }
    
    private void renderer(){
        
    }
    private void stop (long speed){
        try {
            Thread.sleep(speed);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
