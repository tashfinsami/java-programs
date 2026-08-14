package static_keyword_behaviour.static_variable_behaviour;

class Student {

    static int count;

    Student() {
        count++;
    }
}

public class StaticVariableExample {

    public static void main(String[] args) {

        // static variable can be accessed without object as it belongs to the class
        Student.count = 0;

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student(); // every time same copy increased

        System.out.println(Student.count);

        // technically possible to access static method with object but not recommended
        System.out.println(s1.count);
    }
}