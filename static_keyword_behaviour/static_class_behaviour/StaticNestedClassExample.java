package static_keyword_behaviour.static_class_behaviour;

class Outer {

    static class Inner {

        void show() {

            System.out.println("Hello from Inner class");
        }
    }
}

public class StaticNestedClassExample {

    public static void main(String[] args) {

        // separate outer class object not needed to create static nested class (Inner) object
        // unlike in non static nested class
        Outer.Inner obj = new Outer.Inner();

        obj.show();
    }
}