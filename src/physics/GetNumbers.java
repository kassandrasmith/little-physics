package physics;

import javax.swing.*;
import java.awt.event.*;

public class GetNumbers extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField initialVelocity;
    private JTextField acceleration;
    private JTextField inputTime;
    private JTextField velocityAtTime;
    private JTextField initialX;
    private JTextField outputx;
    public Velocity calculator;

    public GetNumbers() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    private void onOK() #!

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        GetNumbers dialog = new GetNumbers();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private double makeDouble(javax.swing.JTextField input){
        String out = input.getText();
        return Double.parseDouble(out);
    }
}
