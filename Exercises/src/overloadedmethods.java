public class overloadedmethods {
    public static void main(String[] args) {

        String pizza = bakePizza("flat bread");
        System.out.println(pizza);

//        System.out.println(add(1,2, 3));

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
//    static double add(double a, double b){
//        return a + b;
//    }
//    static double add(double a, double b, double c){
//        return a + b + c;
    }

