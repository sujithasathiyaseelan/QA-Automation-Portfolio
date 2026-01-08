
// Final class: cannot be inherited
final class Vehicle {

    // Final variable: value cannot be changed
    final int wheels = 4;

    // Final method: cannot be overridden
    final void showDetails() {
        System.out.println("This vehicle has " + wheels + " wheels.");
    }
}

// Trying to inherit from a final class (this would cause an error)
// class Car extends Vehicle {}  //  Not allowed

public class car {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.showDetails();

        // v.wheels = 6; //   Cannot assign a value to final variable
    }
}
