import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        // if statement = performs a block of code if its condition is true
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        System.out.print("What is your name? ");
        name = scanner.nextLine();

        System.out.print("What is your age? ");
        age = scanner.nextInt();

        if(name.isEmpty()){
            System.out.println("You did not enter a name.");
        }

        if (age >= 18){
            System.out.println("You are an adult.");
        }
        else if (age < 0){
            System.out.println("You are not born yet.");
        }
        else if ( age >= 65){
            System.out.println("You are a senior citizen.");
        }
        else if (age == 0){
            System.out.println("You are a baby.");
        }
        else {
            System.out.println("You are not an adult.");
        }

        scanner.close();
    }

}
