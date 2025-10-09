import  java.util.Scanner;
public class Assignment5Function {
// This code uses a method to give metrics on a person associated climbing abilites based on their bodyweight and strength

    public static String Metrics(int bw, int pf){
        int weight = bw + pf;
        float pullmetric = ((float) weight/bw)*100;
        String grade = "";
//Does the math to calculate pull metrics


        if (pullmetric <= 100){
            grade = "V0-V3.";
        } else if (pullmetric > 100 && pullmetric <= 120) {
            grade = "V4-V6.";
        } else if (pullmetric > 120 && pullmetric <= 140) {
            grade = "V6-V8.";
        } else if (pullmetric > 140 && pullmetric <= 160) {
            grade = "V8-V10.";
        } else {grade = "really really hard stuff.";
        }

    //establishes the grade level based off of pull metrics.

    return ("You pull " + pullmetric + "% of your bodyweight, and are strong enough to climb " + grade);

    }

    public static void main(String[] args) {
        Scanner scbw = new Scanner(System.in);
        Scanner scpf = new Scanner(System.in);
        System.out.println("What is your bodyweight?");
        int bodyweight = scbw.nextInt();
        System.out.println("What is your max added weight 1 rep pull up?");
        int pullforce = scpf.nextInt();
        System.out.println(Metrics(bodyweight, pullforce));
    }
    }
// asks the user for the information then feeds it to the function.