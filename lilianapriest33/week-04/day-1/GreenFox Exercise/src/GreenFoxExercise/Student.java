package GreenFoxExercise;

public class Student extends Person{
    private String previousOrganization;
    private int skippedDays;

    public Student(String name, int age, String gender,String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
    }

    public Student () {
        this.previousOrganization = "The School of Life";
        this.skippedDays = 0;
    }

    @Override
    protected String specificIntroduce() {
        return " from " + this.previousOrganization + " who skipped " + this.skippedDays + " days already from the course.";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Be a junior software developer.");
    }

    public int skipDays(int numberOfDays) {
        this.skippedDays += numberOfDays;
        return skippedDays;
    }
}
