class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void active() {
        System.out.println(name + " is active teaching.");
    }
}

class Department {
    String name;
    Professor professor;

    Department(String name, Professor professor) {
        this.name = name;
        this.professor = professor;
    }

    void showProfessor() {
        System.out.println(
            professor.name + " works in " + name + " department."
        );
    }
}

public class AggregationExample {
    public static void main(String[] args) {

        // Professor is created independently
        Professor professor = new Professor("Dr. Rahman");

        // Department receives the existing Professor
        Department department =
            new Department("Computer Science", professor);

        department.showProfessor();

        // Professor can still be used independently
        professor.active();
    }
}