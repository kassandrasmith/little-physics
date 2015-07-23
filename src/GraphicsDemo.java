import java.awt.*;
import javax.swing.*;

class GraphicsDemo extends JFrame {

    public GraphicsDemo() {
        initComponents();
    }

    private void initComponents() {
        // we want a custom Canvas, not a generic JPanel!
        jPanel2 = new Canvas();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        // add the component to the frame to see it!
        this.setContentPane(jPanel2);
        // be nice to testers..
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    public static void main(String args[]) {
        new GraphicsDemo().setVisible(true);
    }

    // Variables declaration - do not modify
    private JPanel jPanel2;
    class Canvas extends JPanel {

        Canvas() {
            // set a preferred size for the custom panel.
            setPreferredSize(new Dimension(420,420));
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;
            super.paintComponent(g);
            Polygon polygon = new Polygon(new int[]{10,50,20,10}, new int[]{10,30,100,10}, 4);
            g2d.drawPolygon(polygon);
            int x1 = 0;
            int x2 = 0;
            int y1 = 0;
            int y2 = 420;
            for (x2 = 0; x2 < 420; x2+=10){
                g2d.drawLine(x1,y1,x2,y2);
                y1+=10;
                g2d.setColor(Color.green);

            }
            y1=400;
            for (x2 = 420; x2 > 0; x2-=10) {
                g2d.drawLine(y2, x2, y1, x1);
                y1 -= 10;
                g2d.setColor(Color.cyan);

            }
            y1=400;
            for (x2 = 0; x2 < 420; x2+=10){
                g2d.drawLine(x2,y2,y1,x1);
                y1-=10;
                g2d.setColor(Color.magenta);

            }
            y1=400;
            for (x2 = 0; x2 < 420; x2+=20) {
               g2d.drawLine(x2, y2, y1, x1);
               y1-=05;
                g2d.setColor(Color.red);
            }


            y1=400;
            for (x2 = 420; x2 > 0; x2-=20) {
                g2d.drawLine(x2, y2, y1, x1);
                y1-=05;
                g2d.setColor(Color.orange);
            }

            y1=430;
            for (x2 = 0; x2 < 840; x2+=20) {
                g2d.drawLine(x1, y1, y2, x2);
                y1+=-15;
                g2d.setColor(Color.orange);
            }

            g2d.drawString("BLA", 20, 20);
            //g2d.drawRect(200, 200, 200, 200);
            g2d.dispose();
        }
    }
}