package interface_abstraction;

interface Father {
    void work();
}

interface Mother {
    void cook();
}

class Child implements Father, Mother { // both multiple interface and multiple inheritance

    @Override
    public void work() {
        System.out.println("Child works");
    }

    @Override
    public void cook() {
        System.out.println("Child cooks");
    }
}

public class MultipleInterfaceExample {
    public static void main(String[] args) {

        Child child = new Child();

        child.work();
        child.cook();
    }
}