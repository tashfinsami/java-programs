package static_keyword_behaviour.static_variable_behaviour;

class MathConstants {

    // recommended to use static final for constant values
    // static -> value does not belong to any specific object (belongs to class)
    // final -> value cannot be changed once assigned
    static final double PI = 3.14159;
}

public class StaticFinalVariableExample {

    public static void main(String[] args) {

        System.out.println(MathConstants.PI);
    }
}