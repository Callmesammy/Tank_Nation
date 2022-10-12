
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
                    
                }
            }
        });
        thread.start();;
    }
    
    private void sleep 
    
}
