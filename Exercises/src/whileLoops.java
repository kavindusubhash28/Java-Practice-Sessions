import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        String name = "";
//
//        while (name.trim().isEmpty()) {
//            System.out.print("Enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);
//
//        scanner.close();

//        Scanner scanner = new Scanner(System.in);
//
//        String response = "";
//
//        while (!response.equals("Q")){
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//
//        System.out.println("You have quit the game.");

        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        while(age < 0) {
            System.out.println("yOUR AGE CANNOT BE NEGATIVE. ");
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old.");

        scanner.close();

        }
    }
