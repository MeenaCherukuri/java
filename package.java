package pack;
public class A {
    public void msg() {
        System.out.println("Pack A msg method ");
    }
}
package mypack;
import pack.*;
class B {
    public static void main(String args[]){
        A obj = new A();
        obj = msg();
    }
}
OUTPUT:  pack/A.java:7: error: class, interface, enum, or record expected
package mypack;
^
pack/A.java:8: error: class, interface, enum, or record expected
import pack.*;
^
2 errors
