package association;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }

    void teach(Student student) {
        System.out.println(name + " teaches " + student.name);
    }
}

public class AssociationExample {
    public static void main(String[] args) {

        Student student = new Student("John");
        Teacher teacher = new Teacher("Mr. Smith");

        teacher.teach(student);
    }
}