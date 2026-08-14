package static_keyword_behaviour.static_method_behaviour;

class Parent {

    // child class can directly access parent class static method
    static void show() {

        System.out.println("Parent show() method");
    }
}

class Child extends Parent {

    // static method cannot use super keyword
    // as super keyword refers to parent class of current object but static method has no current object as it belongs to the class
    /* static void test() {

        super.show(); // restricted
    } */

    // however instance method can use super keyword before parent class static method
    /* void test() {

        super.show(); // allowed
    } */
}

public class StaticMethodInheritanceExample {

    public static void main(String[] args) {

        // static variable accessed through child class
        // though still remains static member of parent class
        Child.show();
    }
}