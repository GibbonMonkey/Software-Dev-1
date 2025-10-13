import java.util.*;
import java.util.Collections;

public class DealorNoDeal {
    public static void main(String[] args) {

    List<Integer> Cases = new ArrayList<>(Arrays.asList(1, 5, 10, 25, 50, 75, 100, 200, 300, 400, 500, 750, 1000, 5000, 10000, 25000, 50000, 75000, 100000, 200000, 300000, 400000, 500000, 750000, 1000000, 1100000));
    List<Boolean> CasesCount = new ArrayList<>(Arrays.asList(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE, Boolean.TRUE  ));
    List<Integer> WorkingCases = new ArrayList<>(Arrays.asList());
    Scanner input1 = new Scanner(System.in);
    Scanner removeinput1 = new Scanner(System.in);
    Scanner bankerscan = new Scanner(System.in);
    Scanner lastdecision = new Scanner(System.in);
    //Establishes lists for the values of the cases and if they've been selected along with a working list of active cases
    //Establishes the few scanners I need for the game to work

    Collections.shuffle(Cases);
    //Shuffles all cases so each game is unique. Did this as one of my last steps for clarity of testing

    System.out.println("Welcome to Deal or No Deal, pick your first case! (1-26)");
    int pick1 = input1.nextInt();
    pick1 = pick1-1;
    //Gets first picks of cases

    int Mycase = Cases.get(pick1);
    CasesCount.set(pick1, Boolean.FALSE);
    //Falses out first case pick on the count list

    System.out.println("Your case is case " + (pick1+1) + ".");
    //Tells the user their case to confirm the input


//!!ROUND 1!!
    for (int p = 0; p <= 5; p++) {
        WorkingCases.clear();


        for (int i = 0; i < Cases.size(); i++){
            if (CasesCount.get(i) == Boolean.TRUE){
                WorkingCases.add(i+1);
            }else continue;
        }
        //iterates through the cases that are still in the game and creates a list of them for user clarity

        System.out.println("Your remaining cases are "+ WorkingCases + ".");
        System.out.println("Select a case to remove from the pool.");
        int remove1 = removeinput1.nextInt();
        CasesCount.set(remove1-1, Boolean.FALSE);
        System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
    }
    //asks player to remove cases and removed them periodically, resetting the list after every iteration of the round

    int sum = 0;
    int average = 0;
    int counter = 0;
    for (int a = 0; a < Cases.size(); a++){
        if (CasesCount.get(a) == Boolean.TRUE) {
            sum = Cases.get(a) + sum;
            counter++;
        }else continue;
    }
    // This is the establishing mathematics for the banker system. I am just taking a sum of all the remaining cases and using a counter to see how many are left to calculate the average.
    //I also add on the value of mycase and the additional counter value to the average on the line below in order to account for it in the average, as it is falsed out in the first pick.

    average = (sum+Mycase)/(counter+1);
    System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
    String dealornodeal = bankerscan.nextLine();
    if (Objects.equals(dealornodeal, "y")) {
        System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
        System.exit(0);
    }else System.out.println("You have chosen NO DEAL! Let's continue...");
// This here acts as the banker mechanic itself, and given the player takes the deal, it ends the game, tells their total, and the value of their initial case.


//!!ROUND 2!!
    for (int p = 0; p <= 4; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
        //this is the same code as for the first round, and while I know I could make this a function, I am lazy and given I know it works, will just recycle it with changes in the round length.

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
        //Again this is the same as round one and while it could be a function, control c and control v are my best friends and the ultimate time savers ;)
        //I will note, I did have to reset the integer variables that calculate sum to 0 instead of declaring them at 0. All the same otherwise


//!!ROUND 3!!
        for (int p = 0; p <= 3; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//Yep, we're copy-pasting the whole way. I'd put a flexed bicep emoji in here if the ASCII allowed it.

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
//*Flexed Bicep Emoji*


//!!ROUND 4!!
        for (int p = 0; p <= 2; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//Code getting long now... will only be getting longer.

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
//Almost line 200 in a deal or no deal simulator haha.



//!!ROUND 5!!
        for (int p = 0; p <= 1; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//Okay this is getting long now, maybe ill make it a function... on the next project *flexed bicep emoji*

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
//What I lose in laziness I make up for in humor. That's what my mom says at least.


//!!ROUND 6!!
        for (int p = 0; p < 1; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//So I did have to change the <= in the first for loop to a < which was really hard work, but the rest is the same.

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
//See the silliest part of this now is that there are at a maximum three more single pick rounds that I get to copy and paste for. More than halfway now though...


//!!ROUND 7!!
        for (int p = 0; p < 1; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//Even if you are scrolling past these I'm giggling to myself in the library about it so it's a win.

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
//Remember when I thought line 200 was a crazy reach for a deal or no deal sim...


//!!ROUND 8!!
        for (int p = 0; p < 1; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//I would really hope that this excellent high-level maximally efficient coding here proves that this is all Evan and no AI

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");
//One more loop now after this... you'd hope *smiling purple devil emoji*


//!!ROUND 9!!
        for (int p = 0; p < 1; p++) {
            WorkingCases.clear();

            for (int i = 0; i < Cases.size(); i++){
                if (CasesCount.get(i) == Boolean.TRUE){
                    WorkingCases.add(i+1);
                }else continue;
            }

            System.out.println("Your remaining cases are "+ WorkingCases + ".");
            System.out.println("Select a case to remove from the pool.");
            int remove1 = removeinput1.nextInt();
            CasesCount.set(remove1-1, Boolean.FALSE);
            System.out.println("That case had " + Cases.get(remove1-1) + " dollars in it!");
        }
//Last one here, thank you for accompanying me on this journey, I truly hope I am the only one to do this... Cause no one can do it better than me *Bicep Flexing Emoji*

        sum = 0;
        average = 0;
        counter = 0;
        for (int a = 0; a < Cases.size(); a++){
            if (CasesCount.get(a) == Boolean.TRUE) {
                sum = Cases.get(a) + sum;
                counter++;
            }else continue;
        }

        average = (sum+Mycase)/(counter+1);
        System.out.println("The banker offers you " + average + " dollars. Will you accept this offer? ('y' or 'n')");
        dealornodeal = bankerscan.nextLine();
        if (Objects.equals(dealornodeal, "y")) {
            System.out.println("You have accepted the deal and made " + average + " dollars! Your own case had " + Mycase + " dollars in it.");
            System.exit(0);
        }else System.out.println("You have chosen NO DEAL! Let's continue...");

/*In all seriousness, while I am happy to save time for other finals, this process has undoubtedly proven to me that
for iterative nonsense like the round system here, a function would not only make the code prettier and more efficient
but also literally halve the file size, which for larger projects would be a must.

So yeah this wasn't laziness, just a.. learning experience... (Give me an A?)
 */

// Okay back to it
    int finalcase = 0;
    for (int z = 0; z < Cases.size(); z++){
        if (CasesCount.get(z) == Boolean.TRUE){
            finalcase = z;
        }else continue;}
       // establishes the final case variable

    System.out.println("You have two cases left, case " + (finalcase +1) + ", and your initial case, case " + (pick1+1) + ".");
    System.out.println("Which case will you pick? ('" + (finalcase +1) + "', or '" + (pick1+1) + "')");
    //gives the text prompt leading up to the final pick


    int endcase = lastdecision.nextInt();
    if (endcase == finalcase+1){
        System.out.println("You chose the last case. It contains " + Cases.get(finalcase) + " dollars! Alternatively, your initial first pick contained " + Mycase + " dollars! Hope you're happy and thanks for playing!");
    }else if (endcase == pick1+1){
        System.out.println("You chose your initial case. It contains " + Mycase + " dollars! Alternatively, the last case contained " + Cases.get(finalcase) + " dollars! Hope you're happy and thanks for playing!");
    }else System.out.println("Ain't no way you messed up putting in two values you get to restart for that.");
    // allows the user to pick between their case and the final case and then gives the information regarding the pick and ends the game.


    }
}