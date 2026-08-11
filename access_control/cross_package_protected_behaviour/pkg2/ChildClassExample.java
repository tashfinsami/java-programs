package access_control.cross_package_protected_behaviour.pkg2;

import access_control.cross_package_protected_behaviour.pkg1.ParentClassExample;

public class ChildClassExample extends ParentClassExample {

    void test() {

        // Direct inheritance access
        show();              // allowed


        
        // Through Child object
        ChildClassExample c = new ChildClassExample();
        c.show();            // allowed

        // ChildClassExample object (c) part of inheritance as ChildClassExample inherits ParentClassExample
        // using protected method show() allowed as a result



        // Through Parent object
        //ParentClassExample p = new ParentClassExample();
        //p.show();            // restricted

        // ParentClassExample object (p) not part of either same package(pkg1) or inheritance
        // using protected method show() restricted as a result
    }
}