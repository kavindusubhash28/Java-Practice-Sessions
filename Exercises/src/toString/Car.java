package toString;

public class Car {

    String make;
    String model;
    int year;
    String colour;

    Car(String make, String model, int year, String colour){
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    @Override
    public String toString(){
        return "Car [make=" + make + ", model=" + model + ", year=" + year + ", colour=" + colour + "]";
    }
}
