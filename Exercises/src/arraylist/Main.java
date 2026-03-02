package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        int numOfFood;
        while (true) {
            System.out.print("Enter the # of food you would like: ");
            if (scanner.hasNextInt()) {
                numOfFood = scanner.nextInt();
                scanner.nextLine();
                if (numOfFood >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("That's not a valid number. Please enter an integer.");
                scanner.nextLine();
            }
        }

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
