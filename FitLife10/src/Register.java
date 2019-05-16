import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Register extends JFrame {
    private JPanel FitLife;
    private JTextField nameInput;
    private JTextField surnameInput;
    private JTextField ageInput;
    private JTextField weightInput;
    private JTextField heightInput;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton notActiveRadioButton;
    private JRadioButton activeRadioButton;
    private JRadioButton superActiveRadioButton;
    private JRadioButton looseRadioButton;
    private JRadioButton maintainRadioButton;
    private JRadioButton gainRadioButton;
    private JButton OKButton;
    private JTextField nicknameInput;
    private JLabel nicknameLabel;
    private JLabel surnameLabel;
    private JLabel genderLabel;
    private JLabel ageLabel;
    private JLabel weightLabel;
    private JLabel heightLabel;
    private JLabel activityLabel;
    private JLabel goalLabel;
    private JLabel nameLabel;
    private JPasswordField passwordField1;
    private JLabel passwordLabel;
    private JFrame frame;


    private Main display;

    public Register(final Main main, String login, String pass) {
        super("FitLife");
        this.display = main;
        display();
        if (!login.isEmpty()) this.nicknameInput.setText(login);
        nameInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        surnameInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        maleRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              if(!getInfo.isExist(nicknameInput.getText(),passwordField1.getText())){
                        fileInfo.writeFile(nicknameInput.getText(),passwordField1.getText(),nameInput.getText(),surnameInput.getText(),maleRadioButton.isSelected() ? "Male" : "Female",ageInput.getText(), weightInput.getText(), heightInput.getText(),notActiveRadioButton.isSelected() ? "Not Active" : (activeRadioButton.isSelected() ? "Active" : "Super Active"), looseRadioButton.isSelected() ? "Loose" : (maintainRadioButton.isSelected() ? "Maintain" : "Gain"));
                        JOptionPane.showMessageDialog(null,"You have registered successful","Info", JOptionPane.PLAIN_MESSAGE );
                        display.myTextField.setText(nicknameInput.getText());
                        display.passwordField.setText(passwordField1.getText());
                        new Calories(display,formulas.getCalories(nicknameInput.getText(),passwordField1.getText()));
                        frame.dispose();
                    } else {
                        int dialogButton = JOptionPane.YES_NO_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog (null, "This nickname is already exist, would you like to login with this nickname?","Warning",dialogButton);
                        if(dialogResult == JOptionPane.YES_OPTION){
                            display.myTextField.setText(nicknameInput.getText());
                            display.passwordField.setText(passwordField1.getText());
                            new Calories(display,formulas.getCalories(nicknameInput.getText(),passwordField1.getText()));
                            frame.dispose();
                        }
                    }

                }

            }

        });
        notActiveRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public void display() {
        frame = new JFrame("Registration");
        frame.setContentPane(this.FitLife);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
