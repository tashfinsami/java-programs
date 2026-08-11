package final_keyword_behaviour.final_method_behaviour;

class Parent {

    final void show() {
        System.out.println("Parent show() method");
    }
}

class Child extends Parent {

    // Cannot override a final method

    /* @Override
    void show() {
        System.out.println("Child show() method");
    } */
}

public class FinalMethodExample {

    public static void main(String[] args) {

        Child child = new Child();

        child.show();   // using inherited final method allowed
    }
}