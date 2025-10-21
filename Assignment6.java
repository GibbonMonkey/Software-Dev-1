import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Assignment6 {
    public static class student {
        String name;
        String year;
        double gpa;
        int id;

        public student(String n, String y, double g, int i) {
            name = n;
            year = y;
            gpa = g;
            id = i;
        }

        //creates the student class and its parameters

        String honorroll() {
            if (this.gpa >= 3.6) {
                return (this.name + " is on the honor roll.");
            } else {
                return (this.name + " is not on the honor roll.");
            }
        }

        // checks if the gpa is higher or equal to 3.6 and assigns honor roll status dependently\

        static List<Integer> idlist = new ArrayList<>(Arrays.asList(1084, 1011, 1029, 1131, 1126));
        static Random rand = new Random();
        static int randomIndex = rand.nextInt(idlist.size());
        static int randid = idlist.get(randomIndex);

        // creates a list with all the student ids, and then randomly selects and index and uses
        // that index to pick an id that gets free lunch that day
        //static means that the variable is consistent amongst all members of the class during any given instance.

        String freelunch() {

            if (this.id == randid) {
                return (this.name + " gets free lunch!");
            }else{
                return (this.name + " does not get free lunch!");
            }
        }

        // checks who gets free lunch

    }
    public static void main(String[] args) {

        student Andy = new student("Andy", "Freshman", 3.1, 1084);
        student Max = new student("Max", "Junior", 2.9, 1011);
        student Linda = new student("Linda", "Senior", 3.9, 1029);
        student Sofia = new student("Sofia", "Freshman", 3.7, 1131);
        student Craig = new student("Craig", "Sophmore", 2.7, 1126);

        System.out.println(Andy.honorroll());
        System.out.println(Max.honorroll());
        System.out.println(Linda.honorroll());
        System.out.println(Sofia.honorroll());
        System.out.println(Craig.honorroll());

        System.out.println(Andy.freelunch());
        System.out.println(Max.freelunch());
        System.out.println(Linda.freelunch());
        System.out.println(Sofia.freelunch());
        System.out.println(Craig.freelunch());
    }}

// establish students along with their parameters.
// checks each student with each of the methods.


/*In this assignment I learned more than anything how variables transfer among classes and through code.
while the classes themselves are very similar to functions in the sense you have your object (specific student)
and your function itself, (method), the way that variables interact and move across classes, as well
as their positioning in the code is a new challenge, and understanding how to make variables consistent
over different blocks of code required me to learn how classes actually use their methods an work under th hood.
 */