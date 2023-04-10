import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz App!");

        // Question 1
        System.out.println("Question 1: What is the capital of India?");
        System.out.println("A. New Delhi");
        System.out.println("B. Mumbai");
        System.out.println("C. Kolkata");
        System.out.println("D. Bangalore");
        String ans1 = sc.nextLine().toUpperCase();

        if (ans1.equals("A")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is A. New Delhi.");
        }

        // Question 2
        System.out.println("Question 2: Who is the CEO of Tesla?");
        System.out.println("A. Tim Cook");
        System.out.println("B. Jeff Bezos");
        System.out.println("C. Elon Musk");
        System.out.println("D. Bill Gates");
        String ans2 = sc.nextLine().toUpperCase();

        if (ans2.equals("C")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is C. Elon Musk.");
        }

        // Question 3
        System.out.println("Question 3: What is the largest organ in the human body?");
        System.out.println("A. Brain");
        System.out.println("B. Liver");
        System.out.println("C. Skin");
        System.out.println("D. Lungs");
        String ans3 = sc.nextLine().toUpperCase();

        if (ans3.equals("C")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect! The correct answer is C. Skin.");
        }

        System.out.println("You scored " + score + " out of 3.");
    }
}