package com.tdd.examples;

import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.List;

import static org.mockito.Mockito.*;

public class VerifyTest {

    @Test
    public void testVerify() {
        // create and configure mock
        User user = Mockito.mock(User.class);
        when(user.getName()).thenReturn("test");

        // call method testing on the mock
        user.getName();
        user.addUser();

        // verify simple invocation on mock
        verify(user).getName();

        // was the method called once?
        // verify number of interactions with mock
        verify(user, times(1)).getName();
    }

    public void testOtherUsages(){

        List<String> mockedList = mock(MyList.class);

        //verify order of interactions
        mockedList.size();
        mockedList.add("a parameter");
        mockedList.clear();

        InOrder inOrder = Mockito.inOrder(mockedList);
        inOrder.verify(mockedList).size();
        inOrder.verify(mockedList).add("a parameter");
        inOrder.verify(mockedList).clear();

        //verify an interaction has not occurred
        mockedList.size();
        verify(mockedList, never()).clear();

        //verify an interaction has occurred at least certain number of times
        mockedList.clear();
        mockedList.clear();
        mockedList.clear();

        verify(mockedList, atLeast(1)).clear();
        verify(mockedList, atMost(10)).clear();

        //verify interaction with exact argument
        mockedList.add("test");
        verify(mockedList).add("test");
    }
}


