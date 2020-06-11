package GreenFoxExercise;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public Sponsor () {
        this.company = "Google";
        this.hiredStudents = 0;
    }

    @Override
    protected String specificIntroduce() {
        return " who represents " + company + " and hired " + hiredStudents + " students so far.";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public int hire() {
        hiredStudents++;
        return hiredStudents;
    }
}
