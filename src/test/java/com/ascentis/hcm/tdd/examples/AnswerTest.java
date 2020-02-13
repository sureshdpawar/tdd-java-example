package com.ascentis.hcm.tdd.examples;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class AnswerTest {

    //It is possible to define a Answer object for complex results.
    // While thenReturn returns a predefined value every time, with answers you can calculate a response based on the arguments given to your stubbed method.

    @Test
    public void test_answer() throws Exception {
        Dummy dummy = mock(Dummy.class);
        Answer<Integer> answer = new Answer<Integer>() {
            public Integer answer(InvocationOnMock invocation) throws Throwable {
                String string = invocation.getArgument(0, String.class);
                return string.length() * 2;
            }
        };

        // choose your preferred way
        when(dummy.stringLength("dummy")).thenAnswer(answer);
        doAnswer(answer).when(dummy).stringLength("dummy");
        assertEquals("The String length comparison test",10, dummy.stringLength("dummy"));
    }
}
