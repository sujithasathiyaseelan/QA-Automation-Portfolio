/////OOPS
//
//// 🔐 Abstraction
//abstract class Person {
//    protected String name;
//
//    // Constructor
//    public Person(String name) {
//        this.name = name;
//    }
//
//    // Abstract method
//    public abstract void displayRole();
//}
////
////Person is an abstract class (cannot be instantiated directly).
////A name field (shared by students and teachers).
////An abstract method displayRole() — no logic here, only a declaration.
////This forces subclasses (like Student and Teacher) to provide their own version of displayRole().
//
//// 👨‍🏫 Inheritance: Student inherits from Person
//
//class Student extends Person {
//    // 🔒 Encapsulation: private variable
//    private int rollNumber;
//
//    //Student and Teacher inherit from Person using extends.
//    // Constructor
//    public Student(String name, int rollNumber) {
//        super(name); // Inherited name
//        this.rollNumber = rollNumber;
//    }
//
//    // Getter & Setter
//    public int getRollNumber() {
//        return rollNumber;
//    }
//
//    public void setRollNumber(int rollNumber) {
//        this.rollNumber = rollNumber;
//    }
////rollNumber is declared private → can’t be accessed directly from outside the class.
// //It is accessed via getter (getRollNumber) and setter (setRollNumber).
//    
//    // 🌀 Polymorphism (method overriding)
//    @Override
//    public void displayRole() {
//        System.out.println("Role: Student");
//    }
//
//    public void showDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Roll No: " + rollNumber);
//    }
//}
//
//// 👩‍🏫 Another subclass of Person
//class Teacher extends Person {
//
//    public Teacher(String name) {
//        super(name);
//    }
//
//    // 🌀 Polymorphism (method overriding)
//    @Override
//    public void displayRole() {
//        System.out.println("Role: Teacher");
//    }
//
//    public void showDetails() {
//        System.out.println("Name: " + name);
//    }
//}
////Both Student and Teacher override the same method displayRole() from Person.
////The behavior of the method depends on the object.
//
//// 🚀 Main Class
//public class OOPS{
//    public static void main(String[] args) {
//        // Creating objects
//        Student s1 = new Student("Alice", 101);
//        Teacher t1 = new Teacher("Mr. Smith");
//
//        // Display roles (Polymorphism in action)
//        s1.displayRole();
//        s1.showDetails();
//
//        System.out.println();
//
//        t1.displayRole();
//        t1.showDetails();
//    }
//}
//
////| OOP Concept       | Where It's Used                                                      |
////| **Abstraction**   | `Person` is an abstract class with abstract method `displayRole()`   |
////| **Inheritance**   | `Student` and `Teacher` inherit from `Person`                        |
////| **Encapsulation** | `rollNumber` is private, accessed via `get/set`                      |
////| **Polymorphism**  | `displayRole()` is overridden differently in `Student` and `Teacher` |
