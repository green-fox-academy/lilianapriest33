package HomeWork;

public class Main {
    public static void main(String[] args) {
        Person jane1 = new Person("Jane Doe", 30, "female");
        Student jane2 = new Student("Jane Doe", 30, "female", "The School of Life");
        Mentor jane3 = new Mentor("Jane Doe", 30, "female", "intermediate");
        Sponsor jane4 = new Sponsor("Jane Doe", 30, "female", "Google");

        jane4.getGoal();
        jane4.introduce();
        jane4.hire();
    }
}