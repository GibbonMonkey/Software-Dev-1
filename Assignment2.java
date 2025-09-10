//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//Evan Shufelt, Games and Media Major


public class Assignment2 {
    public static void main(String[] args) {

        int Score = 0;

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
//Scanners for all 3 questions

        System.out.println("What is the type of rock climbing where the wall is at a less than vertical angle?");
        String ans1 = sc1.nextLine();

        if (ans1 .equals("Slab")){
           Score = Score + 1;
        }else if (ans1 .equals("slab")){
           Score = Score + 1;
        }else {
            Score = Score + 0;
        }
        //Question 1, where if either the capital or lowercase answer is submitted, 1 is added to score

        System.out.println("What is the type of rock climbing where when you fall, you fall on to pads on the ground?");
        String ans2 = sc2.nextLine();

        if (ans2 .equals("bouldering")){
            Score = Score + 1;
        }else if (ans2 .equals("Bouldering")){
            Score = Score + 1;
        }else {
            Score = Score + 0;
        }
        // Question 2

        System.out.println("What is the best, easiest to grab, large 'bucket' hold type known as.");
        String ans3 = sc3.nextLine();

        if (ans3 .equals("Jug")){
            Score = Score + 1;
        }else if (ans3 .equals("jug")){
            Score = Score + 1;
        }else {
            Score = Score + 0;
        }

    // Question 3
        System.out.println("Your Score is " + Score + " Out of 3!");
        }
    }
