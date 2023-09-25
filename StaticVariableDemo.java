//java program to demonstrate static variable 
//StaticVariable.java
import java.io.*;
class Student {
int rollno;//Instance variable
String name;
static String college="SITE";//static variable
Student(int r,String n) { //parameterized constructor
rollno=r;
name=n;
}//constructor close
void display() {
System.out.println(rollno+" "+name+" "+college);
 }
}
public class StaticVariableDemo {
public static void main(String args[]) {
Student s1=new Student(4216,"Meenakshi");
Student s2=new Student(4290,"Yawar");
System.out.println("Student details are");
s1.display();
s2.display();
 }
}
