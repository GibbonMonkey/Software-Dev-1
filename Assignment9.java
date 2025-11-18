import java.util.Stack;
import java.util.LinkedList;
public class Assignment9 {
    public static void main(String[] args) {

        Stack<Integer> stax = new Stack<>();

        stax.push(70);
        stax.push(34);
        stax.push(807);
        stax.push(61);
        stax.push(28);
        stax.push(563);
        stax.push(492);
        stax.push(386);



        LinkedList<Integer> linky = new LinkedList<>();

        linky.add(10);
        linky.add(20);
        linky.add(30);
        linky.add(40);
        linky.add(50);


int highest = stax.getFirst();
int lowest = stax.getFirst();
int fullstack = stax.size();
//Establishes variables for the maximum value and the minimum value as well as the initial stack size.
/*From what I know of comparing items in a list, so long as the base value of the list is an item of
the list, then you can compare other items against it for maximum and minimum and the values will be
correct. Therefore I just used the top value of the list as the base value.*/

    while (stax.size() > 0){
       int current = stax.pop();

       if (current > highest){
           highest = current;
       }else if (current < lowest) {
           lowest = current;}
       }
    //A while loop that ensures while the stack has elements in it, the current element will be compared against the highest and the lowest.

    System.out.println("The maximum value of the stack is " + highest + " and the minimum is " + lowest + ". The stack is " + fullstack + " elements large.");

    double mid = ((linky.size()/2) + .5);
    int intmid = (int) mid;
    int midval = linky.get(intmid);
    //Arithmetic that calculates the midvalue of an odd numbered linkedlist.
    //I did this under the assumption that the list is odd.
    /*Were I to assume that I didn't know I would divide the list size by 2
    and if it were a double, I would use this arthmetic, and if it were an integer
    I would use different arithmetic*/

    System.out.println("The middle value of the linked list is " + midval + ".");

    Stack<String> Shoppingcarts = new Stack<>();
    Shoppingcarts.add("Cart 1");
    Shoppingcarts.add("Cart 2");
    Shoppingcarts.add("Cart 3");
    Shoppingcarts.add("Cart 4");
    Shoppingcarts.add("Cart 5");
    Shoppingcarts.add("Cart 6");
    //Meant to mimic shopping carts.

    Shoppingcarts.pop();
    //Mimics someone grabbing a cart
    Shoppingcarts.pop();
    //Mimics someone grabbing a cart
    System.out.println(Shoppingcarts.peek());
    //Mimics looking at the cart that's at the top of the chain

    }
}