import java.util.Scanner;

public class shoppingCart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to purchase? ");
        item = scanner.nextLine();

        System.out.print("What is the price for each? ");
        price = scanner.nextDouble();

        System.out.print("How many would you like to purchase? ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.printf("You are purchasing %d %s(s) at %c%.2f each. Total: %c%.2f\n", quantity, item, currency, price, currency, total);



        scanner.close();
    }
}
