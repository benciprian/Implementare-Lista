import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        // Adding elements to the list
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        // Printing the list
        System.out.println("List: " + myList);

        // Accessing an element by index
        String firstElement = myList.get(0);
        System.out.println("First element: " + firstElement);

        // Removing an element by index
        myList.remove(1);

        // Printing the list again
        System.out.println("List after removing second element: " + myList);

        // Modifying an element by index
        myList.set(1, "grape");

        // Printing the list again
        System.out.println("List after modifying second element: " + myList);

        // Clearing the list
        myList.clear();

        // Printing the empty list
        System.out.println("Empty list: " + myList);
    }
}
/*In Java, the List interface is part of the java.util package and provides an ordered collection of elements.
Here's an example of how to implement a List using an ArrayList:
This code creates an ArrayList object and adds some elements to it using the add method.
It then prints the list using System.out.println, accesses an element by index using get,
removes an element by index using remove, modifies an element by index using set,
clears the list using clear, and prints the empty list.
 */

