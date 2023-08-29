package com.tdd.examples;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class WhenThenReturnExampleTest {

    @Before
    public void setup(){

    }

    @Test
    public void test1(){
        //  create mock
        WhenThenReturnExample whenThenReturnExample = mock(WhenThenReturnExample.class);

        /*@Mock
        WhenThenReturnExample whenThenReturnExample;*/

        // define return value for method getUniqueId()
        when(whenThenReturnExample.getUniqueId()).thenReturn(43);

        // use mock in test....
        assertEquals(whenThenReturnExample.getUniqueId(), 43);
    }

    // demonstrates the return of multiple values
    @Test
    public void testMoreThanOneReturnValue()  {
        Iterator<String> i = mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result= i.next()+" "+i.next();
        //assert
        assertEquals("Mockito rocks", result);
    }

    // this test demonstrates how to return values based on the input
    @Test
    public void testReturnValueDependentOnMethodParameter()  {
        Comparable<String> c = mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        assertEquals(1, c.compareTo("Mockito"));
        assertEquals(2, c.compareTo("Eclipse"));
    }

    // this test demonstrates how to return values independent of the input value
    @Test
    public void testReturnValueInDependentOnMethodParameter()  {
        Comparable<Integer> c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        //assert
        assertEquals(-1, c.compareTo(9));
    }

    // return a value based on the type of the provide parameter
    @Test
    public void testReturnValueInDependentOnMethodParameter2()  {
        Comparable<User> c= mock(Comparable.class);
        when(c.compareTo(isA(User.class))).thenReturn(0);
        //assert
        assertEquals(0, c.compareTo(new User(0)));
    }
}
