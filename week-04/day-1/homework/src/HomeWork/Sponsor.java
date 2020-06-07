package HomeWork;

public class Sponsor {
    String name;
    int age;
    String gender;
    String company;
    int hiredStudents = 0;

    public Sponsor (String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = hiredStudents;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name +", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("Hire brilliant junior software developers.");
    }
}
