
public class Assignment4 {
    public static void main(String[] args) {
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        int len = myArray.length;

        /*Unsure if this is a modifer, I am using it as I imagine in a real project
        this would be the way to establish that variable, but if I had to not use a
        modifier, I would just count up the elements and assign that to the var "len".
        */

        boolean[] counted = new boolean[len];

        //Creates a counter array to ensure if something has already been counted

        for (int i = 0; i < len; i++) {

            if (counted[i]) continue;

            //Tells the code to not recount values that have already been iterated.

            int dupecount = 1;

            //resets dupecount to 1 for each iteration

            for (int j = i + 1; j < len; j++) {
                if (myArray[i] == myArray[j]) {
                    dupecount++;
                    counted[j] = true;

                    /*adds a dupecount for every value that is repeated and then ensures
                    they will not be counted again
                     */

                }
            }
            if (dupecount > 1) {
                System.out.println(myArray[i] + " Appears " + dupecount + " times!");

                //prints out the numbers and their counts so long as there is more than one.
            }
        }

                }
        }

//What I Learned VVV
/* More than anything else, this assignment taught me how to use booleans. The rest of the
code came relatively easily to me, as the iterating through a list using a for loop is
something I had already done in python, and this was pretty much the same. However, without
having the "in" function, having to iterate through a list multiple times and then select
specific values was a new challenge. Using the boolean of counted or not counted
was my solution, and forced me to understand how you can limit what the iterative value
"i" actually can perform its function on as denoted by the loop.
 */

//How the code works
/*
While the code itself is not that hefty, it is doing alot of things. Firstly, it establishes
the length of the array and then creates a list at that length of completely false boolean
varaibles. Then it initiates a loop and a nested loop. The overhead loop iterates through all
values within myarray, going past the ones counted by the nested loop, and resetting the
duplicate count to 1 upon every iteration. (it is reset to 1, as there is at least one
of every value in the array). The nested loop goes through every value of i, and every non counted
value of myarray, it checks if there are duplicates of it. If there are, it counts them, adds
a value of 1 to the dupecount, and then at the end of its iteration, prints every variable
with a dupecount greater than 1. It then resets to the function of the overhead loop,
where it will reiterate through the whole array, lest a value has been counted by the
nested loop.
 */






