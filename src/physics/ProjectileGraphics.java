package physics;
import javax.swing.*;
import java.awt.*;


public class ProjectileGraphics extends JFrame {
    private JPanel jPanel2;

    public ProjectileGraphics(){
        initComponents();
    }
    private void initComponents() {
            jPanel2 = new Canvas();
            jPanel2.setBackground(new java.awt.Color(255, 240, 255));
            this.setContentPane(jPanel2);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pack();
        }
class Canvas extends JPanel {
    Canvas() {
        // set a preferred size for the custom panel.
        setPreferredSize(new Dimension(420,420));
    }
}
}
