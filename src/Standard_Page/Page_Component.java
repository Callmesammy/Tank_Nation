
package Standard_Page;

import javax.swing.JComponent;


public class Page_Component extends JComponent{
   
    private final int FPS = 60;
    private final int TIME = 1000000000/FPS;
    
    private Thread thread;
    private boolean start = true;
    
    private int width;
    private int height;

    public void Start() {
        width = getWidth();
        height = getHeight();
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (start) {
                    long startTime = System.nanoTime();
                    Drawbackground();
                    Drawgrame();
                    renderer();
                    long time = System.nanoTime() - startTime;
                    if(time< TIME){
                        long sleep =(TIME -time)/1000000;
                         sleep(sleep); // for testing of speed 
                         System.out.println(sleep);
                    }
                   
                    
                }
            }
        });
        thread.start();;
    }
    
    private void Drawbackground(){
        
    }
    
    private void Drawgrame(){
        
    }
    
    private void renderer(){
        
    }
    
    private void sleep (long speed){
        try{
              thread.sleep(speed);
        }catch(InterruptedException e){
            System.err.println(e);
        }
      
        
    }
    
}
