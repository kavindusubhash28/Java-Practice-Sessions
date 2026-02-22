package WrapperClass;

public class main {
    public static void main(String[] args){

        String a =  Integer.toString(123);
        String b =  Double.toString(3.14);
        String c = Character.toString('A');
        String d = Boolean.toString(true);

        String x = a + b + c + d;

        System.out.println(x);


    }
}
