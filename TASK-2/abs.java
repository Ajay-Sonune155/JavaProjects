//abstraction Example
// creating abstract class
abstract class Drink {

    // Abstract method w/o implementation)
    public abstract void prepare();

    // another method
    public void serve() {
        System.out.println("Your drink is ready to be served! ");
    }
}

// Subclass 1: Tea
class Tea extends Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing a cup of tea. ");
    }
}

// Subclass 2: Coffee
class Coffee extends Drink {
    @Override
    public void prepare() {
        System.out.println("Preparing a cup of coffee. ");
    }
}

// Main class to test abstraction
public class abs {
    public static void main(String[] args) {
        Drink myTea = new Tea();   // Using abstraction to create a tea object
        Drink myCoffee = new Coffee(); // Using abstraction to create a coffee object

        myTea.prepare();
        myTea.serve();

        myCoffee.prepare();
        myCoffee.serve();
    }
}
