package abstraction;

public class Main {
    public static void main(String[] args){

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println("Circle area: " + circle.area());
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Rectangle area: " + rectangle.area());

    }
}
