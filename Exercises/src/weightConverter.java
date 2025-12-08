import java.util.Scanner;

public class weightConverter {
    public static void main(String[] args) {

        //Weight Converting program

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the Weight Converter!");
        System.out.println("1. Convert lbs to kilograms");
        System.out.println("2. Convert kilograms to lbs");

        System.out.println("Choose an option: ");
        choice = scanner.nextInt();

        System.out.print(choice);

        if(choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: "+ newWeight);
        }
        else if(choice == 2) {
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("The new weight in lbs is: "+ newWeight);
        }
        else {
            System.out.println("Invalid choice. Please select 1 or 2.");
        }
    }
}

