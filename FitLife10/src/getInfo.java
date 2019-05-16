import java.awt.*;

public class getInfo {
    private static String[] userInfo;
    public getInfo() {

    }
    public static boolean isExist(String login, String pass){
        for(String user: fileInfo.readFile("db/db.txt")){
            if (user.split("#")[0].equals(login) && user.split("#")[1].equals(pass)){
                return true;
            }
        }
        return false;
    }
    public static String[] findPerson(String login, String pass){
        for(String user: fileInfo.readFile("db/db.txt")){
            userInfo = user.split("#");
            if (userInfo[0].equals(login) && userInfo[1].equals(pass)){
                return userInfo;
            }
        }
        return new String[0];
    }

}
