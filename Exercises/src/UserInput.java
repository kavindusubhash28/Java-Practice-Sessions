import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);



        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();



        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("Your gpa is:" +gpa);

        if (isStudent){
            System.out.println("You are enrolles as a student");
        }
        else {
            System.out.println("You are not enrolles as a student");
        }

        scanner.close();
    }
}
