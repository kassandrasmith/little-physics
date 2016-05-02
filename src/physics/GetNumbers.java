<<<<<<< HEAD
<<<<<<< HEAD
package physics;

=======
>>>>>>> ade0834... Use JPanels instead of forms
=======
package physics;

>>>>>>> a74c744... Make calculations work
import javax.swing.*;
import java.awt.event.*;

public class GetNumbers extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a74c744... Make calculations work
    private JTextField initialVelocity;
    private JTextField acceleration;
    private JTextField inputTime;
    private JTextField velocityAtTime;
    private JTextField initialX;
    private JTextField outputx;
    public Velocity calculator;
<<<<<<< HEAD
=======
    private JTextField TextField1;
    private JTextField TextField2;
    private JTextField TextField3;
    private JTextField textField4;
    private JTextField TextField5;
    private JTextField textField6;
>>>>>>> ade0834... Use JPanels instead of forms
=======
>>>>>>> a74c744... Make calculations work

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
    private void onOK() {
// add your code here
        calculator = new Velocity();

<<<<<<< HEAD
<<<<<<< HEAD
    private void onOK() #!
=======
    private void onOK() {
// add your code here
        calculator = new Velocity();

=======
>>>>>>> 491f85d... Update number retrieval
        calculator.acceleration = makeDouble(acceleration);
        calculator.initialVelocity = makeDouble(initialVelocity);
        calculator.time = makeDouble(inputTime);
        velocityAtTime.replaceSelection(" " + calculator.calculateVelocity());
<<<<<<< HEAD



    }
>>>>>>> ade0834... Use JPanels instead of forms
=======
    }
>>>>>>> 491f85d... Update number retrieval

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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> a74c744... Make calculations work

    private double makeDouble(javax.swing.JTextField input){
        String out = input.getText();
        return Double.parseDouble(out);
    }
<<<<<<< HEAD
=======
>>>>>>> ade0834... Use JPanels instead of forms
=======
>>>>>>> a74c744... Make calculations work
}
