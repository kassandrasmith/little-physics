import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class OpeningDialogue extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextArea pleaseSelectAQuestionTextArea;
    private JRadioButton velocityRadioButton;
    private JRadioButton placeholderRadioButton;
    final Velocity newVelocity = new Velocity();


    public OpeningDialogue() {

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
        velocityRadioButton.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent propertyChangeEvent) {

                //todo do calculations
                //todo output here?
            }
        });
    }

    private void onOK() {

        dispose();
        VelocityInput newguy = new VelocityInput();
        newguy.setVisible(true);
    }


    private void onCancel() {
        dispose();
    }


    public static void main(String[] args) {
        OpeningDialogue openingDialogue = new OpeningDialogue();
        openingDialogue.pack();
        openingDialogue.setVisible(true);
        System.exit(0);
    }
}
