package encapsulation;

class Student {

    // Protected data // only subclasses and same package classes can use
    protected String dummy;

    // Private data
    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;

        if (age >= 0) { // negative value automatically fixed to 0
            this.age = age;
        }
    }

    // Setter // set prefix not a rule, any name works
    public void setName(String name) {
        this.name = name;
    }

    // Getter // get prefix not a rule, any name works
    public String getName() {
        return name;
    }

    // Setter with validation // set prefix not a rule, any name works
    public void setAge(int age) {
        if (age >= 0) { // negative value ignored
            this.age = age;
        }
    }

    // Getter // get prefix not a rule, any name works
    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {

    public static void main(String[] args) {

        // Create Student object
        Student student = new Student("Alice", 20);

        // Get data using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Change data using setters
        student.setName("Bob");
        student.setAge(21);

        System.out.println("Updated Name: " + student.getName());
        System.out.println("Updated Age: " + student.getAge());

        // Invalid age
        student.setAge(-5);

        // Age remains 21 because -5 was rejected
        System.out.println("After invalid age: " + student.getAge());

        // Direct access is not allowed
        // student.age = 20;  // age is private
        // student.name = "Alice"; // name is private
    }
}