package HomeWork;

public class Student {
    String name;
    int age;
    String gender;
    String previousOrganization;
    int skippedDays = 0;

    public Student (String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
        this.skippedDays = skippedDays;
    }

    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name +", a " + age + " year old " + gender + "from " + previousOrganization + "who skipped " + skippedDays + " days already from the course.");
    }
    public void skipDays(int numberOfDays) {
    }
}
