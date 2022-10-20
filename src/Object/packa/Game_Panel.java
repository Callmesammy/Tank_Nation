
package Object.packa;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import javax.swing.ImageIcon;


public class Game_Panel {

    public Game_Panel() {
        this.image = new ImageIcon(getClass().getResource("/tank/pic/plane.png")).getImage();
        this.image_speed = new ImageIcon(getClass().getResource("/tank/pic/tankA.png")).getImage();
    }
    
      public static final double Game_Size = 64;
    private double x;
    private double y;
    private float angle = 0f;
    private final Image image;
    private final Image image_speed; 

     public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public float getAngle(){
        return angle;
    }

    public void chagedraw(float angle){
        if (angle<0) {
            angle = 359;
        }else if (angle>359){
            angle = 0;
        }
        this.angle = angle;
    }
    public void draw(Graphics2D g2){
        AffineTransform trans = g2.getTransform();
        g2.translate(x, y);
        g2.drawImage(image, 0, 0, null);
        g2.setTransform(trans);
    }
    
       
     
  
    
}
