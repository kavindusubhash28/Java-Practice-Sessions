import java.util.Scanner;

public class bankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Declare Variables
        double balance = 10.99;
        boolean isRunning = true;
        int choice;

        // Display Menu
        while(isRunning){
            System.out.println("****************");
            System.out.println("Banking System");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            // Get and Process User Input
            System.out.println("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }


        //showBalane()


        //deposit()

        //withdraw()

        //exit()

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        double amount;

        System.out.println("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return 0;
        }
        else{
            return amount;
        }

    }
    static double withdraw(double balance){

        double amount;
        System.out.println("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("Insufficient funds.");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }
}
