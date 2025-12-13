import java.util.Scanner;

public class forLoops {
    public static void main(String[] args) throws InterruptedException {

//        for(int i = 1; i <= 10; i+=2){
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter how maany times you want to loop: ");
//        int max = scanner.nextInt();
//
//        for(int i = 0; i < max; i++){
//            System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many seconds to countdown from? ");
        int start = scanner.nextInt();

//        int start = 10;
        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Happy New Year!");
    }
}
