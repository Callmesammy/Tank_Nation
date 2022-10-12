
package tank_nation;

import Standard_Page.Page_Component;
import java.awt.BorderLayout;
import java.awt.Dimension;
//import java.awt.HeadlessException;
import javax.swing.JFrame;


public class Tank_ation extends JFrame{

    public Tank_ation() {
        init();
    }
    
    private void init(){
        setTitle("Tank_ation");
        setResizable(false);
        setSize(new Dimension(800,500));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Page_Component component = new Page_Component();
        add(component);
    }
    
    public static void main(String[] args) {
        Tank_ation tank = new Tank_ation();
        tank.setVisible(true);
    }

//    private void add(Page_Component component) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    
}
