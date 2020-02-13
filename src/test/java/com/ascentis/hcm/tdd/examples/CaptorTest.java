package com.ascentis.hcm.tdd.examples;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CaptorTest {

    @Mock
    List mockedList;

    @Captor
    ArgumentCaptor argCaptor;

    // The ArgumentCaptor class allows to access the arguments of method calls during the verification.
    // This allows to capture these arguments of method calls and to use them for tests.

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {
        mockedList.add("one");
        Mockito.verify(mockedList).add(argCaptor.capture());

        assertEquals("one", argCaptor.getValue());
    }
}
