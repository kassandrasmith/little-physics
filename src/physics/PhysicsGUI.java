//package physics;
//
//import javax.swing.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class PhysicsGUI {
//    //GUI Elements
//    public JPanel physicsPanel;
//    private JTextField textField1;
//    private JTextField textField2;
//    private JTextField textField3;
//    private JTextField textField4;
//    private JTextField textField5;
//    private JTextField textField6;
//    private JButton calculateButton;
//    //Calculation elements
//    double initialVelocity;
//    double acceleration;
//    double time;
//    double initialX;
//    double velocity;
//    double finalX;
//
//    private void createUIComponents() {
//        physicsPanel = new JPanel();
//    }
//
//    public PhysicsGUI() {
//        JPanel physicsPanel = this.physicsPanel;
//        calculateButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                //stuff for when "calculate" is pressed
//                Velocity velocityCalc = new Velocity();
//                velocityCalc.initialVelocity = initialVelocity;
//                velocityCalc.acceleration = acceleration;
//                velocityCalc.time = time;
//                velocity = velocityCalc.calculateVelocity();
//            }
//        });
//        textField1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                double initialVelocity = Double.parseDouble(textField1.getText());
//            }
//        });
//        textField2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                double acceleration = Double.parseDouble(textField2.getText());
//            }
//        });
//        textField3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                double time = Double.parseDouble(textField3.getText());
//            }
//        });
//        textField4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                double initialX = Double.parseDouble(textField4.getText());
//            }
//        });
//        textField5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                double velocity = Double.parseDouble(textField5.getText());
//            }
//        });
//        textField6.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                double finalX = Double.parseDouble(textField6.getText());
//            }
//        });
//    }
//
//}