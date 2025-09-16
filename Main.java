//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //P1: This one only prints 0-9, can you fix it so it prints 1-10? DONE
        System.out.println("Problem 1");
        for (int i = 0; i < 11; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        Scanner sc = new Scanner(System.in);
        int Sum = 1;
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        int Factorial = sc.nextInt();
        //here's a hint
        for (int i = 1; i < Factorial + 1; i++){
        Sum = (i * Sum);
        }
        System.out.println(Sum);

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        int x = 1;
        int Sum2 = 0;
        int EOSum = sc.nextInt();
        while (x <= EOSum){
            Sum2 = Sum2 + x;
            x = (x + 2);
        }
    System.out.println(Sum2);

        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false;
        }

        //P5: Take a string from the user and print them the reverse!
        Scanner sc2 = new Scanner(System.in);
        String reverse = "";
        System.out.println("Problem 5");
        System.out.println("What is your string?");
        String MyString = sc2.nextLine();

        for (int z = 0; z < MyString.length(); z++){
            reverse = MyString.charAt(z) + reverse;
        }
    System.out.println(reverse);

    }}
