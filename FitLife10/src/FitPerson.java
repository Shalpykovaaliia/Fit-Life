public class FitPerson {

    private String givenName;
    private String givenSurname;
    private String givenGender;
    private String givenAge;
    private String givenWeight;
    private String givenHeight;
    private String givenActivity;
    private String givenGoal;

    public FitPerson(String givenName, String givenSurname, String givenGender, String givenAge, String givenWeight, String givenHeight, String givenActivity, String givenGoal){
        this.givenName = givenName;
        this.givenSurname = givenSurname;
        this.givenGender = givenGender;
        this.givenAge = givenAge;
        this.givenWeight = givenWeight;
        this.givenHeight = givenHeight;
        this.givenActivity = givenActivity;
        this.givenGoal = givenGoal;
    }
    ///Setters

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setGivenSurname(String givenSurname) {
        this.givenSurname = givenSurname;
    }

    public void setGivenGender(String givenGender) {
        this.givenGender = givenGender;
    }

    public void setGivenAge(String givenAge) {
        this.givenAge = givenAge;
    }

    public void setGivenWeight(String givenWeight) {
        this.givenWeight = givenWeight;
    }

    public void setGivenHeight(String givenHeight) {
        this.givenHeight = givenHeight;
    }

    public void setGivenActivity(String givenActivity) {
        this.givenActivity = givenActivity;
    }

    public void setGivenGoal(String givenGoal) {
        this.givenGoal = givenGoal;
    }

    ///Getters
    public String getGivenName() {
        return givenName;
    }

    public String getGivenSurname() {
        return givenSurname;
    }

    public String getGivenGender() {
        return givenGender;
    }

    public String getGivenAge() {
        return givenAge;
    }

    public String getGivenWeight() {
        return givenWeight;
    }

    public String getGivenHeight() {
        return givenHeight;
    }

    public String getGivenActivity() {
        return givenActivity;
    }

    public String getGivenGoal() {
        return givenGoal;
    }
}
