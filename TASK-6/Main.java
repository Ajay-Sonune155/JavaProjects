// In java to move stored data in arraylist from one class to another we can use various
// techniques such as through constructor , setter method , or returning the list from a method.

// This program demonstrates how to transfer an ArrayList from one class (Source)
// to another (Destination) in Java using a getter method and a constructor

import java.util.ArrayList;
class Source {
    private ArrayList <String> dataList ;

    public Source() {
        dataList = new ArrayList<>();
        dataList.add("Apple");
        dataList.add("Banana");
        dataList.add("Guava");
    }

    public ArrayList<String> getDataList() {
        return dataList;
    }
}

class Destination {
    private ArrayList<String> receivedData;

    public Destination(ArrayList<String> data) {
        this.receivedData = data;
    }

    public void displayData() {
        System.out.println("Received Data: " + receivedData);
    }
}
public class Main {
    public static void main(String[] args) {
        Source source = new Source(); // Create source object
        ArrayList<String> data = source.getDataList(); // Get data from Source
        Destination destination = new Destination(data); // Pass data to Destination
        destination.displayData();
    }
}
