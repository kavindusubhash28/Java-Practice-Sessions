package toString;

public class Main {
    public static void main(String[] args){

        Car car = new Car("Ford","Mustang",2024,"Red");
        System.out.println(car);
        System.out.println(car.colour + " " + car.model + " " + car.year);
    }
}
