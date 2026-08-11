package final_keyword_behaviour.final_class_behaviour;

final class Parent {

    void show() {
        System.out.println("Parent show() method");
    }
}

// Cannot extend a final class

// class Child extends Parent {
// }

public class FinalClassExample {

    public static void main(String[] args) {

        final Parent p = new Parent();

        //p = new Parent(); // Cannot reassign pointing object of a final reference variable

        p.show();
    }
}