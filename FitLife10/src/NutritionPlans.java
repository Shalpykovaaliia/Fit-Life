import javax.swing.*;

public class NutritionPlans extends JFrame {
    private JTextArea planOut;
    private JPanel panel1;
    private JLabel field;
    private Calories display;
    private static JFrame frame;
    public NutritionPlans(final Calories main, double caln) {
        this.display = main;
        field.setText(buildHtml(caln));
        display();
    }

    public String buildHtml(double calns){
        String[][] infos = fileInfo.readNutrition("db/nutrition.txt", fileInfo.whatToChoose(calns));

        String lis;
        String titlesLis;
        String titles;
        String css = "<style>" + fileInfo.readHtml("css/style.css") + "</style>";
        String common = "";
        String mainHtmlMeal = fileInfo.readHtml("nutritionPlans/sections.html");
        String mainHtmlTitle = fileInfo.readHtml("nutritionPlans/title.html");
        String mainHtmlLi = fileInfo.readHtml("nutritionPlans/li.html");
        String mainHtmlMain = fileInfo.readHtml("nutritionPlans/main.html");
        for(int i = 0;  i < infos.length; i++){
            lis = "";
            titles = "";
            for(int y = 0;  y < infos[i].length; y++) {
                if (y != 0) {
                    if (infos[i][y] != null) lis += mainHtmlLi.replaceAll("text", "\\"+infos[i][y]);
                }
                else {
                    titles = mainHtmlTitle.replaceAll("text", "\\"+infos[i][y]);
                }
            }
            if (infos[i][0] != null) {
                titlesLis = titles + lis;
                common += mainHtmlMeal.replaceAll("text", "\\"+titlesLis);
            }
        }
        return mainHtmlMain.replaceAll("style", "\\"+css).replaceAll("text", "\\"+common);
    }
    public void display(){
        frame = new JFrame("Training Programs");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(900,535);
        frame.setLayout(null);
        JScrollPane scroll = new JScrollPane(field, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scroll);
        scroll.setBounds(0,0,886,500);
        frame.setVisible(true);

        //textField1.setText("");
        //caloriesLabel.setText("test1");
    }
}
