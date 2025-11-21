package com.example;

public class TestS112WithCustom {
    // Inner class that extends Exception (should trigger the "already exists" detection)
    private static class MyCustomException extends Exception {
        public MyCustomException(String msg) {
            super(msg);
        }
    }

    public void problematic() throws Exception {
        // The code uses a generic Exception - fixer may want to replace this,
        // but since MyCustomException exists in the same file, tests expect an error.
        throw new Exception("some problem");
    }

    public static void main(String[] args) {
        try {
            new TestS112WithCustom().problematic();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
