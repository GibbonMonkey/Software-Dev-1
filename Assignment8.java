import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class Assignment8 {
    public static void main(String[] args) {
        String line = "";
        ArrayList<String> data = new ArrayList<String>();
        ArrayList<Double> gpas = new ArrayList<Double>();
        ArrayList<String> names = new ArrayList<String>();
        //Establishes lists for data sorting


        File inputfile = new File("/Users/evanshufelt/Downloads/practice.txt");
        try {
            Scanner input = new Scanner(inputfile);
            while(input.hasNext()){
            line = input.nextLine();
            data.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //Imports the file and puts each line as a separate element in a list.


        for (int j = 1; j < data.size(); j+=2){
            gpas.add(Double.parseDouble(data.get(j)));
        }
        for (int i = 0; i < data.size(); i+=2){
            names.add(data.get(i));
        }
        //Uses a for loop to separate the names from gpa (only works because I am aware of file format beforehand).
        //Also have to parse out the gpa values as doubles since in the general data list they are strings.


        for (int l = 0; l < gpas.size(); l++){
            if (gpas.get(l) >= 3.5){
                System.out.println(names.get(l) + " has a GPA higher than 3.5!");
            }
        }
        /*Iterates through the list of gpas and if a gpa is >= 3.5, it accesses the identical index in the names list
        and prints it alongside the gpa.
        */


    System.out.println("There are " + names.size() + " names in the list.");
    //Uses the size of the names list to print out the total number of names/entries.

    }
}

/* In this code, rather than learning a bunch about file manipulation in java, (as the
accessing of files and reading of them was pretty straightforward), I actually ended up
learning a lot more about data cleaning and sorting. Having known beforehand the format of
the file allowed me to approach the influx of data in a methodical way, and use the index
of the gathered data to sort out and then manipulate the elements in code. Essentially I had
to strategically think what sort of parameters would allow me to sort data by the type of object it is
while still keeping it in its context of the other data of different object types around it.
 */

