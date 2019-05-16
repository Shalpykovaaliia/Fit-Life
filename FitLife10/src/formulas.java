public class formulas {

    public static double getCalories(String login,String pass){
        getParameters essential = new getParameters(login,pass);
        double calorie;
        if (essential.gender().equals("Female")){
            calorie = formula(essential.age(), essential.weight(), essential.height()) - 150;
            calorie = activeCalorie(calorie, essential.isActive());
            calorie = goalCalories(calorie, essential.goal());
        }
        else{
            calorie = formula(essential.age(), essential.weight(), essential.height());
            calorie = activeCalorie(calorie, essential.isActive());
            calorie = goalCalories(calorie, essential.goal());
        }
        return calorie;
    }

    private static double activeCalorie(double calorie, String isActive){
        switch ( isActive){
            case "Active":
                calorie += 200;
                break;
            case "Not Active":
                calorie -= 200;
                break;
            case "Super Active":
                calorie += 400;
                break;
        }
        return calorie;
    }
    private static double goalCalories(double calorie, String isGoal){
        switch ( isGoal){
            case "Loose":
                calorie -= 200;
                break;
            case "Gain":
                calorie += 500;
                break;
        }
        return calorie;
    }

    public static double formula(int age, int weight, int height){
        double f;
        f = (10 * weight + 6.25 * height - age * 5 - 5);
        return f;

    }
}
