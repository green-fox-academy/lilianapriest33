package Exercises.TeachersStudents;

public class Teacher {
    private String teacher;

    public Teacher() {
    }

    public void teach(Student student) {
        student.learn();
        }

    public void answer() {
        System.out.println("The teacher is answering a question.");
    }
}
