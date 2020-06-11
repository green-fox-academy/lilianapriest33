package CodingHours;

public class CodingHours {
    public static void main(String[] args) {

        int dailyHours = 6;
        int daysOfWeek = 5;
        int weeks = 17;
        int avgWeeklyHours = 52;

        System.out.println("Hours spent with coding in a semester: " + (weeks * daysOfWeek * dailyHours));

        int a = weeks * daysOfWeek * dailyHours;
        int b = weeks * avgWeeklyHours;

        System.out.println("Percentage of the coding hours: " + ((float) a / b * 100) + "%");
    }
}
