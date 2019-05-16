import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calories extends JFrame {
    private JPanel panel1;
    private JLabel fs;
    private JButton nutritionPlanButton, trainingPlanButton;

    private Main display;

    public Calories(final Main main, double caln) {
        this.display = main;
        fs.setText(String.valueOf(caln));
        display();
        nutritionPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NutritionPlans(Calories.this, caln);
            }
        });
        trainingPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TrainingPrograms(Calories.this, caln);
            }
        });
    }

    public void display(){
        JFrame frame = new JFrame("FitLife");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
