package composition;

public class main {
    public static void main(String[] args){

        Car car = new Car("corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }
}
