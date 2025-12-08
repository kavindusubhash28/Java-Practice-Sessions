import java.util.Scanner;

public class temperatureConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celcius or Fahrenheit? (C/F): ");
        unit = scanner.next().toUpperCase();

        //(condition) ? true : false
        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.println(newTemp);

        scanner.close();
    }
}
