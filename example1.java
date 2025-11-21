package com.example;

public class TestS112 {
    public void example1() throws Exception {
        // Violación S112: lanzar Exception genérica
        throw new Exception("generic error occurred");
    }

    public void example2() {
        // Otra violación S112: RuntimeException genérica
        throw new RuntimeException("runtime problem");
    }

    public static void main(String[] args) {
        try {
            new TestS112().example1();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            new TestS112().example2();
        } catch (RuntimeException re) {
            System.out.println("Caught runtime: " + re.getMessage());
        }
    }
}
