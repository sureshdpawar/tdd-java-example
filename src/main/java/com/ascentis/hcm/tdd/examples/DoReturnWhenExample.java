package com.ascentis.hcm.tdd.examples;

public class DoReturnWhenExample {
    public String methodToBeTested() {
        return anotherMethodInClass();
    }

    public String anotherMethodInClass() {
        throw new NullPointerException();
    }
}
