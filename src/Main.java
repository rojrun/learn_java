package src;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String question = "What is 2 + 2?";
        String choiceOne = "2";
        String choiceTwo = "4";
        String choiceThree = "idk";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println(choiceOne);
        System.out.println(choiceTwo);
        System.out.println(choiceThree);

        Scanner input = new Scanner(System.in);
        System.out.println("What is your answer?");
        String userInput = input.next();

        if (correctAnswer.equals(userInput)) {
            System.out.println("You are correct");
        } else {
            System.out.println("Wrong answer");
        }
    }
}
