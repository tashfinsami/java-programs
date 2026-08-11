package final_keyword_behaviour.final_variable_behaviour;

class Student {

    final int age = 20;

    void changeAge() {

        // age = 25;   // Cannot change a final variable
    }
}

public class FinalVariableExample {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s.age);

        s.changeAge();

        System.out.println(s.age);
    }
}