import java.util.Scanner;

public class userinputArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods;
        int size;

        System.out.println("What # of food do you want?: ");
        size = scanner.nextInt();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }
        scanner.close();
    }
}
