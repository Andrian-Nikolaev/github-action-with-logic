import java.time.LocalDate;

public class DayCheck {
    public static void main(String[] args) {
        int day = LocalDate.now().getDayOfMonth();

        if (day < 32) {
            System.out.println("Day is valid: " + day);
            System.exit(0);  // success
        } else {
            System.out.println("Invalid day:" + day);
            System.exit(1);  // failure
        } 
    }
}