import javax.swing.*;

public class Checker {
    public static int age(String age){
        // returns 0 when it is empty
        if (age.equals("")) return 0;
        try {
            int intAge = Integer.parseInt(age);
            // returns 2 if age is smaller than 0
            if (intAge <= 0) return 2;
            // returns 3 if age is bigger than 150
            else if (intAge > 150) return 3;
        } catch (NumberFormatException  e){
            // returns 1 if age is not a number
            return 1;
        }
        // returns 4 if happened something wrong
        return 4;
    }
    public static int weight(String weight){
        // returns 0 when it is empty
        if (weight.equals("")) return 0;
        try {
            int intWeight = Integer.parseInt(weight);
            // returns 2 if weight is smaller than 0
            if (intWeight <= 0) return 2;
                // returns 3 if weight is bigger than 500
            else if (intWeight > 500) return 3;
        } catch (NumberFormatException  e){
            // returns 1 if weight is not a number
            return 1;
        }
        // returns 4 if happened something wrong
        return 4;
    }

    public static int height(String height){
        // returns 0 when it is empty
        if (height.equals("")) return 0;
        try {
            int intHeight = Integer.parseInt(height);
            // returns 2 if height is smaller than 0
            if (intHeight <= 0) return 2;
                // returns 3 if height is bigger than 250
            else if (intHeight > 250) return 3;
        } catch (NumberFormatException  e){
            // returns 1 if height is not a number
            return 1;
        }
        // returns 1 if happened something wrong
        return 4;
    }

    public static int name(String name){
        // returns 0 when it is empty
        if (name.equals("")) return 0;
            // returns 2 if name length is smaller than 3 characters
        else if (name.length() < 3) return 2;
            // returns 3 if name length is bigger than 15 characters
        else if (name.length() > 15) return 3;
            // returns 1 if name contains number/s
        else if (!name.matches ("[a-zA-Z- ]+")) return 1;
        else return 5;
    }
    public static int surname(String surname){
        // returns 0 when it is empty
        if (surname.equals("")) return 0;
            // returns 2 if surname length is smaller than 3 characters
        else if (surname.length() < 3) return 2;
            // returns 3 if surname length is bigger than 15 characters
        else if (surname.length() > 15) return 3;
            // returns 1 if surname contains number/s
        else if (!surname.matches ("[a-zA-Z- ]+")) return 1;
        else return 5;
    }

    public static int nickname(String name){
        // returns 0 when it is empty
        if (name.equals("")) return 0;
            // returns 2 if name length is smaller than 3 characters
        else if (name.length() < 3) return 2;
            // returns 3 if name length is bigger than 15 characters
        else if (name.length() > 15) return 3;
            // returns 1 if name contains other characters
        else if (!name.matches ("[a-zA-Z0-9-.]+")) return 1;
        else return 5;
    }
    public static int password(String pass){
        // returns 0 when it is empty
        if (pass.equals("")) return 0;
            // returns 2 if name length is smaller than 3 characters
        else if (pass.length() < 3) return 2;
            // returns 3 if name length is bigger than 15 characters
        else if (pass.length() > 15) return 3;
            // returns 1 if name contains other characters
        else if (!pass.matches ("[a-zA-Z0-9-.]+")) return 1;
        else return 5;

    }
    public static int gender(boolean male, boolean female){
        // returns 0 when it wasn't selected
        if (!(male || female)) return 0;
            // returns 5 if is is ok
        else return 5;
    }
    public static int active(boolean notActive, boolean Active, boolean superActive){
        // returns 0 when it wasn't selected
        if (!(notActive || Active || superActive)) return 0;
            // returns 5 if is is ok
        else return 5;
    }

    public static int goal(boolean loose, boolean maintain, boolean gain){
        // returns 0 when it wasn't selected
        if (!(loose || maintain || gain)) return 0;
            // returns 5 if is is ok
        else return 5;
    }

