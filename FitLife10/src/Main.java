import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.awt.event.*;

public class Main {

        public static JFrame frame = new JFrame();
        public static JLabel panelB = new JLabel(), bodies = new JLabel();
        public static JLabel[] buttons = {new JLabel(),new JLabel()};
        public static JPanel panel = new JPanel();
        public static ImageIcon background, button1, button2, panelb;
        public static int WIDTH = 850, HEIGHT = 540;
        public static JLayeredPane layered = new JLayeredPane();
        public JTextField myTextField; // login field
        public JPasswordField passwordField; // password field

    public Main(){
            buttons[0].addMouseListener(new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent e)
                {
                    if (!myTextField.getText().isEmpty()){
                        if (getInfo.isExist(myTextField.getText(),passwordField.getText())) new Calories(Main.this, formulas.getCalories(myTextField.getText(),passwordField.getText()));
                        else {
                            int dialogButton = JOptionPane.YES_NO_OPTION;
                            int dialogResult = JOptionPane.showConfirmDialog (null, "This person wasn't registered yet, would you like to registrate now?","Warning",dialogButton);
                            if(dialogResult == JOptionPane.YES_OPTION){
                                new Register(Main.this, myTextField.getText(),passwordField.getText());
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"You haven't entered any nickname, please enter a nickname","Error",JOptionPane.ERROR_MESSAGE );
                    }

                }
            });
            buttons[1].addMouseListener(new MouseAdapter()
            {
                @Override
                public void mouseClicked(MouseEvent e)
                {
                    new Register(Main.this, "","");
                }
            });
        }

        public void load(){
            try{
                background = new ImageIcon(ImageIO.read(new FileInputStream("imgs/background.jpg")));
                button1 = new ImageIcon(ImageIO.read(new FileInputStream("imgs/lgn.png")));
                button2 = new ImageIcon(ImageIO.read(new FileInputStream("imgs/sv.png")));
                panelb = new ImageIcon(ImageIO.read(new FileInputStream("imgs/panel.png")));
            } catch (Exception e){
                System.out.println(e);
            }

        }

        private void display() {
            frame.pack();
            panel.setBackground(Color.BLACK);
            load();
            frame.setContentPane(layered);

            bodies.setIcon(background);
            bodies.setBounds(0,-13,1110,525);

            buttons[0].setIcon(button1);
            buttons[0].setBounds(64,230,153,50);
            buttons[0].setText( "LogIn" );
            buttons[0].setHorizontalTextPosition(JLabel.CENTER);
            buttons[0].setVerticalTextPosition(JLabel.CENTER);

            buttons[1].setIcon(button2);
            buttons[1].setBounds(120,325,200,50);
            buttons[1].setText( "Registration" );
            buttons[1].setHorizontalTextPosition(JLabel.CENTER);
            buttons[1].setVerticalTextPosition(JLabel.CENTER);

            buttons[0].setCursor(new Cursor(Cursor.HAND_CURSOR));
            buttons[1].setCursor(new Cursor(Cursor.HAND_CURSOR));

            myTextField = new JTextField();
            myTextField.setSize(300,37);
            myTextField.setBounds(64,150,300,37);

            passwordField = new JPasswordField();
            passwordField.setSize(300,37);
            passwordField.setBounds(64,190,300,37);

            JLabel txtlog = new JLabel("<html><style>.biglogin {font-size: 16px; font-style: sans-serif;}</style><body><div class=\"biglogin\">NickName and Password:</div></body></html>");
            txtlog.setBounds(70,80,400,37);

            JLabel txtlg = new JLabel("<html><style>.bigl {font-size: 10px; font-style: sans-serif; color: #635959;}</style><body><div class=\"bigl\">You can register, if you haven't use the program</div></body></html>");
            txtlg.setBounds(70,280,400,37);


            panelB.setIcon(panelb);
            panelB.setBounds(30,50,370,350);

            frame.setSize(WIDTH, HEIGHT);
            frame.setLocationRelativeTo(null);

            //Set a default close action
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Set a title
            frame.setTitle("FitLife");
            //Disable resize
            frame.setResizable(false);
            frame.setVisible(true);


            layered.add(myTextField,0);
            layered.add(passwordField, 0);
            layered.add(txtlog,1);
            layered.add(txtlg,2);

            layered.add(bodies,4);
            layered.add(panelB,3);
            layered.add(buttons[0],3);
            layered.add(buttons[1], 3);

            // To animate background image
            Animate.animateBackground();
        }

        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Main().display();
                }
            });
        }
    }
