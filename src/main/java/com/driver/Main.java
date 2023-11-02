package com.driver;

//Task 1: Create a class A with a method named meth.
class A {
 public String meth() {
     return "Invoking method from class A";
 }
}

//Task 2: Create a class B that extends class A.
class B extends A {
 // Task 4: Override the meth method in class B.
 @Override
 public String meth() {
     return "Method is overridden in Extended class B";
 }
}

public class Main {
 public static void main(String[] args) {
     // Task 3: Create an object of class B and call the meth method from class A.
     A objA = new A();
     String resultA = objA.meth();
     System.out.println("Result from class A: " + resultA);

     // Task 5: Call the overridden meth method from the object of class B.
     B objB = new B();
     String resultB = objB.meth();
     System.out.println("Result from class B: " + resultB);
 }
}
