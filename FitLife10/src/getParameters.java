public class getParameters {
    String login;
    String password;
    String[] userInformation;
    boolean isExist = false;
    public getParameters(String login,String password){
        this.login = login;
        this.password = password;
        if(getInfo.isExist(login,password)) {
            userInformation = getInfo.findPerson(login,password);
            isExist = true;
        } else {
            System.out.println("User not found");
        }
    }
    public int weight(){
        int weight = 0;
        try {
                weight = Integer.parseInt(userInformation[6]);
        } catch (NumberFormatException  e){
                System.out.println(e);
        }
        return weight;
    }
    public int age(){
        int age = 0;
        try {
                age = Integer.parseInt(userInformation[5]);
        } catch (NumberFormatException  e){
                System.out.println(e);
        }
        return age;
    }
    public int height(){
        int height = 0;
        try {
            height = Integer.parseInt(userInformation[7]);
        } catch (NumberFormatException  e){
            System.out.println(e);
        }
        return height;
    }
    public String name(){
        String name = "";
        name = userInformation[2];
        return name;
    }
    public String surname(){
        String surname = "";
        surname = userInformation[3];
        return surname;
    }
    public String gender(){
        String gender = "";
        gender = userInformation[4];
        return gender;
    }
    public String isActive(){
        String active = "";
        active = userInformation[8];
        return active;
    }
    public String goal(){
        String goal = "";
        goal = userInformation[9];
        return goal;
    }

    public static void main(String[] args) {


    }
}
