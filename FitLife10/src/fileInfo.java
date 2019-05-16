import java.io.*;

public class fileInfo {
    public static BufferedReader fileR;
    public static BufferedWriter fileW;
    public static void writeFile(String nickname,String pass, String name, String surname, String gender, String age, String weight, String height, String activity, String goal){
        try {
            fileW = new BufferedWriter(new FileWriter("db/db.txt",true));
            fileW.newLine();
            fileW.write(nickname + "#" + pass + "#"+ name + "#" + surname + "#" + gender + "#" + age + "#" + weight + "#" + height + "#" + activity + "#" + goal);
            closeFileW();
        } catch (IOException e){
            System.out.println(e);
        }
    }
    public static String readHtml(String directory){
        String lines = "";
        String line;
        try {
            fileR = new BufferedReader(new FileReader("templates/" + directory));
            while ((line = fileR.readLine()) != null){
                lines += line;
            }
            closeFileR();
        } catch (IOException e){
            System.out.println(e);
        }
        return lines;
    }
    public static String[] readFile(String directory){
        String line;
        String[] arr = new String[0];
        try {
            int c = 0;
            fileR = new BufferedReader(new FileReader(directory));
            while ((fileR.readLine()) != null){
                c++;
            }
            arr = new String[c];
            fileR = new BufferedReader(new FileReader(directory));
            c = 0;
            while ((line = fileR.readLine()) != null){
                arr[c] = line;
                c++;
            }
            closeFileR();
        } catch (IOException e){
            System.out.println(e);
        }
        return arr;
    }
    public static boolean isInt(String integ){
        try{
            Integer.parseInt(integ);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    public static int whatToChoose(double numberOfCalories){
        int choosenCalories = 0;

        int equivalent;
        if (numberOfCalories < 1000) equivalent = 0;
        else if (numberOfCalories >= 10000) equivalent = Integer.parseInt(Double.toString(numberOfCalories).substring(0,1)) * 10;
        else equivalent = Integer.parseInt(Double.toString(numberOfCalories).substring(0,1));
        if (numberOfCalories > 1000) {
            if ((int) numberOfCalories % 1000 <= 250 && (int) numberOfCalories % 1000 >= 0) choosenCalories = 1000 * equivalent;
            else if ((int) numberOfCalories % 1000 > 250 && (int) numberOfCalories % 1000 < 750) {
                if ((int)numberOfCalories < 1000) choosenCalories = 100 * equivalent + 500;
                else choosenCalories = 1000 * equivalent + 500;
            }
            else if ((int) numberOfCalories % 1000 >= 750) choosenCalories = 1000 * equivalent + 1000;
        } else if (numberOfCalories >= 10000) {
            if ((int) numberOfCalories % 10000 <= 250 && (int) numberOfCalories % 10000 >= 0) choosenCalories = 10000 * equivalent;
            else if ((int) numberOfCalories % 10000 > 250 && (int) numberOfCalories % 10000 < 750) choosenCalories = 10000 * equivalent + 500;
        } else {
            if (numberOfCalories > 0) choosenCalories = 1000;
        }
        System.out.println(choosenCalories);
        return choosenCalories;
    }
    public static int toInt(String integ){
        try{
            return Integer.parseInt(integ);
        } catch (NumberFormatException e){
            return -1;
        }
    }
    public static String[][] readNutrition(String directory, int calory){
        String line;
        String[][] ln = new String[10][15];
        try {
            fileR = new BufferedReader(new FileReader(directory));
            boolean flag = false;
            boolean readIt = false;
            int g = 0;
            while ((line = fileR.readLine()) != null){
                    if (isInt(line)){
                        if (toInt(line) == calory ) {
                            readIt = true;
                            flag = true;
                            continue;
                        }
                    } else {
                        if (readIt && flag) {
                            if (line.isEmpty()) break;
                                String[] mb = line.split("#");
                                for (int i = 0; i < mb.length; i++) {
                                    ln[g][i] = mb[i];
                                }
                                g++;
                        }
                    }
            }
            closeFileR();
        } catch (IOException e){
            System.out.println(e);
        }

        return ln;
    }

    public static void closeFileR(){
            try {
                fileR.close();
            } catch (IOException e){
                System.out.println(e);
            }
    }
    public static void closeFileW(){
            try {
                fileW.close();
            } catch (IOException e){
                System.out.println(e);
            }
    }


}
