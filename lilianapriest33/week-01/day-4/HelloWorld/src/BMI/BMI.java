package BMI;

public class BMI {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;
        double heightInM2 = (heightInM * 2);

        System.out.println("Your BMI is: "+ (massInKg / heightInM2));
    }

}
