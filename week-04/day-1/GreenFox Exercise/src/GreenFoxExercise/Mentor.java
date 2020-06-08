package GreenFoxExercise;

public class Mentor extends Person{
    private String level; //junior, intermediate, senior

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
    }

    public Mentor () {
        this.level= "intermediate";
    }

    @Override
    protected String specificIntroduce() {
        return " " + level + " mentor.";
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}