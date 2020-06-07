package HomeWork;

public class Mentor {
    String name;
    int age;
    String gender;
    String level; //junior, intermediate, senior

    public Mentor (String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public void getGoal() {
        System.out.println("Educate brilliant junior software developers.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name +", a " + age + " year old " + gender + " " + level + " mentor.");
    }
}