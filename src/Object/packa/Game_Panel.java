
package Object.packa;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Game_Panel {

    public Game_Panel() {
        this.XImage = new ImageIcon(getClass().getResource("/TankPics/tankB.png")).getImage();
        this.YImage_speed = new ImageIcon(getClass().getResource("/TankPics/tankA.png")).getImage();
    }

    private void drawImage(float angle){
        if (angle<0) {
            angle = 359;
        }else if (angle>359){
            angle = 0;
        }
        
    }
    
    private double getX(){
        return x;
    }
    
    private double getY(){
        return y;
    }
    
    private double getAngle(){
        return angle;
    }
    private static double Game_Size = 64;
    private double x;
    private double y;
    private float angle = 0f;
    private Image XImage;
    private Image YImage_speed; 
    
}
