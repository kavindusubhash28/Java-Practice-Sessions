import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook Launched?",
                              "Who is known as the father of computer?",
                              "what was the first programming language?"};

        String[][] options = {{"1. Stroring files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing Passwords"},
                              {"1. RAM", "2. CPU", "3. Hard Drive", "4. GPU"},
                              {"1. 2000", "2. 2004", "3. 2006", "4. 2008"},
                              {"1. Charles Babbage", "2. Alan Turing", "3. John Von Neumann", "4. Thomas Edison"},
                              {"1. Fortran", "2. COBOL", "3. Assembly Language", "4. Machine Language"}};

        int[] answers = {3, 2, 2, 1, 1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("***************************");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("***************************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.println("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("CORRECT!");
                score++;
            }
            else{
                System.out.println("WRONG!");
                System.out.println("The correct answer was option " + answers[i]);
            }
        }

        System.out.println("Your final score is: " + score + "out of " + questions.length);

        scanner.close();
    }
}
