import java.util.Scanner;

    public class Assignment1A {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // Makes the Scanner

            System.out.println("What is your age? ");
            String Age = sc.nextLine();
            //Asks for the age and sets it so that the next line (input) is picked up by the scanner

            System.out.println("You are " + Age + " years old.");
            // Prints out text along with the new Age string.
        }
    }
