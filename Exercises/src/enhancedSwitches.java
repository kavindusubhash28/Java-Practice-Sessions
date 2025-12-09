import java.util.Scanner;

public class enhancedSwitches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();


        switch(day) {
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednessday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + " is not a day");

        }
    }
}
