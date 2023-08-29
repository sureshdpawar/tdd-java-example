package com.tdd.examples;

public class DoReturnWhenExample {
    public String methodToBeTested() {
        return anotherMethodInClass();
    }

    public String anotherMethodInClass() {
        throw new NullPointerException();
    }
}
