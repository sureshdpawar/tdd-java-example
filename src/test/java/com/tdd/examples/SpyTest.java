package com.tdd.examples;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SpyTest {

    @Spy
    List<String> spyList = new ArrayList<String>();

    // When spy is called, then actual method of real object is called.
    @Test
    public void whenSpyingOnList_thenCorrect() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = Mockito.spy(list);

        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());
    }

    @Test
    public void whenUsingTheSpyAnnotation_thenObjectIsSpied() {
        spyList.add("one");
        spyList.add("two");

        Mockito.verify(spyList).add("one");
        Mockito.verify(spyList).add("two");

        assertEquals(2, spyList.size());
    }

    //Stubbing a Spy
    @Test
    public void whenStubASpy_thenStubbed() {
        List<String> list = new ArrayList<String>();
        List<String> spyList = Mockito.spy(list);

        assertEquals(0, spyList.size());

        Mockito.doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }

    @Ignore
    @Test
    public void test() {
        List<String> list = new ArrayList<String>();
        Mockito.doReturn(100).when(list).size();

        assertEquals("Size should be 100: ", 100, list.size());
    }

    /*
    org.mockito.exceptions.misusing.NotAMockException:
    Argument passed to when() is not a mock!
    Example of correct stubbing:
    doThrow(new RuntimeException()).when(mock).someMethod();
     */

    //The Mockito when() method expects a mock or spy object as the argument.
}
