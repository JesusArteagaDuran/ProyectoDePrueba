package com.example;

public class MyClass {

   public void doSomething() {
    try {
        throw new Exception("Error genérico!");
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}