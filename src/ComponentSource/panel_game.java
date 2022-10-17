
package ComponentSource;

import javax.swing.JComponent;

/**
 *
 * @author user
 */
public class panel_game extends JComponent{
    
    private final int FPS = 16;
    private final int START_GAME = 1000000000;
    private int width;
    private int height;
    private Thread thread;
    private boolean start;

    public panel_game() {
        width = getWidth();
        height = getHeight();
        
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (start) {                    
               long STARTTIME = System.nanoTime();
                drawBackground();
                drawShpe();
                renderer();
               long time = System.nanoTime() - STARTTIME;
                    if (time <STARTTIME) {
                        SLOW(time);
                        System.out.println(time); //test
                    }
                }
                  
              
            }
        });
        thread.start();
        
    }
    
    private void drawBackground(){
        
    }
    
    private void drawShpe(){
        
    }
    
    private void renderer(){
        
    }
    private void SLOW(long speed){
        try {
               thread.sleep(speed);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
