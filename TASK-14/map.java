import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
    hashmap();
    hashmap2();
    linkedHashMap();
    treemap();
    }

    /*
    Similar to list here commands are similar but different--
    .put                        to assign value in key value pair
    .get                        to fetch value
    .getOrDefault               to fetch value and avoid getting null
    .put(key,value);            to assign value in the pair of map
    .get (key no.);             to access a value present in any index
    .containsKey(key no.);      check if key exist
    .remove(key no.)            to remove an entry.

    unlike list which index starts from 0 1 2 3 ..
    here maps use key no. (a unique key) <key : value> pair
     */

    public static void hashmap () {
        System.out.print("Lets do Hashmap");
        Scanner input = new Scanner (System.in);
        System.out.println("Lets work with hashmap--");
        HashMap <Integer,String> map = new HashMap<Integer,String>();

        System.out.print("\nEnter the number of elements: ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println();

        for (int i = 0; i<n; i++) {
            System.out.print("Enter your integer: ");
            int key = input.nextInt();

            input.nextLine();// consume new line

            System.out.print("Enter your string: ");
            String value = input.nextLine();
            System.out.println();

            map.put(key,value);

        }
        System.out.println(map);

        // access a value using .get (key)
        System.out.println("\nThe third item in list is: " + map.get(3));

        // check if key exist using .containsKey(key no.);
        System.out.println("\nThe key exist? : " + map.containsKey(4));

        // removing an entry using .remove (key)
        map.remove(2);
        System.out.println("\n" + map);

    }

    public static void hashmap2 () {
        System.out.println();
        System.out.println("\nLets do hashmap but little adv.");
        Scanner input = new Scanner (System.in);
        HashMap <Integer,String> map = new HashMap<Integer,String> ();
        System.out.print("Enter the number of Elements: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter your integer: ");

            int key = input.nextInt();
            input.nextLine();

            System.out.print("Enter your String: ");
            String value = input.nextLine();

            map.put(key,value);
        }
        System.out.println(map);

        // access value from key by taking input from user.
        System.out.print("\nEnter your Key number you want to fetch: ");
        int x = input.nextInt();
        System.out.println("value of your key number is: " + map.get(x) );

        // check if key exist
        System.out.print("\nEnter your key number to check if exist: ");
        int y = input.nextInt();
        System.out.print("Whether your key exist or not: " + map.containsKey(y));

        // removing a key of our choice
        System.out.print("\nWhich key you want vanish: ");
        int z = input.nextInt();
        map.remove(z);
        System.out.println(map);
    }

    public static void linkedHashMap() {
        System.out.println("\nLets do LinkedHashMap");
        Scanner input = new Scanner (System.in);
        LinkedHashMap <Integer,String> map = new LinkedHashMap <Integer,String> ();
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n ; i++){
            System.out.print("Enter your Integer (KEY): ");
            int key = input.nextInt();
            input.nextLine();

            System.out.print("Enter your Value (Value): ");
            String value = input.nextLine();
            System.out.println();

            map.put(key,value);
        }

        System.out.println(map);

        // accessing value
        System.out.print("Enter the key you like to access: ");
        int x = input.nextInt();
        System.out.println("Your access value is: " + map.get(x));

        // updating value
        System.out.print("\nEnter the key you like to update: ");
        int y = input.nextInt();
        input.nextLine();
        System.out.print("Enter the value which you like to update for that key (in String): ");
        String z = input.nextLine();

        map.put(y,z);
        System.out.println();
        System.out.print(map);

        // delete a specific key value pair
        System.out.print("\nWhich key you want to dissapear: ");
        int a = input.nextInt();
        map.remove (a);
        System.out.println(map);

        // check if key exist using containsKey()
        System.out.print("\nEnter your key if it exist or not: ");
        int b = input.nextInt();
        boolean check = map.containsKey(b);

        if (check == true) {
            System.out.print("Your KEY is EXISTED");
        } else if (check == false) {
            System.out.println("Your KEY is NOT existed");  }
        // instead of if function using like this lets done this in single line which could be like this:
        // System.out.println(check ? "your key exist" : "your key not exist");

        // check the size of the map
        System.out.println("\nThe size of the map is: " + map.size());
        System.out.println(map);

        // lets clear all elements
        map.clear();
        map.isEmpty();
        System.out.println("\n" + map);
    }

    // lets do tree map
    // it has similar functions as linkedHashmap like get , remove , put , clear , containsKey , size , isempty
    /*
    the only different one are:
    .firstEntry()
    .lastEntry()
    .headMap()
    .tailMap()
    iterating using entry set
     */

    public static void treemap() {
        Scanner input = new Scanner (System.in);
        TreeMap<Integer,String> map = new TreeMap <Integer,String> ();
        System.out.println("\nLets do treemap---");
        System.out.print("\nEnter the number of elements: ");
        int num = input.nextInt();

        for (int i = 0 ; i < num ; i++) {
            System.out.print("Enter your Key(Integer): ");
            int key = input.nextInt();
            input.nextLine();

            System.out.print("Enter your String value: ");
            String value = input.nextLine();
            System.out.println();

            map.put(key,value);
        }
        System.out.println(map);

        // lets do firstentry and lastentry--
        System.out.println("The first Entry is: " + map.firstEntry());
        System.out.print("The last entry is: " + map.lastEntry());

        System.out.println("\n" + map);

        // lets do headmap and tailmap
        System.out.println("The headMap is: " + map.headMap(2));
        System.out.println("The tailmap is: " + map.tailMap(2));

    }
}
