//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Assignment5Debug {

    public static int P2(int p2num) {
        int Sum = 1;
        for (int i = 1; i < p2num + 1; i++){
            Sum = (i * Sum);
        }
        return (Sum);
    }

    public static int P3(int p3num){
        int x = 1;
        int Sum2 = 0;
        while (x <= p3num){
            Sum2 = Sum2 + x;
            x = (x + 2);
    }
    return (Sum2);
    }

    public static String P5(String p5word){
        Scanner sc2 = new Scanner(System.in);
        String reverse = "";
        String MyString = p5word;

        for (int z = 0; z < MyString.length(); z++){
            reverse = MyString.charAt(z) + reverse;
        }
        return(reverse);

    }


    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Problem 2, enter a number and I will give you its factorial");
        int nump2 = sc1.nextInt();
           System.out.println(P2(nump2));

       Scanner sc2 = new Scanner(System.in);
       System.out.println("Problem 3, enter a number and I will tell you the sum of every other number");
       int nump3 = sc2.nextInt();
            System.out.println(P3(nump3));

       Scanner sc3 = new Scanner(System.in);
       System.out.println("Problem 5, give me a word and I'll reverse it");
       String wordp5 = sc3.nextLine();
            System.out.println(P5(wordp5));
    }}