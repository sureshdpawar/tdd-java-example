package com.ascentis.hcm.tdd.examples;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class WhenThenThrowTest {

    // if our method return type is not void we can use when().thenThrow():
    @Test(expected = NullPointerException.class)
    public void whenConfigNonVoidRetunMethodToThrowEx_thenExIsThrown() {
        User user = mock(User.class);
        when(user.getName()).thenThrow(NullPointerException.class);
        //when(user.addUser()).thenThrow(NullPointerException.class);
        user.getName();
    }

    // if our method returns void, we'll use doThrow():
    // We can't use when().thenThrow() with void return type as the compiler doesn't allow void methods inside brackets.
    @Test(expected = IllegalStateException.class)
    public void whenConfigVoidRetunMethodToThrowEx_thenExIsThrown() {
        User user = mock(User.class);
        doThrow(IllegalStateException.class).when(user).addUser();
        user.addUser();
    }
}