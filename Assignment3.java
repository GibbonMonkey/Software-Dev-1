import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Assignment3 {
    public static void main(String[] args) {
    Scanner Str = new Scanner(System.in);
    String singleC = "";
    System.out.println("What is your string?");
    String MyStr = Str.nextLine();


    for (int x = 0; x < MyStr.length(); x++){
        singleC = String.valueOf(MyStr.charAt(x));
        System.out.println(singleC);

    }}}

// This code works by first creating a scanner variable and an empty string that will be used as
// a place to hold each given character of the string. The meat of the code which is the bottom
// paragraph creates a for loop, where the first value is 0 and the final value is equal
// to the length of characters within the entered string. As the loop iterates through
// the characters, it uses the MyStr.charAt(x) to single out the current value of x that
// is being iterated. With this value singled out, the String.valueOf command is used to ensure
// that the character retrieved from MyStr is in the form of string, not char. The code
// then prints out the selected character as a string and this is repeated each line until
// MyStr has been fully iterated through.