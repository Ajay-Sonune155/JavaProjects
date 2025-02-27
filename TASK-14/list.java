import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList;

public class list {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        list();
        arraylist();
        linkedlist();
        input.close();
    }

/* Essential functions present in lists.
   .add()
   .remove()
   .get()
   .size()
   .isEmpty()
   .contains()
   .clear()
   .indexOf
   for-each loop enhanced for loop
*/
    public static void list() {
        Scanner input = new Scanner(System.in);
        List<String> myList = new ArrayList<String>(); // list creation

        System.out.print("Enter the Number of Elements: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter your element: ");
            String take = input.nextLine();
            myList.add(take);
        }

//        myList.add("Apple");
//        myList.add("Banana");
//        myList.add("Cherry");
//        myList.add("Date");

        // Displaying the list
        System.out.println("\nList elements: " + myList);

        // Removing an element by value
        myList.remove("Banana");
        System.out.println("List after removing Banana: " + myList);

        // Removing an element by index
        myList.remove(1);
        System.out.println("List after removing element at index 1: " + myList);

        // Accessing an element
        System.out.println("First element: " + myList.get(0));

        // Checking if an element exists
        System.out.println("Does the list contain 'Apple'? " + myList.contains("Apple"));

        // Finding the index of an element
        System.out.println("Index of 'Date': " + myList.indexOf("Date"));

        // Getting the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Checking if the list is empty
        System.out.println("Is the list empty? " + myList.isEmpty());

        // Iterating through the list
        System.out.println("Iterating through the list:");
        // using for-each loop to iterate through every item and item is a variable here
        for (String item : myList) {
            System.out.println(item);
        }

        // Clearing the list
        myList.clear();
        System.out.println("List after clearing: " + myList);
    }

    public static void arraylist() {
        System.out.println("\n Lets do the ArrayList ---");
        Scanner input = new Scanner (System.in);
        ArrayList <String> myList = new ArrayList<String>();
        System.out.print("Enter the number of elements: ");

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n ; i++) {
            System.out.print("Enter your element: ");
            String take = input.nextLine();
                    myList.add(take);
        }

        System.out.println(myList);

        // Let's access any element using get--
        if (myList.size() > 1){
        System.out.println("\nThe 2nd position item is: " + myList.get(1)); }
        else {
            System.out.println("The list does not have enough items/elements");
        }

        // lets remove a single element such as 3rd one
        System.out.println("\nRemoving the 3rd element " + myList.remove(1));
        System.out.println(myList);

        // lets iterate for each element
        System.out.print("\nIterating over each element: ");
        System.out.println();
        for (String item : myList) {
            System.out.println(item);
        }

        System.out.println("\n lets check the size of list: " + myList.size());

        System.out.println("\n lets check whether it has hell: " + myList.contains("hell"));

        System.out.println("\n Lets check whether it is empty: " + myList.isEmpty());

        myList.clear();
        System.out.println("\n Lets clear or delete the list:  " + myList);

    }

    public static void linkedlist () {
        System.out.println("\nLets do the LinkedList");
        Scanner input = new Scanner (System.in);
        LinkedList <Integer> myList = new LinkedList <Integer> ();
        System.out.print("Enter the no. of elements: ");

        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n ; i++) {
            System.out.print("Enter your element in number: " );
            int take = input.nextInt();
            myList.add(take);
        }
        System.out.println(myList);

        // lets get first and last element from list
        System.out.println("First element: " + myList.getFirst());
        System.out.println("last Element: " + myList.getLast());

        // to find index no. for eg. item name as 3 is present in index no. 2
        System.out.println("lets get the index of position 3rd item: " + myList.indexOf(3));
    }
}