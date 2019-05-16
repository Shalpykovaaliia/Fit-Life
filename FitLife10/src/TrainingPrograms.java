import javax.swing.*;

public class TrainingPrograms extends JFrame {
    private JTextArea planOut;
    private JPanel panel1;
    private JLabel field;
    private Calories display;
    private static JFrame frame;
    public TrainingPrograms(final Calories main, double caln) {
        this.display = main;
        field.setText(buildHtml(caln));
        display();
    }

    public String buildHtml(double calns){
        String[][] infos = fileInfo.readNutrition("db/trainingProgram.txt", fileInfo.whatToChoose(calns));
        String lis;
        String titlesLis;
        String titles;
        String css = "<style>" + fileInfo.readHtml("css/style.css") + "</style>";
        String common = "";
        String mainHtmlMeal = fileInfo.readHtml("trainingPrograms/sections.html");
        String mainHtmlTitle = fileInfo.readHtml("trainingPrograms/title.html");
        String mainHtmlLi = fileInfo.readHtml("trainingPrograms/li.html");
        String mainHtmlMain = fileInfo.readHtml("trainingPrograms/main.html");
        for(int i = 0;  i < infos.length; i++){
            lis = "";
            titles = "";
            for(int y = 0;  y < infos[i].length; y++) {
                if (y != 0) {
                    if (infos[i][y] != null) lis += mainHtmlLi.replaceAll("changed", "\\"+infos[i][y]);
                }
                else {
                    titles = mainHtmlTitle.replaceAll("changed", "\\"+infos[i][y]);
                }
            }
            if (infos[i][0] != null) {
                titlesLis = titles + lis;
                common += mainHtmlMeal.replaceAll("changed", "\\"+titlesLis);
            }
        }
        return mainHtmlMain.replaceAll("style", "\\"+css).replaceAll("changed", "\\"+common);
    }
    public void display(){
        frame = new JFrame("x");
        frame.setContentPane(this.panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(900,535);
        frame.setLayout(null);
        JScrollPane scroll = new JScrollPane(field, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        frame.add(scroll);
        scroll.setBounds(0,0,886,500);
        frame.setVisible(true);
        frame.setLayout(null);
    }
}
