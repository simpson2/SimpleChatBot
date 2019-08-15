import java.util.Scanner;

/**
 * Program which asks for name, guesses your age based on certain parameters
 * and conducts a programming quiz before shutting down.
 * @author Saulius Baltramonaitis
 * @version 1.0
 * @since 2019-08-15
 */

public class Chatbot {
    Scanner sc = new Scanner(System.in);

    String[] quizAnswers = {
            "1. To repeat a statement multiple times.",
            "2. To decompose a program into several small subroutines.",
            "3. To determine the execution time of a program.",
            "4. To interrupt the execution of a program.",
    };

    /**
     * Method to determine user's name.
     */
    public void name() {
        System.out.println("Hello! I am 'simple chat bot 1.0'. What shall I call you?>>>");
        System.out.println("Name registered. Hello "+sc.nextLine()+"!");
    }

    /**
     * Method to determine user's age based on divisors.
     */
    public void age() {
        System.out.println("I will now attempt to determine your age.");
        System.out.println("Please enter the remainder when your age is divided by 3, 5, 7 respectively.>>>");
        int age = (sc.nextInt() * 70 + sc.nextInt() * 21 + sc.nextInt() * 15) % 105;
        System.out.println("You are "+age+" years old.");
    }

    /**
     * Method to conduct a quiz. Program will continue to run until right answer is given.
     */
    public void quiz() {
        System.out.println("Initialising simple quiz...");
        System.out.println();
        System.out.println("Why do we use methods?");
        System.out.println();

        for (String quizAnswer : quizAnswers) { //foreach loop instead of for loop
            System.out.println(quizAnswer);
        }

        while(sc.nextInt() != 2) {
            System.out.println("That is incorrect. Please try again.");
        }
        sc.close();
        System.out.println("That is correct!");
        System.out.println("Program terminating. Have a good day.");
    }
}