    public static boolean checkAll(String nickname, String password, String name, String surname, int gender, String age, String weight, String height, int activity, int goal){
        switch (nickname(nickname)){
            case 0:
                JOptionPane.showMessageDialog(null,"Please enter your Nickname","Nickname ERROR",JOptionPane.PLAIN_MESSAGE );
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Your Nickname is too short","Nickname ERROR",JOptionPane.PLAIN_MESSAGE );
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Your Nickname is too long","Nickname ERROR",JOptionPane.PLAIN_MESSAGE );
                break;
            case 5:
                switch (password(password)){
                    case 0:
                        JOptionPane.showMessageDialog(null,"Please enter your Password","Password ERROR",JOptionPane.PLAIN_MESSAGE );
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,"Your Password is too short","Password ERROR",JOptionPane.PLAIN_MESSAGE );
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null,"Your Password is too long","Password ERROR",JOptionPane.PLAIN_MESSAGE );
                        break;
                    case 5:
                        switch (name(name)){
                            case 0:
                                JOptionPane.showMessageDialog(null,"Please enter your Name","Name ERROR",JOptionPane.PLAIN_MESSAGE );
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null,"Your name has to consist of only English characters","Name ERROR",JOptionPane.PLAIN_MESSAGE );
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null,"Your name is too short","Name ERROR",JOptionPane.PLAIN_MESSAGE );
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null,"Your name is too long","Name ERROR",JOptionPane.PLAIN_MESSAGE );
                                break;
                            case 5:
                                switch (surname(surname)){
                                    case 0:
                                        JOptionPane.showMessageDialog(null,"Please enter your Surname","Surname ERROR",JOptionPane.PLAIN_MESSAGE );
                                        break;
                                    case 1:
                                        JOptionPane.showMessageDialog(null,"Your Surname has to consist of only English characters(no numbers)","Surname ERROR",JOptionPane.PLAIN_MESSAGE );
                                        break;
                                    case 2:
                                        JOptionPane.showMessageDialog(null,"Your Surname is too short","Surname ERROR",JOptionPane.PLAIN_MESSAGE );
                                        break;
                                    case 3:
                                        JOptionPane.showMessageDialog(null,"Your Surname is too long","Surname ERROR",JOptionPane.PLAIN_MESSAGE );
                                        break;
                                    case 5:
                                        switch (gender){
                                            case 0:
                                                JOptionPane.showMessageDialog(null,"You have not selected Gender","Gender ERROR",JOptionPane.PLAIN_MESSAGE );
                                                break;
                                            case 5:
                                                switch (age(age)){
                                                    case 0:
                                                        JOptionPane.showMessageDialog(null,"Please enter your Age","Age ERROR",JOptionPane.PLAIN_MESSAGE );
                                                        break;
                                                    case 1:
                                                        JOptionPane.showMessageDialog(null,"Your Age has to consist of only numbers","Age ERROR",JOptionPane.PLAIN_MESSAGE );
                                                        break;
                                                    case 2:
                                                        JOptionPane.showMessageDialog(null,"Your Age can not be smaller than 0","Age ERROR",JOptionPane.PLAIN_MESSAGE );
                                                        break;
                                                    case 3:
                                                        JOptionPane.showMessageDialog(null,"Your Age can not be so big, it is impossible","Age ERROR",JOptionPane.PLAIN_MESSAGE );
                                                        break;
                                                    case 4:
                                                        switch (weight(weight)){
                                                            case 0:
                                                                JOptionPane.showMessageDialog(null,"Please enter your Weight","Weight ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                break;
                                                            case 1:
                                                                JOptionPane.showMessageDialog(null, "Your Weight has to consist of only numbers","Weight ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                break;
                                                            case 2:
                                                                JOptionPane.showMessageDialog(null,"Your Weight can not be smaller than 0","Weight ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                break;
                                                            case 3:
                                                                JOptionPane.showMessageDialog(null,"Your Weight can not be so big","Weight ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                break;
                                                            case 4:
                                                                switch (height(height)){
                                                                    case 0:
                                                                        JOptionPane.showMessageDialog(null,"Please enter your Height","Height ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                        break;
                                                                    case 1:
                                                                        JOptionPane.showMessageDialog(null,"Your Height has to consist of only numbers","Height ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                        break;
                                                                    case 2:
                                                                        JOptionPane.showMessageDialog(null,"Your Height can not be smaller than 0","Height ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                        break;
                                                                    case 3:
                                                                        JOptionPane.showMessageDialog(null,"Your Weight can not be so big","Height ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                        break;
                                                                    case 4:
                                                                        switch (activity){
                                                                            case 0:
                                                                                JOptionPane.showMessageDialog(null,"You have not selected your Activity","Activity ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                                break;
                                                                            case 5:
                                                                                switch (goal){
                                                                                    case 0:
                                                                                        JOptionPane.showMessageDialog(null,"You have not selected your Goal","Goal ERROR",JOptionPane.PLAIN_MESSAGE );
                                                                                        break;
                                                                                    case 5:
                                                                                        return true;
                                                                                    default:
                                                                                        System.out.println("Input Special Exception Error");
                                                                                        break;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                System.out.println("Input Special Exception Error");
                                                                                break;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        System.out.println("Input Special Exception Error");
                                                                        break;
                                                                }
                                                                break;
                                                            default:
                                                                System.out.println("Input Special Exception Error");
                                                                break;
                                                        }
                                                        break;
                                                    default:
                                                        System.out.println("Input Special Exception Error");
                                                        break;
                                                }
                                                break;
                                            default:
                                                System.out.println("Input Special Exception Error");
                                                break;
                                        }
                                        break;
                                    default:
                                        System.out.println("Input Special Exception Error");
                                        break;
                                }
                                break;
                            default:
                                System.out.println("Input Special Exception Error");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Input Special Exception Error");
                        break;
                }
                break;
            default:
                System.out.println("Input Special Exception Error");
                break;
        }
        return false;
    }
}
