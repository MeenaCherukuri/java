//java program to demonstrate static variable by using count.
//count the number of objects s1,s2,s3...
//CounterDemo.java
import java.io.*;
class CounterDemo {
    static int count=0;
    CounterDemo() { //Default Constructor
    count++;
    System.out.println("count="+count);
    }
}
public class StaticVariableDemo2 {
    public static void main(String args[]) {
        CounterDemo cd=new CounterDemo();
        CounterDemo cd1 = new CounterDemo();
        CounterDemo cd2 =new CounterDemo();
    }
}
