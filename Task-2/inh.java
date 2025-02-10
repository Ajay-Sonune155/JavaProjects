//Inheritance Example
// superClass
class Animal {
    String name;

    //methods of superclass
    public void eat() {
        System.out.println(name + " is eating.");
    }
    // 2nd method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
// lets make sub class now
// and do inheritance
class Dog extends Animal {
    // Additional method in the child class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to FiNaLLy test Inheritance
public class inh {
    public static void main(String[] args) {
        Dog myDog = new Dog();   // new keyword allocate memory for our object
        myDog.name = "Buddy";  // Inherited property from Animal

        // Inherited method
        myDog.eat();
        myDog.sleep();
        myDog.bark();  // sub class method
    }
}
