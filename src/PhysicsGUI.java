import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by kassandra on 4/19/16.
 */
public class PhysicsGUI {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JButton calculateButton;
    private JScrollBar scrollBar1;

    public PhysicsGUI() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //stuff for when "calculate" is pressed
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double initialVelocity = Double.parseDouble(textField1.getText());
            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double acceleration = Double.parseDouble(textField2.getText());
            }
        });
        textField3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double time = Double.parseDouble(textField3.getText());
            }
        });
        textField4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double initialX = Double.parseDouble(textField4.getText());
            }
        });
        textField5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double velocity = Double.parseDouble(textField5.getText());
            }
        });
        textField6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double finalX = Double.parseDouble(textField6.getText());
            }
        });
    }
}
