package static_keyword_behaviour.static_variable_behaviour;

class Parent {

    // child class can directly access parent class static variable
    static int x = 100;
    static int y = 500;
}

class Child extends Parent {

    // variable hiding works similar to method hiding
    // if static variable of same name created in child class
    static int y = 250;

    // static method cannot use super keyword
    // as super keyword refers to parent class of current object but static method has no current object as it belongs to the class
    // static int z = super.x; // restricted

    // however instance method can use super keyword before parent class static method
    //int z = super.x; // allowed
}

public class StaticVariableInheritanceExample {

    public static void main(String[] args) {

        // static variable accessed through child class
        // though still remains static member of parent class
        System.out.println(Child.x);

        // use of variable hiding
        Parent p = new Child();
        
        // parent class y variable accessed as even though object belongs to child class
        // parent class used as reference type
        System.out.println(p.y);
    }
}